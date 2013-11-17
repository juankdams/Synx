package com.ankamagames.baseImpl.graphics.script;

import bYE;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

public class SetMusicMix extends dsg
{
  private static final bYE[] Rf = { new bYE("targetGain", "Volume entre 0 et 100", bxT.gjb, false), new bYE("fadeOutTime", "Temps de transition", bxT.gjb, true) };

  public SetMusicMix(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setMusicMix";
  }

  public String getDescription()
  {
    return "Règle le volume auquel mettre la musique lorsqu'on joue les sons de combat, et le temps de transition vers ce volume";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    float f1 = (float)Bs(0);
    float f2 = -1.0F;
    if (paramInt > 1) {
      f2 = (float)Bs(1);
    }

    SoundFunctionsLibrary.ckJ().G(f1, f2);
  }
}