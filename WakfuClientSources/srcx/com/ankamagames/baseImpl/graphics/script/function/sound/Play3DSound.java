package com.ankamagames.baseImpl.graphics.script.function.sound;

import bXf;
import bYE;
import bxT;
import com.ankamagames.baseImpl.graphics.script.SoundFunctionsLibrary;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class Play3DSound extends dsg
{
  private static final Logger K = Logger.getLogger(Play3DSound.class);
  private static final boolean DEBUG = true;
  private static final bYE[] Rf = { new bYE("soundFileId", "Id du fichier son", bxT.giY, false), new bYE("posX", "Position x", bxT.gja, false), new bYE("posY", "Position y", bxT.gja, false), new bYE("posZ", "Position z", bxT.gja, false), new bYE("isLoop", "Si le son boucle", bxT.gjc, true), new bYE("isStereo", "Si on active le mode stéréo", bxT.gjc, true) };

  public Play3DSound(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "play3DSound";
  }

  public String getDescription() {
    return "Joue un son (évènement sonore relativement court) placé à une position spécifique du monde.";
  }

  public bYE[] ce() {
    return Rf;
  }

  public bYE[] cf() {
    return null;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    int i = Br(1);
    int j = Br(2);
    int k = Br(3);
    int m = (paramInt >= 5) && (By(4)) ? 1 : 0;
    int n = (paramInt >= 6) && (By(5)) ? 1 : 0;
    try
    {
      if (l > 0L)
        SoundFunctionsLibrary.ckJ().a(l, 1.0F, m != 0 ? 0 : 1, -1L, -1L, cYS().a());
      else
        K.warn("Pas de son spécifié (ID<=0)");
    }
    catch (Exception localException) {
      a(K, "soundExtension or soundPath not initialized");
    }
  }
}