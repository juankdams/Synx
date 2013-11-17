package com.ankamagames.baseImpl.graphics.script.function.particle;

import ahm;
import bQK;
import bYE;
import bxT;
import cUo;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import dps;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class AddParticleSystemToMobile extends AddParticleSystemTo
{
  private static final Logger K = Logger.getLogger(AddParticleSystemToMobile.class);
  private static final String NAME = "addParticleSystemToTarget";
  private static final bYE[] Rf = { new bYE("particleFileId", "Id du systeme", bxT.gja, false), new bYE("targetId", "Id du mobile", bxT.giY, false), new bYE("level", "Niveau du systeme", bxT.gja, true) };

  public AddParticleSystemToMobile(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addParticleSystemToTarget";
  }

  public String getDescription()
  {
    return "Ajoute un systeme de particule à un mobile";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  protected ahm m(long paramLong) {
    cUo localcUo = bQK.bXG().gY(paramLong);
    if (localcUo != null)
      return localcUo;
    return dps.cXa().jR(paramLong);
  }

  protected void a(FreeParticleSystem paramFreeParticleSystem, ahm paramahm, int paramInt) {
    paramFreeParticleSystem.b(paramahm);
    c(paramFreeParticleSystem);
  }
}