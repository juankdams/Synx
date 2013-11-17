package com.ankamagames.wakfu.client.ui.script.function.bubbleText;

import Kd;
import bMt;
import bQK;
import bVf;
import bVl;
import bYE;
import bxT;
import byv;
import byz;
import cbM;
import dcY;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaObject;
import org.keplerproject.luajava.LuaState;

final class PrepareWakfuBubble extends dsg
{
  private static final Logger K = Logger.getLogger(PrepareWakfuBubble.class);
  private static final bYE[] Rf = { new bYE("characterId", "Id du personnage", bxT.giY, false), new bYE("offsetX", "Décalage en pixel vers la droite", bxT.gja, false), new bYE("offsetY", "Décalage en pixel vers le haut", bxT.gja, false), new bYE("infiniteDuration", "si true la bulle reste toujours affichée", bxT.gjc, true), new bYE("funcOnEnd", "Fonction à appeler lors de la fermeture", bxT.giZ, true) };

  private static final bYE[] bxk = { new bYE("bubbleId", "Id de la bulle créée", bxT.gja, false), new bYE("displayTime", "Temps d'affichage en ms", bxT.gja, false) };

  PrepareWakfuBubble(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "prepareWakfuBubble";
  }

  public String getDescription()
  {
    return "Prépare une bulle de dialogue à afficher pour faire parler un personnage";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public bYE[] cf()
  {
    return bxk;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    Object localObject = bQK.bXG().gY(l);
    if (localObject == null) {
      localObject = bVl.caZ().hb(l);
    }

    if (localObject == null) {
      a(K, "mobile ou IE " + l + " inexistant");
      cYR();
      cYR();
      return;
    }

    String str1 = bMt.bTO();
    dcY localdcY = bMt.jR(str1);
    try {
      localdcY.t(true, false);
    } catch (Exception localException) {
      K.warn(localException.getMessage());
      cYR();
      cYR();
      return;
    }
    localdcY.setTarget((bVf)localObject);
    localdcY.setBubbleObserver(byv.bFN().bFO().aeL());
    localdcY.setXOffset(Br(1));
    localdcY.setYOffset(Br(2) + ((bVf)localObject).ats() * 10);
    localdcY.setBubbleIsVisible(false);
    boolean bool = false;
    String str2 = null;

    if (paramInt >= 4) {
      if (getParam(5).isBoolean())
        bool = By(3);
      else if (getParam(5).isString()) {
        str2 = Bv(3);
      }
    }

    if ((paramInt >= 5) && 
      (getParam(6).isString())) {
      str2 = Bv(4);
    }

    if (bool) {
      localdcY.setDuration(-1);
    }

    int i = localdcY.cIP();
    Kd.UN().a(localdcY);
    if (str2 != null) {
      cbM localcbM = new cbM(str2, cYS(), null);
      Kd.UN().b(i, localcbM);
    }
    Bz(localdcY.getAdviserId());
    Bz(localdcY.getDuration());
  }
}