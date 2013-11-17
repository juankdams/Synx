package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import byv;
import cth;
import cvW;
import cyx;
import dnc;
import java.util.ArrayList;

public class EntityStatusCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    StringBuilder localStringBuilder = new StringBuilder("Status de WakfuGameEntity :");
    try {
      localStringBuilder.append('\n').append("Connecté : ").append(byv.bFN().aJK().isConnected());
    } catch (Exception localException) {
    }
    localStringBuilder.append('\n').append("Frames : ");
    for (cvW localcvW : byv.bFN().aCA()) {
      localStringBuilder.append('\n').append(" - ").append(localcvW.getClass().getSimpleName());
    }
    paramcth.trace(localStringBuilder.toString());
  }

  public boolean X()
  {
    return false;
  }
}