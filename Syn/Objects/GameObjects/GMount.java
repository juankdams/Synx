
package GameObjects;

import static Constants.Constants.prefixGM;

import java.util.ArrayList;

import Abstractions.AbstractCharacter;
import Abstractions.AbstractWorld;
import ConfigurationObjects.Classe;
import Enums.CharacterType;
import Enums.CharacteristicType;
import GameObjects.GStatistiques.CharacteristicColumn;
import GlobalObjects.Map;
import Plugins.Managers.PluginsManager;
import Providers.GMountProvider;

/**
 * Les sprites de dragodindes qui marchent dans leur enclos, 
 * pas la monture sur laquelle on est qui est un item/accessoire.
 * 
 * @author Robyn
 */
public class GMount extends AbstractCharacter{
	
	
	
	
	public static GMountProvider provide(AbstractWorld w){
		PluginsManager pm = w.getStrategy().defaultPluginsManager;
		if(w.getServer() != null){
			w.getServer().getPluginsManager();
		}
		return pm.getProviders().provideMount();
	}
	
	
	/*
	 - Sur l'item lui-même, il faut afficher : 
		- Le nom ("Nom : blablacookie")
		- Le nom du possesseur ("Appartient à : blablamaster")
		- La phrase/bouton "Consulter la fiche de la monture" (c'est dans cet effet qu'on met l'ID de la monture)
		- Le temps de validité du certificat ("Validité : 39j 16h 42m")
 	- En cliquant sur "consulter la fiche de la monture" (donc des vars dans GMount), on a accès à : 
 		- Tous onglets :
 			- type de dd (pourpre, émeraude, doré, etc), son niveau, 
 			- nom, sexe, si elle est montable, si elle est sauvage
 			- bouton "voir son arbre généalogique"
 		- Onglet Général :
 			- son énergie, expérience, fatigue, nb de reproductions, 
 		- Onglet Statistiques :
 			- amour, maturité, endurance, happiness(aggressivité vs sérénité)
 		- Onglet Effets : 
 			- Bah ce que donne la dd : vitalité, force, chance, sagesse, pm, po, etc
 		- Onglets Capacités
 			- si elle est Reproductrice, Caméléonne, Sage, etc
	 */

	/*
	 case "-9": //ParkMount
     {
     	var _loc43 = new Object();
     	_loc43.spriteType = _loc16;
        _loc43.gfxID = _loc20;
        _loc43.scaleX = _loc21;
        _loc43.scaleY = _loc22;
        _loc43.cell = _loc11;
        _loc43.dir = _loc12;
        _loc43.ownerName = _loc10[7];
        _loc43.level = _loc10[8];
        _loc43.modelID = _loc10[9];
        _loc25 = this.api.kernel.CharactersManager.createParkMount(_loc14, _loc15 != "" ? (_loc15) : (this.api.lang.getText("NO_NAME")), _loc43);
        break;
     } 
	 */
	
	
	/*  //Monture sur GM de personnage
                        if (this.api.datacenter.Game.isFight)
                        {
                            //##trucs de personnage## ...//
                             //---- //---//---
                              
                            if (_loc10[25].indexOf(",") != -1) //si monture :)
                            {
                                var _loc47 = _loc10[25].split(",");
                                var _loc48 = Number(_loc47[0]);
                                var _loc49 = Number(_loc47[1]);
                                var _loc50 = Number(_loc47[2]);
                                var _loc51 = Number(_loc47[3]);
                                if (_loc49 == -1 || _global.isNaN(_loc49))
                                {
                                    _loc49 = this.api.datacenter.Player.color1;
                                } // end if
                                if (_loc50 == -1 || _global.isNaN(_loc50))
                                {
                                    _loc50 = this.api.datacenter.Player.color2;
                                } // end if
                                if (_loc51 == -1 || _global.isNaN(_loc51))
                                {
                                    _loc51 = this.api.datacenter.Player.color3;
                                } // end if
                                if (!_global.isNaN(_loc48))
                                {
                                    var _loc52 = new dofus.datacenter.Mount(_loc48, Number(_loc20));
                                    _loc52.customColor1 = _loc49;
                                    _loc52.customColor2 = _loc50;
                                    _loc52.customColor3 = _loc51;
                                    _loc46.mount = _loc52;
                                } // end if
                            }
                            else
                            {
                                var _loc53 = Number(_loc10[25]);
                                if (!_global.isNaN(_loc53))
                                {
                                    _loc46.mount = new dofus.datacenter.Mount(_loc53, Number(_loc20));
                                } // end if
                            } // end else if
                        }
                        else
                        {
                            //##trucs de personnage## ...//
                             //---- //---//--- blablabla
                              
                            if (_loc10[19].indexOf(",") != -1) //si monture :)
                            {
                                var _loc54 = _loc10[19].split(",");
                                var _loc55 = Number(_loc54[0]);
                                var _loc56 = _global.parseInt(_loc54[1], 16);
                                var _loc57 = _global.parseInt(_loc54[2], 16);
                                var _loc58 = _global.parseInt(_loc54[3], 16);
                                if (_loc56 == -1 || _global.isNaN(_loc56))
                                {
                                    _loc56 = this.api.datacenter.Player.color1;
                                } // end if
                                if (_loc57 == -1 || _global.isNaN(_loc57))
                                {
                                    _loc57 = this.api.datacenter.Player.color2;
                                } // end if
                                if (_loc58 == -1 || _global.isNaN(_loc58))
                                {
                                    _loc58 = this.api.datacenter.Player.color3;
                                } // end if
                                if (!_global.isNaN(_loc55))
                                {
                                    var _loc59 = new dofus.datacenter.Mount(_loc55, Number(_loc20));
                                    _loc59.customColor1 = _loc56;
                                    _loc59.customColor2 = _loc57;
                                    _loc59.customColor3 = _loc58;
                                    _loc46.mount = _loc59;
                                } // end if
                            }
                            else
                            {
                                var _loc60 = Number(_loc10[19]);
                                if (!_global.isNaN(_loc60))
                                {
                                    _loc46.mount = new dofus.datacenter.Mount(_loc60, Number(_loc20));
                                } // end if
                            } // end else if
                        } // end else if
	 */
	
	
	//screen dd équipée+montrée ds l'inventaire : http://pbrd.co/17F2HvZ
	//si elle est équipée mais pas montée, il n'y a juste rien dans la slot d'inventaire.
	private GStatistiques stats; //level, xp, 
	private ArrayList<GEffect> effects;//force, intel, chance, agi, vita, ini, pm/po
	private byte sexe = 0;
	
	
	@Override
	public CharacterType getCharacterType() {
		return CharacterType.PARKED_MOUNT;
	}

