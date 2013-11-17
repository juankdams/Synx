package com.ankamagames.baseImpl.graphics.script.function.particle;

import ZP;
import bXf;
import bYE;
import bxT;
import cof;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import dsg;
import org.keplerproject.luajava.LuaObject;
import org.keplerproject.luajava.LuaState;

public class TimeTweenParticleSystem extends dsg
{
  private static final String NAME = "getTweenParticleSystemTime";
  private static final bYE[] Rf = { new bYE("particleFileId", null, bxT.gja, false), new bYE("startX", null, bxT.gja, false), new bYE("startY", null, bxT.gja, false), new bYE("startZ", null, bxT.gja, false), new bYE("destX", null, bxT.gja, false), new bYE("destY", null, bxT.gja, false), new bYE("destZ", null, bxT.gja, false), new bYE("angle", null, bxT.gja, false), new bYE("type", null, bxT.gja, false), new bYE("timeCoef", null, bxT.gjb, true), new bYE("level", null, bxT.gja, true) };

  private static final bYE[] bxk = { new bYE("movementDuration", null, bxT.gja, false) };

  public TimeTweenParticleSystem(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "getTweenParticleSystemTime";
  }

  public bYE[] ce() {
    return Rf;
  }

  public final bYE[] cf()
  {
    return bxk;
  }

  public void S(int paramInt) {
    LuaObject localLuaObject = cYS().getLuaState().getLuaObject("fightId");
    int i = -1;
    if (localLuaObject.isNumber()) {
      i = (int)localLuaObject.getNumber();
      if (!cof.cop().wa(i)) {
        Bz(0);
        return;
      }
    }
    int j = Br(0);
    int k = Br(1);
    int m = Br(2);
    int n = Br(3);
    int i1 = Br(4);
    int i2 = Br(5);
    int i3 = Br(6);
    int i4 = Br(7);
    Br(8);
    float f = paramInt >= 9 ? Bt(9) : -1.0F;
    FreeParticleSystem localFreeParticleSystem;
    if (paramInt >= 10)
      localFreeParticleSystem = cof.cop().dC(j, Br(10));
    else {
      localFreeParticleSystem = cof.cop().vY(j);
    }
    localFreeParticleSystem.f(k, m, n);
    localFreeParticleSystem.cS(i);
    ZP localZP;
    if (f < 0.0F)
      localZP = new ZP(localFreeParticleSystem, i1, i2, i3, i4);
    else {
      localZP = new ZP(localFreeParticleSystem, i1, i2, i3, i4, f);
    }
    Bz((int)localZP.alz());

    localFreeParticleSystem.axl();
  }
}