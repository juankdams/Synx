package com.ankamagames.wakfu.client.ui.script;

import bFB;
import bOg;
import bXf;
import bYE;
import cIM;
import cmI;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$AddSpellSelectionListener extends dsg
{
  UIFunctionsLibrary$AddSpellSelectionListener(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addSpellSelectionListener";
  }

  public String getDescription() {
    return "Ajoute une écoute sur la sélection d'un sort";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Zi();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    if (paramInt < 1) {
      UIFunctionsLibrary.K.warn("On utilise addSpellSelectionListener sans argument !");
      return;
    }
    Boolean localBoolean = Boolean.valueOf(By(0));

    String str = Bv(1);
    bFB[] arrayOfbFB = eT(2, paramInt);
    bXf localbXf = cYS();

    bOg localbOg1 = (bOg)cIM.cDe().a(localbXf, null, null, null, str);
    if (localbOg1 == null) {
      localbOg1 = new bOg(localbXf, str, arrayOfbFB, localBoolean.booleanValue());

      cIM.cDe().a(localbXf, null, null, null, str, localbOg1);

      cmI.cnw().a(localbOg1);
    } else {
      localbOg1.a(arrayOfbFB);
      bOg localbOg2 = cmI.cnw().cnz();
      if ((localbOg2 == null) || (localbOg2 != localbOg1))
        cmI.cnw().a(localbOg1);
    }
  }
}