package com.ankamagames.baseImpl.graphics.script.function.sound;

import Yo;
import aVB;
import bCO;
import bYE;
import bxT;
import cWS;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import com.ankamagames.baseImpl.graphics.script.SoundFunctionsLibrary;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class PlayRandomApsSound extends dsg
{
  private static final Logger K = Logger.getLogger(PlayRandomApsSound.class);
  private static final bYE[] Rf = { new bYE("fightId", null, bxT.gja, false), new bYE("apsId", null, bxT.gja, false), new bYE("duration", null, bxT.gja, false), new bYE("fadeOutTime", null, bxT.gja, false), new bYE("rollOffId", null, bxT.gja, false), new bYE("loop", null, bxT.gjc, false), new bYE("soundId,gain", null, bxT.gje, true) };

  public PlayRandomApsSound(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "playRandomApsSound";
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
    int i = Br(0);
    int j = Br(1);
    int k = Br(2);
    int m = Br(3);
    int n = Br(4);
    boolean bool = By(5);

    int i1 = bCO.sf((paramInt - 6) / 2) * 2 + 6;
    long l1 = Bu(i1);
    long l2 = System.currentTimeMillis();

    if (!Yo.ajW().i(l2, l1)) {
      return;
    }
    float f = Br(i1 + 1) / 100.0F;

    long l3 = l2 + k;
    long l4 = m != 0 ? l3 - m : 0L;

    IsoParticleSystem localIsoParticleSystem = cWS.cKD().zj(j);
    try
    {
      if (l1 != 0L)
      {
        aVB localaVB;
        if (localIsoParticleSystem == null)
          localaVB = SoundFunctionsLibrary.ckJ().a(l1, f, bool ? 0 : 1, l3, l4, i);
        else {
          localaVB = SoundFunctionsLibrary.ckJ().a(l1, f, bool ? 0 : 1, l3, l4, i, localIsoParticleSystem, n, false);
        }

        if (localaVB != null)
          Yo.ajW().a(j, localaVB.akM(), l2, l1);
      }
      else {
        K.error("Id du son nul");
      }
    } catch (Exception localException) {
      a(K, "soundExtension or soundPath not initialized " + localException);
    }
  }
}