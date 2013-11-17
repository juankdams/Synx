package com.ankamagames.wakfu.client.core.script;

import aVB;
import bCO;
import bYE;
import bxT;
import cSi;
import com.ankamagames.baseImpl.graphics.script.SoundFunctionsLibrary;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class InteractiveDialogScriptManager$InnerSoundFunctionsLibrary$PlayRandomSound extends dsg
{
  private static int[] dQb = null;
  private static int TR;

  public InteractiveDialogScriptManager$InnerSoundFunctionsLibrary$PlayRandomSound(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  private void lc(int paramInt) {
    cSi localcSi = new cSi(paramInt);
    for (int i = 0; i < paramInt; i++) {
      localcSi.add(i);
    }

    localcSi.a(bCO.gxi);
    dQb = localcSi.cIf();
    TR = 0;
  }

  public final String getName()
  {
    return "playRandomSound";
  }

  public final bYE[] ce()
  {
    return new bYE[] { new bYE("soundId, gain", null, bxT.gje, true) };
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

    if (paramInt % 2 != 0) {
      return;
    }

    int i = paramInt / 2;
    if ((dQb == null) || (i != dQb.length)) {
      lc(i);
    }
    int j = dQb[TR];
    if (TR < dQb.length - 1)
      TR += 1;
    else {
      lc(i);
    }

    long l = Bu(2 * j);
    int k = Br(2 * j + 1);
    try
    {
      if (l != 0L) {
        aVB localaVB = SoundFunctionsLibrary.ckJ().a(l, k / 100.0F, 1, -1L, -1L, -1);
        if (localaVB != null)
          InteractiveDialogScriptManager.fb(localaVB.akM());
      }
      else {
        InteractiveDialogScriptManager.InnerSoundFunctionsLibrary.i().debug("Id du son nul");
      }
    } catch (Exception localException) {
      InteractiveDialogScriptManager.InnerSoundFunctionsLibrary.an().debug("soundExtension or soundPath not initialized " + localException);
    }
  }
}