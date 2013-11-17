package Swing;

import static Misc.Utils.w;
import static Swing.DynamicListModel.ListModelType.COMPONENT_LIST;
import static Swing.DynamicListModel.ListModelType.OBJECT_LIST;
import static Swing.DynamicListModel.ListModelType.STRING_LIST;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JTabbedPane;

public class ComponentList extends MyJInternalFrame {

	JList list = null;

	
	/**
	 * Create the frame.
	 */
	public ComponentList(String name, Container c) {
		super(name);
		this.setBounds(0, 0, 249, 393);
		this.setVisible(true);
		this.setClosable(true);
		this.setMaximizable(true);
		this.setIconifiable(true);
		this.setResizable(true);
		this.getLayeredPane().grabFocus();
		list = new JList();
		list.setSize(100, 300);
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(list.getSelectedValue() == null){
					w("ComponentList.mousePressed . list.getSelectedValue() = null");
				}else{
					DynamicListModel dlm = ((DynamicListModel)list.getModel());
					Object element = dlm.getElement(""+list.getSelectedValue());
					if(dlm.getListType() == COMPONENT_LIST){
						((Component)element).getParent().setComponentZOrder(((Component)element), 0);
						((Component)element).setVisible(true);
					}else
					if(dlm.getListType() == OBJECT_LIST){
						//do something					
					}else
					if(dlm.getListType() == STRING_LIST){
						//do something
					}

					/*for(Component o : Datacenter.mainWindow.mainFrame.getContentPane().getComponents()){
						if(o.getName() != null && o.getName().equals(""+list.getSelectedValue())){
							//w("setting "+o.getName()+" to visible");
							o.setVisible(true);
							//o.getParent().getl
						}
					}*/
				}
			}
		});
		getContentPane().add(list, BorderLayout.CENTER);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.NORTH);
		getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{list, tabbedPane}));
	}
	
	public void setList(ArrayList<Component> a){
		//if(list.getModel().getSize() != 0){
		//	((DynamicListModel)list.getModel()).setValues(a);
		//}else{
			list.setModel(new DynamicListModel(a, COMPONENT_LIST));
		//}
		w("componentList.setList of Components");
	}
}
