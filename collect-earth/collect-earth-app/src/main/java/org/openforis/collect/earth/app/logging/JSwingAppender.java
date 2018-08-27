package org.openforis.collect.earth.app.logging;

import java.awt.Dimension;

import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginElement;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;
import org.apache.logging.log4j.core.layout.PatternLayout;

@Plugin(name = "JSwingAppender", category = "Core", elementType = "appender", printObject = true)
public class JSwingAppender extends AbstractAppender {

	public JSwingAppender(String name, Filter filter, Layout<?> layout, boolean ignoreExceptions) {
		super(name, filter, layout, ignoreExceptions);
	}

	@PluginFactory
	public static JSwingAppender createAppender(@PluginAttribute("name") String name,
			@PluginElement("Layout") Layout<?> layout, @PluginElement("Filters") Filter filter,
			@PluginAttribute("ignoreExceptions") boolean ignoreExceptions) {

		if (name == null) {
			LOGGER.error("No name provided for JTextAreaAppender");
			return null;
		}

		if (layout == null) {
			layout = PatternLayout.createDefaultLayout();
		}
		return new JSwingAppender(name, filter, layout, ignoreExceptions);
	}

	@Override
	public void append(LogEvent event) {

		final String message = new String(this.getLayout().toByteArray(event)).replaceAll("(\r\n|\n)", "<br />");

		// Append formatted message to text area using the Thread.
		try {
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					JEditorPane web = new JEditorPane();
					web.setEditable(false);
					web.setContentType("text/html");
					web.setText(message);

					JScrollPane scrollPane = new JScrollPane(web);
					scrollPane.setPreferredSize(new Dimension(450, 350));

					JOptionPane.showMessageDialog(null, scrollPane, "Error has been loogged", JOptionPane.ERROR_MESSAGE);
				}
			});
		} catch (final IllegalStateException e) {
			// ignore case when the platform hasn't yet been initialized
		}
	}
}