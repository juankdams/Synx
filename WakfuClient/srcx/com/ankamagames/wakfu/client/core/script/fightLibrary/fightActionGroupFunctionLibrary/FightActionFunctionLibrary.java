package com.ankamagames.wakfu.client.core.script.fightLibrary.fightActionGroupFunctionLibrary;

import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public final class FightActionFunctionLibrary extends hQ
{
  public static final FightActionFunctionLibrary daw = new FightActionFunctionLibrary();
  private static final String NAME = "FightAction";
  private static final String Vu = "Librairie qui permet de manipuler les groupes d'actions";

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new AddActionToPendingGroup(paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }

  public String getName()
  {
    return "FightAction";
  }

  public String getDescription()
  {
    return "Librairie qui permet de manipuler les groupes d'actions";
  }
}