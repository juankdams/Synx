package Enums;

import Core.Exceptions;
import Interfaces.IInteractionType;

public enum ExchangeType implements IInteractionType {

	PLAYER(1),
	
	
	CHEST_STORAGE(5),
	PlayerShopModifier(6),
	TaxCollectorStorage(8),
	
	BigStoreSell(10),
	BigStoreBuy(11),
	
	/**Chais pas si c'est le 12 ou le 13 qui est craft ou fm*/
	CRAFT_DOUBLE(12),
	/**Chais pas si c'est le 12 ou le 13 qui est craft ou fm*/
	FM_DOUBLE(13),
	
	ARTISAN_LIST(14),
	DRAGODINDE_STORAGE(15),
	STABLE(16),
	
	;
	
	
	private byte ID = 0;
	private ExchangeType(int id){
		this.ID = (byte)id;
	}
	public byte get(){
		return this.ID;
	}
	public static ExchangeType getExchangeType(byte ID){
		for(ExchangeType ct : values()){
			if(ct.ID == ID){
				return ct;
			}
		}
		Exceptions.throwNullPointerException("");
		return null;
	}
	
}
