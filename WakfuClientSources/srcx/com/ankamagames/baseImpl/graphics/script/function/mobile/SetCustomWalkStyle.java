package com.ankamagames.baseImpl.graphics.script.function.mobile;

import ZV;
import ao;
import bQK;
import bYE;
import bxT;
import cUo;
import dMM;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetCustomWalkStyle extends dsg
{
  private static final Logger K = Logger.getLogger(SetCustomWalkStyle.class);
  private static final String NAME = "setCustomWalkStyle";
  private static final bYE[] Rf = { new bYE("mobileId", "Id du mobile", bxT.giY, false), new bYE("animationName", "Nom de l'animation", bxT.giZ, true), new bYE("cellSpeed", "Temps de déplacement d'une cellule vers la suivante en ms", bxT.gja, true) };

  public SetCustomWalkStyle(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "setCustomWalkStyle";
  }

  public String getDescription() {
    return "Change l'animation de marche d'un mobile";
  }

  public bYE[] ce() {
    return Rf;
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    long l = Bu(0);
    cUo localcUo = bQK.bXG().gY(l);
    if ((localcUo == null) || (!(localcUo instanceof dMM))) {
      a(K, "le mobile " + l + " n'existe pas ");
      return;
    }

    dMM localdMM = (dMM)localcUo;
    if (paramInt == 1) {
      localdMM.cax();
    } else {
      localdMM.b(true, ZV.cMJ);
      ao localao = (ao)localdMM.cat();

      localao.setAnimation(Bv(1));
      if (paramInt == 3)
        localao.p(Br(2));
    }
  }
}