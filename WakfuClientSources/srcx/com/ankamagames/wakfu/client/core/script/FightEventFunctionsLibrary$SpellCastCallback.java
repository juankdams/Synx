package com.ankamagames.wakfu.client.core.script;

import bEX;
import bFB;
import bXf;
import bYE;
import bpM;
import cfP;
import dsg;
import org.keplerproject.luajava.LuaState;

public class FightEventFunctionsLibrary$SpellCastCallback extends dsg
{
  private FightEventFunctionsLibrary$SpellCastCallback(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addSpellCastCallback";
  }

  public bYE[] ce()
  {
    return FightEventFunctionsLibrary.Er();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l1 = Bu(0);
    long l2 = Bu(1);
    String str = Bv(2);
    bFB[] arrayOfbFB = eT(3, paramInt);
    bXf localbXf = cYS();
    bEX.gzY.a(bpM.fKr, new cfP(this, l1, l2, localbXf, str, arrayOfbFB));
  }
}