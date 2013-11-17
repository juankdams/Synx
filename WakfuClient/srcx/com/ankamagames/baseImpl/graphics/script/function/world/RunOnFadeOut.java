package com.ankamagames.baseImpl.graphics.script.function.world;

import IH;
import atv;
import bXf;
import bYE;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaObject;
import org.keplerproject.luajava.LuaState;

public class RunOnFadeOut extends dsg
{
  public RunOnFadeOut(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "runOnFadeOut";
  }

  public bYE[] ce() {
    return new bYE[] { new bYE("func", null, bxT.giZ, false) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt) {
    String str = null;

    LuaObject localLuaObject = getParam(2);
    if (localLuaObject.isString()) {
      str = localLuaObject.getString();
    }
    if (IH.Sd().Sh())
      cYS().kE(str);
    else
      IH.Sd().a(new atv(this, str, cYS(), null));
  }
}