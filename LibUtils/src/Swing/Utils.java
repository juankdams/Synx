package Swing;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPopupMenu;


public class Utils {

	private static Container defaultContentPaneContainer = null;
	
	
	public static void setDefaultContentPaneContainer(Container defaultContentPaneContainer) {
		Utils.defaultContentPaneContainer = defaultContentPaneContainer;
	}
	public static Container getDefaultContentPaneContainer() {
		return defaultContentPaneContainer;
	}


	/**
	 * Ajoute un popupMenu au composant. (Le menu du clique-droit)
	 * @param component
	 * @param popup
	 */
	public static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}




}
