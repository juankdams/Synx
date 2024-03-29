package Providers;

import java.util.ArrayList;

import Abstractions.AbstractWorld;
import Core.Exceptions;
import GameObjects.GEffect;
import GlobalObjects.EffectsShare;
import GlobalObjects.ItemSet;
import Interfaces.IProvider;
import Misc.Utils;

public class ItemSetProvider implements IProvider {


	public ItemSet createNew(short ID, String items, String bonusStr, AbstractWorld s){
		ItemSet is = new ItemSet();
		is.setID(ID);
		
		//Les ID des ItemTemplates qui font parti de l'ItemSet
		String itemps[] = items.split(",");
		is.setItemTemplateIDs(new short[itemps.length]);
		for(int i = itemps.length; i-- > 0;){
			if(Utils.isParsableInteger(itemps[i].trim())){
				is.getItemTemplateIDs()[i] = Short.parseShort(itemps[i].trim());
			}else{
				Exceptions.throwNumberFormatException("Impossible de parser l'id d'item -"+itemps[i]+"- dans le constructeur de l'ItemSet ID "+ID);
			}
		}
		
		//Les bonus de l'ItemSet à chaque grade (nbr d'item de la pano équipé)
		String grades[] = bonusStr.split(";");
		is.setAllBonuses(new ArrayList[grades.length]);
		
		for(int i = grades.length; i-- > 0;){
			is.getAllBonuses()[i] = new ArrayList<GEffect>();
			
			String bonuss[] = grades[i].split(",");//Chaque bonus qu'il y a pour ce grade
			for(int b = bonuss.length; b-- > 0;){
				if(Utils.isParsableInteger(bonuss[b].substring(0, bonuss[b].indexOf(":")))
						&& Utils.isParsableInteger(bonuss[b].substring(1+bonuss[b].indexOf(":")))){
						is.getAllBonuses()[i].add(EffectsShare.addOrModifyEffect(
								GEffect.provide(s).createNewForItemSet(
								Short.parseShort(bonuss[b].substring(0, bonuss[b].indexOf(":"))),
								Short.parseShort(bonuss[b].substring(1+bonuss[b].indexOf(":")))
						)	)
									
						);
				}else{
					Exceptions.throwNumberFormatException("Impossible de parser l'un des effets: -"+bonuss[b]+"- dans le constructeur de l'ItemSet ID "+ID);
				}
			}
			
		}
		return is;
	}

	
	
}
