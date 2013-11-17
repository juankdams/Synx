package com.ankamagames.baseImpl.graphics.script;

import com.ankamagames.baseImpl.graphics.script.function.mobile.AddCubicSplineTweenToMobile;
import com.ankamagames.baseImpl.graphics.script.function.mobile.AddMobileCreationCallback;
import com.ankamagames.baseImpl.graphics.script.function.mobile.AddMobileDestructionCallback;
import com.ankamagames.baseImpl.graphics.script.function.mobile.ApplyEquipment;
import com.ankamagames.baseImpl.graphics.script.function.mobile.GenerateClientMobileId;
import com.ankamagames.baseImpl.graphics.script.function.mobile.GetAnimationDuration;
import com.ankamagames.baseImpl.graphics.script.function.mobile.GetCarriedMobileId;
import com.ankamagames.baseImpl.graphics.script.function.mobile.GetDirection8To;
import com.ankamagames.baseImpl.graphics.script.function.mobile.GetDirectionTo;
import com.ankamagames.baseImpl.graphics.script.function.mobile.GetDistanceBetweenMobile;
import com.ankamagames.baseImpl.graphics.script.function.mobile.GetMobileAlpha;
import com.ankamagames.baseImpl.graphics.script.function.mobile.GetMobileDirection;
import com.ankamagames.baseImpl.graphics.script.function.mobile.GetMobileHeight;
import com.ankamagames.baseImpl.graphics.script.function.mobile.GetMobileJumpCapacity;
import com.ankamagames.baseImpl.graphics.script.function.mobile.GetMobilePosition;
import com.ankamagames.baseImpl.graphics.script.function.mobile.GetMobileRadius;
import com.ankamagames.baseImpl.graphics.script.function.mobile.GetMobileStatus;
import com.ankamagames.baseImpl.graphics.script.function.mobile.HasAnimation;
import com.ankamagames.baseImpl.graphics.script.function.mobile.IncrementMobileDeltaZ;
import com.ankamagames.baseImpl.graphics.script.function.mobile.IsAnimatedElement;
import com.ankamagames.baseImpl.graphics.script.function.mobile.IsMobile;
import com.ankamagames.baseImpl.graphics.script.function.mobile.IsMobileVisible;
import com.ankamagames.baseImpl.graphics.script.function.mobile.LinkMobile;
import com.ankamagames.baseImpl.graphics.script.function.mobile.MoveMobile;
import com.ankamagames.baseImpl.graphics.script.function.mobile.OnCellTransition;
import com.ankamagames.baseImpl.graphics.script.function.mobile.OnPathEnded;
import com.ankamagames.baseImpl.graphics.script.function.mobile.RemovePartColor;
import com.ankamagames.baseImpl.graphics.script.function.mobile.SetCarriedMobile;
import com.ankamagames.baseImpl.graphics.script.function.mobile.SetCustomWalkStyle;
import com.ankamagames.baseImpl.graphics.script.function.mobile.SetDirectionParticleSystemVisibility;
import com.ankamagames.baseImpl.graphics.script.function.mobile.SetMobileAlpha;
import com.ankamagames.baseImpl.graphics.script.function.mobile.SetMobileAnimation;
import com.ankamagames.baseImpl.graphics.script.function.mobile.SetMobileAnimationSpeed;
import com.ankamagames.baseImpl.graphics.script.function.mobile.SetMobileAnimationSuffix;
import com.ankamagames.baseImpl.graphics.script.function.mobile.SetMobileCanPlaySound;
import com.ankamagames.baseImpl.graphics.script.function.mobile.SetMobileDirection;
import com.ankamagames.baseImpl.graphics.script.function.mobile.SetMobileJumpCapacity;
import com.ankamagames.baseImpl.graphics.script.function.mobile.SetMobileLookAt;
import com.ankamagames.baseImpl.graphics.script.function.mobile.SetMobileMovementStyle;
import com.ankamagames.baseImpl.graphics.script.function.mobile.SetMobileNext4Direction;
import com.ankamagames.baseImpl.graphics.script.function.mobile.SetMobilePosition;
import com.ankamagames.baseImpl.graphics.script.function.mobile.SetMobileRadius;
import com.ankamagames.baseImpl.graphics.script.function.mobile.SetMobileStaticAnimationKey;
import com.ankamagames.baseImpl.graphics.script.function.mobile.SetMobileStatus;
import com.ankamagames.baseImpl.graphics.script.function.mobile.SetMobileToHitAnimation;
import com.ankamagames.baseImpl.graphics.script.function.mobile.SetMobileToStaticAnimation;
import com.ankamagames.baseImpl.graphics.script.function.mobile.SetMobileVisible;
import com.ankamagames.baseImpl.graphics.script.function.mobile.SetPartColor;
import com.ankamagames.baseImpl.graphics.script.function.mobile.SetPartColorByte;
import com.ankamagames.baseImpl.graphics.script.function.mobile.SetPartVisible;
import com.ankamagames.baseImpl.graphics.script.function.mobile.ThrowCarriedMobile;
import com.ankamagames.baseImpl.graphics.script.function.mobile.UnlinkMobile;
import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class MobileFunctionsLibrary extends hQ
{
  private static final MobileFunctionsLibrary ejJ = new MobileFunctionsLibrary();

  public static MobileFunctionsLibrary bbd()
  {
    return ejJ;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new MoveMobile(paramLuaState), new SetMobileAnimation(paramLuaState), new SetMobileAnimationSuffix(paramLuaState), new SetMobileAnimationSpeed(paramLuaState), new SetMobileStaticAnimationKey(paramLuaState), new SetMobileToStaticAnimation(paramLuaState), new SetMobileToHitAnimation(paramLuaState), new GetMobileDirection(paramLuaState), new SetMobileDirection(paramLuaState), new SetMobileLookAt(paramLuaState), new GetMobilePosition(paramLuaState), new SetMobilePosition(paramLuaState), new SetMobileVisible(paramLuaState), new SetMobileMovementStyle(paramLuaState), new GetMobileHeight(paramLuaState), new GetMobileStatus(paramLuaState), new OnPathEnded(paramLuaState), new GetDistanceBetweenMobile(paramLuaState), new SetMobileNext4Direction(paramLuaState), new LinkMobile(paramLuaState), new UnlinkMobile(paramLuaState), new IncrementMobileDeltaZ(paramLuaState), new SetMobileRadius(paramLuaState), new SetMobileStatus(paramLuaState), new SetMobileAlpha(paramLuaState), new GenerateClientMobileId(paramLuaState), new SetPartVisible(paramLuaState), new SetPartColor(paramLuaState), new SetPartColorByte(paramLuaState), new SetCustomWalkStyle(paramLuaState), new GetMobileAlpha(paramLuaState), new GetAnimationDuration(paramLuaState), new SetMobileJumpCapacity(paramLuaState), new GetMobileJumpCapacity(paramLuaState), new OnCellTransition(paramLuaState), new AddMobileCreationCallback(paramLuaState), new AddMobileDestructionCallback(paramLuaState), new IsMobile(paramLuaState), new IsAnimatedElement(paramLuaState), new AddCubicSplineTweenToMobile(paramLuaState), new SetCarriedMobile(paramLuaState), new ThrowCarriedMobile(paramLuaState), new GetMobileRadius(paramLuaState), new IsMobileVisible(paramLuaState), new HasAnimation(paramLuaState), new ApplyEquipment(paramLuaState), new GetDirectionTo(paramLuaState), new GetDirection8To(paramLuaState), new SetDirectionParticleSystemVisibility(paramLuaState), new GetCarriedMobileId(paramLuaState), new RemovePartColor(paramLuaState), new SetMobileCanPlaySound(paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }

  public final String getName()
  {
    return "Mobile";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }
}