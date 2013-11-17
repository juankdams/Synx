package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bFB;
import bQK;
import bXf;
import bYE;
import bxT;
import cIG;
import dJ;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class AddMobileCreationCallback extends dsg
{
  private static final Logger K = Logger.getLogger(AddMobileCreationCallback.class);
  private static final String NAME = "addMobileCreationCallback";
  private static final bYE[] Rf = { new bYE("mobileId", null, bxT.giY, false), new bYE("funcName", null, bxT.giZ, false), new bYE("params", null, bxT.gje, true) };

  public AddMobileCreationCallback(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "addMobileCreationCallback";
  }

  public bYE[] ce() {
    return Rf;
  }

  public bYE[] cf() {
    return null;
  }

  protected void S(int paramInt) {
    bXf localbXf = cYS();
    long l = Bu(0);
    String str = Bv(1);
    bFB[] arrayOfbFB = eT(2, paramInt);

    if (bQK.bXG().gY(l) != null) {
      localbXf.a(str, arrayOfbFB, new cIG[0]);
    }
    bQK.bXG().b(new dJ(this, l, localbXf, str, arrayOfbFB));
  }
}