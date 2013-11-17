package com.ankamagames.baseImpl.graphics.script.function.particle;

import ahm;
import bXf;
import bYE;
import bxT;
import cWS;
import cof;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public abstract class AddParticleSystemTo extends dsg
{
  private static final Logger K = Logger.getLogger(AddParticleSystemTo.class);

  protected AddParticleSystemTo(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public bYE[] cf() {
    return new bYE[] { new bYE("systemId", null, bxT.gja, false) };
  }

  protected abstract ahm m(long paramLong);

  protected abstract void a(FreeParticleSystem paramFreeParticleSystem, ahm paramahm, int paramInt);

  protected final void c(FreeParticleSystem paramFreeParticleSystem)
  {
    int i = cYS().a();
    if (i != -1)
      paramFreeParticleSystem.cS(i);
  }

  protected void S(int paramInt)
  {
    long l = Bu(1);
    ahm localahm = m(l);
    if ((localahm != null) && (!cof.cop().wa(localahm.aeR())))
    {
      Bz(0);
      return;
    }

    int i = Br(0);
    FreeParticleSystem localFreeParticleSystem;
    if (paramInt >= 3)
      localFreeParticleSystem = cof.cop().dC(i, Br(2));
    else {
      localFreeParticleSystem = cof.cop().vY(i);
    }
    if (localahm != null) {
      a(localFreeParticleSystem, localahm, paramInt);

      cWS.cKD().b(localFreeParticleSystem);
      Bz(localFreeParticleSystem.getId());
    } else {
      a(K, "pas d'élément interactif trouvé " + l);
      cYR();
    }
  }
}