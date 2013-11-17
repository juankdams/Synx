package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public final class ApplyEquipment extends dsg
{
  private static final Logger K = Logger.getLogger(ApplyEquipment.class);
  private static final String NAME = "applyEquipment";
  private static final bYE[] Rf = { new bYE("mobileId", null, bxT.giY, false), new bYE("equipmentFileId", null, bxT.gjb, false) };

  public ApplyEquipment(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "applyEquipment";
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
    int i = Br(1);

    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo != null)
      localcUo.ie(i);
    else
      a(K, "le mobile " + l + " n'existe pas ");
  }
}