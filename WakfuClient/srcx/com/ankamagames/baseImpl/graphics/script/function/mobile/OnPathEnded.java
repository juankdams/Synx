package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bFB;
import bQK;
import bXf;
import bYE;
import bxT;
import cH;
import cUo;
import dMM;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class OnPathEnded extends dsg
{
  private static final Logger K = Logger.getLogger(OnPathEnded.class);
  private static final boolean DEBUG = true;
  private static final String NAME = "onPathEnded";
  private static final bYE[] Rf = { new bYE("mobileId", "Id du mobile", bxT.giY, false), new bYE("funcName", "Fonction à appeler", bxT.giZ, false), new bYE("params", "Paramètres de la fonction à appeler", bxT.gje, true) };

  public OnPathEnded(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "onPathEnded";
  }

  public String getDescription()
  {
    return "Apelle une fonction quand le mobile est arrivé a destination";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);

    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo != null) {
      if ((localcUo instanceof dMM)) {
        dMM localdMM = (dMM)localcUo;
        bXf localbXf = cYS();
        String str = Bv(1);
        bFB[] arrayOfbFB = eT(2, paramInt);
        boolean bool = localbXf.a(str, arrayOfbFB);

        cH localcH = new cH(this, bool, localbXf, str, arrayOfbFB);

        localdMM.b(localcH);
      }
    }
    else a(K, "le mobile " + l + " n'existe pas ");
  }
}