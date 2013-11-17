package com.ankamagames.wakfu.client.ui.script;

import aIH;
import ana;
import az;
import bU;
import bYE;
import bmz;
import cjO;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$DisplayTutorialMessage extends dsg
{
  UIFunctionsLibrary$DisplayTutorialMessage(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "displayTutorialMessage";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Er();
  }

  public String getDescription()
  {
    return "Utilise le système d'affichage popup pour afficher un message titré";
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    if (!WakfuClientInstance.awy().awB().a(bmz.fEP)) {
      return;
    }
    String str1 = bU.fH().getString(Bv(0));
    String str2 = bU.fH().getString(Bv(1));
    az localaz = new az(str1, str2, ana.dqn);
    cjO.clE().j(localaz);
  }
}