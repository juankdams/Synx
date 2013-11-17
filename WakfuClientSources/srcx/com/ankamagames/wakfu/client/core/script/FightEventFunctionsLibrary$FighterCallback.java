package com.ankamagames.wakfu.client.core.script;

import aAN;
import bEX;
import bFB;
import bXf;
import bYE;
import bpM;
import dsg;
import org.keplerproject.luajava.LuaState;

public class FightEventFunctionsLibrary$FighterCallback extends dsg
{
  private final String m_name;
  private final bpM bTS;

  private FightEventFunctionsLibrary$FighterCallback(LuaState paramLuaState, String paramString, bpM parambpM)
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
    return FightEventFunctionsLibrary.Eq();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    String str = Bv(1);
    bFB[] arrayOfbFB = eT(2, paramInt);
    bXf localbXf = cYS();
    bEX.gzY.a(this.bTS, new aAN(this, l, localbXf, str, arrayOfbFB));
  }
}