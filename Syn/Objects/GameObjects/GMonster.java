package GameObjects;

import static Constants.Constants.prefixGM;
import Abstractions.AbstractWorld;
import Abstractions.CombativeCharacter;
import ConfigurationObjects.Classe;
import Enums.CharacterType;
import Enums.CharacteristicType;
import Game.GameServer;
import GameObjects.GStatistiques.CharacteristicColumn;
import GlobalObjects.Map;
import Plugins.Managers.PluginsManager;
import Providers.GMonsterProvider;

public class GMonster extends CombativeCharacter {
	
	public static GMonsterProvider provide(AbstractWorld w){
		PluginsManager pm = w.getStrategy().defaultPluginsManager;
		if(w.getServer() != null){
			w.getServer().getPluginsManager();
		}
		return pm.getProviders().provideMonster();
	}
	
	
	//level + powerlvl  (level réel + grade)
	//
	
	//private GAlignement alignement = null;
	//private Stack<GAction> actions = new Stack<GAction>();
	
	private short monsterTemplateID = 0;
	private String accessories = null;
	private GDrop[] drops = null;
	private long xp = 0;
	private GStatistiques stats = null;
	
	


	public int getStatistiquesID(){
		return - ((getTemplateID() * 10) + getGrade());
	}
	
	/**
	 * Aussi appelé PowerLevel par le client je crois.
	 * @return - Le grade de 0 à genre 4 ou 5 (Index dans l'array[] de monstre dans l'hashmap)
	 */
	public int getGrade(){
		int i = 0;
		for(GMonster m : getWorld().getMonsterTemplate(monsterTemplateID)){
			if(m.equals(this)){
				//Syn.d("GMonster.getGrade: good, m.equals this.  i="+i+".");
			//if(m.getLevel() == this.getLevel()){
				return i;
			}
			i++;
		}
		//Syn.d("GMonster.getGrade: bad, didnt found");
		return getID() * -10;
	}
	
	
	/**
	 * Créé une copy (instance) de ce monstre en TOUS POINTS CONFORMES et retourne l'objet.
	 * Ajoute ses stats dans le world, mais pas le monstre lui-même. (Seulement les templates sont stockés là)
	 * @param s - Le serveur qui veut utiliser une instance de ce monstre. (mob.setServer(s))
	 */
	public GMonster copy(GameServer s){
		CombativeCharacter cc = super.copy(s);
		GMonster m = (GMonster) cc;
		GStatistiques stat = this.getStatistique().copy();
		
		m.monsterTemplateID = this.monsterTemplateID;
		m.accessories = this.accessories;
		m.setDrops(this.getDrops());

		m.ID = s.getWorld().getNextCharacterID();
		m.stats = stat;
		m.setLevel(getLevel());
		/*if(m.getTemplateID() >= CServers.minimumIDinWorldMonstersTable){
			s.getWorld().addStatistique(m.getStatistiquesID(), stat);
		}else{
			LWorld.addStatistique(m.getStatistiquesID(), stat);
		}
		*/
		return m;
	}
	
	
	
	


	
	@Override
	public String getName() {
		return this.monsterTemplateID+"";
	}

	@Override
	public CharacterType getCharacterType() {
		return CharacterType.MONSTER;//XXX: Attention, y'a MONSTER_GROUP aussi dans cette enum, chais pas lequel est le bon encore
	}

