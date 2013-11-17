package com.ankamagames.wakfu.client.core.script.fightLibrary.cast;

import CA;
import Su;
import bYE;
import bxT;
import cJs;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class GetCasterBreed extends CastFunction
{
  private static final Logger K = Logger.getLogger(GetCasterBreed.class);
  private static final String NAME = "getCasterBreed";
  private static final String Vu = "Permet de récupérer l'id de la breed du lanceur";
  private static final bYE[] aRi = { new bYE("breedId", null, bxT.gja, false) };

  GetCasterBreed(LuaState paramLuaState, cJs paramcJs)
  {
    super(paramLuaState, paramcJs);
  }

  public String getName()
  {
    return "getCasterBreed";
  }

  public bYE[] ce()
  {
    return null;
  }

  public bYE[] cf()
  {
    return aRi;
  }

  protected void S(int paramInt)
  {
    Su localSu = CA.Lv().bj(this.gPj.bwv());
    if (localSu == null) {
      a(K, "CharacterInfo introuvable : " + this.gPj.bwv());
      cYR();
      return;
    }
    Bz(localSu.uO());
  }

  public String getDescription()
  {
    return "Permet de récupérer l'id de la breed du lanceur";
  }
}