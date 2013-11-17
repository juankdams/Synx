package com.ankamagames.baseImpl.graphics.sound;

import IL;
import aGb;
import ahm;
import avP;
import bXf;
import bYE;
import com.ankamagames.baseImpl.graphics.script.SoundFunctionsLibrary;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class LuaAnmActionRunScriptManager$InnerSoundFunctionsLibrary$PlayBark extends dsg
{
  public LuaAnmActionRunScriptManager$InnerSoundFunctionsLibrary$PlayBark(LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary paramInnerSoundFunctionsLibrary, LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "playBark";
  }

  public final bYE[] ce()
  {
    return LuaAnmActionRunScriptManager.XF();
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

    int i = Br(0);
    int j = 100;
    int k = -1;

    if (paramInt > 1) {
      j = Br(1);
    }

    if (paramInt > 2) {
      k = Br(2);
    }
    try
    {
      if (i != 0) {
        avP localavP = SoundFunctionsLibrary.ckJ().a(i, LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.a(this.aYF), k);
        if (localavP == null) {
          LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.asz().debug("Impossible de trouver de BarkData adéquat");
          return;
        }

        if (!LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.a(this.aYF).asT().bD(localavP.alu())) {
          return;
        }

        long l = System.currentTimeMillis();
        if (!aGb.aSn().i(l, localavP.alu())) {
          return;
        }
        aGb.aSn().v(l, localavP.alu());

        SoundFunctionsLibrary.ckJ().a(localavP.alu(), localavP.alh() * j / 100.0F, 1, -1L, -1L, cYS().a(), LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.a(this.aYF), localavP.alv());
      }
      else {
        LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.asA().debug("Id du son nul");
      }
    } catch (Exception localException) {
      LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.asB().debug("soundExtension or soundPath not initialized " + localException);
    }
  }
}