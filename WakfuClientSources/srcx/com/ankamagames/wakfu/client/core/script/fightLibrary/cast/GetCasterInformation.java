package com.ankamagames.wakfu.client.core.script.fightLibrary.cast;

import Su;
import bYE;
import bxT;
import byo;
import cJs;
import cKd;
import dhJ;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public final class GetCasterInformation extends CastFunction
{
  private static final Logger K = Logger.getLogger(GetCasterInformation.class);
  private static final String NAME = "getCasterInformation";
  private static final String Vu = "Permet de récupérer un objet contenant des informations sur le lanceur";
  private static final bYE[] bUH = { new bYE("casterInfo", null, bxT.giX, false) };

  GetCasterInformation(LuaState paramLuaState, cJs paramcJs)
  {
    super(paramLuaState, paramcJs);
  }

  public String getName()
  {
    return "getCasterInformation";
  }

  public bYE[] ce()
  {
    return null;
  }

  public bYE[] cf()
  {
    return bUH;
  }

  public String getDescription()
  {
    return "Permet de récupérer un objet contenant des informations sur le lanceur";
  }

  public void S(int paramInt)
  {
    Su localSu = this.gPj.dX(this.gPj.bwv());

    if (localSu != null)
    {
      cKd localcKd;
      switch (localSu.getType())
      {
      case 2:
        localcKd = new cKd(this, localSu.aJp(), localSu.bY(), localSu.cQF(), localSu.xK(), localSu.getType(), 0);

        break;
      case 0:
        localcKd = new cKd(this, localSu.aJp(), localSu.bY(), localSu.cQF(), localSu.xK(), localSu.getType(), 0);

        break;
      case 1:
        localcKd = new cKd(this, localSu.aJp(), localSu.bY(), localSu.cQF(), localSu.xK(), localSu.getType(), ((byo)localSu).Rw());

        break;
      default:
        localcKd = null;
      }

      if (localcKd != null) {
        bq(localcKd);
      } else {
        K.error("pas de caster");
        cYR();
      }
    }
  }
}