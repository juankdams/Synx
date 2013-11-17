package com.ankamagames.wakfu.client.core.script.fightLibrary.cast;

import CA;
import Su;
import bYE;
import bxT;
import cJs;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class HasEffect extends CastFunction
{
  private static final Logger K = Logger.getLogger(HasEffect.class);

  private static final bYE[] hti = { new bYE("effectId", null, bxT.gja, false) };

  private static final bYE[] htj = { new bYE("hasEffect", null, bxT.gjc, false) };
  private static final String NAME = "hasEffect";
  private static final String Vu = "Permet de savoir si le lanceur de l'action possède un effet d'id donné";

  HasEffect(LuaState paramLuaState, cJs paramcJs)
  {
    super(paramLuaState, paramcJs);
  }

  public String getName()
  {
    return "hasEffect";
  }

  public bYE[] ce()
  {
    return hti;
  }

  public bYE[] cf()
  {
    return htj;
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
      kl(localSu.zX(i));
    } else {
      a(K, "Nombre de parametres invalides : " + paramInt);
      cYR();
    }
  }

  public String getDescription()
  {
    return "Permet de savoir si le lanceur de l'action possède un effet d'id donné";
  }
}