	@Override
	public String getSpritePacket(PluginsManager pm, String prefix) {
		return getSpritePacket(prefix);
	}
	@Override
	public String getSpritePacket(String prefix) {
		if(prefix.indexOf(prefixGM) == -1){
			return "";
		}
		/*
		 _loc43.spriteType = _loc16;
        _loc43.gfxID = _loc20;
        _loc43.scaleX = _loc21;
        _loc43.scaleY = _loc22;
        _loc43.cell = _loc11;
        _loc43.dir = _loc12;
        _loc43.ownerName = _loc10[7];
        _loc43.level = _loc10[8];
        _loc43.modelID = _loc10[9];
        _loc25 = this.api.kernel.CharactersManager.createParkMount(_loc14, _loc15 != "" ? (_loc15) : (this.api.lang.getText("NO_NAME")), _loc43);
		 */
		StringBuilder str = new StringBuilder(prefix)
		.append(getCellID()).append(';')
		.append(getOrientation()).append(';')
		.append('0').append(';')// _loc34.bonusValue=_loc13; c'est pour les étoiles des monsterGroups
		.append(getID()).append(';')
		.append(getName()).append(';')
		.append(getCharacterType().getType())//CharacterType = la ClassID pour les Personnages. Voir l'enum pour les autres types
		.append(';')//title
		.append(getGfxID()).append('^').append(getSize()).append(';')// gfxID^size
		
		
		.append(getSexe()).append(';')
		.append(getAlignementSpecialization()).append(",")// 1,0,0,4055064
		.append("0,")// FIXME personnage.GMPacket : 0?
		//FIXME personnage.GMPacket : showWings/Alignement.
		.append("0,")//.append((_showWings ? getPvpGrade() : "0")).append(",")
		.append(getLevel()).append(';') // _loc33.powerLevel = _loc10[7];
		.append((getColor1() == -1 ? "-1" : Integer.toHexString(getColor1()))).append(';')
		.append((getColor2() == -1 ? "-1" : Integer.toHexString(getColor2()))).append(';')
		.append((getColor3() == -1 ? "-1" : Integer.toHexString(getColor3()))).append(';')
		.append(getAccessoriesPacket()).append(';') // _loc33.accessories = _loc10[11];
		.append((getLevel() > getServer().getConfig().getAura100lvl() ? (getLevel() > getServer().getConfig().getAura200lvl() ? '2' : '1') : '0')).append(';')
		
		.append(';')// Emote
		.append(';')// Emote timer
		/*
	FIXME : personnage.GMPacket: parametres de restrictions, de guilde et de dragodinde.
		
		if (this._guildMember != null&& this._guildMember.getGuild().getMembers().size() >= Zen.MEMBRE_MINI_GUILDE_VALIDE) {
			str.append(this._guildMember.getGuild().get_name()).append(';').append(this._guildMember.getGuild().get_emblem()).append(';');
		} else{
			str.append(";;");
		}
		str.append(Long.toString(get_GMrestrictions(), 36)).append(';');// Restrictions
		
		 
		if(hasMount()){
			if(getMount().getCapabilities().isCameleon()){
				str.append(getMount().getID()).append(',')
				.append((getMount().getColor1() == -1 ? "-1" : Integer.toHexString(getMount().getColor1()))).append(';')
				.append((getMount().getColor2() == -1 ? "-1" : Integer.toHexString(getMount().getColor2()))).append(';')
				.append((getMount().getColor3() == -1 ? "-1" : Integer.toHexString(getMount().getColor3()))).append(';');
			}else{
				str.append(getMount().getID());
			}
		}
		
		str.append(';');
		*/
		.append(";;0;;");
		return str.toString();
	}
	
	public short getLevel() {
		return this.getStatistique().getValue(CharacteristicType.LEVEL.get(), CharacteristicColumn.BASE);
	}

	private GStatistiques getStatistique() {
		return stats;
	}

	@Override
	public Classe getClasse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte getAlignementSpecialization() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getAccessoriesPacket() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onAddedToMap(Map m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onRemovedFromMap(Map m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void terminate() throws Throwable {
		// TODO Auto-generated method stub
		this.finalize();
	}

	public void setSexe(byte sexe) {
		this.sexe = sexe;
	}

	public byte getSexe() {
		return sexe;
	}



}
