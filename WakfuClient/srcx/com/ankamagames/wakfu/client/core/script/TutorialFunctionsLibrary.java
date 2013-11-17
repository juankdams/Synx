package com.ankamagames.wakfu.client.core.script;

import dsg;
import hQ;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class TutorialFunctionsLibrary extends hQ
{
  private static final Logger K = Logger.getLogger(TutorialFunctionsLibrary.class);

  private static final TutorialFunctionsLibrary iDA = new TutorialFunctionsLibrary();

  public static TutorialFunctionsLibrary cCn() {
    return iDA;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new TutorialFunctionsLibrary.EnableTutorialTooltips(this, paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }

  public final String getName()
  {
    return "Tutorial";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }
}