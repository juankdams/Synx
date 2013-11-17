package com.ankamagames.wakfu.client.core.script.fightLibrary.cast;

import CA;
import Su;
import bYE;
import bxT;
import cJs;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class GetCasterSex extends CastFunction
{
  private static final Logger K = Logger.getLogger(GetCasterSex.class);
  private static final String NAME = "getCasterSex";
  private static final String Vu = "Permet de récupérer l'id du sexe du lanceur de l'action";
  private static final bYE[] hiu = { new bYE("sex", null, bxT.gja, false) };

  GetCasterSex(LuaState paramLuaState, cJs paramcJs)
  {
    super(paramLuaState, paramcJs);
  }

  public String getName()
  {
    return "getCasterSex";
  }

  public bYE[] ce()
  {
    return null;
  }

  public bYE[] cf()
  {
    return hiu;
  }

  protected void S(int paramInt)
  {
    Su localSu = CA.Lv().bj(this.gPj.bwv());
    if (localSu == null) {
      a(K, "CharacterInfo introuvable : " + this.gPj.bwv());
      cYR();
      return;
    }
    Bz(localSu.xK());
  }

  public String getDescription()
  {
    return "Permet de récupérer l'id du sexe du lanceur de l'action";
  }
}