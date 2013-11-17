package com.ankamagames.wakfu.client.core.script;

import bVl;
import bYE;
import bxT;
import cMb;
import dsg;
import ob;
import org.keplerproject.luajava.LuaState;

class InteractiveElementFunctionsLibrary$GetState extends dsg
{
  InteractiveElementFunctionsLibrary$GetState(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getState";
  }

  public String getDescription()
  {
    return "Récupère l'état d'un element interactif";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("elementId", "Id de l'element interactif", bxT.giY, false) };
  }

  public bYE[] cf()
  {
    return new bYE[] { new bYE("state", "L'etat de l'element interactif", bxT.gja, false) };
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);

    ob localob = bVl.caZ().hb(l);
    if (localob == null) {
      a(InteractiveElementFunctionsLibrary.ch(), "l'element interactif d'id " + l + " n'existe pas....");
      cYR();
      return;
    }
    cMb localcMb = (cMb)localob.vK();
    Bz(localcMb.getState());
  }
}