package com.ankamagames.wakfu.client.ui.script;

import CA;
import Su;
import aiI;
import bYE;
import csx;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$AddMRU extends dsg
{
  UIFunctionsLibrary$AddMRU(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addMRU";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XI();
  }

  public String getDescription() {
    return "Ajoute un MRU d'action définie à un personnage";
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    long l = Bu(0);
    int i = Br(1);
    Su localSu = CA.Lv().bj(l);

    csx[] arrayOfcsx = localSu.adN();
    aiI[] arrayOfaiI1 = new aiI[arrayOfcsx.length];
    for (int j = 0; j < arrayOfcsx.length; j++) {
      arrayOfaiI1[j] = arrayOfcsx[j].pW();
    }

    aiI localaiI = null;
    aiI[] arrayOfaiI2 = aiI.values();
    for (int k = 0; k < arrayOfaiI2.length; k++) {
      if (arrayOfaiI2[k].eo() == i) {
        localaiI = arrayOfaiI2[k];
        break;
      }
    }

    k = 0;
    if ((paramInt < 3) || (By(2))) {
      for (int m = 0; m < arrayOfaiI1.length; m++)
        if (localaiI != null)
        {
          if (arrayOfaiI1[m].eo() == localaiI.avu().pW().eo()) {
            k = 1;
            break;
          }
        }
    }
    if (k == 0)
      localSu.a(localaiI);
  }
}