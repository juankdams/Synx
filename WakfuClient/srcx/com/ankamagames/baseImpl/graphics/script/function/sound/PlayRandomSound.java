package com.ankamagames.baseImpl.graphics.script.function.sound;

import bCO;
import bXf;
import bYE;
import bxT;
import com.ankamagames.baseImpl.graphics.script.SoundFunctionsLibrary;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class PlayRandomSound extends dsg
{
  private static final Logger K = Logger.getLogger(PlaySound.class);
  private static final bYE[] Rf = { new bYE("soundId, gain", null, bxT.gje, true) };

  public PlayRandomSound(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "playRandomSound";
  }

  public final bYE[] ce()
  {
    return Rf;
  }

  public final bYE[] cf()
  {
    return null;
  }

  public final void S(int paramInt)
  {
    if (!SoundFunctionsLibrary.ckJ().atb()) {
      return;
    }
    if (paramInt % 2 != 0) {
      return;
    }

    int i = bCO.cL(0, paramInt / 2);
    long l = Bu(2 * i);
    int j = Br(2 * i + 1);
    try
    {
      if (l != 0L)
        SoundFunctionsLibrary.ckJ().a(l, j / 100.0F, 1, -1L, -1L, cYS().a());
      else
        K.error("Id du son nul");
    }
    catch (Exception localException) {
      a(K, "soundExtension or soundPath not initialized " + localException);
    }
  }
}