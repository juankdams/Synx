package com.ankamagames.baseImpl.graphics.script.function.sound;

import bYE;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class StopMusic extends dsg
{
  private static final Logger K = Logger.getLogger(StopMusic.class);

  public StopMusic(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName()
  {
    return "stopMusic";
  }

  public String getDescription()
  {
    return "Stop une musique en cours de lecture";
  }

  public bYE[] ce()
  {
    return null;
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    a(K, "stop music not yet implemented");
  }
}