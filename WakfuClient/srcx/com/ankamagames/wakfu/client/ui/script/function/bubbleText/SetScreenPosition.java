package com.ankamagames.wakfu.client.ui.script.function.bubbleText;

import Kd;
import ajb;
import bYE;
import bxT;
import cwP;
import dIJ;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class SetScreenPosition extends dsg
{
  private static final Logger K = Logger.getLogger(SetScreenPosition.class);

  SetScreenPosition(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setScreenPosition";
  }

  public String getDescription()
  {
    return "Déplace une bulle de dialogue";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("bubbleId", "Id de la bulle", bxT.gja, false), new bYE("align", "Alignement de la bulle", bxT.giZ, false), new bYE("screenXoffset", "Décalage en pixel vers la droite", bxT.gja, false), new bYE("screenYoffset", "Décalage en pixel vers le haut", bxT.gja, false) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    dIJ localdIJ = Kd.UN().fA(i);
    if (localdIJ != null) {
      ajb localajb = ajb.valueOf(Bv(1));
      int j = Br(2);
      int k = Br(3);

      cwP localcwP = new cwP();
      localcwP.aJ();
      localcwP.setAlign(localajb);
      localcwP.setXOffset(j);
      localcwP.setYOffset(k);
      localdIJ.a(localcwP);
    }
    K.info("SetScreenPosition " + localdIJ);
  }
}