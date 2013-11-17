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

class LuaAnmActionRunScriptManager$InnerSoundFunctionsLibrary$PlayLocalRandomSound extends dsg
{
  public LuaAnmActionRunScriptManager$InnerSoundFunctionsLibrary$PlayLocalRandomSound(LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary paramInnerSoundFunctionsLibrary, LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "playLocalRandomSound";
  }

  public final bYE[] ce()
  {
    return LuaAnmActionRunScriptManager.XA();
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

    int i = Br(0);
    boolean bool = By(1);

    if (paramInt % 2 != 0) {
      return;
    }

    int j = bCO.cL(0, (paramInt - 2) / 2);
    long l1 = Bu(2 * j + 2);
    int k = Br(2 * j + 3);

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
        aVB localaVB = SoundFunctionsLibrary.ckJ().a(l1, k / 100.0F, 1, -1L, -1L, cYS().a(), LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.a(this.aYF), i);

        if ((bool) && (localaVB != null))
          LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.a(this.aYF).j(l1, localaVB.akM());
      }
      else {
        LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.asv().debug("Id du son nul");
      }
    } catch (Exception localException) {
      LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.asw().debug("soundExtension or soundPath not initialized " + localException);
    }
  }
}