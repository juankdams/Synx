package com.ankamagames.baseImpl.graphics.script;

import Pb;
import Ud;
import bYE;
import bxT;
import czT;
import dsg;
import org.keplerproject.luajava.LuaState;

class EffectFunctionsLibrary$CreateSnowEffect extends dsg
{
  EffectFunctionsLibrary$CreateSnowEffect(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "createSnowEffect";
  }

  public String getDescription()
  {
    return "Active un effet de neige";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("numParticles", "Nombre de flocons à l'écran", bxT.gjb, true), new bYE("numParticlesPerSpawn", "Nombre de flocons a régénérer", bxT.gjb, true), new bYE("spawnFrequency", "On régenère numParticlesPerSpawn toutes les spawnFrequency millisecondes", bxT.gjb, true), new bYE("particleLifeTime", "Durée de vie d'un flocon", bxT.gjb, true), new bYE("particleSize", "Taille d'un flocon", bxT.gjb, true), new bYE("particleVelocity", "Vitesse d'un flocon", bxT.gjb, true), new bYE("windSpeed", "Vitesse du vent", bxT.gjb, true) };
  }

  public bYE[] cf()
  {
    return new bYE[] { new bYE("effectId", "Id de l'effet", bxT.gja, false) };
  }

  protected void S(int paramInt)
  {
    int i = 512;
    float f1 = 10.0F;
    float f2 = 300.0F;
    float f3 = 20000.0F;
    float f4 = 3.0F;

    if (paramInt >= 1) {
      i = Br(0);
    }
    if (paramInt >= 2) {
      f1 = (float)Bs(1);
    }
    if (paramInt >= 3) {
      f2 = (float)Bs(2);
    }
    if (paramInt >= 4) {
      f3 = (float)Bs(3);
    }
    if (paramInt >= 5) {
      f4 = (float)Bs(4);
    }

    Ud localUd = new Ud();
    localUd.initialize(i);
    localUd.e(f1, f2, f3, f4);
    localUd.a(EffectFunctionsLibrary.cPT());
    localUd.a(new czT(-18.0F, 18.0F, -18.0F, 18.0F, -18.0F, 18.0F));

    Pb.aaU().a(localUd);
    Bz(localUd.getId());
  }
}