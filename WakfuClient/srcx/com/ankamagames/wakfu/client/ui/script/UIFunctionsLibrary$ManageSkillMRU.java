package com.ankamagames.wakfu.client.ui.script;

import aCH;
import bYE;
import clR;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$ManageSkillMRU extends dsg
{
  UIFunctionsLibrary$ManageSkillMRU(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "manageSkillMRU";
  }

  public String getDescription()
  {
    return "Active/Desactive une action MRU";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XG();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    int i = Br(0);
    aCH localaCH = clR.cni().vL(i);
    if (localaCH == null) {
      UIFunctionsLibrary.K.error("[GD] Mauvais paramètre, le visuel " + i + " n'existe pas");
      return;
    }
    localaCH.setEnabled(By(1));
  }
}