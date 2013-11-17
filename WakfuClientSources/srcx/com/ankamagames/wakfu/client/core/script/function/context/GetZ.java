package com.ankamagames.wakfu.client.core.script.function.context;

import bYE;
import bxT;
import cwO;
import dsg;
import org.keplerproject.luajava.LuaState;

public final class GetZ extends dsg
{
  public GetZ(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getZ";
  }

  public String getDescription()
  {
    return "Retourne les altitudes walkable d'une position donnée (dans l'ordre décroissant)";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("worldX", "Position x", bxT.gja, false), new bYE("worldY", "Position y", bxT.gja, false), new bYE("worldZ", "Position z", bxT.gja, true) };
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("worldZ", "Liste des altitudes walkables", bxT.gje, true) };
  }

  public void S(int paramInt)
  {
    int i = Br(0);
    int j = Br(1);

    if (paramInt == 3) {
      int k = Br(2);
      if (k == -32768)
        Bz(k);
      else
        Bz(cwO.U(i, j, (short)k));
      return;
    }

    short[] arrayOfShort = cwO.dX(i, j);
    for (int m = 0; m < arrayOfShort.length; m++)
      Bz(arrayOfShort[m]);
  }
}