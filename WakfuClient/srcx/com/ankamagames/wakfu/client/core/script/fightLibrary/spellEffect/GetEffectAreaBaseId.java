package com.ankamagames.wakfu.client.core.script.fightLibrary.spellEffect;

import aJD;
import bOX;
import bYE;
import bxT;
import cjK;
import ckT;
import dhy;
import dsg;
import org.keplerproject.luajava.LuaState;

final class GetEffectAreaBaseId extends dsg
{
  public static final String NAME = "getEffectAreaBaseId";
  private static final String Vu = "Retourne le reference id de la zone dont l'uid est passé en paramètre";
  private static final bYE[] Rf = { new bYE("areaId", null, bxT.giY, false) };

  private static final bYE[] Vt = { new bYE("areaBaseId", null, bxT.giY, false) };

  GetEffectAreaBaseId(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getEffectAreaBaseId";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public bYE[] cf()
  {
    return Vt;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);

    ckT localckT = bOX.bVM().mD();
    if (localckT == null) {
      return;
    }
    aJD localaJD = localckT.LC();
    if (localaJD == null) {
      return;
    }
    cjK localcjK = localaJD.eb(l);
    if ((localcjK == null) || (!(localcjK instanceof dhy))) {
      return;
    }
    kg(localcjK.clt());
  }

  public String getDescription()
  {
    return "Retourne le reference id de la zone dont l'uid est passé en paramètre";
  }
}