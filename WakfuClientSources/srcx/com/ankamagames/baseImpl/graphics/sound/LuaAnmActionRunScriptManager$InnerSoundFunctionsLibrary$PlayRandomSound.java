package com.ankamagames.baseImpl.graphics.sound;

import IL;
import aGb;
import aVB;
import ahm;
import bCO;
import bXf;
import bYE;
import com.ankamagames.baseImpl.graphics.script.SoundFunctionsLibrary;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class LuaAnmActionRunScriptManager$InnerSoundFunctionsLibrary$PlayRandomSound extends dsg
{
  public LuaAnmActionRunScriptManager$InnerSoundFunctionsLibrary$PlayRandomSound(LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary paramInnerSoundFunctionsLibrary, LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "playRandomSound";
  }

  public final bYE[] ce()
  {
    return LuaAnmActionRunScriptManager.Ep();
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

    if (paramInt % 2 != 1) {
      return;
    }

    boolean bool = By(0);

    int i = bCO.cL(0, (paramInt - 1) / 2);
    long l1 = Bu(2 * i + 1);
    int j = Br(2 * i + 2);

    if (!LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.a(this.aYF).asT().bD(l1)) {
      return;
    }

    long l2 = System.currentTimeMillis();
    if (!aGb.aSn().i(l2, l1)) {
      return;
    }
    aGb.aSn().v(l2, l1);
    try
    {
      if (l1 != 0L) {
        aVB localaVB = SoundFunctionsLibrary.ckJ().a(l1, j / 100.0F, 1, -1L, -1L, cYS().a());

        if ((bool) && (localaVB != null))
          LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.a(this.aYF).j(l1, localaVB.akM());
      }
      else {
        LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.an().debug("Id du son nul");
      }
    } catch (Exception localException) {
      LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.Re().debug("soundExtension or soundPath not initialized " + localException);
    }
  }
}