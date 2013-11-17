package com.ankamagames.wakfu.client.ui.script;

import KO;
import bYE;
import bZj;
import cAo;
import cMS;
import coS;
import dsg;
import org.keplerproject.luajava.LuaState;

public class UIFunctionsLibrary$DisplayCountDown extends dsg
{
  private int kv = 0;
  private int kw = 1;
  private final bZj kx = new bZj(this);

  UIFunctionsLibrary$DisplayCountDown(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "displayCountdown";
  }

  public String getDescription()
  {
    return "Affiche un décompte";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XC();
  }

  public final bYE[] cf()
  {
    return null;
  }

  private void eG() {
    KO.Vm().a(new coS(cMS.ksg, String.valueOf(this.kv), this.kv * 1000));

    this.kv -= this.kw;
  }

  public void S(int paramInt)
  {
    this.kv = Br(0);
    this.kw = (paramInt == 2 ? Br(1) : 1);
    eG();
    cAo.cxf().a(this.kx, this.kw * 1000, -1, this.kv / this.kw + 1);
  }
}