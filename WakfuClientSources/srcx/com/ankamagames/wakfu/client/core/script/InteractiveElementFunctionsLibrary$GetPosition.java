package com.ankamagames.wakfu.client.core.script;

import ayg;
import bYE;
import bxT;
import cYk;
import dWu;
import dsg;
import org.keplerproject.luajava.LuaState;

class InteractiveElementFunctionsLibrary$GetPosition extends dsg
{
  InteractiveElementFunctionsLibrary$GetPosition(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getPosition";
  }

  public String getDescription()
  {
    return "Récupère la position d'un element interactif";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("elementId", "Id de l'element interactif", bxT.giY, false) };
  }

  public bYE[] cf()
  {
    return new bYE[] { new bYE("x", "Position x", bxT.gja, false), new bYE("y", "Position y", bxT.gja, false), new bYE("z", "Position z", bxT.gja, false) };
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);

    dWu localdWu = ayg.aJQ().dw(l);

    if (localdWu == null) {
      a(InteractiveElementFunctionsLibrary.ch(), getName() + " : l'element interactif d'id " + l + " n'existe pas...");
      cYR();
      cYR();
      cYR();
      return;
    }
    cYk localcYk = localdWu.ML();
    Bz(localcYk.getX());
    Bz(localcYk.getY());
    Bz(localcYk.IB());
  }
}