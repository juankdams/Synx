package com.ankamagames.wakfu.client.core.script.fightLibrary.spellEffect;

import CA;
import Su;
import bYE;
import bxT;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class HasState extends dsg
{
  private static final Logger K = Logger.getLogger(HasState.class);
  private static final String NAME = "hasState";
  private static final String Vu = "Renvoie true si le personnage dont l'id passé en param porte l'état d'id et de niveau (optionnel) donné";
  private static final bYE[] aUS = { new bYE("characterId", null, bxT.gja, false), new bYE("stateId", null, bxT.gja, false), new bYE("stateLevel", null, bxT.gja, true) };

  private static final bYE[] aUT = { new bYE("hasState", null, bxT.gjc, false) };

  HasState(LuaState paramLuaState)
  {
    super(paramLuaState);
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
    long l = Bu(0);
    Su localSu = CA.Lv().bj(l);
    if (localSu == null) {
      a(K, "CharacterInfo introuvable : " + l);
      cYR();
      return;
    }
    int i = Br(1);
    if (paramInt == 2) {
      kl(localSu.du(i));
    } else if (paramInt == 3) {
      int j = Br(2);
      kl(localSu.r(i, j));
    } else {
      a(K, "Nombre de parametres invalides : " + paramInt);
      cYR();
    }
  }

  public String getDescription()
  {
    return "Renvoie true si le personnage dont l'id passé en param porte l'état d'id et de niveau (optionnel) donné";
  }
}