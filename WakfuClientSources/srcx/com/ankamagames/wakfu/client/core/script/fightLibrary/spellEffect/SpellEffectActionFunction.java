package com.ankamagames.wakfu.client.core.script.fightLibrary.spellEffect;

import aZI;
import dsg;
import org.keplerproject.luajava.LuaState;

abstract class SpellEffectActionFunction extends dsg
{
  protected final aZI kZA;

  public SpellEffectActionFunction(LuaState paramLuaState, aZI paramaZI)
  {
    super(paramLuaState);
    this.kZA = paramaZI;
  }
}