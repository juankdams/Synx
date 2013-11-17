package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bvC;
import bxT;
import cEi;
import cUo;
import cnj;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class ThrowCarriedMobile extends dsg
{
  private static final Logger K = Logger.getLogger(ThrowCarriedMobile.class);
  private static final String NAME = "throwCarriedMobile";
  private static final bYE[] Rf = { new bYE("mobileId", null, bxT.giY, false), new bYE("destX", null, bxT.gja, false), new bYE("destY", null, bxT.gja, false), new bYE("destZ", null, bxT.gja, false), new bYE("duration", null, bxT.gja, false), new bYE("startVectorZ", null, bxT.gjb, false), new bYE("endVectorZ", null, bxT.gjb, false) };

  public ThrowCarriedMobile(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "throwCarriedMobile";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    long l = Bu(0);
    int i = Br(1);
    int j = Br(2);
    int k = Br(3);
    int m = Br(4);
    float f1 = (float)Bs(5);
    float f2 = (float)Bs(6);

    cUo localcUo1 = bQK.bXG().gY(l);

    if (localcUo1 == null) {
      a(K, "Pas de carrier trouvé avec l'id " + l);
      return;
    }

    cUo localcUo2 = localcUo1.cJA();
    if (localcUo2 == null) {
      a(K, "Pas de carrier porté trouvé avec l'id " + l);
      return;
    }

    localcUo2.setVisible(true);
    localcUo1.a(false, null);

    bvC localbvC = new bvC(localcUo2);
    localbvC.c(new cEi(i, j, k));
    localbvC.a(new cEi(localcUo2.fa(), localcUo2.fb(), localcUo2.fc() + localcUo1.BC()));
    localbvC.cE(m);
    localbvC.b(new cEi(0.0F, 0.0F, f1));
    localbvC.d(new cEi(0.0F, 0.0F, f2));

    cnj.cnO().b(localbvC);
  }
}