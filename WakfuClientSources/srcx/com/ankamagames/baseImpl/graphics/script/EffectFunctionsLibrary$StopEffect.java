package com.ankamagames.baseImpl.graphics.script;

import Pb;
import adQ;
import bYE;
import bxT;
import cmL;
import dsg;
import org.keplerproject.luajava.LuaState;

class EffectFunctionsLibrary$StopEffect extends dsg
{
  EffectFunctionsLibrary$StopEffect(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "stopEffect";
  }

  public String getDescription()
  {
    return "Arrête l'execution d'un effet";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("effectId", "L'id de l'effet", bxT.gjb, false) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    if ((i == cmL.hSc) || (i == cmL.hSd))
    {
      return;
    }

    adQ localadQ = Pb.aaU().gh(i);
    if (localadQ != null) {
      localadQ.L(false);
      Pb.aaU().b(localadQ);
      localadQ.clear();
    }
  }
}