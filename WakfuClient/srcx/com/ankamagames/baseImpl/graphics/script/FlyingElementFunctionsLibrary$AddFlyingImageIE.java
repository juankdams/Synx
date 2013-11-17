package com.ankamagames.baseImpl.graphics.script;

import bVl;
import bYE;
import bxT;
import dVG;
import dbI;
import doc;
import dsg;
import ob;
import org.keplerproject.luajava.LuaState;

class FlyingElementFunctionsLibrary$AddFlyingImageIE extends dsg
{
  FlyingElementFunctionsLibrary$AddFlyingImageIE(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addFlyingImageIE";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("interactiveElementId", null, bxT.gja, true), new bYE("imagePath", null, bxT.giZ, true) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    String str = Bv(1);

    ob localob = bVl.caZ().hb(l);

    dVG localdVG = new dVG();

    doc localdoc = new doc(str, -1, -1, localdVG, 3000);
    localdoc.a(localob);
    dbI.cNt().a(localdoc);
  }
}