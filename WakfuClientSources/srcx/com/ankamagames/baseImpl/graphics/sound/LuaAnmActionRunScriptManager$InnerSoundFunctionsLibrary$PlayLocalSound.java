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

class LuaAnmActionRunScriptManager$InnerSoundFunctionsLibrary$PlayLocalSound extends dsg
{
  public LuaAnmActionRunScriptManager$InnerSoundFunctionsLibrary$PlayLocalSound(LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary paramInnerSoundFunctionsLibrary, LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "playLocalSound";
  }

  public final bYE[] ce()
  {
    return LuaAnmActionRunScriptManager.XC();
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
    long l1 = Bu(2);

    if (!LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.a(this.aYF).asT().bD(l1)) {
      return;
    }

    long l2 = System.currentTimeMillis();
    if (!aGb.aSn().i(l2, l1)) {
      return;
    }
    aGb.aSn().v(l2, l1);
    float f;
    if (paramInt >= 4)
      f = (float)Bs(3);
    else
      f = 100.0F;
    int j;
    if (paramInt >= 5)
      j = Br(4);
    else
      j = 1;
    try
    {
      if (l1 != 0L) {
        aVB localaVB = SoundFunctionsLibrary.ckJ().a(l1, f / 100.0F, j, -1L, -1L, cYS().a(), LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.a(this.aYF), i);

        if ((bool) && (localaVB != null))
          LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.a(this.aYF).j(l1, localaVB.akM());
      }
      else {
        LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.asx().debug("Id du son nul");
      }
    } catch (Exception localException) {
      LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.asy().debug("soundExtension or soundPath not initialized " + localException);
    }
  }
}