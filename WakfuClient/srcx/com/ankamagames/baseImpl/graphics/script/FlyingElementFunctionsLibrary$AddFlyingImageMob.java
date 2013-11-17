package com.ankamagames.baseImpl.graphics.script;

import bQK;
import bYE;
import bxT;
import cUo;
import dVG;
import dbI;
import doc;
import dsg;
import org.keplerproject.luajava.LuaState;

class FlyingElementFunctionsLibrary$AddFlyingImageMob extends dsg
{
  FlyingElementFunctionsLibrary$AddFlyingImageMob(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addFlyingImageMob";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("mobileId", null, bxT.gja, true), new bYE("imagePath", null, bxT.giZ, true) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    String str = Bv(1);

    cUo localcUo = bQK.bXG().gY(l);

    dVG localdVG = new dVG();

    doc localdoc = new doc(str, -1, -1, localdVG, 3000);
    localdoc.a(localcUo);
    dbI.cNt().a(localdoc);
  }
}