package com.ankamagames.baseImpl.graphics.script.function.sound;

import aVB;
import bXf;
import bYE;
import bxT;
import com.ankamagames.baseImpl.graphics.script.SoundFunctionsLibrary;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class PlaySound extends dsg
{
  private static final Logger K = Logger.getLogger(PlaySound.class);
  private static final bYE[] Rf = { new bYE("soundFileId", "Id du fichier son", bxT.giY, false), new bYE("isStereo", "Activation de la stéréo", bxT.gjc, true), new bYE("gainModification", "Entier compris entre 0 et 200 % spécifiant une modification du gain", bxT.gjb, true), new bYE("playCount", "Nombre de fois ou le son doit être joué", bxT.gjb, true) };

  private static final bYE[] fJD = { new bYE("fileId", "uid du son créé", bxT.giY, false) };

  public PlaySound(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "playSound";
  }

  public String getDescription()
  {
    return "Joue un son (évènement sonore relativement court) au sein du monde.";
  }

  public final bYE[] ce()
  {
    return Rf;
  }

  public final bYE[] cf()
  {
    return fJD;
  }

  public final void S(int paramInt)
  {
    if (!SoundFunctionsLibrary.ckJ().atb()) {
      return;
    }

    long l = Bu(0);
    int i = (paramInt >= 2) && (By(1)) ? 1 : 0;
    float f;
    if (paramInt >= 3)
      f = (float)Bs(2);
    else
      f = 100.0F;
    int j;
    if (paramInt >= 4)
      j = Br(3);
    else
      j = 1;
    try
    {
      if (l != 0L) {
        aVB localaVB = SoundFunctionsLibrary.ckJ().a(l, f / 100.0F, j, -1L, -1L, cYS().a());

        kg(localaVB == null ? -1L : localaVB.akM());
      }
      else {
        K.error("Id du son nul");
      }
    } catch (Exception localException) {
      a(K, "soundExtension or soundPath not initialized " + localException);
    }
  }
}