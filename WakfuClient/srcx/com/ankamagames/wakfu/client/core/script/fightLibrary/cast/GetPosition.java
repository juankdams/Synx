package com.ankamagames.wakfu.client.core.script.fightLibrary.cast;

import bYE;
import bxT;
import cJs;
import org.keplerproject.luajava.LuaState;

final class GetPosition extends CastFunction
{
  private static final String NAME = "getPosition";
  private static final String Vu = "Permet de récupérer les coordonnées de la cellule ciblée par l'action";
  private static final bYE[] edq = { new bYE("posX", null, bxT.gja, false), new bYE("posY", null, bxT.gja, false), new bYE("posZ", null, bxT.gja, false) };

  GetPosition(LuaState paramLuaState, cJs paramcJs)
  {
    super(paramLuaState, paramcJs);
  }

  public String getName()
  {
    return "getPosition";
  }

  public bYE[] ce()
  {
    return null;
  }

  public final bYE[] cf()
  {
    return edq;
  }

  public void S(int paramInt)
  {
    Bz(this.gPj.getX());
    Bz(this.gPj.getY());
    Bz(this.gPj.IB());
  }

  public String getDescription()
  {
    return "Permet de récupérer les coordonnées de la cellule ciblée par l'action";
  }
}