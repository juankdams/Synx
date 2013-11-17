package com.ankamagames.wakfu.client.ui.script;

import aiI;
import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$ManageMRU extends dsg
{
  UIFunctionsLibrary$ManageMRU(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "manageMRU";
  }

  public String getDescription()
  {
    return "Active/Désactive des actions du MRU en fonction de leur ID";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XH();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    int i = Br(0);
    aiI[] arrayOfaiI1 = aiI.values();
    for (aiI localaiI : arrayOfaiI1)
      if (localaiI.eo() == i) {
        localaiI.setUsable(By(1));
        break;
      }
  }
}