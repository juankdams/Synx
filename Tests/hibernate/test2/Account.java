package test2;


public class Account {

	
	public int ID = 0;
	public String[] userAndPass = new String[2];
	public byte curPerso = 0;//pour le chercher dans l'index
	public byte GMLVL = 0;
	
	public Account(int id, String username, String password){
		this.ID = id;
		userAndPass[0] = username;
		userAndPass[1] = password;
	}
	
	public byte hasGM() {
		if(GMLVL > 1){
			return 1;
		}
		return 0;
	}
	
}
