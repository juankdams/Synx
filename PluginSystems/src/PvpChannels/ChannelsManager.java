package PvpChannels;

import java.util.HashMap;

public class ChannelsManager {

	
	public HashMap<Integer, Channel> channels = new HashMap<Integer, Channel>();
	
	
	/**
	 * 
	 * @param persoLevel - Mettre 0 si on ne veut pas prendre en compte les limitations de range de niveau.
	 * @param state - L'état du channel de combat (Preparing, Active, Looting)
	 * @return
	 */
	public StringBuilder getChannelsList(int persoLevel, byte state){
		StringBuilder sb = new StringBuilder(channels.size()*10);//jai mit 10 completement au hasard, à refaire.
		for(Channel c : channels.values()){
			if(c.getState() == state){
				if(persoLevel == 0 || c.getLevelMin() <= persoLevel && c.getLevelMax() >= persoLevel){
					if(sb.length() != 0){
						sb.append("|");
					}
					sb.append(c.toString());
				}
			}
		}
		return sb;
	}
	
	
}
