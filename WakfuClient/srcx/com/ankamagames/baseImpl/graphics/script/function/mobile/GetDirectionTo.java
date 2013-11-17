package com.ankamagames.baseImpl.graphics.script.function.mobile;

import CG;
import bCO;
import bYE;
import bxT;
import cYk;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public final class GetDirectionTo extends dsg
{
  private static final Logger K = Logger.getLogger(GetDirectionTo.class);
  private static final String NAME = "getDirectionTo";
  private static final bYE[] Rf = { new bYE("startX", null, bxT.gjb, false), new bYE("startY", null, bxT.gjb, false), new bYE("destX", null, bxT.gjb, false), new bYE("destY", null, bxT.gjb, false) };

  private static final bYE[] bxk = { new bYE("direction", null, bxT.gja, false) };

  public GetDirectionTo(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "getDirectionTo";
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
      Bz(cYk.a(n, i1, localCG).m_index);
    }
  }
}