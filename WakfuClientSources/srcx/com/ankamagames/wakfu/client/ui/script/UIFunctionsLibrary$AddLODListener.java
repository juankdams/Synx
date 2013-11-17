package com.ankamagames.wakfu.client.ui.script;

import asZ;
import bXf;
import bYE;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class UIFunctionsLibrary$AddLODListener extends dsg
{
  UIFunctionsLibrary$AddLODListener(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addLODListener";
  }

  public String getDescription() {
    return "Ajoute une écoute sur le changement de niveau de détails du jeu";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Zk();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    if (paramInt < 1) {
      UIFunctionsLibrary.K.warn("On utilise addLODListener sans argument !");
      return;
    }

    String str = Bv(0);
    bXf localbXf = cYS();

    WakfuClientInstance.awy().a(new asZ(this, localbXf, str));
  }
}