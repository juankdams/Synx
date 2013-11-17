/**
 * @filename - My First Script
 * @author - Robyn
 * @Date - 21/01/2013
 */



importClass(Packages.SM.Messages);
importClass(Packages.GameObjects.GPersonnage);
importClass(Packages.Game.GClient);
importClass(Packages.Constants.Constants);

//Import Java packages and classes 
//like import package.*; in Java
importPackage(java.awt);
//like import java.awt.Frame in Java
importClass(java.awt.Frame);
//Create Java Objects by "new ClassName"
var frame = new java.awt.Frame("hello");
//Call Java public methods from script
frame.setVisible(true);
//Access "JavaBean" properties like "fields"
print(frame.title);

function hello(p) {
	print('Hello Again, ' + p.getName()); 
	Messages.M(p.getClient().getSession(), "Hello from script!", Constants.COLOR_BLUE);
	
	
	
	
	
	
	
	// create JavaImporter with specific packages and classes to import

	var SwingGui = new JavaImporter(javax.swing,
	                            javax.swing.event,
	                            javax.swing.border,
	                            java.awt.event);
	with (SwingGui) {
	    // within this 'with' statement, we can access Swing and AWT
	    // classes by unqualified (simple) names.

	    var mybutton = new JButton("test");
	    var myframe = new JFrame("test");
	}
}