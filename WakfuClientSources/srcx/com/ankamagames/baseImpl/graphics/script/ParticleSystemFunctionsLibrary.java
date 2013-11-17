package com.ankamagames.baseImpl.graphics.script;

import com.ankamagames.baseImpl.graphics.script.function.particle.AddParticleSystem;
import com.ankamagames.baseImpl.graphics.script.function.particle.AddParticleSystemToInteractiveElement;
import com.ankamagames.baseImpl.graphics.script.function.particle.AddParticleSystemToInteractiveElementWithOffset;
import com.ankamagames.baseImpl.graphics.script.function.particle.AddParticleSystemToMobile;
import com.ankamagames.baseImpl.graphics.script.function.particle.AddParticleSystemToMobileWithOffset;
import com.ankamagames.baseImpl.graphics.script.function.particle.AddTweenParticleSystem;
import com.ankamagames.baseImpl.graphics.script.function.particle.ClearParticleSystemOnMobile;
import com.ankamagames.baseImpl.graphics.script.function.particle.RemoveParticleSystem;
import com.ankamagames.baseImpl.graphics.script.function.particle.TimeTweenParticleSystem;
import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class ParticleSystemFunctionsLibrary extends hQ
{
  private static final ParticleSystemFunctionsLibrary eVw = new ParticleSystemFunctionsLibrary();

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new AddTweenParticleSystem(paramLuaState), new AddParticleSystem(paramLuaState), new RemoveParticleSystem(paramLuaState), new AddParticleSystemToMobile(paramLuaState), new TimeTweenParticleSystem(paramLuaState), new AddParticleSystemToInteractiveElement(paramLuaState), new AddParticleSystemToInteractiveElementWithOffset(paramLuaState), new AddParticleSystemToMobileWithOffset(paramLuaState), new ClearParticleSystemOnMobile(paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }

  public static ParticleSystemFunctionsLibrary bjA()
  {
    return eVw;
  }

  public final String getName()
  {
    return "Particle";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }
}