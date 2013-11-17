package com.ankamagames.wakfu.client.core.script;

import bVl;
import bYE;
import bxT;
import dsg;
import ob;
import org.keplerproject.luajava.LuaState;

class InteractiveElementFunctionsLibrary$SetVisible extends dsg
{
  InteractiveElementFunctionsLibrary$SetVisible(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setVisible";
  }

  public String getDescription()
  {
    return "Change la visibilité d'un element interactif";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("id", "Id de l'element interactif", bxT.giY, false), new bYE("visible", "Visibilité", bxT.gjc, false) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    boolean bool = By(1);

    ob localob = bVl.caZ().hb(l);
    if (localob == null) {
      a(InteractiveElementFunctionsLibrary.ch(), "l'element interactif d'id " + l + " n'existe pas.");
      return;
    }
    localob.setVisible(bool);
  }
}