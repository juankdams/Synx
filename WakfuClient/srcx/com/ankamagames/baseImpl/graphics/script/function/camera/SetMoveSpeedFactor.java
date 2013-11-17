package com.ankamagames.baseImpl.graphics.script.function.camera;

import aWe;
import bYE;
import bxT;
import cXf;
import com.ankamagames.baseImpl.graphics.script.CameraFunctionsLibrary;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetMoveSpeedFactor extends dsg
{
  private static final Logger K = Logger.getLogger(SetMoveSpeedFactor.class);

  public SetMoveSpeedFactor(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setMoveSpeedFactor";
  }

  public String getDescription()
  {
    return "Définit la vitesse à laquelle la camera se déplace par rapport à la vitesse de base";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("speedFactor", "Vitesse de déplacement", bxT.gjb, true) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    cXf localcXf = CameraFunctionsLibrary.bvj().bvi();
    if (localcXf != null)
      localcXf.cKV().F((float)Bs(0));
    else
      a(K, "pas de camera associée à CameraFunctionsLibrary");
  }
}