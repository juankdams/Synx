package com.ankamagames.wakfu.client.ui.script;

import bCY;
import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$SetNextPetMessage extends dsg
{
  UIFunctionsLibrary$SetNextPetMessage(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setNextPetMessage";
  }

  public String getDescription() {
    return "[Obsolète] Fais passer le message de gélutin courant";
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
    bCY.bLy().bLD();
  }
}