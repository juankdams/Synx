package com.ankamagames.wakfu.client.core.script.function.context;

import Su;
import bXf;
import bYE;
import bxT;
import cjS;
import ckT;
import dsg;
import java.util.Collection;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class GetFighterId extends dsg
{
  private static final Logger K = Logger.getLogger(GetFighterId.class);

  public GetFighterId(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getFighterId";
  }

  public String getDescription()
  {
    return "Renvoi l'id du mobile positionné en X, Y ou nil si aucun mobile trouvé";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("worldX", null, bxT.gja, false), new bYE("worldY", null, bxT.gja, false) };
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("mobileId", null, bxT.giY, false) };
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    int j = Br(1);

    int k = cYS().a();
    ckT localckT = cjS.clP().vz(k);
    if (localckT == null) {
      K.error("fight inconnu " + k);
      cYR();
      return;
    }
    Collection localCollection = localckT.bgG();
    for (Su localSu : localCollection) {
      if ((localSu.fa() == i) && (localSu.fb() == j)) {
        kg(localSu.getId());
        return;
      }
    }
    cYR();
  }
}