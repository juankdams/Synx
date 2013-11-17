package com.ankamagames.wakfu.client.core.script.fightLibrary.spellEffect;

import aZI;
import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class SpellEffectFunctionsLibrary extends hQ
{
  private static final String NAME = "SpellEffect";
  private static final String Vu = "Librairie à utiliser dans les scripts d'effets uniquement";
  private final aZI kZA;

  public SpellEffectFunctionsLibrary(aZI paramaZI)
  {
    this.kZA = paramaZI;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new RollEcaflipDice(paramLuaState, this.kZA), new GetTarget(paramLuaState, this.kZA), new DisplayFlyingValue(paramLuaState, this.kZA), new GetEffectValue(paramLuaState, this.kZA), new GetHpLeechValue(paramLuaState, this.kZA), new GetPosition(paramLuaState, this.kZA), new GetTargetCell(paramLuaState, this.kZA), new GetCaster(paramLuaState, this.kZA), new GetMovementEffectArrivalCell(paramLuaState, this.kZA), new GetThrowEffectArrivalCell(paramLuaState, this.kZA), new GetMover(paramLuaState, this.kZA), new DisplayFlyingItem(paramLuaState, this.kZA), new GetEffectArea(paramLuaState, this.kZA), new GetCasterPosition(paramLuaState, this.kZA), new GetBearerPosition(paramLuaState, this.kZA), new SetEffectAreaPlayDeathAnim(paramLuaState), new HasState(paramLuaState), new GetEffectAreaBaseId(paramLuaState), new GetArmorLossValue(paramLuaState, this.kZA) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }

  public final String getName()
  {
    return "SpellEffect";
  }

  public String getDescription()
  {
    return "Librairie à utiliser dans les scripts d'effets uniquement";
  }
}