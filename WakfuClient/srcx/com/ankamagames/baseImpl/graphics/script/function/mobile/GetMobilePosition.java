package com.ankamagames.baseImpl.graphics.script.function.mobile;

import ahm;
import bQK;
import bYE;
import bxT;
import dps;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class GetMobilePosition extends dsg
{
  private static final Logger K = Logger.getLogger(GetMobilePosition.class);
  private static final String NAME = "getMobilePosition";
  private static final bYE[] Rf = { new bYE("mobileId", "L'Id du mobile", bxT.giY, false) };

  private static final bYE[] bxk = { new bYE("posX", "Position x", bxT.gja, false), new bYE("posY", "Position y", bxT.gja, false), new bYE("posZ", "Position z", bxT.gja, false) };

  public GetMobilePosition(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getMobilePosition";
  }

  public String getDescription()
  {
    return "Récupère la position d'un mobile";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public final bYE[] cf()
  {
    return bxk;
  }

  public void S(int paramInt)
  {
    long l = Bu(0);

    Object localObject = bQK.bXG().gY(l);
    if (localObject == null)
      localObject = dps.cXa().jR(l);
    if (localObject != null) {
      Bz(((ahm)localObject).fa());
      Bz(((ahm)localObject).fb());
      Bz((int)((ahm)localObject).getAltitude());
    } else {
      a(K, "le mobile " + l + " n'existe pas ");
      cYR();
      cYR();
      cYR();
    }
  }
}