	@Override
	public byte getAlignementSpecialization() {
		// TODO Auto-generated method stub
		return 0;
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
		  var _loc11 = _loc10[0];//cellID
                var _loc12 = _loc10[1];//directionID
                var _loc13 = Number(_loc10[2]);//bonusValue, les étoiles pour les monsterGroup
                var _loc14 = _loc10[3];//ID du character,sprite à modifier
                var _loc15 = _loc10[4];
                var _loc16 = _loc10[5];//spriteType
                var _loc17 = _loc10[6];//gfx^size
                _loc27.powerLevel = _loc10[7];
                _loc27.color1 = _loc10[8];
                _loc27.color2 = _loc10[9];
                _loc27.color3 = _loc10[10];
                _loc27.accessories = _loc10[11];
		 */
	 /*case "-1"://Creature
     case "-2"://Monstre
     {
         var _loc27 = new Object();
         _loc27.cell = _loc11;
         _loc27.dir = _loc12;
         _loc27.spriteType = _loc16;
         _loc27.noFlip = _loc18;
         _loc27.gfxID = _loc20;
         _loc27.scaleX = _loc21;
         _loc27.scaleY = _loc22;
         _loc27.powerLevel = _loc10[7];
         _loc27.color1 = _loc10[8];
         _loc27.color2 = _loc10[9];
         _loc27.color3 = _loc10[10];
         _loc27.accessories = _loc10[11];
         if (this.api.datacenter.Game.isFight)
         {
             _loc27.LP = _loc10[12];
             _loc27.AP = _loc10[13];
             _loc27.MP = _loc10[14];
             if (_loc10.length > 18)
             {
                 _loc27.resistances = new Array(Number(_loc10[15]), Number(_loc10[16]), Number(_loc10[17]), Number(_loc10[18]), Number(_loc10[19]), Number(_loc10[20]), Number(_loc10[21]));
                 _loc27.team = _loc10[22];
             }
             else
             {
                 _loc27.team = _loc10[15];
             } // end else if
             _loc27.summoned = bIsSummoned;
         } // end if
         if (_loc16 == -1)
         {
             _loc25 = this.api.kernel.CharactersManager.createCreature(_loc14, _loc15, _loc27);
         }
         else
         {
             _loc25 = this.api.kernel.CharactersManager.createMonster(_loc14, _loc15, _loc27);
         } // end else if
         break;
     } */
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(prefix)
		
		.append(this.getCellID())					.append(';')
		.append(this.getOrientation())				.append(';')
		.append("0;")// _loc34.bonusValue=_loc13; c'est pour les étoiles des monsterGroups
		.append(this.getID())						.append(';')
		.append(this.getName())						.append(';')
		
		.append(this.getCharacterType().getType())	.append(';')
		.append(this.getGfxID())
		.append('^').append(this.getSize())
		//.append(this.getSizeX() != DefaultCharacterSize ? "^"+this.getSizeX()+"x" : "")	.append(';')//scaleX
		//.append(this.getSizeY() != DefaultCharacterSize ? "^"+this.getSizeY() : "")		.append(';')//scaleY
		.append(this.isNoFlip() ? "*" : "")			.append(';')
		
		.append(this.getLevel())					.append(';')//todo : utiliser un objet GStatistiques
		.append((getColor1() == -1 ? "-1" : Integer.toHexString(getColor1()))).append(';')
		.append((getColor2() == -1 ? "-1" : Integer.toHexString(getColor2()))).append(';')
		.append((getColor3() == -1 ? "-1" : Integer.toHexString(getColor3()))).append(';')
		.append("0,0,0,0;");//.append(getAccessoriesPacket())				.append(';');
		
		if(this.getFight() != null){
			sb.append(getStatistique().getPdv()).append(';')
			.append(getStatistique().getPA(null)).append(';')
			.append(getStatistique().getPM(null)).append(';');
			//if(false){
				sb.append(getStatistique().getValue(CharacteristicType.RESIST_NEUTRE_PERCENT.get(), CharacteristicColumn.TOTAL)).append(';')
				.append(getStatistique().getValue(CharacteristicType.RESIST_TERRE_PERCENT.get(), CharacteristicColumn.TOTAL)).append(';')
				.append(getStatistique().getValue(CharacteristicType.RESIST_FEU_PERCENT.get(), CharacteristicColumn.TOTAL)).append(';')
				.append(getStatistique().getValue(CharacteristicType.RESIST_EAU_PERCENT.get(), CharacteristicColumn.TOTAL)).append(';')
				.append(getStatistique().getValue(CharacteristicType.RESIST_AIR_PERCENT.get(), CharacteristicColumn.TOTAL)).append(';')
				.append(getStatistique().getValue(CharacteristicType.ESQUIVE_PA.get(), CharacteristicColumn.TOTAL)).append(';')
				.append(getStatistique().getValue(CharacteristicType.ESQUIVE_PM.get(), CharacteristicColumn.TOTAL)).append(';');
			//}
			sb.append(this.getFight().getCharacterTeamID(this));
			
		}
		
		
		return sb.toString();
	}

