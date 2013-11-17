package com.ankamagames.wakfu.client.core.script;

import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class InteractiveDialogScriptManager$InnerSoundFunctionsLibrary extends hQ
{
  public final String getName()
  {
    return "Sound";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new InteractiveDialogScriptManager.InnerSoundFunctionsLibrary.PlaySound(paramLuaState), new InteractiveDialogScriptManager.InnerSoundFunctionsLibrary.PlayRandomSound(paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }
}