package com.ankamagames.baseImpl.graphics.script;

import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

public class ResetMusicMix extends dsg
{
  public ResetMusicMix(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "resetMusicMix";
  }

  public String getDescription()
  {
    return "Ramène le réglage du mixage musique/son de combat aux paramètres par défaut";
  }

  public bYE[] ce()
  {
    return null;
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    SoundFunctionsLibrary.ckJ().bbc();
  }
}