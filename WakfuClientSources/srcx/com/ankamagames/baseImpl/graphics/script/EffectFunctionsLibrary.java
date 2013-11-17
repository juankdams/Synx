package com.ankamagames.baseImpl.graphics.script;

import adG;
import bKZ;
import bhQ;
import dsg;
import ew;
import hQ;
import org.keplerproject.luajava.LuaState;
import rp;

public class EffectFunctionsLibrary extends hQ
{
  private static final EffectFunctionsLibrary lbz = new EffectFunctionsLibrary();
  private adG lbA;

  public static EffectFunctionsLibrary cPR()
  {
    return lbz;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new EffectFunctionsLibrary.CreateSnowEffect(paramLuaState), new EffectFunctionsLibrary.StopEffect(paramLuaState), new EffectFunctionsLibrary.CreateRainEffect(paramLuaState), new EffectFunctionsLibrary.CreateCameraShakeEffect(paramLuaState), new EffectFunctionsLibrary.CreateCameraSeaSicknessEffect(paramLuaState), new EffectFunctionsLibrary.CreateHeatPostProcess(paramLuaState), new EffectFunctionsLibrary.CreateBloomPostProcess(paramLuaState), new EffectFunctionsLibrary.CreateFullScreenSprite(paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }

  public final void n(adG paramadG) {
    this.lbA = paramadG;
  }

  public adG cPS() {
    return this.lbA;
  }

  private static rp apF()
  {
    return lbz.lbA.apF();
  }

  public final String getName()
  {
    return "Effect";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }

  private static void a(int paramInt1, int paramInt2, int paramInt3, ew paramew, rp paramrp)
  {
    paramew.a(paramrp);
    if (paramInt2 == -1)
      paramew.e(new bhQ(paramInt1));
    else
      paramew.e(new bKZ(paramInt1, paramInt2, paramInt3));
  }
}