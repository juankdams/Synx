package com.ankamagames.wakfu.client.core.script;

import CA;
import Su;
import bAF;
import bKm;
import bYE;
import bxT;
import dRM;
import dsg;
import org.keplerproject.luajava.LuaState;

class PetFunctionsLibrary$SetPetVisible extends dsg
{
  PetFunctionsLibrary$SetPetVisible(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setPetVisible";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("playerId", null, bxT.giY, false), new bYE("visible", null, bxT.gjc, false) };
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    long l = Bu(0);
    boolean bool = By(1);

    Su localSu = CA.Lv().bj(l);
    if ((localSu != null) && ((localSu instanceof bKm))) {
      dRM localdRM = ((bKm)localSu).bRF();
      if (localdRM != null)
        localdRM.dsz().setVisible(bool);
      else
        a(PetFunctionsLibrary.an(), "le character " + l + " n'a pas de pet");
    }
    else {
      a(PetFunctionsLibrary.Re(), "le character " + l + " n'existe pas ou n'est pas un joueur");
    }
  }
}