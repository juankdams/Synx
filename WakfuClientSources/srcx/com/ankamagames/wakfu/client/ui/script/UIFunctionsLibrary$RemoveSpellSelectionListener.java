package com.ankamagames.wakfu.client.ui.script;

import bXf;
import bYE;
import cIM;
import cmI;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$RemoveSpellSelectionListener extends dsg
{
  UIFunctionsLibrary$RemoveSpellSelectionListener(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "removeSpellSelectionListener";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Zj();
  }

  public String getDescription() {
    return "Supprime l'écoute de la sélection d'un sort par une fonction script";
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    if (paramInt < 1) {
      UIFunctionsLibrary.K.warn("On utilise removeSpellSelectionListener sans argument !");
      return;
    }

    String str = Bv(0);
    bXf localbXf = cYS();

    cIM.cDe().b(localbXf, null, null, null, str);
    cmI.cnw().a(null);
  }
}