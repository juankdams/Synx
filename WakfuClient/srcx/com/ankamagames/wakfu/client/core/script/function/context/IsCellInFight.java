package com.ankamagames.wakfu.client.core.script.function.context;

import UG;
import bXf;
import bYE;
import bxT;
import cjS;
import ckT;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class IsCellInFight extends dsg
{
  private static final Logger K = Logger.getLogger(IsCellInFight.class);

  public IsCellInFight(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName() {
    return "isCellInFight";
  }

  public bYE[] ce() {
    return new bYE[] { new bYE("worldX", null, bxT.gja, false), new bYE("worldY", null, bxT.gja, false) };
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("cellIsInFight", null, bxT.gjc, false) };
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
    kl(localckT.LB().aq(i, j));
  }
}