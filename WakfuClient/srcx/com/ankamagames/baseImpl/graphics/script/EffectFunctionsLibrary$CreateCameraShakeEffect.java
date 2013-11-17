package com.ankamagames.baseImpl.graphics.script;

import Pb;
import bYE;
import bxT;
import cZf;
import dsg;
import org.keplerproject.luajava.LuaState;

class EffectFunctionsLibrary$CreateCameraShakeEffect extends dsg
{
  EffectFunctionsLibrary$CreateCameraShakeEffect(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "createCameraShakeEffect";
  }

  public String getDescription()
  {
    return "Active un effet de tremblement de la caméra";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("startDuration", "Temps pendant lequel la force augmente progressivement (en ms)", bxT.gjb, true), new bYE("midDuration", "Durée de l'effet à la force max (en ms)", bxT.gjb, true), new bYE("endDuration", "Temps pendant lequel la force diminue progressivement (en ms)", bxT.gjb, true), new bYE("amplitude", "Amplitude max des mouvements", bxT.gjb, true), new bYE("period", "Période du tremblement", bxT.gjb, true), new bYE("direction", "Application de l'effet selon l'axe 'X', 'Y', ou 'BOTH' ('XY')", bxT.giZ, true) };
  }

  public bYE[] cf()
  {
    return new bYE[] { new bYE("effectId", "Id de l'efet", bxT.gja, false) };
  }

  protected void S(int paramInt)
  {
    int i = 1000;
    int j = 2000;
    int k = 1000;
    float f1 = 0.5F;
    float f2 = 77.0F;
    String str = "BOTH";

    if (paramInt >= 1) {
      i = (int)Bs(0);
    }
    if (paramInt >= 2) {
      j = (int)Bs(1);
    }
    if (paramInt >= 3) {
      k = (int)Bs(2);
    }
    if (paramInt >= 4) {
      f1 = (float)Bs(3);
    }
    if (paramInt == 5) {
      f2 = (float)Bs(4);
    }
    if (paramInt == 6) {
      str = Bv(5).toUpperCase();
    }

    cZf localcZf = new cZf();
    localcZf.setDirection(str);
    localcZf.am(f2, f1);
    EffectFunctionsLibrary.b(i, j, k, localcZf, EffectFunctionsLibrary.cPT());

    Pb.aaU().a(localcZf);
    Bz(localcZf.getId());
  }
}