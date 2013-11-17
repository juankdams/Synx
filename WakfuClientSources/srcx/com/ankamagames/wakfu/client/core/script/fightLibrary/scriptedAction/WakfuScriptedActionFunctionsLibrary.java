package com.ankamagames.wakfu.client.core.script.fightLibrary.scriptedAction;

import bvm;
import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class WakfuScriptedActionFunctionsLibrary extends hQ
{
  private static final String NAME = "WakfuScriptedAction";
  private static final String Vu = "Librarie qui fournit des fonctions permettant de forcer l'execution d'actions dans des groupes d'actions de Wakfu";
  private final bvm dGR;

  public WakfuScriptedActionFunctionsLibrary(bvm parambvm)
  {
    this.dGR = parambvm;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new ExecuteSpellCost(paramLuaState, this.dGR), new GetNextActionEffectArea(paramLuaState, this.dGR) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }

  public final String getName()
  {
    return "WakfuScriptedAction";
  }

  public String getDescription()
  {
    return "Librarie qui fournit des fonctions permettant de forcer l'execution d'actions dans des groupes d'actions de Wakfu";
  }
}