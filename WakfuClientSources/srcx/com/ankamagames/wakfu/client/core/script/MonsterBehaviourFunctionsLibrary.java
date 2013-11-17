package com.ankamagames.wakfu.client.core.script;

import aIA;
import bYE;
import bxT;
import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class MonsterBehaviourFunctionsLibrary extends hQ
{
  private static final bYE[] loB = { new bYE("monsterId", null, bxT.giY, false) };

  private static final bYE[] loC = { new bYE("monsterId", null, bxT.giY, false) };

  private static final bYE[] loD = { new bYE("posX", null, bxT.gja, false), new bYE("posY", null, bxT.gja, false) };

  private static final bYE[] loE = { new bYE("isOnFight", null, bxT.gjc, false) };
  private final aIA loF;

  public final String getName()
  {
    return "Behaviour";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }

  public MonsterBehaviourFunctionsLibrary(aIA paramaIA)
  {
    this.loF = paramaIA;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new MonsterBehaviourFunctionsLibrary.GetMonster(this, paramLuaState), new MonsterBehaviourFunctionsLibrary.GetTarget(this, paramLuaState), new MonsterBehaviourFunctionsLibrary.GetResourcePosition(this, paramLuaState), new MonsterBehaviourFunctionsLibrary.IsMonsterOnFight(this, paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }
}