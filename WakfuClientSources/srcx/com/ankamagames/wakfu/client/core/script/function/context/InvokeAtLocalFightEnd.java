package com.ankamagames.wakfu.client.core.script.function.context;

import arl;
import bFB;
import bXf;
import bYE;
import bxT;
import byv;
import byz;
import cIG;
import dsg;
import g;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class InvokeAtLocalFightEnd extends dsg
{
  private static final Logger K = Logger.getLogger(InvokeAtLocalFightEnd.class);

  public InvokeAtLocalFightEnd(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName() {
    return "invokeAtLocalFightEnd";
  }

  public bYE[] ce() {
    return new bYE[] { new bYE("func", null, bxT.giZ, false), new bYE("params", null, bxT.gje, true) };
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    bXf localbXf = cYS();
    String str = Bv(0);
    bFB[] arrayOfbFB = eT(1, paramInt);

    byz localbyz = byv.bFN().bFO();
    if (localbyz.adF()) {
      localbXf.cct();
      arl localarl = localbyz.aeQ();
      localarl.a(new g(this, localbXf, str, arrayOfbFB));
    }
    else
    {
      localbXf.a(str, arrayOfbFB, new cIG[0]);
    }
  }
}