package SM;

import org.apache.mina.core.session.IoSession;

import Enums.CharacteristicType;
import GameObjects.GStatistiques;
import GameObjects.GStatistiques.CharacteristicColumn;


//------------------------------------------------------------------------------------------------------------------ MOUNTS

/**
 * Contient tous les paquets envoyables concernant les Rides  (Mounts) (Dragodindes)
 */
public class Mounts extends Sender{
	
	/**
	 * GAME_SEND_Rp_PACKET<p>
	 * this.aks.Mount.onMountPark(sData.substr(2));
	 */
	/*public static void Rp(Personnage perso, MountPark MP)
	{
		if(MP != null){
			StringBuilder packet = new StringBuilder();
			packet.append("Rp").append(MP.get_owner()).append(";").append(MP.get_price()).append(";").append(MP.get_size()).append(";").append(MP.getObjectNumb()).append(";");
			Guild G = MP.get_guild();
			//Si une guilde est definie
			if(G != null)
			{
				packet.append(G.get_name()).append(";").append(G.get_emblem());
			}
			else
			{
				packet.append(";");
			}
			send(perso,packet.toString());
		}
	}
	/**
	 * GAME_SEND_MOUNT_DESCRIPTION_PACKET<p>
	 * this.aks.Mount.onData(sData.substr(2));
	 */
	/*public static void Rd(Personnage perso,Dragodinde DD)
	{
		send(perso,"Rd"+DD.parse());
	}
	/**
	 * GAME_SEND_Rr_PACKET<p>
	 * this.aks.Mount.onRidingState(sData.substr(2));
	 */
	/*public static void Rr(Personnage perso, String str)
	{
		send(perso,"Rr"+str);
	}
	/**
	 * GAME_SEND_Re_PACKET<p>
	 * Pour équiper une dragodinde (Ride equip Add)<p>
	 * this.aks.Mount.onEquip(sData.substr(2));
	 */
	/*public static void Re_A(Personnage out,Dragodinde DD)
	{
		send(out,"Re+"+DD.parse());
	}
	/**
	 * Pour déséquiper la dragodinde   (Ride equip Remove)<p>
	 * this.aks.Mount.onEquip(sData.substr(2));
	 */
	/*public static void Re_R(Personnage out)
	{
		send(out,"Re-");
	}
	/**
	 * Packet d'erreur quand on veut équiper une dinde
	 * this.aks.Mount.onEquip(sData.substr(2));
	 */
	/*public static void ReEr(Personnage out)
	{
		send(out,"ReEr");
	}*/
	/**
	 * GAME_SEND_Rx_PACKET<p>
	 * this.aks.Mount.onXP(sData.substr(2));
	 */
	public static void Rx(IoSession s, GStatistiques gs)
	{
		send(s,"Rx"+gs.getValue(CharacteristicType.BONUS_XP_DD.get(), CharacteristicColumn.BASE));
		//FIXME send(out,"Rx"+out.getMountXpGive());
	}
	/**
	 * GAME_SEND_Rn_PACKET<p>
	 * this.aks.Mount.onName(sData.substr(2));
	 */
	/*public static void Rn(Personnage out,String name)
	{
		send(out, "Rn"+name);
	}
	/**
	 * this.aks.Mount.onMountParkBuy(sData.substr(2));
	 */
	/*public static void RD(Personnage out,String packet)
	{
		send(out, "RD"+packet);
	}
	/**
	 * this.aks.Mount.onLeave(sData.substr(2));
	 */
	/*public static void Rv(Personnage out,String packet)
	{
		send(out, "Rv"+packet);
	}
	
	
	
	
	
	
	
	
	
	/*
	 case "R":
            {
                switch (sAction)
                {
                    case "e":
                    {
                        this.aks.Mount.onEquip(sData.substr(2));
                        break;
                    } 
                    case "x":
                    {
                        this.aks.Mount.onXP(sData.substr(2));
                        break;
                    } 
                    case "n":
                    {
                        this.aks.Mount.onName(sData.substr(2));
                        break;
                    } 
                    case "d":
                    {
                        this.aks.Mount.onData(sData.substr(2));
                        break;
                    } 
                    case "p":
                    {
                        this.aks.Mount.onMountPark(sData.substr(2));
                        break;
                    } 
                    case "D":
                    {
                        this.aks.Mount.onMountParkBuy(sData.substr(2));
                        break;
                    } 
                    case "v":
                    {
                        this.aks.Mount.onLeave(sData.substr(2));
                        break;
                    } 
                    case "r":
                    {
                        this.aks.Mount.onRidingState(sData.substr(2));
                        break;
                    } 
                    default:
                    {
                        this.defaultProcessAction(sType, sAction, bError, sData);
                        break;
                    } 
                } // End of switch
                break;
            } 
	 
	 
	 */
}
