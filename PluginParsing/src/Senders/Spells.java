package Senders;


import org.apache.mina.core.session.IoSession;

import GameObjects.GEffect;
import GameObjects.GPersonnage;
import Misc.Utils;


//------------------------------------------------------------------------------------------------------------------ SPELLS

/**
 * Contient tous les paquets envoyables concernant les Spells (l'interface de sorts)
 */
public class Spells extends Sender{
	/**
	 * GAME_SEND_SPELL_LIST<p>
	 * Envoyé pour update la liste des sorts du joueur<p>
	 *  this.aks.Spells.onList(sData.substr(2));
	 * @param perso
	 */
	public static void SL(GPersonnage perso)
	{
		if(perso.getSpells() != null && perso.getSpells().size() > 0){
			send(perso.getClient().getSession(), "SL"+perso.getSpellListString(true));
		}
	}
	
	/**
	 * GAME_SEND_SEESPELL_OPTION<p>
	 * Pour si le gars peut voir ou pas les options liées aux sorts de sa spelllist: 
	 * 		booster, voir le coût pour booster, voir les sorts de niveau supérieur....<p>
	 * (Genre utile pour les bandits)<p>
	 * o : this.aks.Spells.onChangeOption(sData.substr(3));
	 * @param spells - true = show, false = dont show
	 */
	public static void SLo(IoSession session, boolean showOptions)
	{
		send(session,"SLo"+(showOptions?"+":"-"));
	}
	/* *
	 * GAME_SEND_FORGETSPELL_INTERFACE<p>
	 * this.aks.Spells.onSpellForget(sData.substr(2));
	 * /
	public static void SF(char sign,Personnage perso)
	{
		send(perso, "SF"+sign);
	}
*/
	
	/**
	 * Pour les items de classes. Faut envoyer en décimal
	 * <p>Exemple: SB290;191;1 ajoute un lancer par tour à ronce multiple.  SB290;191;-1 pour enlever un lancer/tour.
	  * <p>this.aks.Spells.onSpellBoost(sData.substr(2));
	 * @param effectID - L'effet appliqué sur le sort par l'item. (Exemple la portée)
	 * @param boostedSpell - L'id du sort boosté par l'item (Exemple La Folle)
	 * @param boostValue - La valeur de l'effet appliqué sur le sort (Exemple +3)
	 * 
	 * @param addOrRemove - "-" pour unequipItem ou "" pour equipItem.
	 */
	public static void SB(IoSession perso, GEffect e, String addOrRemove){
		if(e.getParams().isDice()){
			send(perso, "SB"+e.getEffectID()+";"+e.getDice().getBaseBoost()+";"+addOrRemove+(Utils.toDecimalOr(!e.getSpecialArg().equals("0"), e.getSpecialArg(), "1")));
		}else if(e.getParams().isJet()){
			send(perso, "SB"+e.getEffectID()+";"+e.getJet().getValue()+";"+addOrRemove+(Utils.toDecimalOr(!e.getSpecialArg().equals("0"), e.getSpecialArg(), "1")));

		}
		//Exemple:  SB290;191;1 ajoute un lancer par tour à ronce multiple.  SB290;191;-1 pour enlever un lancer/tour.
		/*
		_loc1.onSpellBoost = function (sExtraData)
	    {
	        var _loc3 = sExtraData.split(";");
	        var _loc4 = Number(_loc3[0]);
	        var _loc5 = Number(_loc3[1]);
	        var _loc6 = Number(_loc3[2]);
	        this.api.kernel.SpellsBoostsManager.setSpellModificator(_loc4, _loc5, _loc6);
	    };
	    
	    _loc1.setSpellModificator = function (actionId, spellId, modificator)
    	{
	        if (typeof(this._oSpellsModificators[actionId]) != "object" && this._oSpellsModificators[actionId] == undefined)
	        {
	            this._oSpellsModificators[actionId] = new Object();
	        } // end if
	        this._oSpellsModificators[actionId][spellId] = modificator;
    	};
		 */
		
	}
	/**
	 * SpellUpradeOK
	 * <p>Quand on réussi à booster un sort
	 * <p>this.aks.Spells.onUpgradeSpell(!bError, sData.substr(3));
	 */
	public static void SUK(IoSession session, short spellID1, int newLvl) {
		send(session, "SUK"+spellID1+"~"+newLvl);
	}
	/**
	 * SpellUpradeError
	 * <p>GAME_SEND_SPELL_UPGRADE_FAILED
	 * <p>Quand on fail à booster un sort
	 * <p>this.aks.Spells.onUpgradeSpell(!bError, sData.substr(3));
	 */
	public static void SUE(IoSession session) {
		send(session, "SUE");
	}
	
	
	/*
	 *  case "S":
        {
            switch (sAction)
            {
                case "L":
                {
                    switch (sData.charAt(2))
                    {
                        case "o": //TODO manque le packet SM.Spells.SLo (pour activer ou pas la vue des sorts supérieur à mon niveau)
                        {
                            this.aks.Spells.onChangeOption(sData.substr(3));
                            break;
                        } 
                        default:
                        {
                            this.aks.Spells.onList(sData.substr(2));
                            break;
                        } 
                    } // End of switch
                    break;
                } 
                case "U":
                {
                    this.aks.Spells.onUpgradeSpell(!bError, sData.substr(3));
                    break;
                } 
                case "B":
                {
                    this.aks.Spells.onSpellBoost(sData.substr(2));
                    break;
                } 
                case "F": //TODO manque le packet SM.Spells.SF pour ouvrir l'interface d'oubli de sort
                {
                    this.aks.Spells.onSpellForget(sData.substr(2));
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