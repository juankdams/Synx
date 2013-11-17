package com.ankamagames.wakfu.client.ui.script;

import bU;
import bYE;
import cCZ;
import cwO;
import dsE;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$AddCompass extends dsg
{
  UIFunctionsLibrary$AddCompass(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addCompass";
  }

  public String getDescription()
  {
    return "Crée une boussole";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Zm();
  }

  public final bYE[] cf()
  {
    return UIFunctionsLibrary.Zn();
  }

  protected void S(int paramInt)
  {
    String str = bU.fH().getString(Bv(0));
    int i = Br(1);
    int j = Br(2);
    short s = paramInt >= 4 ? (short)Br(3) : 0;
    s = cwO.V(i, j, s);
    if (s == -32768) {
      s = 0;
    }

    int k = 2;
    if (paramInt >= 5) {
      k = Br(4);
    }

    long l = dsE.cYX();
    cCZ.cyZ().a(k, i, j, s, null, str);
    kg(l);
  }
}