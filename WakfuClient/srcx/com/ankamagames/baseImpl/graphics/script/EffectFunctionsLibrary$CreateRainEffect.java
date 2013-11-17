package com.ankamagames.baseImpl.graphics.script;

import Pb;
import bYE;
import bxT;
import cZv;
import czT;
import dsg;
import org.keplerproject.luajava.LuaState;

class EffectFunctionsLibrary$CreateRainEffect extends dsg
{
  EffectFunctionsLibrary$CreateRainEffect(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "createRainEffect";
  }

  public String getDescription()
  {
    return "Active un effet de pluie";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("numParticles", "Nombre de gouttes à l'écran", bxT.gjb, true), new bYE("numParticlesPerSpawn", "Nombre de gouttes à générer", bxT.gjb, true), new bYE("spawnFrequency", "On régenère numParticlesPerSpawn toutes les spawnFrequency millisecondes", bxT.gjb, true), new bYE("particleLifeTime", "Durée de vie d'une goutte", bxT.gjb, true), new bYE("particleHeight", "Taille d'une goutte", bxT.gjb, true), new bYE("particleVelocity", "Vitesse de chute des gouttes", bxT.gjb, true), new bYE("particleAlpha", "Transparence des gouttes", bxT.gjb, true), new bYE("particleAngle", "Angle (en radian) selon lequel tombe les gouttes", bxT.gjb, true), new bYE("particleAngleRandom", "Aléatoire sur l'angle (en radian à ajouter à particleAngle)", bxT.gjb, true) };
  }

  public bYE[] cf()
  {
    return new bYE[] { new bYE("effectId", "Id de l'effet", bxT.gja, false) };
  }

  protected void S(int paramInt)
  {
    int i = 512;
    float f1 = 128.0F;
    float f2 = 100.0F;
    float f3 = 300.0F;
    float f4 = 4.0F;
    float f5 = -60.0F;
    float f6 = 0.25F;
    float f7 = -1.256637F;
    float f8 = 0.1570796F;

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
    if (paramInt >= 6) {
      f5 = (float)Bs(5);
    }
    if (paramInt == 7) {
      f6 = (float)Bs(6);
    }
    if (paramInt == 8) {
      f7 = (float)Bs(7);
    }
    if (paramInt == 9) {
      f8 = (float)Bs(8);
    }

    cZv localcZv = new cZv();
    localcZv.initialize(i);
    localcZv.an(f7, f8);
    localcZv.a(1.0F, 1.0F, 1.0F, f6, 0.0F);
    localcZv.b(f1, f2, f3, f4, f5, 0.0F);
    localcZv.a(EffectFunctionsLibrary.cPT());
    localcZv.a(new czT(-18.0F, 18.0F, -18.0F, 18.0F, -18.0F, 18.0F));

    Pb.aaU().a(localcZv);
    Bz(localcZv.getId());
  }
}