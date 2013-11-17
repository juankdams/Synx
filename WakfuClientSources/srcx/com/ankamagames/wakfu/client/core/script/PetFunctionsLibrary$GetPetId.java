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

class PetFunctionsLibrary$GetPetId extends dsg
{
  PetFunctionsLibrary$GetPetId(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getPetId";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("playerId", null, bxT.giY, false) };
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("petId", null, bxT.giY, false) };
  }

  public void S(int paramInt)
  {
    long l = Bu(0);
    Su localSu = CA.Lv().bj(l);
    if ((localSu != null) && ((localSu instanceof bKm))) {
      dRM localdRM = ((bKm)localSu).bRF();
      if (localdRM != null) {
        kg(localdRM.dsz().getId());
      } else {
        cYR();
        a(PetFunctionsLibrary.ch(), "le character " + l + " n'a pas de pet");
      }
    } else {
      cYR();
      a(PetFunctionsLibrary.i(), "le character " + l + " n'existe pas ou n'est pas un joueur");
    }
  }
}