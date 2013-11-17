package com.ankamagames.baseImpl.graphics.script;

import Pb;
import bYE;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;
import wI;

class EffectFunctionsLibrary$CreateCameraSeaSicknessEffect extends dsg
{
  EffectFunctionsLibrary$CreateCameraSeaSicknessEffect(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "createCameraSeaSicknessEffect";
  }

  public String getDescription()
  {
    return "Active un effet de mal de mer";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("startDuration", "Temps pendant lequel la force augmente progressivement (en ms)", bxT.gjb, true), new bYE("midDuration", "Durée de l'effet à la force max (en ms)", bxT.gjb, true), new bYE("endDuration", "Temps pendant lequel la force diminue progressivement (en ms)", bxT.gjb, true), new bYE("amplitude", "Amplitude max des mouvements", bxT.gjb, true), new bYE("period", "Période du tremblement", bxT.gjb, true), new bYE("rotation", null, bxT.gjb, true), new bYE("direction", "Application de l'effet selon l'axe 'X', 'Y', ou 'BOTH' ('XY')", bxT.giZ, true) };
  }

  public bYE[] cf()
  {
    return new bYE[] { new bYE("effectId", "Id de l'effet", bxT.gja, false) };
  }

  protected void S(int paramInt)
  {
    int i = 0;
    int j = -1;
    int k = 0;
    float f1 = 5.0F;
    float f2 = 1500.0F;
    float f3 = 0.025F;
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
    if (paramInt >= 5) {
      f2 = (float)Bs(4);
    }
    if (paramInt >= 6) {
      f3 = (float)Bs(6);
    }
    if (paramInt >= 7) {
      str = Bv(6).toUpperCase();
    }

    wI localwI = new wI();
    localwI.setDirection(str);
    localwI.a(f2, f1, f3);
    EffectFunctionsLibrary.b(i, j, k, localwI, EffectFunctionsLibrary.cPT());

    Pb.aaU().a(localwI);
    Bz(localwI.getId());
  }
}