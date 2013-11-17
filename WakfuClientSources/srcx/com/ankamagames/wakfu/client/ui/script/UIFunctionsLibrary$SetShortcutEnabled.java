package com.ankamagames.wakfu.client.ui.script;

import bEs;
import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$SetShortcutEnabled extends dsg
{
  UIFunctionsLibrary$SetShortcutEnabled(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setShortcutEnabled";
  }

  public String getDescription()
  {
    return "Permet d'activer/désactiver l'ensemble, un groupe ou un unique raccourci (voir le fichier config/client/content/data/shortcuts.xml). Si aucune id n'est précisée dans le raccourci, vous pouvez en rajouter une.";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.YP();
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    boolean bool = By(0);
    String str1 = paramInt >= 2 ? Bv(1) : null;
    String str2 = paramInt >= 3 ? Bv(2) : null;

    if (paramInt == 1)
      bEs.bMK().ay(bool);
    else if (paramInt == 2)
      bEs.bMK().e(str1, bool);
    else if (paramInt == 3)
      bEs.bMK().f(str2, bool);
  }
}