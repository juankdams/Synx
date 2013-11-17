package com.ankamagames.baseImpl.graphics.script.function.world;

import bYE;
import bxT;
import cjY;
import dsg;
import org.keplerproject.luajava.LuaState;

public class SetLoading extends dsg
{
  public SetLoading(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "setLoading";
  }

  public bYE[] ce() {
    return new bYE[] { new bYE("anmName", null, bxT.giZ, true), new bYE("durationMin", null, bxT.gja, true), new bYE("soundId", null, bxT.gja, true), new bYE("fadeInDuration", null, bxT.gja, true), new bYE("fadeOutDuration", null, bxT.gja, true) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt) {
    cjY localcjY = cjY.clY();
    if (paramInt == 0) {
      localcjY.reset();
      return;
    }
    String str = paramInt > 0 ? Bv(0) : null;
    int i = paramInt > 1 ? Br(1) : 0;
    int j = paramInt > 2 ? Br(2) : 0;
    int k = paramInt > 3 ? Br(3) : 1000;
    int m = paramInt > 4 ? Br(4) : 1000;
    localcjY.lh(str);
    localcjY.jc(i);
    localcjY.setSoundId(j);
    localcjY.vp(k);
    localcjY.fm(m);
  }
}