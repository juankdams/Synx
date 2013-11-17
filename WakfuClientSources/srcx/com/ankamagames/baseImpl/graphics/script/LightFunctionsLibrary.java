package com.ankamagames.baseImpl.graphics.script;

import aAa;
import bGL;
import cSR;
import dsg;
import hQ;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class LightFunctionsLibrary extends hQ
{
  private static final Logger K = Logger.getLogger(LightFunctionsLibrary.class);
  private static final boolean DEBUG = true;
  private static final LightFunctionsLibrary gQB = new LightFunctionsLibrary();

  private static int ID = 0;

  private final cSR gQC = new cSR();
  private final cSR gQD = new cSR();

  public final String getName()
  {
    return "Light";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }

  private static aAa tk(int paramInt)
  {
    return (aAa)gQB.gQD.get(paramInt);
  }

  private static void tl(int paramInt) {
    gQB.gQD.remove(paramInt);
  }

  private static void a(int paramInt, aAa paramaAa) {
    gQB.gQD.put(paramInt, paramaAa);
  }

  private static bGL tm(int paramInt) {
    return (bGL)gQB.gQC.get(paramInt);
  }

  private static void tn(int paramInt) {
    gQB.gQC.remove(paramInt);
  }

  private static void a(int paramInt, bGL parambGL) {
    gQB.gQC.put(paramInt, parambGL);
  }

  public static LightFunctionsLibrary bUm()
  {
    return gQB;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new LightFunctionsLibrary.AddPointLight(paramLuaState), new LightFunctionsLibrary.RemovePointLight(paramLuaState), new LightFunctionsLibrary.SetPointLightPosition(paramLuaState), new LightFunctionsLibrary.SetPointLightColor(paramLuaState), new LightFunctionsLibrary.SetPointLightRange(paramLuaState), new LightFunctionsLibrary.AddGlobalLight(paramLuaState), new LightFunctionsLibrary.RemoveGlobalLight(paramLuaState), new LightFunctionsLibrary.SetGlobalLightColor(paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }
}