package com.ankamagames.wakfu.client.ui.script;

import bYE;
import bzu;
import cWG;
import cjO;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$UnloadTutorialMessageDialog extends dsg
{
  UIFunctionsLibrary$UnloadTutorialMessageDialog(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "unloadTutorialDialog";
  }

  public String getDescription() {
    return "Ferme l'interface de tutorial";
  }

  public bYE[] ce()
  {
    return null;
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    bzu localbzu = new bzu();
    localbzu.d(19149);
    cjO.clE().j(localbzu);
  }
}