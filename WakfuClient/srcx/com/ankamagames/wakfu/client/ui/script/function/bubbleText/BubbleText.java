package com.ankamagames.wakfu.client.ui.script.function.bubbleText;

import Kd;
import bFc;
import btI;
import cBQ;
import dbI;
import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public final class BubbleText extends hQ
{
  private static final BubbleText lSx = new BubbleText();

  private BubbleText() {
    cBQ.cxL().a(new bFc());
    dbI.cNt().a(new btI());
  }

  public static BubbleText dhV() {
    return lSx;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new ShowText(paramLuaState), new Prepare(paramLuaState), new PrepareFloating(paramLuaState), new SetText(paramLuaState), new ChangeToUpperLayer(paramLuaState), new SetOffset(paramLuaState), new AddButton(paramLuaState), new AddTimedButton(paramLuaState), new ShowMonologue(paramLuaState), new Show(paramLuaState), new Close(paramLuaState), new CloseBubbleAttachedTo(paramLuaState), new SetScreenPosition(paramLuaState), new AttachToMobile(paramLuaState), new PrepareWakfuBubble(paramLuaState), new SetCharacterSpeak(paramLuaState), new RemoveOnClose(paramLuaState), new SetShakingMode(paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }

  public void clear() {
    Kd.UN().clear();
  }

  public final String getName()
  {
    return "BubbleText";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }
}