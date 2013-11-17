package com.ankamagames.wakfu.client.ui.script;

import bYE;
import dJn;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$IncrementDungeonLadderMonsterCount extends dsg
{
  UIFunctionsLibrary$IncrementDungeonLadderMonsterCount(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "incrementDungeonLadderMonsterCount";
  }

  public String getDescription() {
    return "[DONJON SHUKRUTE] Incrémente le compteur de monstres du donjon";
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
    dJn.diF().diK();
  }
}