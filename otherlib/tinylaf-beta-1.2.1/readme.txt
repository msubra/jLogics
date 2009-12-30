TinyLaF beta 1.2.1
=================


Please read the file license.txt for license information.

----------------------------------------------------------------------------------

Required JRE: 1.4.0 or later.

----------------------------------------------------------------------------------

To start the control panel, double-click tinylaf.jar or execute:

java -jar tinylaf.jar

----------------------------------------------------------------------------------

To make TinyLaF the current L&F for your application, include this line:

UIManager.setLookAndFeel("de.muntjak.tinylookandfeel.TinyLookAndFeel");

at the beginning of your main method. (You will have to catch any exceptions).

If TinyLaF is started this way it looks for a default theme file (file name: 'Default.theme')
in user.home and then in user.dir and, if it finds one, this file will be loaded at startup.
(The 'Default.theme' file is an ordinary TinyLaF .theme file, just with a special name.)

(Additional ways to define the L&F can be found in the Sun API docs: api/javax/swing/UIManager.html)

----------------------------------------------------------------------------------

To try the 'Decorated Frames' feature, include the following two lines (or maybe
just one) in your source code BEFORE THE FIRST FRAME IS MADE VISIBLE:

JFrame.setDefaultLookAndFeelDecorated(true);	// to decorate frames
JDialog.setDefaultLookAndFeelDecorated(true);	// to decorate dialogs

The flicker which appears when resizing a decorated frame is not supposed to
be a bug, but I'd be VERY happy, if someone could tell me, how to prevent it.

----------------------------------------------------------------------------------

Classpath issues:

The easy and recommended way to add the tinylaf.jar to your class path is, to put it in
the lib/ext folder that comes with every JSDK and JRE.

For a JSDK the path is: .../j2sdkXXX/jre/lib/ext
For a JRE the path is: .../j2reXXX/lib/ext

(My experience is, that javac looks in the JSDK and that java looks in the JRE.)

----------------------------------------------------------------------------------

How to bundle tinylaf.jar with your packed application:

When JARing your application you should write a manifest file which is simply an ascii-file
which can have any name.

If you are new to manifest files:

The first line defines the main class of your application, like this:
Main-Class: package1/package2/YourMainClass

The second line should read like this:
Class-Path: tinylaf.jar

The third line MUST be an empty line.

(More about JAR files and manifest files in the VERY valuable SUN Java tutorial)

When JARing your application, you say:
jar cmf nameOfManifestFile nameOfJar contentsOfJar...

What you get is an executable JAR (you can run it with a double-click, at least on Windows)
which automatically finds tinylaf.jar if it is in the same folder.

----------------------------------------------------------------------------------

Changes since Beta 1.0:

	Fixed: JProgressBar.getFont() returning null. Aditionally one can set the font for JProgressBar now.
	Fixed: JProgressBar now displays strings even when in indeterminate mode.
	Fixed: Defining TinyLaF as the standard L&F in swing.properties threw exceptions (PanelUI not found).
		This is fixed.
	Fixed: ButtonUI now honours isBorderPainted and isContentAreaFilled properties.
	Fixed: Border of JToolBar now isn't painted if set to null or isBorderPainted resolves to false.
	Fixed: Border of JTextField and JComboBox now isn't painted if set to null.
	Fixed: Due to a bug in BasicProgressBarUI (unfortunately in a private method, caused by a private
		member) sometimes a NullPointerException was thrown soon after the ControlPanel started.
		Because this exception is harmless, I decided to catch it.

	Changed: Removed Popup Font.
	Changed: Added ProgressBar Font together with two additional text colors in Decoration/ProgressBar.
	Changed: File format changed slightly due to previous changes. 1.0-themes can still be loaded, but
		saved themes are not compatible with TinyLaF-1.0

Changes since Beta 1.1:

	Fixed: Icons for JMenuItems were painted disabled when menu item was selected.
	Fixed: The selection background and selection foreground for text components
		were both set to white.
	Fixed: Double-clicking the title bar of a frame maximized the frame without respect
		to the (Windows) task bar (while clicking the maximize button DID respect
		screen insets).
	
	Changed: Simplified the paint routine for progress bar border to be faster so it doesn't
		conflict with the animation speed in javax.swing.plaf.basic.BasicProgressBarUI.

	!!! IMPORTANT CHANGE !!!
	From beta 1.2 on you can apply themes derived from the Windows XP Style only on machines
	running Windows XP. TinyLaF checks the system property "os.name" and, if it doesn't
	resolve to "Windows XP" you will see a UnsupportedLookAndFeelException.

Changes since Beta 1.2:
	
	Fixed: Bug in Launcher calling wrong L&F class.
	Fixed: Now changing to TinyLookAndFeel from another L&F works -
		changing from TinyLookAndFeel to another L&F still causes problems
		(certain properties not updated, I guess this will never be fixed)

	Changed: Before searching the user.dir for a 'Default.theme', TinyLaF searches user.home,
		e.g. you can set a global default theme if you put it in user.home.

----------------------------------------------------------------------------------

I hope, this files will be useful for you and have fun, creating your own themes.

29.9.2003   Hans Bickel

----------------------------------------------------------------------------------

The latest version of TinyLaF can be found at:

http://www.muntjak.de/hans/java/tinylaf/index.html

Please send bug-reports, questions, suggestions, feedback to: hb@muntjak.de
