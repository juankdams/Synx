package com.ankamagames.baseImpl.graphics.script.function.camera;

import aWe;
import bYE;
import bxT;
import cXf;
import com.ankamagames.baseImpl.graphics.script.CameraFunctionsLibrary;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetUserZoomLocked extends dsg
{
  private static final Logger K = Logger.getLogger(SetUserZoomLocked.class);

  public SetUserZoomLocked(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setUserZoomLocked";
  }

  public String getDescription()
  {
    return "Empêche l'utilisation de la molette pour zoomer";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("zoomLocked", "True pour bloquer, false sinon", bxT.gjc, false) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    cXf localcXf = CameraFunctionsLibrary.bvj().bvi();
    if (localcXf == null) {
      a(K, "pas de scene associé à CameraFunctionsLibrary");
      return;
    }
    aWe localaWe = localcXf.cKV();
    if (localaWe == null) {
      a(K, "pas de camera associé à la scene");
      return;
    }
    localaWe.R(By(0));
  }
}