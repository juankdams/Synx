package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bFB;
import bQK;
import bXf;
import bYE;
import bxT;
import cNt;
import cUo;
import dMM;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class OnCellTransition extends dsg
{
  private static final Logger K = Logger.getLogger(OnCellTransition.class);
  private static final boolean DEBUG = true;
  private static final String NAME = "onCellTransition";
  private static final bYE[] Rf = { new bYE("mobileId", null, bxT.giY, false), new bYE("x", null, bxT.gja, false), new bYE("y", null, bxT.gja, false), new bYE("funcName", null, bxT.giZ, false), new bYE("params", null, bxT.gje, true) };

  public OnCellTransition(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "onCellTransition";
  }

  public bYE[] ce() {
    return Rf;
  }

  public bYE[] cf() {
    return null;
  }

  protected void S(int paramInt) {
    long l = Bu(0);

    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo != null) {
      if ((localcUo instanceof dMM)) {
        dMM localdMM = (dMM)localcUo;
        bXf localbXf = cYS();
        int i = Br(1);
        int j = Br(2);
        String str = Bv(3);
        bFB[] arrayOfbFB = eT(4, paramInt);
        boolean bool = localbXf.a(str, arrayOfbFB);
        cNt localcNt = new cNt(this, i, j, localcUo, bool, localbXf, str, arrayOfbFB);

        localdMM.a(localcNt);
      }
    }
    else a(K, "le mobile " + l + " n'existe pas ");
  }
}