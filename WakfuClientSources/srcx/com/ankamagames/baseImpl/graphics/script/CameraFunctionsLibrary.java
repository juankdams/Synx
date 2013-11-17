package com.ankamagames.baseImpl.graphics.script;

import cXf;
import com.ankamagames.baseImpl.graphics.script.function.camera.AttachCameraToMobile;
import com.ankamagames.baseImpl.graphics.script.function.camera.GetWorldTarget;
import com.ankamagames.baseImpl.graphics.script.function.camera.GetZoomFactor;
import com.ankamagames.baseImpl.graphics.script.function.camera.ScrollTo;
import com.ankamagames.baseImpl.graphics.script.function.camera.SetCamera;
import com.ankamagames.baseImpl.graphics.script.function.camera.SetMoveSpeedFactor;
import com.ankamagames.baseImpl.graphics.script.function.camera.SetUserZoomLocked;
import com.ankamagames.baseImpl.graphics.script.function.camera.SetWorldTarget;
import com.ankamagames.baseImpl.graphics.script.function.camera.SetZoomFactor;
import com.ankamagames.baseImpl.graphics.script.function.camera.SetZoomSpeedFactor;
import com.ankamagames.baseImpl.graphics.script.function.camera.ZoomOn;
import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class CameraFunctionsLibrary extends hQ
{
  private static final CameraFunctionsLibrary fAx = new CameraFunctionsLibrary();

  private cXf fAy = null;

  public cXf bvi() {
    return this.fAy;
  }

  public void d(cXf paramcXf) {
    this.fAy = paramcXf;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new SetCamera(paramLuaState), new ZoomOn(paramLuaState), new GetWorldTarget(paramLuaState), new SetWorldTarget(paramLuaState), new GetZoomFactor(paramLuaState), new SetZoomFactor(paramLuaState), new AttachCameraToMobile(paramLuaState), new SetUserZoomLocked(paramLuaState), new SetZoomSpeedFactor(paramLuaState), new SetMoveSpeedFactor(paramLuaState), new ScrollTo(paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }

  public static CameraFunctionsLibrary bvj()
  {
    return fAx;
  }

  public final String getName()
  {
    return "Camera";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }
}