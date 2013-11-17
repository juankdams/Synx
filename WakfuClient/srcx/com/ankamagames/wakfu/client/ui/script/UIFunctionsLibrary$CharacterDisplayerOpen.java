package com.ankamagames.wakfu.client.ui.script;

import VV;
import ajb;
import bYE;
import bxT;
import cBQ;
import cwP;
import dLE;
import dOc;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$CharacterDisplayerOpen extends dsg
{
  UIFunctionsLibrary$CharacterDisplayerOpen(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "characterDisplayerOpen";
  }

  public String getDescription()
  {
    return "Affiche une fenetre d'interface dans laquelle on place un perso";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XT();
  }

  public bYE[] cf()
  {
    return new bYE[] { new bYE("id", null, bxT.gja, false) };
  }

  protected void S(int paramInt)
  {
    int i = UIFunctionsLibrary.XU();
    String str1 = UIFunctionsLibrary.fR(i);

    dOc localdOc = (dOc)cBQ.cxL().a(str1, VV.dJ("emissaryTutoDialog"), (short)10000);

    String str2 = Bv(1);

    String str3 = Bv(0) + ".anm";
    String str4 = str2.substring(2);
    int j = Integer.parseInt(str2.substring(0, 1));

    dLE.doY().a("filePath", str3, str1);
    dLE.doY().a("animName", str4, str1);
    dLE.doY().a("direction", Integer.valueOf(j), str1);

    ajb localajb = ajb.valueOf(Bv(2));
    int k = Br(3);
    int m = Br(4);

    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setAlign(localajb);
    localcwP.setXOffset(k);
    localcwP.setYOffset(m);
    localdOc.a(localcwP);

    Bz(i);
  }
}