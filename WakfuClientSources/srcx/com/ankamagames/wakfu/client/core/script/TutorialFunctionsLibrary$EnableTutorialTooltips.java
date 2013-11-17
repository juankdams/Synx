package com.ankamagames.wakfu.client.core.script;

import bYE;
import buj;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

class TutorialFunctionsLibrary$EnableTutorialTooltips extends dsg
{
  public TutorialFunctionsLibrary$EnableTutorialTooltips(TutorialFunctionsLibrary paramTutorialFunctionsLibrary, LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "enableTutorialTooltips";
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
    buj.bCk().setEnabled(By(0));
  }
}