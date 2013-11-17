package com.ankamagames.wakfu.client.core.script;

import aVB;
import bYE;
import bxT;
import com.ankamagames.baseImpl.graphics.script.SoundFunctionsLibrary;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class InteractiveDialogScriptManager$InnerSoundFunctionsLibrary$PlaySound extends dsg
{
  public InteractiveDialogScriptManager$InnerSoundFunctionsLibrary$PlaySound(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "playSound";
  }

  public final bYE[] ce()
  {
    return new bYE[] { new bYE("soundFileId", null, bxT.giY, false), new bYE("gainModification", null, bxT.gjb, true) };
  }

  public final bYE[] cf()
  {
    return null;
  }

  public final void S(int paramInt)
  {
    long l = Bu(0);
    float f;
    if (paramInt >= 2)
      f = (float)Bs(1);
    else {
      f = 100.0F;
    }
    try
    {
      if (l != 0L) {
        aVB localaVB = SoundFunctionsLibrary.ckJ().a(l, f / 100.0F, 1, -1L, -1L, -1);

        if (localaVB != null)
          InteractiveDialogScriptManager.fb(localaVB.akM());
      }
      else {
        InteractiveDialogScriptManager.InnerSoundFunctionsLibrary.Re().debug("Id du son nul");
      }
    } catch (Exception localException) {
      InteractiveDialogScriptManager.InnerSoundFunctionsLibrary.gV().debug("soundExtension or soundPath not initialized " + localException);
    }
  }
}