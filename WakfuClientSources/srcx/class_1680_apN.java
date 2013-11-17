import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.DFA;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.NoViableAltException;

class apN extends DFA
{
  public apN(aJc paramaJc, BaseRecognizer paramBaseRecognizer)
  {
    this.recognizer = paramBaseRecognizer;
    this.decisionNumber = 52;
    this.eot = aJc.ejn;
    this.eof = aJc.ejo;
    this.min = aJc.ejp;
    this.max = aJc.ejq;
    this.accept = aJc.ejr;
    this.special = aJc.ejs;
    this.transition = aJc.ejt;
  }

  public String getDescription() {
    return "1:1: Tokens : ( ADD | BAN | BEGIN | COMPLETE | COMPLETE_OBJECTIVE | COORDS_SEPARATOR | DUMP | END | ENDLINE | ESCAPE | GET | INFO | KICK | OFF | ON | PANEL | PAUSE | PING | REMOVE | RESET | RESUME | RIGHTS | SET | SHUTDOWN | START | START_DATE | STATS | STATUS | STOP | SYMBIOT | TURN_DURATION | UNBAN | VAR | WHERE | WHO | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | T__208 | T__209 | T__210 | T__211 | T__212 | T__213 | T__214 | T__215 | T__216 | T__217 | T__218 | T__219 | T__220 | T__221 | T__222 | T__223 | T__224 | T__225 | T__226 | T__227 | T__228 | T__229 | T__230 | T__231 | T__232 | T__233 | T__234 | T__235 | T__236 | T__237 | T__238 | T__239 | T__240 | T__241 | T__242 | T__243 | T__244 | T__245 | T__246 | T__247 | T__248 | T__249 | T__250 | T__251 | T__252 | T__253 | T__254 | T__255 | T__256 | T__257 | T__258 | T__259 | T__260 | T__261 | T__262 | T__263 | T__264 | T__265 | T__266 | T__267 | T__268 | T__269 | T__270 | T__271 | T__272 | T__273 | T__274 | T__275 | T__276 | T__277 | T__278 | T__279 | T__280 | T__281 | T__282 | T__283 | T__284 | T__285 | T__286 | T__287 | T__288 | T__289 | T__290 | T__291 | T__292 | T__293 | T__294 | T__295 | T__296 | T__297 | T__298 | T__299 | T__300 | T__301 | T__302 | T__303 | T__304 | T__305 | SERVERLOCK | VERSION | TELEPORT | TELEPORT_USER | TELEPORT_TO_MONSTER | GHOSTCHECK | CREATE_GROUP | DESTROY_MONSTERS | PLANT_RESOURCES | DESTROY_RESOURCES | ADD_TO_GROUP | PLAY_APS | PLAY_ANIMATION | CHAOS | RESTART_CHAOS | CREATE_ITEM | CREATE_SET | DELETE_ITEM | REGENERATE | REGENERATE_WITH_ITEM | HELP | RUNACTION | STAFF | SUBSCRIBER | FREE_ACCESS | ENDSCENARIO | RELOADSCENARIOS | SCENARIO_COMMAND | ADD_SPELLXP | ADD_XP | SET_BONUS_FACTOR | SET_SPELLLEVEL | ADD_SKILLXP | SET_SKILL_LEVEL | ALMANACH | ADD_ITEM_XP | ADD_MONEY | GOD_MODE | SYSMSG | MSGALL | INSTANCE_USAGE | DESTROY_INSTANCE | SHOW_AGGRO_LIST | SET_LEVEL | IDENT_PHASE | SESSIONS | MUTE_PARTITIONS | UNMUTE_PARTITIONS | MUTE | UNMUTE | SETNEXTCHALLENGE | FINISHCHALLENGE | SPAWN_INTERACTIVE_ELEMENT | DISTRIBUTE_ITEMS | NATION | SEARCH | GIVE_RIGHTS | REMOVE_RIGHTS | QUOTA | RAGNAROK | BUFF | VOTE | CITIZEN_POINTS | ALIGNMENT | REMOVE_FLOOR_ITEMS | SHOW_POPULATION | SHOW_MONSTER_QUOTA | CANCEL_COLLECT_COOLDOWN | SET_RESOURCE_SPEED_FACTOR | MONSTER_GROUP | GET_INSTANCE_UID | TEMP | CALENDAR_CMD | DUMP_BAG | SET_WAKFU_GAUGE | ZONE_BUFF | PROTECTOR_CMD | STATE_CMD | FIGHT_CMD | SET_RESPAWN_CMD | CHECK_CMD | CRAFT_CMD | BAN_REQUEST | ICE_STATUS | ACHIEVEMENT | SPELL_CMD | GEM_CMD | PET | GUILD | APTITUDE | HAVEN_WORLD | LEARN_EMOTE | SET_PLAYER_TITLE | CREATE_FULL_GROUP | INVENTORY | EMPTY_CHAR | GAMEPLAY_STATS | CLIENT_GAME_EVENT_CMD | RENT_ITEM_CMD | CHARACTER_CMD | BOOLEAN | NUMBER | CHARNAME_PATTERN | ACCOUNT_PATTERN | PROXIMITY_PATTERN | ESCAPED_STRING | FLOAT | WHITESPACE | DATE );";
  }

  public int specialStateTransition(int paramInt, IntStream paramIntStream) {
    IntStream localIntStream = paramIntStream;
    int i = paramInt;
    switch (paramInt) {
    case 0:
      int j = localIntStream.LA(1);

      paramInt = -1;
      if ((j >= 0) && (j <= 65535))
        paramInt = 72;
      else {
        paramInt = 71;
      }
      if (paramInt >= 0)
        return paramInt;
      break;
    }
    NoViableAltException localNoViableAltException = new NoViableAltException(getDescription(), 52, i, localIntStream);

    error(localNoViableAltException);
    throw localNoViableAltException;
  }
}