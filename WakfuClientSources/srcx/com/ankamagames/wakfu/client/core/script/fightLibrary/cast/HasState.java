package com.ankamagames.wakfu.client.core.script.fightLibrary.cast;

import CA;
import Su;
import bYE;
import bxT;
import cJs;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class HasState extends CastFunction
{
  private static final Logger K = Logger.getLogger(HasState.class);
  private static final String NAME = "hasState";
  private static final String Vu = "Permet de savoir si le lanceur de l'action possède un état optionnellement d'un certain niveau";
  private static final bYE[] aUS = { new bYE("stateId", null, bxT.gja, false), new bYE("stateLevel", null, bxT.gja, true) };

  private static final bYE[] aUT = { new bYE("hasState", null, bxT.gjc, false) };

  HasState(LuaState paramLuaState, cJs paramcJs)
  {
    super(paramLuaState, paramcJs);
  }

  public String getName()
  {
    return "hasState";
  }

  public bYE[] ce()
  {
    return aUS;
  }

  public bYE[] cf()
  {
    return aUT;
  }

  protected void S(int paramInt)
  {
    Su localSu = CA.Lv().bj(this.gPj.bwv());
    if (localSu == null) {
      a(K, "CharacterInfo introuvable : " + this.gPj.bwv());
      cYR();
      return;
    }
    int i = Br(0);
    if (paramInt == 1) {
      kl(localSu.du(i));
    } else if (paramInt == 2) {
      int j = Br(1);
      kl(localSu.r(i, j));
    } else {
      a(K, "Nombre de parametres invalides : " + paramInt);
      cYR();
    }
  }

  public String getDescription()
  {
    return "Permet de savoir si le lanceur de l'action possède un état optionnellement d'un certain niveau";
  }
}