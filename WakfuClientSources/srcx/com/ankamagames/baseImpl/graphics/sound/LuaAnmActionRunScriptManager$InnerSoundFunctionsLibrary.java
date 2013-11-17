package com.ankamagames.baseImpl.graphics.sound;

import ahm;
import dsg;
import hQ;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class LuaAnmActionRunScriptManager$InnerSoundFunctionsLibrary extends hQ
{
  private final Logger daR = Logger.getLogger(InnerSoundFunctionsLibrary.class);
  private final ahm daS;

  private LuaAnmActionRunScriptManager$InnerSoundFunctionsLibrary(ahm paramahm)
  {
    this.daS = paramahm;
  }

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
    return new dsg[] { new LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.PlaySound(this, paramLuaState), new LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.PlayRandomSound(this, paramLuaState), new LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.PlayLocalSound(this, paramLuaState), new LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.PlayLocalRandomSound(this, paramLuaState), new LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.PlayBark(this, paramLuaState), new LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.PlayGroundSound(this, paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }
}