package com.ankamagames.baseImpl.graphics.script.function.world;

import bYE;
import bxT;
import cjY;
import dsg;
import org.keplerproject.luajava.LuaState;

public class SetVideoLoading extends dsg
{
  public SetVideoLoading(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "setVideoLoading";
  }

  public bYE[] ce() {
    return new bYE[] { new bYE("videoName", null, bxT.giZ, true), new bYE("soundId", null, bxT.gja, true), new bYE("fadeInDuration", null, bxT.gja, true), new bYE("fadeOutDuration", null, bxT.gja, true) };
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
    int j = paramInt > 2 ? Br(2) : 1000;
    int k = paramInt > 3 ? Br(3) : 1000;
    localcjY.li(str);
    localcjY.setSoundId(i);
    localcjY.vp(j);
    localcjY.fm(k);
  }
}