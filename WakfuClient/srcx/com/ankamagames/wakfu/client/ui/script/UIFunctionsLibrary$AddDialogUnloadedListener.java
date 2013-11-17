package com.ankamagames.wakfu.client.ui.script;

import Xd;
import bFB;
import bXf;
import bYE;
import cIM;
import dsg;
import org.keplerproject.luajava.LuaState;

public class UIFunctionsLibrary$AddDialogUnloadedListener extends dsg
{
  UIFunctionsLibrary$AddDialogUnloadedListener(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addDialogUnloadedListener";
  }

  public String getDescription()
  {
    return "Permet de demander l'éxécution d'un callback LUA lors de la fermeture d'une interface Xulor. Une fois ce callback appelé, il sera automatiquement désenregistré.";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.YK();
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    String str1 = Bv(0);
    String str2 = Bv(1);
    bFB[] arrayOfbFB = eT(2, paramInt);
    bXf localbXf = cYS();

    Xd localXd = new Xd(this, localbXf, str2, arrayOfbFB, str1);

    cIM.cDe().a(str1, localXd);
  }
}