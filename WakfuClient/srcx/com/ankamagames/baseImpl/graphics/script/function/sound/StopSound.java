package com.ankamagames.baseImpl.graphics.script.function.sound;

import ZG;
import bYE;
import bxT;
import cFl;
import com.ankamagames.baseImpl.graphics.script.SoundFunctionsLibrary;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class StopSound extends dsg
{
  private static final Logger K = Logger.getLogger(StopSound.class);
  private static final bYE[] Rf = { new bYE("soundUID", "UID du fichier son", bxT.giY, false) };

  public StopSound(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "stopSound";
  }

  public String getDescription()
  {
    return "Stoppe un son au sein du monde.";
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
    long l = Bu(0);
    ZG localZG = cFl.cAH().ir(l);
    SoundFunctionsLibrary.ckJ().a(l, localZG);
  }
}