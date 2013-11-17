package com.ankamagames.baseImpl.graphics.script.function.camera;

import aWe;
import bYE;
import bxT;
import cXf;
import com.ankamagames.baseImpl.graphics.script.CameraFunctionsLibrary;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class GetWorldTarget extends dsg
{
  private static final Logger K = Logger.getLogger(GetWorldTarget.class);

  public GetWorldTarget(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getWorldTarget";
  }

  public String getDescription()
  {
    return "Permet de récupérer la position actuelle de la caméra";
  }

  public bYE[] ce()
  {
    return null;
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("posX", "Position x", bxT.gjb, false), new bYE("posY", "Position y", bxT.gjb, false), new bYE("posZ", "Position z", bxT.gjb, false) };
  }

  public void S(int paramInt)
  {
    cXf localcXf = CameraFunctionsLibrary.bvj().bvi();

    if (localcXf != null) {
      aWe localaWe = localcXf.cKV();

      dj(localaWe.xV());
      dj(localaWe.xW());
      dj(localaWe.getAltitude());
    } else {
      a(K, "Pas de scene associé à CameraFunctionsLibrary");
      cYR();
      cYR();
      cYR();
    }
  }
}