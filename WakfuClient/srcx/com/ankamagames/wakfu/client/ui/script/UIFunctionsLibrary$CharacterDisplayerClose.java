package com.ankamagames.wakfu.client.ui.script;

import bYE;
import cBQ;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$CharacterDisplayerClose extends dsg
{
  UIFunctionsLibrary$CharacterDisplayerClose(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "characterDisplayerClose";
  }

  public String getDescription()
  {
    return "Ferme une fenetre d'interface dans laquelle on place un perso";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XW();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    cBQ.cxL().mW(UIFunctionsLibrary.fR(i));
  }
}