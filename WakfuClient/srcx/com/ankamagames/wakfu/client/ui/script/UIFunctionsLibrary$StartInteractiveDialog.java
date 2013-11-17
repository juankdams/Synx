package com.ankamagames.wakfu.client.ui.script;

import bYE;
import byv;
import cyx;
import dsg;
import im;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$StartInteractiveDialog extends dsg
{
  UIFunctionsLibrary$StartInteractiveDialog(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "startInteractiveDialog";
  }

  public String getDescription()
  {
    return "Affiche une fenêtre de dialogue interactive";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Ep();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    int i = Br(0);
    byte b = (byte)Br(1);
    long l = Bu(2);

    im localim = new im();
    localim.aS(i);
    localim.G(l);
    localim.i(b);
    byv.bFN().aJK().d(localim);
  }
}