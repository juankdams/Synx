package com.ankamagames.baseImpl.graphics.sound;

import aGb;
import ahm;
import akR;
import bYE;
import bjC;
import bxT;
import dlD;

public class LuaAnmActionRunScriptManager extends aGb
{
  private static final bYE[] lxp = { new bYE("stopOnAnimationChange", null, bxT.gjc, false), new bYE("soundId, gain", null, bxT.gje, true) };

  private static final bYE[] lxq = { new bYE("soundFileId", null, bxT.giY, false), new bYE("stopOnAnimationChange", null, bxT.gjc, false), new bYE("gainModification", null, bxT.gjb, true), new bYE("playCount", null, bxT.gjb, true) };

  private static final bYE[] lxr = { new bYE("rollOffPresetId", null, bxT.gja, false), new bYE("stopOnAnimationChange", null, bxT.gjc, false), new bYE("soundId, gain", null, bxT.gje, true) };

  private static final bYE[] lxs = { new bYE("rollOffPresetId", null, bxT.gja, false), new bYE("stopOnAnimationChange", null, bxT.gjc, false), new bYE("soundFileId", null, bxT.giY, false), new bYE("gainModification", null, bxT.gjb, true), new bYE("playCount", null, bxT.gjb, true) };

  private static final bYE[] lxt = { new bYE("barkId", null, bxT.gja, false), new bYE("gain", null, bxT.gja, true), new bYE("breedId", null, bxT.gja, true) };

  private static final bYE[] lxu = { new bYE("walkType", null, bxT.gja, false), new bYE("gain", null, bxT.gja, true) };
  private static final String lxv = "anm/";

  private static String kn(long paramLong)
  {
    if ((!bB) && (dlD.cTt().getPath() == null)) throw new AssertionError();
    return String.format("%s%d%s", new Object[] { "anm/", Long.valueOf(paramLong), dlD.cTt().getExtension() });
  }

  protected void b(bjC parambjC, long paramLong)
  {
    akR localakR = new akR(1);
    localakR.put("fightId", Integer.valueOf(parambjC.aeR()));
    LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary[] arrayOfInnerSoundFunctionsLibrary = { new LuaAnmActionRunScriptManager.InnerSoundFunctionsLibrary((ahm)parambjC, null) };
    dlD.cTt().a(kn(paramLong), arrayOfInnerSoundFunctionsLibrary, localakR, null, false);
  }
}