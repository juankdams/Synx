package com.ankamagames.wakfu.client.core.script.fightLibrary.effectArea;

import aAZ;
import aJD;
import bYE;
import bxT;
import cjK;
import dsg;
import org.keplerproject.luajava.LuaState;

final class GetAreaPosition extends dsg
{
  private static final bYE[] Vt = { new bYE("posX", null, bxT.gja, false), new bYE("posY", null, bxT.gja, false), new bYE("posZ", null, bxT.gja, false) };
  private static final String NAME = "getAreaPosition";
  private static final String Vu = "Permet de récupérer les coordonnées de la zone associée de l'action";
  private final aAZ Vv;

  GetAreaPosition(LuaState paramLuaState, aAZ paramaAZ)
  {
    super(paramLuaState);
    this.Vv = paramaAZ;
  }

  public String getName()
  {
    return "getAreaPosition";
  }

  public bYE[] ce()
  {
    return null;
  }

  public bYE[] cf()
  {
    return Vt;
  }

  protected void S(int paramInt)
  {
    aJD localaJD = this.Vv.LC();
    if (localaJD == null) {
      return;
    }
    cjK localcjK = localaJD.ec(this.Vv.bwv());
    if (localcjK == null) {
      return;
    }
    Bz(localcjK.fa());
    Bz(localcjK.fb());
    Bz(localcjK.fc());
  }

  public String getDescription()
  {
    return "Permet de récupérer les coordonnées de la zone associée de l'action";
  }
}