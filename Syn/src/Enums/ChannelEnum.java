package Enums;

import Core.Exceptions;

public enum ChannelEnum {

	INFORMATION('i'),
	GENERAL('*'),
	/**Le canal bleu doit venir avec TEAM, PARTY et PRIVATE ensemble*/
	TEAM('#'),
	/**Le canal bleu doit venir avec TEAM, PARTY et PRIVATE ensemble*/
	PARTY('$'),
	/**Le canal bleu doit venir avec TEAM, PARTY et PRIVATE ensemble*/
	PRIVATE('p'),
	GUILD('%'),
	ALIGNMENT('!'),
	TRADING(':'),
	RECRUITMENT('?'),
	ADMIN('@'),//XXX @ et ¤. (Quand on envoit un message rose en canal Admin (/q) en jeu, l'emu recoit G [RECV] << BM@|f|  et G [RECV] << BM¤|f|  juste apres
	INCARNAM('^'),
	UNKNOWN1((char) 194),
	ADMIN_2((char) 207);//¤
	//Lien pour voir les charactères selon leur numéro :
//http://www.theasciicode.com.ar/extended-ascii-code/box-drawing-character-ascii-code-194.html
	
	
	private char value;
	private ChannelEnum(char value) {
		this.value = value;
	}
	public char getValue() {
		return value;
	}
	
	public static ChannelEnum getChannel(char channel){
		for(ChannelEnum ce : ChannelEnum.values()){
			if(ce.value == channel){
				return ce;
			}
		}
		Exceptions.throwNullPointerException("ChannelEnum.getChannel(char) : channelEnum non trouvée : channel demandé: ("+channel+") invalide.");
		return null;
	}
}
