package com.ankamagames.wakfu.client.core.script;

import bEX;
import bFB;
import bXf;
import bYE;
import bpM;
import ciY;
import dsg;
import org.keplerproject.luajava.LuaState;

public class FightEventFunctionsLibrary$FightCallback extends dsg
{
  private final String m_name;
  private final bpM bTS;

  private FightEventFunctionsLibrary$FightCallback(LuaState paramLuaState, String paramString, bpM parambpM)
  {
    super(paramLuaState);
    this.m_name = paramString;
    this.bTS = parambpM;
  }

  public String getName()
  {
    return this.m_name;
  }

  public bYE[] ce()
  {
    return FightEventFunctionsLibrary.Ep();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    String str = Bv(0);
    bFB[] arrayOfbFB = eT(1, paramInt);
    bXf localbXf = cYS();
    bEX.gzY.a(this.bTS, new ciY(this, localbXf, str, arrayOfbFB));
  }
}