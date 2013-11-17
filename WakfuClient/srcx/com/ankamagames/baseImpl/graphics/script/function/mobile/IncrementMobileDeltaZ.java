package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class IncrementMobileDeltaZ extends dsg
{
  private static final Logger K = Logger.getLogger(SetMobileNext4Direction.class);
  private static final String NAME = "incrementMobileDeltaZ";
  private static final bYE[] Rf = { new bYE("mobileId", "Id du mobile", bxT.giY, false), new bYE("deltaZ", "La valeur à ajouter (peut être négatif)", bxT.gja, false) };

  public IncrementMobileDeltaZ(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "incrementMobileDeltaZ";
  }

  public String getDescription()
  {
    return "Place le mobile sur un autre plan. Deux personnage placés à la même coordonnée seront trié selon leur deltaZ, il suffit d'incrémenter le deltaZ d'un perso pour que celui-ci soit affiché devant.";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    int i = Br(1);

    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo != null)
      localcUo.id(localcUo.asR() + i);
    else
      a(K, "le mobile " + l + " n'existe pas ");
  }
}