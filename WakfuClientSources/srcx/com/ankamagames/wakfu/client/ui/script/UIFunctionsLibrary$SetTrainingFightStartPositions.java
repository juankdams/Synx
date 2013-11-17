package com.ankamagames.wakfu.client.ui.script;

import aiI;
import bYE;
import cYk;
import cqB;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$SetTrainingFightStartPositions extends dsg
{
  UIFunctionsLibrary$SetTrainingFightStartPositions(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setStartPositions";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XM();
  }

  public String getDescription() {
    return "Spécifie la position des attaquants et défenseurs d'un combat d'entraînement";
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
    localcqB.P(new cYk(Br(1), Br(2), (short)Br(3)));
    localcqB.Q(new cYk(Br(4), Br(5), (short)Br(6)));
  }
}