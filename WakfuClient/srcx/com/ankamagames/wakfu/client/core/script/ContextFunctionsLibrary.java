package com.ankamagames.wakfu.client.core.script;

import com.ankamagames.wakfu.client.core.script.function.context.CreateAnimatedElement;
import com.ankamagames.wakfu.client.core.script.function.context.DeleteAnimatedElement;
import com.ankamagames.wakfu.client.core.script.function.context.GetCharacterName;
import com.ankamagames.wakfu.client.core.script.function.context.GetCharacteristicValue;
import com.ankamagames.wakfu.client.core.script.function.context.GetDistanceFromLocalPlayer;
import com.ankamagames.wakfu.client.core.script.function.context.GetFighterId;
import com.ankamagames.wakfu.client.core.script.function.context.GetLocalPlayerId;
import com.ankamagames.wakfu.client.core.script.function.context.GetLocalPlayerInstanceId;
import com.ankamagames.wakfu.client.core.script.function.context.GetLocalPlayerLevel;
import com.ankamagames.wakfu.client.core.script.function.context.GetLocalPlayerName;
import com.ankamagames.wakfu.client.core.script.function.context.GetLocalPlayerPetId;
import com.ankamagames.wakfu.client.core.script.function.context.GetZ;
import com.ankamagames.wakfu.client.core.script.function.context.InvokeAtLocalFightEnd;
import com.ankamagames.wakfu.client.core.script.function.context.IsCellBlockedByObstacle;
import com.ankamagames.wakfu.client.core.script.function.context.IsCellInFight;
import com.ankamagames.wakfu.client.core.script.function.context.IsLocalPlayerInFight;
import com.ankamagames.wakfu.client.core.script.function.context.IsWalkable;
import com.ankamagames.wakfu.client.core.script.function.context.SetCharacteristicListenerOn;
import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class ContextFunctionsLibrary extends hQ
{
  private static final ContextFunctionsLibrary lAY = new ContextFunctionsLibrary();

  public static ContextFunctionsLibrary dba() {
    return lAY;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new GetLocalPlayerId(paramLuaState), new IsLocalPlayerInFight(paramLuaState), new GetLocalPlayerName(paramLuaState), new GetLocalPlayerLevel(paramLuaState), new GetZ(paramLuaState), new IsWalkable(paramLuaState), new IsCellInFight(paramLuaState), new GetFighterId(paramLuaState), new SetCharacteristicListenerOn(paramLuaState), new GetCharacteristicValue(paramLuaState), new GetLocalPlayerPetId(paramLuaState), new CreateAnimatedElement(paramLuaState), new DeleteAnimatedElement(paramLuaState), new InvokeAtLocalFightEnd(paramLuaState), new GetCharacterName(paramLuaState), new GetDistanceFromLocalPlayer(paramLuaState), new IsCellBlockedByObstacle(paramLuaState), new GetLocalPlayerInstanceId(paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }

  public final String getName()
  {
    return "Context";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }
}