package com.ankamagames.wakfu.client.ui.script;

import KP;
import aCc;
import acy;
import bYE;
import blo;
import dcK;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$SetStaticProtectorInterval extends dsg
{
  UIFunctionsLibrary$SetStaticProtectorInterval(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setStaticProtectorInterval";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.YZ();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    if (paramInt < 4) {
      UIFunctionsLibrary.K.warn("On utilise setStaticProtectorInterval avec trop peu d'arguments !");
      return;
    }
    if (KP.bXy.CB() == -1) {
      UIFunctionsLibrary.K.error("On ajoute un interval de volonté au protecteur static qui n'existe pas");
      return;
    }
    boolean bool = By(0);
    int i = Br(1);
    int j = Br(2);
    int k = Br(3);
    if (k < j) {
      UIFunctionsLibrary.K.error("On ajoute un interval de volonté dont la borne max est inférieure à la borne min au protecteur static !");
      return;
    }
    acy localacy = bool ? blo.bws().qc(i) : dcK.cOf().zJ(i);

    if (localacy == null) {
      UIFunctionsLibrary.K.error("Impossible de retrouver la famille de ressource pour laquelle on cherche à ajouter un interval de volonté de mdc");
      return;
    }

    aCc localaCc = new aCc(j, k);
    localacy.a(localaCc);
    KP.bXy.b(i, localaCc);
  }
}