package SQL;

import static SQL.SqlServiceMySql.closePreparedStatement;
import static SQL.SqlServiceMySql.closeResultSet;
import static SQL.SqlServiceMySql.log;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Abstractions.AbstractSqlService;
import Abstractions.AbstractWorld;
import Core.Syn;
import GameObjects.GSpell;
import Misc.Tests.Perfs;
import Providers.GSpellProvider;


public class Spells {
	
	private static final String updateSpellLvl = "UPDATE `spells` SET `lvl`= ? WHERE `spells`.`ID` = ?;";
	private static final String updateSpellAnimationsParameters = "UPDATE `spells` SET `spellSprite`= ?, `characterSprite`= ?, `displayType`= ?, `showInFrontOfSprite`= ? WHERE `spells`.`ID` = ?;";
	
	
	/**
	 * //TODO Spells.loadAllImportant !!
	 * @param s - Si le serveur est null, on load du global, sinon on load du game.
	 * @param IDs - Si null : va charger absolument tous les sorts, sinon va charger WHERE ID IN (IDs);
	 * @return
	 */
	public static void loadAllSpells(AbstractWorld w, String IDs){
		Syn.d("IDS = ["+IDs+"]");
		AbstractSqlService sqlService = w.getServer() == null ? w.getStrategy().sqlGlobalService : w.getServer().getSqlService();
		try
		{
			ResultSet RS;
			if(IDs != null){
				RS = sqlService.executeQuery("SELECT * FROM spells WHERE ID IN ("+IDs+");");
			}else{
				RS = sqlService.executeQuery("SELECT * FROM spells;");
			}
			if(RS == null) return;
			
			GSpellProvider gsp = GSpell.provide(w);
			GSpell[] spellLevels = null;
			while(RS.next())
			{
				Perfs p = new Perfs();
				short ID = RS.getShort("ID");
				short spellSprite = RS.getShort("spellSprite");
				byte spriteAnim = RS.getByte("characterSprite");
				byte display = RS.getByte("displayType");
				boolean showInFrontOf = RS.getBoolean("showInFrontOfSprite");
				if(!RS.getString("lvl5").equalsIgnoreCase("-1")){
					if(!RS.getString("lvl6").equalsIgnoreCase("-1")){
						spellLevels = new GSpell[6];
						spellLevels[5] = gsp.createNew(ID, RS.getString("lvl6"), spellSprite, spriteAnim, display, showInFrontOf, w);
					}else{
						spellLevels = new GSpell[5];
					}
					spellLevels[4] = gsp.createNew(ID, RS.getString("lvl5"), spellSprite, spriteAnim, display, showInFrontOf, w);
				}else{
					spellLevels = new GSpell[4];
				}
				spellLevels[3] = gsp.createNew(ID, RS.getString("lvl4"), spellSprite, spriteAnim, display, showInFrontOf, w);
				spellLevels[2] = gsp.createNew(ID, RS.getString("lvl3"), spellSprite, spriteAnim, display, showInFrontOf, w);
				spellLevels[1] = gsp.createNew(ID, RS.getString("lvl2"), spellSprite, spriteAnim, display, showInFrontOf, w);
				spellLevels[0] = gsp.createNew(ID, RS.getString("lvl1"), spellSprite, spriteAnim, display, showInFrontOf, w);
				
				w.addSpell(spellLevels);
				//if(s == null){
				//	GlobalWorld.addSpell(spellLevels);
				//}else{
				//	s.getWorld().addSpell(spellLevels);
				//}
				//Syn.d("SpellID ["+spellLevels[0].getID()+"] lvl 1 mtn = ("+spellLevels[0].toString()+")");
				spellLevels = null;
				p.stopTiming("Loaded spell "+ID);
			}
			closeResultSet(RS);
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Charge tous les niveaux d'un sort. Il peut avoir 4,5 ou 6 niveaux. (Certains sorts de mobs ont juste 4 ou 5 niveaux)
	 * @param ID - Si on veut charger seulement un spell à la fois, on met l'ID du spell voulu ici
	 * @param IDs - Si on veut charger plusieurs spells d'un coup, on met "id1,id2,id3,etc.."
	 */
	public static GSpell[] load(short ID, AbstractWorld w){
		//EffectsManager em = serv == null ? Syn.Services.defaultPluginsManager.getEffectsManager() : serv.getEffectsManager();
		AbstractSqlService sqlService = w.getServer() == null ? w.getStrategy().sqlGlobalService : w.getServer().getSqlService();
		//AbstractSqlService sqlService = serv == null ? Syn.Services.sqlGlobalService : serv.getSqlService();
		try
		{
			ResultSet RS = sqlService.executeQuery("SELECT * FROM spells WHERE ID = "+ID+";");
			if(RS == null) return null;
			GSpellProvider gsp = GSpell.provide(w);
			GSpell[] spellLevels = null;
			while(RS.next())
			{
				//Perfs p = new Perfs();
				short spellSprite = RS.getShort("spellSprite");
				byte spriteAnim = RS.getByte("characterSprite");
				byte display = RS.getByte("displayType");
				boolean showInFrontOf = RS.getBoolean("showInFrontOfSprite");
				if(!RS.getString("lvl5").equalsIgnoreCase("-1")){
					if(!RS.getString("lvl6").equalsIgnoreCase("-1")){
						spellLevels = new GSpell[6];
						spellLevels[5] = gsp.createNew(ID, RS.getString("lvl6"), spellSprite, spriteAnim, display, showInFrontOf, w);
						
					}else{
						spellLevels = new GSpell[5];
					}
					spellLevels[4] = gsp.createNew(ID, RS.getString("lvl5"), spellSprite, spriteAnim, display, showInFrontOf, w);
				}else{
					spellLevels = new GSpell[4];
				}
				spellLevels[3] = gsp.createNew(ID, RS.getString("lvl4"), spellSprite, spriteAnim, display, showInFrontOf, w);
				spellLevels[2] = gsp.createNew(ID, RS.getString("lvl3"), spellSprite, spriteAnim, display, showInFrontOf, w);
				spellLevels[1] = gsp.createNew(ID, RS.getString("lvl2"), spellSprite, spriteAnim, display, showInFrontOf, w);
				spellLevels[0] = gsp.createNew(ID, RS.getString("lvl1"), spellSprite, spriteAnim, display, showInFrontOf, w);
				//Syn.d("SpellID ["+spellLevels[0].getID()+"] lvl 1 mtn = ("+spellLevels[0].toString()+")");

				//p.stopTiming("Loaded spell "+ID);
			}
			closeResultSet(RS);
			return spellLevels;
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	
	/*
	public static void updateSpellDataStructure(GSpell[] spell, SqlServiceMySql sqlService){
		try {
			for(int i = spell.length-1; i >= 0; i--){
				PreparedStatement p = sqlService.newTransact(updateSpellDataStructure);
				p.setInt(1, i);
				p.setString(2, spell[i].toString());
				p.setInt(3, spell[i].getID());
				p.execute();
				closePreparedStatement(p);
			}
		} catch (SQLException e) {
			 log.error("Game: SQL ERROR: "+e.getMessage());
			 log.error("Game: Query: "+updateSpellDataStructure);
		}
	}
	*/
	
	/**
	 * Update tous les level/grades du spell 
	 * @param spell
	 */
	public static void updateSpellLevels(GSpell[] spell, SqlServiceMySql sqlService){
		try {
			for(int i = spell.length-1; i >= 0; i--){
				PreparedStatement p = sqlService.newTransact(updateSpellLvl);
				p.setInt(1, i);
				p.setString(2, spell[i].toString());
				p.setInt(3, spell[i].getID());
				p.execute();
				closePreparedStatement(p);
			}
		} catch (SQLException e) {
			 log.error("Game: SQL ERROR: "+e.getMessage());
			 log.error("Game: Query: "+updateSpellLvl);
		}
	}
	
	public static void transferAllSpellAnimationsParametersFromZen(){
		try
		{
			ResultSet RS = Syn.Services.sqlZenService.executeQuery("SELECT * FROM spells;");
			if(RS == null) return;
			while(RS.next())
			{
				String[] spriteInfos = RS.getString("spriteinfos").split(",");
				try {
					PreparedStatement p = Syn.Services.dofusClientStrategy.sqlGlobalService.newTransact(updateSpellAnimationsParameters);
					p.setShort(1, RS.getString("sprite").equals("-1") ? -1 : RS.getShort("sprite"));
					p.setByte(2, Byte.parseByte(spriteInfos[1]));
					p.setByte(3, Byte.parseByte(spriteInfos[0]));
					p.setString(4, (""+spriteInfos[2].equals("1")));
					p.setInt(5,  RS.getInt("ID"));
					p.execute();
					closePreparedStatement(p);
				} catch (Exception e) {
					 Syn.d("Sort ID("+RS.getInt("ID")+") bug. showInFrontOf=("+spriteInfos[2].equals("1")+")");
					 log.error("Game: SQL ERROR: "+e.getMessage());
					 log.error("Game: Query: "+updateSpellAnimationsParameters);
					 break;
				}
			}
			closeResultSet(RS);
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
}