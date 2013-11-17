package com.ankamagames.baseImpl.graphics.script.function.sound;

import bYE;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

public class PlayMusic extends dsg
{
  private static final bYE[] Rf = { new bYE("musicFileId", "Id du fichier à jouer", bxT.giY, false) };

  public PlayMusic(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "playMusic";
  }

  public String getDescription()
  {
    return "Joue une musique (son relativement long, et bouclant) au sein du monde.";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    long l = Bu(0);
  }
}