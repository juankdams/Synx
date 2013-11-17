package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import cth;
import dnc;
import java.util.ArrayList;

public class DebugBarCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    WakfuClientInstance localWakfuClientInstance = WakfuClientInstance.awy();
    boolean bool = localWakfuClientInstance.cVd();
    localWakfuClientInstance.jF(!bool);
    if (bool == localWakfuClientInstance.cVd())
    {
      if (bool)
        paramcth.err("Unable to hide DebugBar");
      else
        paramcth.err("Unable to display DebugBar");
    }
  }

  public boolean X() {
    return false;
  }
}