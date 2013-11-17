package com.ankamagames.wakfu.client.core.script.function.context;

import UG;
import bXf;
import bYE;
import bxT;
import cdO;
import cjS;
import ckT;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class IsCellBlockedByObstacle extends dsg
{
  private static final Logger K = Logger.getLogger(IsCellBlockedByObstacle.class);

  public IsCellBlockedByObstacle(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName() {
    return "isCellBlockedByObstacle";
  }

  public bYE[] ce() {
    return new bYE[] { new bYE("worldX", null, bxT.gja, false), new bYE("worldY", null, bxT.gja, false) };
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("cellBlockedByObstacle", null, bxT.gjc, false) };
  }

  public void S(int paramInt)
  {
    int i = Br(0);
    int j = Br(1);

    ckT localckT = cjS.clP().vz(cYS().a());
    if (localckT == null) {
      a(K, "pas de combat trouvé");
      cYR();
      return;
    }
    cdO localcdO = localckT.LB().au(i, j);
    kl(localcdO != null);
  }
}