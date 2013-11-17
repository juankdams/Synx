package com.ankamagames.baseImpl.graphics.sound;

import IL;
import aGb;
import aVB;
import ahm;
import bXf;
import bYE;
import com.ankamagames.baseImpl.graphics.script.SoundFunctionsLibrary;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class LuaAnmActionRunScriptManager$InnerSoundFunctionsLibrary$PlaySound extends dsg
{
  public LuaAnmActionRunScriptManager$InnerSoundFunctionsLibrary$PlaySound(LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary paramInnerSoundFunctionsLibrary, LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "playSound";
  }

  public final bYE[] ce()
  {
    return LuaAnmActionRunScriptManager.Er();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public final void S(int paramInt)
  {
    if (!LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.a(this.aYF).atb()) {
      return;
    }

    if (!SoundFunctionsLibrary.ckJ().atb()) {
      return;
    }

    long l1 = Bu(0);
    if (!LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.a(this.aYF).asT().bD(l1)) {
      return;
    }

    long l2 = System.currentTimeMillis();
    if (!aGb.aSn().i(l2, l1)) {
      return;
    }
    aGb.aSn().v(l2, l1);

    boolean bool = By(1);
    float f;
    if (paramInt >= 3)
      f = (float)Bs(2);
    else
      f = 100.0F;
    int i;
    if (paramInt >= 4)
      i = Br(3);
    else
      i = 1;
    try
    {
      if (l1 != 0L) {
        aVB localaVB = SoundFunctionsLibrary.ckJ().a(l1, f / 100.0F, i, -1L, -1L, cYS().a());

        if ((bool) && (localaVB != null))
          LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.a(this.aYF).j(l1, localaVB.akM());
      }
      else {
        LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.aiN().debug("Id du son nul");
      }
    } catch (Exception localException) {
      LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.asu().debug("soundExtension or soundPath not initialized " + localException);
    }
  }
}