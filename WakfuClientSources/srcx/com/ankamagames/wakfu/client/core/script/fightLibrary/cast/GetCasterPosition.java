package com.ankamagames.wakfu.client.core.script.fightLibrary.cast;

import CA;
import Su;
import bYE;
import bxT;
import cJs;
import cYk;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class GetCasterPosition extends CastFunction
{
  private static final Logger K = Logger.getLogger(GetCasterPosition.class);
  private static final String NAME = "getCasterPosition";
  private static final String Vu = "Permet de récupérer les coordonnées de la cellule du lanceur de l'action";
  private static final bYE[] gDe = { new bYE("posX", null, bxT.gja, false), new bYE("posY", null, bxT.gja, false), new bYE("posZ", null, bxT.gja, false) };

  GetCasterPosition(LuaState paramLuaState, cJs paramcJs)
  {
    super(paramLuaState, paramcJs);
  }

  public String getName()
  {
    return "getCasterPosition";
  }

  public bYE[] ce()
  {
    return null;
  }

  public bYE[] cf()
  {
    return gDe;
  }

  protected void S(int paramInt)
  {
    Su localSu = CA.Lv().bj(this.gPj.bwv());
    if (localSu == null) {
      a(K, "CharacterInfo introuvable : " + this.gPj.bwv());
      cYR();
      return;
    }
    cYk localcYk = localSu.ML();
    Bz(localcYk.getX());
    Bz(localcYk.getY());
    Bz(localcYk.IB());
  }

  public String getDescription()
  {
    return "Permet de récupérer les coordonnées de la cellule du lanceur de l'action";
  }
}