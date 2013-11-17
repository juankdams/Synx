package com.ankamagames.wakfu.client.core.script;

import bVl;
import bYE;
import bxT;
import cMb;
import dsg;
import ob;
import org.keplerproject.luajava.LuaState;

class InteractiveElementFunctionsLibrary$IsUsable extends dsg
{
  InteractiveElementFunctionsLibrary$IsUsable(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "isUsable";
  }

  public String getDescription()
  {
    return "Permet de savoir si un element interactif est 'usable' ou non";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("elementId", "Id de l'element interactif", bxT.giY, false) };
  }

  public bYE[] cf()
  {
    return new bYE[] { new bYE("usable", "Si l'element interactif est 'usable'", bxT.gjc, false) };
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);

    ob localob = bVl.caZ().hb(l);
    if (localob == null) {
      a(InteractiveElementFunctionsLibrary.ch(), "l'element interactif d'id " + l + " n'existe pas.....");
      cYR();
      return;
    }
    cMb localcMb = (cMb)localob.vK();
    kl(localcMb.isUsable());
  }
}