	/**
	 * TODO GMonster.isNoFlip -> param à chercher dans le client.
	 * @return
	 */
	private boolean isNoFlip() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void onAddedToMap(Map m) {
		SM.Game.GM_ADD(this, m);
	}

	@Override
	public void onRemovedFromMap(Map m) {
		SM.Game.GM_REMOVE(m, this);
	}


	@Override
	public Classe getClasse() {
		// TODO Auto-generated method stub 
		//todo: insérer un objet classe pour avoir les stats, sorts, lvl, maxpapm, etc
		//du coup on pourrait générer des monstres avec des stats aléatoires controllées par les paliers 
			//genre un bouftou pourrait avec 80vita et 10force et un autre bouftou du meme lvl pourrait avoir 50vita et 40force
			//(comme les familiers sur elite pvp)
		return null;
	}


	@Override
	public short getLevel() {
		return this.getStatistique().getValue(CharacteristicType.LEVEL.get(), CharacteristicColumn.BASE);
	}

	@Override
	public void setLevel(short lvl) {
		this.getStatistique().putCharac(CharacteristicColumn.BASE, CharacteristicType.LEVEL, lvl);
	}

	@Override
	public String getAccessoriesPacket(){
		if(this.accessories == null){
			return ",,,,";
		}
		return this.accessories;
	}
	public void setAccessories(String accessories){
		this.accessories = accessories;
	}
	
	
	public void setStatistiques(GStatistiques stat){
		this.stats = stat;
	}

	/**
	 * Va chercher les statistiques du monstre dans le GWorld
	 * <p> Va les chercher dans la bdd si elles étaient pas dans le GWorld 
	 * <p> Ajoute les statistiques chargées de la bdd dans le world si elles ne sont pas null
	 */
	@Override
	public GStatistiques getStatistique() {
		if(stats != null){
			return stats;
		}
		int statsID = getStatistiquesID();
		stats = SQL.Monsters.loadStatistiques(""+(-statsID), getWorld());
		return stats;
/*		//Syn.d("GMons.getStats, statsID="+getStatistiquesID()+".");
		Syn.d("GMons.getStats, getWorld==null :"+(getWorld()==null)+".");
		int statsID = getStatistiquesID();
		if(getWorld() == null){//Monstre stocké sur le login
			if(LWorld.getStatistisque(statsID) == null){
				GStatistiques s = SQL.Monsters.loadStatistiques(""+(-statsID), null);
				if(s != null){
					LWorld.addStatistique(statsID, s);
				}
			}
			return LWorld.getStatistisque(statsID);
		}else{//Monstre stocké sur le game
			if(getWorld().getStatistisque(statsID) == null){
				GStatistiques s = SQL.Monsters.loadStatistiques(""+(-statsID), getServer());
				if(s != null){
					getWorld().addStatistique(statsID, s);
				}
			}
			return getWorld().getStatistisque(statsID);
		}
*/	}
	
	public GMonster setTemplateID(short monsterTemplateID){
		this.monsterTemplateID = monsterTemplateID;
		return this;
	}
	public short getTemplateID(){
		return monsterTemplateID;
	}
	
	public long getXP(){
		return this.xp;
	}
	public void setXP(long xp){
		this.xp = xp;
	}


	@Override
	public void terminate() throws Throwable {
		// TODO Auto-generated method stub
		super.terminate();
		stats.terminate();
		stats = null;	//this.getWorld().removeStatistiques(this.getStatistiquesID());
		if(getDrops() != null){
			for(GDrop d : getDrops()){
				d.terminate();
			}
		}
		setDrops(null);
		accessories = null;
		this.finalize();
	}


	public void setDrops(GDrop[] drops) {
		this.drops = drops;
	}


	public GDrop[] getDrops() {
		return drops;
	}


	public boolean compare(GMonster m) {
		if(
			//pas besoin de checker le templateID, il est inclu dans le getStatsID
			this.getStatistiquesID() == m.getStatistiquesID() &&
			this.getAccessoriesPacket() == m.getAccessoriesPacket() &&
			this.getColor1() == m.getColor1() &&
			this.getColor2() == m.getColor2() &&
			this.getColor3() == m.getColor3() &&
			this.xp == m.xp
		){
			return true;
		}
		return false;
	}
	
	
}
