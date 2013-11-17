package com.ankamagames.wakfu.client.ui.script;

import bYE;
import bsP;
import cOP;
import ckp;
import dsg;
import org.keplerproject.luajava.LuaState;

public class UIFunctionsLibrary$SetUIVisible extends dsg
{
  UIFunctionsLibrary$SetUIVisible(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setUIVisible";
  }

  public String getDescription() {
    return "Rend visible/invisible les éléments d'interface qui ne font pas partis des layers permanents (Upper, Bulles de dialogue, Monde(overheads),etc...)";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.YQ();
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    boolean bool = By(0);

    cOP localcOP = bsP.getInstance().getLayeredContainer();
    ckp localckp = new ckp(this, bool);

    localcOP.b(localckp, new int[] { 26000, 25000, 25999, -40000 });
  }
}