package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import ahm;
import cth;
import dnc;
import java.util.ArrayList;

public class OverheadDebugCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    ahm.dck = !ahm.dck;

    if (ahm.dck)
      paramcth.trace("Overhead debug : on");
    else
      paramcth.trace("Overhead debug : off");
  }

  public boolean X()
  {
    return false;
  }
}