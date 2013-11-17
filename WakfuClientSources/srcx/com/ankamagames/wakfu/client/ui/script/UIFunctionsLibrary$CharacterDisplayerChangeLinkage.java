package com.ankamagames.wakfu.client.ui.script;

import bYE;
import dLE;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$CharacterDisplayerChangeLinkage extends dsg
{
  UIFunctionsLibrary$CharacterDisplayerChangeLinkage(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "characterDisplayerChangeLinkage";
  }

  public String getDescription()
  {
    return "Change l'animation d'un perso dans une interface";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XV();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    String str1 = Bv(1);
    String str2 = UIFunctionsLibrary.fR(i);
    String str3 = str1.substring(2);
    int j = Integer.parseInt(str1.substring(0, 1));
    dLE.doY().a("animName", str3, str2);
    dLE.doY().a("direction", Integer.valueOf(j), str2);
  }
}