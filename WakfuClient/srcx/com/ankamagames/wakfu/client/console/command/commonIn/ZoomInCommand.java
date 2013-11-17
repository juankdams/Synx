package com.ankamagames.wakfu.client.console.command.commonIn;

import aeF;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import cth;
import dSz;
import dnc;
import java.util.ArrayList;

public class ZoomInCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    dSz localdSz = WakfuClientInstance.awy().Dg();
    localdSz.B(localdSz.xU() + 0.1F);
  }

  public boolean X() {
    return false;
  }
}