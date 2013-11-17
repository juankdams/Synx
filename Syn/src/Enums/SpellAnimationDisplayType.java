package Enums;

public enum SpellAnimationDisplayType {

	
	;
	
	
	
	
	public static void go(int nDisplayType){
		boolean _loc14 = true;
		boolean _loc15 = false;
        switch (nDisplayType)
        {
            case 0:
            {
            	_loc15 = false;
                _loc14 = false;
                break;
            } 
            case 10:
            case 11:
            {
                _loc15 = false;
                break;
            } 
            case 12:
            {
                _loc15 = true;
                break;
            } 
            case 20:
            case 21:
            {
                _loc15 = false;
                break;
            } 
            case 30:
            case 31:
            {
                _loc15 = true;
                break;
            } 
            case 40:
            case 41:
            {
                _loc15 = true;
                break;
            } 
            case 50:
            {
                _loc15 = false;
                break;
            } 
            case 51:
            {
                _loc15 = true;
                break;
            } 
            default:
            {
                _loc15 = false;
                _loc14 = false;
                break;
            } 
        } // End of switch
	}
	
}
