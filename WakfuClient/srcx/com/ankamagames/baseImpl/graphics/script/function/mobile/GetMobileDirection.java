package com.ankamagames.baseImpl.graphics.script.function.mobile;

import CG;
import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class GetMobileDirection extends dsg
{
  private static final Logger K = Logger.getLogger(GetMobileDirection.class);
  private static final String NAME = "getMobileDirection";
  private static final bYE[] Rf = { new bYE("mobileId", "L'Id du mobile", bxT.giY, false) };

  private static final bYE[] Vt = { new bYE("directionIndex", "L'Id de la direction du mobile", bxT.gja, false) };

  public GetMobileDirection(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getMobileDirection";
  }

  public String getDescription()
  {
    return "Retourne la direction actuelle du mobile dans un système à 8 directions.";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public final bYE[] cf()
  {
    return Vt;
  }

  public void S(int paramInt)
  {
    long l = Bu(0);

    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo != null) {
      Bz(localcUo.E().m_index);
    } else {
      a(K, "le mobile " + l + " n'existe pas ");
      cYR();
    }
  }
}