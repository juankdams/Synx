package com.ankamagames.wakfu.client.ui.script;

import aiI;
import bFB;
import bYE;
import bxT;
import cqB;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$SetTrainingFightParameters extends dsg
{
  UIFunctionsLibrary$SetTrainingFightParameters(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setTrainingParameters";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XK();
  }

  public String getDescription() {
    return "Spécifie les paramètres d'un combat d'entraînement en les fournissant à l'action MRU qui correspond";
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    int i = Br(0);
    cqB localcqB;
    if (i == aiI.dfJ.eo()) {
      localcqB = (cqB)aiI.dfJ.avu();
    } else if (i == aiI.dfK.eo()) {
      localcqB = (cqB)aiI.dfK.avu();
    } else {
      UIFunctionsLibrary.K.error("Il n'y a que 2 actions différentes de combat d'entrainement");
      return;
    }
    localcqB.gP(By(1));
    localcqB.uZ(Br(2));
    localcqB.gQ(By(3));
    localcqB.dH((byte)Br(4));

    bFB[] arrayOfbFB = eT(5, paramInt);
    int[] arrayOfInt = null;
    if (arrayOfbFB.length > 0) {
      arrayOfInt = new int[arrayOfbFB.length];
      for (int j = 0; j < arrayOfbFB.length; j++) {
        if ((arrayOfbFB[j].bNs() == bxT.gja) || (arrayOfbFB[j].bNs() == bxT.gjb)) {
          arrayOfInt[j] = ((Double)arrayOfbFB[j].getValue()).intValue();
        } else {
          UIFunctionsLibrary.K.error("Les paramètres de battleground doivent impérativement être de type nombre");
          arrayOfInt[j] = 0;
        }
      }
    }
    localcqB.L(arrayOfInt);
  }
}