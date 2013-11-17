package com.ankamagames.wakfu.client.core.script;

import bVl;
import bYE;
import bxT;
import dsg;
import ob;
import org.keplerproject.luajava.LuaState;

class InteractiveElementFunctionsLibrary$IsVisible extends dsg
{
  InteractiveElementFunctionsLibrary$IsVisible(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "isVisible";
  }

  public String getDescription()
  {
    return "Permet de savoir si un element interactif est 'visible'";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("elementId", "Id de l'element interactif", bxT.giY, false) };
  }

  public bYE[] cf()
  {
    return new bYE[] { new bYE("visible", "Si l'element est 'visible'", bxT.gjc, false) };
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);

    ob localob = bVl.caZ().hb(l);
    if (localob == null) {
      a(InteractiveElementFunctionsLibrary.ch(), "l'element interactif d'id " + l + " n'existe pas..");
      cYR();
      return;
    }
    kl(localob.isVisible());
  }
}