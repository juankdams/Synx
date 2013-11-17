package com.ankamagames.baseImpl.graphics.script.function.world;

import IH;
import bXf;
import bYE;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;
import yp;

public class RunOnFadeIn extends dsg
{
  public RunOnFadeIn(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "runOnFadeIn";
  }

  public bYE[] ce() {
    return new bYE[] { new bYE("func", null, bxT.giZ, false) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt) {
    String str = Bv(0);
    if (IH.Sd().Sg())
      cYS().kE(str);
    else
      IH.Sd().a(new yp(this, str, cYS(), null));
  }
}