package com.ankamagames.wakfu.client.core.script;

import dsg;
import hQ;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class ChallengeFunctionsLibrary extends hQ
{
  private static final Logger K = Logger.getLogger(ChallengeFunctionsLibrary.class);

  private static final ChallengeFunctionsLibrary lnC = new ChallengeFunctionsLibrary();

  public static ChallengeFunctionsLibrary cVh() {
    return lnC;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new ChallengeFunctionsLibrary.EnableAreaChallenges(this, paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }

  public final String getName()
  {
    return "Challenge";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }
}