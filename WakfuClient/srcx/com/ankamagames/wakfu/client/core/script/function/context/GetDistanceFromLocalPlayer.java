package com.ankamagames.wakfu.client.core.script.function.context;

import CA;
import Su;
import bYE;
import bxT;
import byv;
import byz;
import cYk;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class GetDistanceFromLocalPlayer extends dsg
{
  private static final Logger K = Logger.getLogger(GetDistanceFromLocalPlayer.class);

  public GetDistanceFromLocalPlayer(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getDistanceFromLocalPlayer";
  }

  public String getDescription()
  {
    return "Retourne la distance entre le joueur et le personnage d'id donné en paramètre";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("characterId", "Id du character", bxT.giY, false) };
  }

  public bYE[] cf()
  {
    return new bYE[] { new bYE("distance", null, bxT.gja, false) };
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);

    Su localSu = CA.Lv().bj(l);
    if (localSu == null) {
      K.error("On veut recup la distance séparant le joueur d'un personnage inexistant :" + l);
      cYR();
      return;
    }

    byz localbyz = byv.bFN().bFO();
    Bz(localSu.ML().ac(localbyz.ML()));
  }
}