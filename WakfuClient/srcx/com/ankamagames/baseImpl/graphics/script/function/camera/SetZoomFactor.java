package com.ankamagames.baseImpl.graphics.script.function.camera;

import bYE;
import bxT;
import cXf;
import com.ankamagames.baseImpl.graphics.script.CameraFunctionsLibrary;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetZoomFactor extends dsg
{
  private static final Logger K = Logger.getLogger(SetZoomFactor.class);

  public SetZoomFactor(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setZoomFactor";
  }

  public String getDescription()
  {
    return "Défini le niveau de zoom de la caméra";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("zoomValue", "Float compris entre 0.9 et 1.9 indiquant le nouveau niveau de zoom de la caméra", bxT.gjb, false) };
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    float f = Bt(0);

    cXf localcXf = CameraFunctionsLibrary.bvj().bvi();

    if (localcXf != null)
      localcXf.B(f);
    else
      a(K, "pas de camera associée à CameraFunctionsLibrary");
  }
}