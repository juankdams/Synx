package com.ankamagames.baseImpl.graphics.script.function.sound;

import Yo;
import aVB;
import bYE;
import bxT;
import cWS;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import com.ankamagames.baseImpl.graphics.script.SoundFunctionsLibrary;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class PlayApsSound extends dsg
{
  private static final Logger K = Logger.getLogger(PlayApsSound.class);
  private static final bYE[] Rf = { new bYE("soundFileId", null, bxT.giY, false), new bYE("fightId", null, bxT.gja, false), new bYE("gain", null, bxT.gja, false), new bYE("apsId", null, bxT.gja, false), new bYE("duration", null, bxT.gja, false), new bYE("fadeOutTime", null, bxT.gja, false), new bYE("rollOffId", null, bxT.gja, false), new bYE("loop", null, bxT.gjc, false) };

  public PlayApsSound(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "playApsSound";
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
    long l1 = System.currentTimeMillis();
    long l2 = Bu(0);
    if (!Yo.ajW().i(l1, l2)) {
      return;
    }
    int i = Br(1);
    float f = Br(2) / 100.0F;
    int j = Br(3);
    int k = Br(4);
    int m = Br(5);
    int n = Br(6);
    boolean bool = By(7);

    long l3 = k != -1 ? l1 + k : -1L;
    long l4 = m != 0 ? l3 - m : -1L;

    IsoParticleSystem localIsoParticleSystem = cWS.cKD().zj(j);
    try
    {
      if (l2 != 0L)
      {
        aVB localaVB;
        if (localIsoParticleSystem != null)
          localaVB = SoundFunctionsLibrary.ckJ().a(l2, f, bool ? 0 : 1, l3, l4, i, localIsoParticleSystem, n, false);
        else {
          localaVB = SoundFunctionsLibrary.ckJ().a(l2, f, bool ? 0 : 1, l3, l4, i);
        }

        if (localaVB != null)
          Yo.ajW().a(j, localaVB.akM(), l1, l2);
      }
      else {
        K.error("Id du son nul");
      }
    } catch (Exception localException) {
      a(K, "soundExtension or soundPath not initialized " + localException);
    }
  }
}