package com.ankamagames.baseImpl.graphics.script.function.camera;

import bYE;
import bxT;
import cXf;
import com.ankamagames.baseImpl.graphics.script.CameraFunctionsLibrary;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class GetZoomFactor extends dsg
{
  private static final Logger K = Logger.getLogger(GetZoomFactor.class);

  public GetZoomFactor(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getZoomFactor";
  }

  public String getDescription()
  {
    return "Récupère le niveau de zoom actuel de la caméra";
  }

  public bYE[] ce()
  {
    return null;
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("zoomValue", "le niveau de zoom actuel de la caméra, entre 0.9 et 1.9", bxT.gjb, false) };
  }

  public void S(int paramInt)
  {
    cXf localcXf = CameraFunctionsLibrary.bvj().bvi();

    if (localcXf != null) {
      float f = localcXf.xU();
      dj(f);
    } else {
      a(K, "pas de camera associée à CameraFunctionsLibrary");
      cYR();
    }
  }
}