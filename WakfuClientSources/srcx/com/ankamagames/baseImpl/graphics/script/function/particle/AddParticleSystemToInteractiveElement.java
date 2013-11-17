package com.ankamagames.baseImpl.graphics.script.function.particle;

import ahm;
import bVl;
import bYE;
import bxT;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class AddParticleSystemToInteractiveElement extends AddParticleSystemTo
{
  private static final Logger K = Logger.getLogger(AddParticleSystemToInteractiveElement.class);
  private static final String NAME = "addParticleSystemToIe";
  private static final bYE[] Rf = { new bYE("particleFileId", "Id du systeme", bxT.gja, false), new bYE("targetId", "Id de l'element interactif", bxT.giY, false), new bYE("level", "Niveau du systeme", bxT.gja, true) };

  public AddParticleSystemToInteractiveElement(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addParticleSystemToIe";
  }

  public String getDescription()
  {
    return "Ajoute un systeme de particule à un element interactif";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  protected ahm m(long paramLong)
  {
    return bVl.caZ().hb(paramLong);
  }

  protected void a(FreeParticleSystem paramFreeParticleSystem, ahm paramahm, int paramInt)
  {
    paramFreeParticleSystem.b(paramahm);
  }
}