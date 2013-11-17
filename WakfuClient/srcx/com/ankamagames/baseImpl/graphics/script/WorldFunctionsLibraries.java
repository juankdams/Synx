package com.ankamagames.baseImpl.graphics.script;

import com.ankamagames.baseImpl.graphics.script.function.world.RunOnFadeIn;
import com.ankamagames.baseImpl.graphics.script.function.world.RunOnFadeOut;
import com.ankamagames.baseImpl.graphics.script.function.world.SetLoading;
import com.ankamagames.baseImpl.graphics.script.function.world.SetPictoAlpha;
import com.ankamagames.baseImpl.graphics.script.function.world.SetPictoColor;
import com.ankamagames.baseImpl.graphics.script.function.world.SetVideoLoading;
import dsg;
import hQ;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class WorldFunctionsLibraries extends hQ
{
  private static final Logger K = Logger.getLogger(WorldFunctionsLibraries.class);

  private static final WorldFunctionsLibraries hAc = new WorldFunctionsLibraries();

  public static WorldFunctionsLibraries cib()
  {
    return hAc;
  }

  public dsg[] b(LuaState paramLuaState) {
    return new dsg[] { new RunOnFadeIn(paramLuaState), new RunOnFadeOut(paramLuaState), new SetPictoAlpha(paramLuaState), new SetPictoColor(paramLuaState), new SetLoading(paramLuaState), new SetVideoLoading(paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }

  public final String getName()
  {
    return "World";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }
}