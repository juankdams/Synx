package com.ankamagames.baseImpl.graphics.script.function.mobile;

import CG;
import bCO;
import bYE;
import bxT;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public final class GetDirection8To extends dsg
{
  private static final Logger K = Logger.getLogger(GetDirection8To.class);
  private static final String NAME = "getDirection8To";
  private static final bYE[] Rf = { new bYE("startX", null, bxT.gjb, false), new bYE("startY", null, bxT.gjb, false), new bYE("destX", null, bxT.gjb, false), new bYE("destY", null, bxT.gjb, false) };

  private static final bYE[] bxk = { new bYE("direction", null, bxT.gja, false) };

  public GetDirection8To(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "getDirection8To";
  }

  public bYE[] ce() {
    return Rf;
  }

  public bYE[] cf() {
    return bxk;
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    int j = Br(1);

    int k = Br(2);
    int m = Br(3);

    int n = k - i;
    int i1 = m - j;
    CG localCG = CG.T(bCO.J(n, -1, 1), bCO.J(i1, -1, 1));

    if (localCG == null) {
      K.error("Pas de direction trouvée pour les coords : " + i + ", " + j + ", " + k + ", " + m);
      Bz(0);
    } else {
      Bz(localCG.m_index);
    }
  }
}