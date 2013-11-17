package com.ankamagames.framework.script.libraries.scriptedAction;

import bvm;
import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class ScriptedActionFunctionsLibrary extends hQ
{
  private static final String NAME = "ScriptedAction";
  private static final String Vu = "Librarie qui fournit des fonctions permettant de forcer l'execution d'actions dans des groupes d'actions";
  private final bvm dGR;

  public final String getName()
  {
    return "ScriptedAction";
  }

  public String getDescription()
  {
    return "Librarie qui fournit des fonctions permettant de forcer l'execution d'actions dans des groupes d'actions";
  }

  public ScriptedActionFunctionsLibrary(bvm parambvm)
  {
    this.dGR = parambvm;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new GetActions(paramLuaState, this.dGR), new ExecuteAction(paramLuaState, this.dGR), new ExecuteFirstAction(paramLuaState, this.dGR), new ExecuteAllAction(paramLuaState, this.dGR), new GetNextActionTarget(paramLuaState, this.dGR), new GetNextActionsTargets(paramLuaState, this.dGR), new GetNextActionWithSpecialIdTarget(paramLuaState, this.dGR), new ExecuteFirstActionWithSpecialId(paramLuaState, this.dGR), new ExecuteActionsWithSpecialId(paramLuaState, this.dGR) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }
}