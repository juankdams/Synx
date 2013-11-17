package Swing;

import static Misc.Utils.w;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyVetoException;

import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

public class MyJInternalFrame extends JInternalFrame {
	
	public MyJInternalFrame(String name) {
		super(name);
		setName(name);
		setTitle(name);
		setClosable(true);
		setResizable(true);
		setMaximizable(true);
		setIconifiable(true);

		addInternalFrameListener(new InternalFrameAdapter() {
			@Override
			public void internalFrameActivated(InternalFrameEvent arg0) {
				w("InternalFrame actived !");
				arg0.getInternalFrame().getParent().setComponentZOrder(arg0.getInternalFrame(), 0);
				arg0.getInternalFrame().getParent().repaint();
				for(Component c : arg0.getInternalFrame().getParent().getComponents()){
					if(c instanceof JInternalFrame && c != arg0.getInternalFrame()){
						try {
							((JInternalFrame)c).setSelected(false);
						} catch (PropertyVetoException e) {
							e.printStackTrace();
						}
					}
				}
			}
			@Override
			public void internalFrameIconified(InternalFrameEvent arg0) {
				arg0.getInternalFrame().setVisible(false);
			}
		});
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				w("mousePressed in my internal jframe");
				w(arg0.getComponent().getName());
				//w(arg0.getComponent().getParent().getName());
				//w(arg0.getComponent().getParent().getParent().getName());
				//w(getParent().getName());
				//w(getParent().getParent().getName());
				arg0.getComponent().getParent().setComponentZOrder(arg0.getComponent(), 0);
				arg0.getComponent().getParent().repaint();
			}
		});
	}

	
	
	
}
