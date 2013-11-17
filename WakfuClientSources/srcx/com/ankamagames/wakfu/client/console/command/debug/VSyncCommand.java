package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import bAU;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import cth;
import dnc;
import java.util.ArrayList;

public class VSyncCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    bAU localbAU = WakfuClientInstance.awy().rs();
    localbAU.fM(!localbAU.bJE());

    if (!localbAU.bJE())
      paramcth.trace("vsync: on");
    else
      paramcth.trace("vsync: off");
  }

  public boolean X()
  {
    return false;
  }
}