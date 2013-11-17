package Enums;

/**
 * value[0] = French
 * value[1] = English
 * Else = French.
 * @author Robyn
 *
 */
public enum i18n {

	
	
	GM_LVL_TOO_LOW("",""),
	PLUGIN_NOT_EXISTS("",""),
	COMMAND_NOT_EXISTS("",""),
	ACCOUNT_NOT_CONNECTED("",""),
	ACCOUNT_NOT_EXISTS("",""),
	PERSO_NOT_CONNECTED("",""),
	PERSO_NOT_EXIST("",""),
	SPECIFY_PARAMETER("","");
	
	
	private String value[] = {"",""};
	i18n(String valueFrench, String valueEnglish){
		this.setValue(valueFrench, valueEnglish);
	}
	
	public void setValue(String valueFrench, String valueEnglish) {
		this.value[0] = valueFrench;
		this.value[1] = valueEnglish;
	}
	
	/**
	 * 
	 * @param cw - Le CWorld du serveur qui dira à quelle language/communauté il appartient et version du message on veut
	 * @return - Le message selon la bonne langue.
	 */
	public String getValue(Constants.CWorld cw) {
		if(cw.lang.equals("fr")){
			return value[0];
		}else if(cw.lang.equals("en")){
			return value[1];
		}else{
			return value[0];
		}
	}
	
}
