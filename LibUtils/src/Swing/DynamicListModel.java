package Swing;

import static Swing.DynamicListModel.ListModelType.COMPONENT_LIST;
import static Swing.DynamicListModel.ListModelType.OBJECT_LIST;
import static Swing.DynamicListModel.ListModelType.STRING_LIST;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.ListModel;
import javax.swing.event.ListDataListener;


public class DynamicListModel implements ListModel{

	public static enum ListModelType{
		COMPONENT_LIST,
		STRING_LIST,
		OBJECT_LIST;
	}
	
	
	// /** {Index, ComponentName, Component} */
	//private ArrayList<Object[]> values = new ArrayList<Object[]>();
	private ArrayList<Object> values = new ArrayList<Object>();
	private Object selectedItem = null;
	private ListModelType listType = null;
	
	
	
	public DynamicListModel(){
		
	}
	public DynamicListModel(ArrayList<Component> values, ListModelType lmt){
		/*this.values = new ArrayList<Object[]>(values.size());
		for(int i = values.size()-1; i >= 0; i--){
			while(i >= this.values.size()){
				this.values.add(null);
			}
			this.values.set(i, new Object[]{i, values.get(i).getName(), values.get(i)});
		}*/
		addAll(values);
		listType = lmt;
	}
	
	@Override
	public void addListDataListener(ListDataListener l) {
		// TODO Auto-generated method stub
	}
	@Override
	public void removeListDataListener(ListDataListener l) {
		// TODO Auto-generated method stub
	}

	/*@Override
	public Object[] getElementAt(int index) {
		return values.get(index);
	}
	public String getElementName(int index) {
		return (String) values.get(index)[1];
	}
	public Component getElementComponent(int index) {
		return (Component) values.get(index)[2];
	}
	public Object[] addElement(Object o[]){
		values.add(o);
		return o;
	}
	public Object[] addElementAt(int index, Object o[]){
		values.add(index, o);
		return o;
	}
	public Object[] replaceElementAt(int index, Object o[]){
		values.set(index, o);
		return o;
	}*/
	@Override
	public String getElementAt(int index) {
		if(listType == COMPONENT_LIST){
			return ((Component) values.get(index)).getName();
		}
		if(listType == OBJECT_LIST){
			return values.get(index).toString();
		}
		if(listType == STRING_LIST){
			return ((String) values.get(index));
		}
		return (String) values.get(index);
	}
	public Object getElement(int index) {
		return values.get(index);
	}
	public Object getElement(String name) {
		if(listType == COMPONENT_LIST){
			for(Object c : values){
				if(((Component)c).getName() != null && ((Component)c).getName().equals(name)){
					return c;
				}
			}
		}
		if(listType == OBJECT_LIST){
			for(Object c : values){
				if(c.toString().equals(name)){
					return c;
				}
			}
		}
		if(listType == STRING_LIST){
			for(Object c : values){
				if(((String)c).equals(name)){
					return c;
				}
			}
		}
		return null;
	}
	public Object addElement(Object o){
		values.add(o);
		return o;
	}
	public Object addElementAt(int index, Object o){
		values.add(index, o);
		return o;
	}
	public Object replaceElementAt(int index, Object o){
		values.set(index, o);
		return o;
	}
	/**
	 * Ajoute tous les Components de l'ArrayList à l'arrayList locale.
	 * @param values - Les Components à ajouter
	 * @return - L'ArrayList locale.
	 */
	public ArrayList<Object> addAll(ArrayList<Component> values){
		for(int i = values.size()-1; i >= 0; i--){
			if(values.get(i) != null){
				this.values.add(values.get(i));
			}
		}
		return this.values;
	}
	/**
	 * this.values.clear();
	 */
	public ArrayList<Object> emptyList(){
		this.values.clear();
		return this.values;
	}
	
	public ArrayList<Object> setValues(ArrayList<Component> values){
		this.values = new ArrayList<Object>(values);
		return this.values;
	}
	
	@Override
	public int getSize() {
		return values.size();
	}

	public Object getSelectedItem() {
		return selectedItem;
	}
	public void setSelectedItem(Object anItem) {
		selectedItem = anItem;
	}
	public ListModelType getListType() {
		return listType;
	}
	public void setListType(ListModelType listType) {
		this.listType = listType;
	}

}
