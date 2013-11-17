package com.ankamagames.wakfu.client.core.script.function.context;

import bYE;
import bxT;
import cwO;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class IsWalkable extends dsg
{
  private static final Logger K = Logger.getLogger(IsWalkable.class);

  public IsWalkable(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName()
  {
    return "isWalkable";
  }

  public String getDescription()
  {
    return "Permet de savoir si le perso peut marcher aux coordonnées données";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("worldX", "Position x", bxT.gja, false), new bYE("worldY", "Position y", bxT.gja, false), new bYE("worldZ", "Position z", bxT.gja, false) };
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("walkable", "Si le perso peu marcher ou pas", bxT.gjc, false) };
  }

  public void S(int paramInt)
  {
    int i = Br(0);
    int j = Br(1);
    int k = Br(2);

    kl(cwO.v(i, j, (short)k));
  }
}