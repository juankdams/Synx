package com.ankamagames.baseImpl.graphics.script.function.camera;

import aWe;
import bYE;
import bxT;
import cXf;
import com.ankamagames.baseImpl.graphics.script.CameraFunctionsLibrary;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetZoomSpeedFactor extends dsg
{
  private static final Logger K = Logger.getLogger(SetZoomSpeedFactor.class);

  public SetZoomSpeedFactor(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setZoomSpeedFactor";
  }

  public String getDescription()
  {
    return "Définit la vitesse à laquelle une modification de zoom s'applique";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("speed", "Float définissant la vitesse à laquelle le zoom se modifie par rapport à la vitesse de base", bxT.gjb, true) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    cXf localcXf = CameraFunctionsLibrary.bvj().bvi();
    if (localcXf != null)
      localcXf.cKV().E((float)Bs(0));
    else
      a(K, "pas de camera associée à CameraFunctionsLibrary");
  }
}