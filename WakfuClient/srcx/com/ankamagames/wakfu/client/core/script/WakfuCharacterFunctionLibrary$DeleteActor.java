package com.ankamagames.wakfu.client.core.script;

import bQK;
import bSH;
import bYE;
import cCZ;
import dsg;
import duf;
import org.keplerproject.luajava.LuaState;

class WakfuCharacterFunctionLibrary$DeleteActor extends dsg
{
  WakfuCharacterFunctionLibrary$DeleteActor(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "deleteActor";
  }

  public String getDescription()
  {
    return "Supprime un perso dans le monde. Attention le serveur ne connait pas cet actor.";
  }

  public bYE[] ce()
  {
    return WakfuCharacterFunctionLibrary.XA();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    long l = Bu(0);
    bQK.bXG().gX(l);

    duf.a(0, l, bSH.bZs());
    duf.b(0, l, bSH.bZs());
    duf.a(0, l, cCZ.cyZ());
  }
}