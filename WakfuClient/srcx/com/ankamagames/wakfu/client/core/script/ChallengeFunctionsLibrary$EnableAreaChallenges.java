package com.ankamagames.wakfu.client.core.script;

import aIH;
import bYE;
import bmz;
import bxT;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import dsg;
import org.keplerproject.luajava.LuaState;

class ChallengeFunctionsLibrary$EnableAreaChallenges extends dsg
{
  public ChallengeFunctionsLibrary$EnableAreaChallenges(ChallengeFunctionsLibrary paramChallengeFunctionsLibrary, LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "enableAreaChallenges";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("enable", null, bxT.gjc, false) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    WakfuClientInstance.awy().awB().a(bmz.fEx, By(0));
  }
}