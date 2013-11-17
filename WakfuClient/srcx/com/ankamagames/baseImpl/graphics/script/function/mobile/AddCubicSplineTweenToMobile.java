package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bvC;
import bxT;
import cEi;
import cUo;
import cnj;
import dsg;
import org.keplerproject.luajava.LuaState;

public class AddCubicSplineTweenToMobile extends dsg
{
  private static final String NAME = "addCubicSplineTweenToMobile";
  private static final bYE[] Rf = { new bYE("mobileId", null, bxT.giY, false), new bYE("destX", null, bxT.gja, false), new bYE("destY", null, bxT.gja, false), new bYE("destZ", null, bxT.gja, false), new bYE("duration", null, bxT.gja, false), new bYE("startVectorX", null, bxT.gjb, false), new bYE("startVectorY", null, bxT.gjb, false), new bYE("startVectorZ", null, bxT.gjb, false), new bYE("endVectorX", null, bxT.gjb, false), new bYE("endVectorY", null, bxT.gjb, false), new bYE("endVectorZ", null, bxT.gjb, false) };

  public AddCubicSplineTweenToMobile(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "addCubicSplineTweenToMobile";
  }

  public bYE[] ce() {
    return Rf;
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt) {
    long l = Bu(0);
    int i = Br(1);
    int j = Br(2);
    int k = Br(3);
    int m = Br(4);
    float f1 = (float)Bs(5);
    float f2 = (float)Bs(6);
    float f3 = (float)Bs(7);
    float f4 = (float)Bs(8);
    float f5 = (float)Bs(9);
    float f6 = (float)Bs(10);

    cUo localcUo = bQK.bXG().gY(l);

    bvC localbvC = new bvC(localcUo);
    localbvC.c(new cEi(i, j, k));
    localbvC.a(new cEi(localcUo.fa(), localcUo.fb(), localcUo.fc()));
    localbvC.cE(m);
    localbvC.b(new cEi(f1, f2, f3));
    localbvC.d(new cEi(f4, f5, f6));

    cnj.cnO().b(localbvC);
  }
}