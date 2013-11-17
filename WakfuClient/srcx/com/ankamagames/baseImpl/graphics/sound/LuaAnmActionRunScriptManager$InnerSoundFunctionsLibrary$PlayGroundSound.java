package com.ankamagames.baseImpl.graphics.sound;

import IL;
import ZI;
import aGb;
import aKU;
import ahm;
import bXf;
import bYE;
import btb;
import cWj;
import cid;
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.baseImpl.graphics.script.SoundFunctionsLibrary;
import cwO;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class LuaAnmActionRunScriptManager$InnerSoundFunctionsLibrary$PlayGroundSound extends dsg
{
  public LuaAnmActionRunScriptManager$InnerSoundFunctionsLibrary$PlayGroundSound(LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary paramInnerSoundFunctionsLibrary, LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "playGroundSound";
  }

  public final bYE[] ce()
  {
    return LuaAnmActionRunScriptManager.XJ();
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

    byte b1 = aKU.eoX.getType();
    byte b2 = (byte)Br(0);
    int i = 100;

    if (paramInt > 1) {
      i = Br(1);
    }

    int j = cwO.U(LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.a(this.aYF).fa(), LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.a(this.aYF).fb(), LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.a(this.aYF).fc());

    DisplayedScreenElement localDisplayedScreenElement = btb.bBd().b(LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.a(this.aYF).fa(), LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.a(this.aYF).fb(), j, cWj.kJk);
    Object localObject;
    if (localDisplayedScreenElement != null) {
      localObject = localDisplayedScreenElement.bpc().ddL();
      if (localObject != null) {
        b1 = ((cid)localObject).cjL();
      }
    }
    try
    {
      localObject = SoundFunctionsLibrary.ckJ().n(b1, b2);
      if (localObject == null) {
        LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.SR().debug("Impossible de trouver de GroundSoundData adéquat");
        return;
      }

      if (!LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.a(this.aYF).asT().bD(((ZI)localObject).alu())) {
        return;
      }

      long l = System.currentTimeMillis();
      if (!aGb.aSn().i(l, ((ZI)localObject).alu())) {
        return;
      }
      aGb.aSn().v(l, ((ZI)localObject).alu());

      SoundFunctionsLibrary.ckJ().a(((ZI)localObject).alu(), ((ZI)localObject).alh() * i / 100.0F, 1, -1L, -1L, cYS().a(), LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.a(this.aYF), ((ZI)localObject).alv());
    }
    catch (Exception localException) {
      LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary.asC().debug("soundExtension or soundPath not initialized " + localException);
    }
  }
}