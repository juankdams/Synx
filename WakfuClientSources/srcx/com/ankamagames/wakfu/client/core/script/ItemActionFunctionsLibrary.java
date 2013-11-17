package com.ankamagames.wakfu.client.core.script;

import VY;
import bYE;
import bxT;
import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class ItemActionFunctionsLibrary extends hQ
{
  private static final bYE[] edq = { new bYE("posX", null, bxT.gja, false), new bYE("posY", null, bxT.gja, false), new bYE("posZ", null, bxT.gja, false) };
  private final VY mol;

  public final String getName()
  {
    return "ItemAction";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }

  public ItemActionFunctionsLibrary(VY paramVY)
  {
    this.mol = paramVY;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new ItemActionFunctionsLibrary.GetMobile(this, paramLuaState), new ItemActionFunctionsLibrary.GetCastPosition(paramLuaState), new ItemActionFunctionsLibrary.SelectPosition(paramLuaState), new ItemActionFunctionsLibrary.SelectCharacter(paramLuaState), new ItemActionFunctionsLibrary.SetClientVar(this, paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }
}