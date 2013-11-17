package com.ankamagames.baseImpl.graphics.script.function.sound;

import aAv;
import bYE;
import bxT;
import com.ankamagames.baseImpl.graphics.script.SoundFunctionsLibrary;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class PlayLocalSound extends dsg
{
  private static final Logger K = Logger.getLogger(PlayLocalSound.class);
  private static final boolean DEBUG = true;
  private static final bYE[] Rf = { new bYE("rollOff", null, bxT.gja, false), new bYE("soundFileId", null, bxT.giY, false), new bYE("gain", null, bxT.giY, false), new bYE("posX", null, bxT.gja, false), new bYE("posY", null, bxT.gja, false), new bYE("posZ", null, bxT.gja, false) };

  public PlayLocalSound(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "playLocalSound";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public bYE[] cf() {
    return null;
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    long l = Bu(1);
    int j = Br(2);
    int k = Br(3);
    int m = Br(4);
    int n = Br(5);
    try {
      if (l > 0L) {
        SoundFunctionsLibrary.ckJ().a(l, j / 100.0F, 1, -1L, -1L, -1, new aAv(k, m, n, false, 0), i);
      }
      else
        K.warn("Pas de son spécifié (ID<=0)");
    } catch (Exception localException) {
      a(K, "soundExtension or soundPath not initialized");
    }
  }
}