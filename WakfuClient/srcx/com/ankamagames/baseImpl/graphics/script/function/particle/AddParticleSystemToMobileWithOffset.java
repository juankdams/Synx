package com.ankamagames.baseImpl.graphics.script.function.particle;

import ahm;
import bYE;
import bxT;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class AddParticleSystemToMobileWithOffset extends AddParticleSystemToMobile
{
  private static final Logger K = Logger.getLogger(AddParticleSystemToMobileWithOffset.class);
  private static final String NAME = "addParticleSystemToTargetWithOffset";
  private static final bYE[] Rf = { new bYE("particleFileId", null, bxT.gja, false), new bYE("targetId", null, bxT.giY, false), new bYE("level", null, bxT.gja, false), new bYE("height", null, bxT.gja, true) };

  public AddParticleSystemToMobileWithOffset(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addParticleSystemToTargetWithOffset";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  protected void a(FreeParticleSystem paramFreeParticleSystem, ahm paramahm, int paramInt) {
    int i = paramInt == 4 ? Br(3) : paramahm.ats();
    paramFreeParticleSystem.a(paramahm, 0.0F, i);
    c(paramFreeParticleSystem);
  }
}