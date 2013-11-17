package com.ankamagames.baseImpl.graphics.script.function.mobile;

import aZD;
import bFB;
import bQK;
import bXf;
import bYE;
import bxT;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class AddMobileDestructionCallback extends dsg
{
  private static final Logger K = Logger.getLogger(AddMobileDestructionCallback.class);
  private static final String NAME = "addMobileDestructionCallback";
  private static final bYE[] Rf = { new bYE("mobileId", null, bxT.giY, false), new bYE("funcName", null, bxT.giZ, false), new bYE("params", null, bxT.gje, true) };

  public AddMobileDestructionCallback(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "addMobileDestructionCallback";
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

    bQK.bXG().b(new aZD(this, l, localbXf, str, arrayOfbFB));
  }
}