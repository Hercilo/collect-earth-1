# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [1.10.16] - 2020-4-6

### Changed
- Demo survey now opens the GEE App rather than a GEE Code Editor

## [1.10.15] - 2020-4-6

### Changed
- Fixed the hesagon and circle shape plot layout generation.
- Updater updated so that the chromedriver.exe processes are stoped and the updater might replace the file
- Installer is now deleting the java and tmp folders so that there are no issues with the JRE versions 

## [1.10.14] - 2020-3-30

### Changed
- Updated to version 3.26.6 of Collect. 

## [1.10.12] - 2020-2-27

### Changed
- Refresh the view in SecureWatch when it is locked

## [1.10.11] - 2020-2-13

### Changed
- Fixed installer for the Mac OS X

## [1.10.10] - 2020-2-11

### Changed
- Refresh the view in SecureWatch when it is locked

## [1.10.9] - 2020-2-10

### Added
- Added full support for Secure Watch

## [1.10.8] - 2020-2-10

### Changed
- Fixed support for Chrome version 80

## [1.10.6] - 2020-2-5

### Changed
- Planet Imagery improvements

## [1.10.5] - 2020-2-3

### Changed
- Added access to Rapid Eye imagery for the Planet integration

## [1.10.4] - 2020-1-31

### Changed
- Fixed JRE issue when installing new versions of Windows and MacOS

## [1.10.0] - 2020-1-29

### Changed
- Multiple bug fixes when opening SecureWatch and Planet
- Added the JRE to the installers that had a problem in the previous version

## [1.10.0] - 2020-1-29

### Added
- Added support for Maxar SecureWatch imagery

### Changed
- Updated the JRE used on the installer from Oracle 1.8.1_121 of AdoptOpenJDK 1.8.0_232 with 
- Updated to latest version of Collect and syncronized libraries to use the same versions ( Spring and others)
- Improved Planet integration


## [1.9.1] - 2019-12-13

### Added
- Added support for Planet Maps imagery

## [1.9.0] - 2019-11-27

### Added
- Turkish translations for the GUI
- Support for Mac OS X - Catalina

## [1.8.8] - 2019-10-24

### Changed
- Updated ChromeDriver to support the newest version of Chrome ( 78 )
- Updated to latest version of Jetty server
- Small bug fixes

## [1.8.7] - 2019-08-02

### Changed
- Updated ChromeDriver to support the newest version of Chrome ( 76 )

## [1.8.4] - 2019-06-06

### Changed
- Fix bug that did not allow the user to update the values of already stored plots (due to validation issues preventing the write to DB)

## [1.8.2] - 2019-06-03

### Changed
- Fix of CSV updates not showing progress on large CSV files
- Fix of switch between DB types requiring a full Collect Earth restart
- Updated Collect core (3.24.23) version to fix bug when switching from single to multiple code list attributes.

## [1.8.1] - 2019-05-06

### Added
- Added option to use the ID of the plot as one of the parameters in the extra_map_url URL i.e. http://openthiswindow.com?lat=LATITUDE&long=LONGITUDE&id=PLOT_ID
- Added support to the new Survey Guide PDF document file. If a Survey Guide file is added to the survey it can be opened directly within the Help menu

### Changed
- Updated Chromedriver to be compatible with Chrome version 74
- Fixed the progress monitor not working when exporting data (CSV or XML)


## [1.8.0] - 2019-04-12

### Added
- Added the Changelog mechanism to keep track of changes to the code 
- Added a link to this Change Log from the About dialog
- Added a button to access the Properties directly in the dialog

### Changed
- Fix exceptions when no file is chosen in the "Find Missing Plots in Database" dialog
- Operator name is updated automatically when the user finished typing on the text field 

### Removed
- Removed the unnecessary Quit button from the main windows
- Operator name update button


## [1.7.12] - 2019-03-29
### Added
- TODO

### Changed
- Updated to last version of Collect Core (3.24.15) that fixes the issue with calculated attributes not using the right calculation chain.

### Removed
- TODO
