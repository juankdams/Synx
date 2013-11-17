package com.ankamagames.baseImpl.graphics.script.function.sound;

import bXf;
import bYE;
import bxT;
import com.ankamagames.baseImpl.graphics.script.SoundFunctionsLibrary;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class LoopSound extends dsg
{
  private static final Logger K = Logger.getLogger(PlaySound.class);
  private static final bYE[] Rf = { new bYE("soundFileId", "id du fichier son", bxT.giY, false), new bYE("isStereo", "Activation de mode stéréo", bxT.gjc, true), new bYE("gainMod", "Entier compris entre 0 et 200 spécifiant un gain en %", bxT.gjb, true), new bYE("loopingTime", "Temps (en ms) pendant lequel le son doit être bouclé", bxT.gjb, true), new bYE("fadeOut time", "Temps (en ms) à partir duquel le volume du son foit être diminué", bxT.gjb, true) };

  public LoopSound(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "loopSound";
  }

  public String getDescription()
  {
    return "Joue un son (évènement sonore relativement court) en boucle pendant un temps fixé.";
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
    long l1 = Bu(0);
    int i = 0;

    int j = (paramInt >= 2) && (By(1)) ? 1 : 0;
    float f;
    if (paramInt >= 3)
      f = (float)Bs(2);
    else
      f = 100.0F;
    if (paramInt >= 4)
      i = Br(3);
    long l2;
    if (paramInt >= 5)
      l2 = Br(4);
    else
      l2 = 0L;
    try {
      if (l1 != 0L) {
        int k = i > 0 ? 1 : 0;
        long l3 = k != 0 ? System.currentTimeMillis() + i : -1L;
        SoundFunctionsLibrary.ckJ().a(l1, f / 100.0F, k != 0 ? 0 : 1, l3, l2, cYS().a());
      } else {
        K.error("Id du son nul");
      }
    }
    catch (Exception localException) {
      a(K, "soundExtension or soundPath not initialized");
    }
  }
}