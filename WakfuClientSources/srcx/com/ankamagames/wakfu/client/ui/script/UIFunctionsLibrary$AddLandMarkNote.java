package com.ankamagames.wakfu.client.ui.script;

import bSH;
import bU;
import bYE;
import cCZ;
import cDB;
import dlw;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$AddLandMarkNote extends dsg
{
  UIFunctionsLibrary$AddLandMarkNote(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addLandMarkNote";
  }

  public String getDescription()
  {
    return "Ajoute une note personnelle";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Xw();
  }

  public final bYE[] cf()
  {
    return UIFunctionsLibrary.Eq();
  }

  public void S(int paramInt)
  {
    String str = bU.fH().getString(Bv(0));
    int i = Br(1);
    int j = Br(2);
    int k = Br(3);

    cDB localcDB = dlw.cTl().a(j, k, str, i);

    cCZ.cyZ().a(localcDB);
    bSH.bZs().a(localcDB);

    Bz(localcDB.getId());
  }
}