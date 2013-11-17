package com.ankamagames.baseImpl.graphics.script.function.particle;

import bXf;
import bYE;
import bxT;
import cWS;
import cof;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import dsg;
import org.keplerproject.luajava.LuaObject;
import org.keplerproject.luajava.LuaState;

public class AddParticleSystem extends dsg
{
  private static final String NAME = "addParticleSystem";
  private static final bYE[] Rf = { new bYE("particleFileId", "Id du systeme", bxT.gja, false), new bYE("x", "Position x", bxT.gja, false), new bYE("y", "Position y", bxT.gja, false), new bYE("z", "Position z", bxT.gja, false), new bYE("level", "Niveau du systeme", bxT.gja, true), new bYE("fightId", null, bxT.gja, true) };

  private static final bYE[] bxk = { new bYE("systemId", "Id unique de l'APS", bxT.gja, false) };

  public AddParticleSystem(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addParticleSystem";
  }

  public String getDescription()
  {
    return "Ajoute un système de particules à un endroit bien précis du monde.";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public final bYE[] cf()
  {
    return bxk;
  }

  public void S(int paramInt)
  {
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
    if (j == 0) {
      Bz(-1);
      return;
    }

    if (paramInt >= 6) {
      i = Br(5);
    }
    int k = Br(1);
    int m = Br(2);
    int n = Br(3);
    FreeParticleSystem localFreeParticleSystem;
    if (paramInt >= 5)
      localFreeParticleSystem = cof.cop().dC(j, Br(4));
    else {
      localFreeParticleSystem = cof.cop().vY(j);
    }

    localFreeParticleSystem.f(k, m, n);
    localFreeParticleSystem.cS(i);
    cWS.cKD().b(localFreeParticleSystem);

    Bz(localFreeParticleSystem.getId());
  }
}