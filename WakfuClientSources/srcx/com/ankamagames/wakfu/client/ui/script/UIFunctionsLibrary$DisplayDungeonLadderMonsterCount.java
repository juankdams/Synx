package com.ankamagames.wakfu.client.ui.script;

import bYE;
import dJn;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$DisplayDungeonLadderMonsterCount extends dsg
{
  UIFunctionsLibrary$DisplayDungeonLadderMonsterCount(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "displayDungeonLadderMonsterCount";
  }

  public String getDescription() {
    return "[DONJON SHUKRUTE] Initialise et affiche le compteur de monstres du donjon";
  }

  public bYE[] ce()
  {
    return null;
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    dJn.diF().diJ();
  }
}