package com.ankamagames.wakfu.client.ui.script;

import bYE;
import cBQ;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$LoadDialog extends dsg
{
  UIFunctionsLibrary$LoadDialog(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "loadDialog";
  }

  public String getDescription()
  {
    return "Ouvre une fenêtre de dialogue si elle n'est pas ouverte";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XX();
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    String str1 = Bv(0);
    String str2 = null;
    short s = -1;

    if (str1.equals("emissaryTutoDialog")) {
      str2 = "emissaryTutoDialog.xml";
      s = 10000;
    } else if (str1.equals("fleaDialog")) {
      str2 = "fleaDialog.xml";
      s = 10000;
    }
    else
    {
      a(UIFunctionsLibrary.K, "Ce dialogue n'est pas pris en charge");
    }

    if ((!bB) && ((str2 == null) || (s <= 0))) throw new AssertionError();

    if (cBQ.cxL().mZ(str1)) {
      UIFunctionsLibrary.K.info("dialog " + str1 + " déjà ouvert");
      return;
    }

    cBQ.cxL().a(str1, str2, s);
  }
}