package com.ankamagames.wakfu.client.ui.script;

import aiI;
import bYE;
import cYk;
import cqB;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$SetTrainingFightBattleGroundCenter extends dsg
{
  UIFunctionsLibrary$SetTrainingFightBattleGroundCenter(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setBattlegroundCenter";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XL();
  }

  public String getDescription() {
    return "Spécifie la position du centre du battleground d'un combat d'entraînement";
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
    localcqB.O(new cYk(Br(1), Br(2), (short)Br(3)));
  }
}