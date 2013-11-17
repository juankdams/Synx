package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import cth;
import dMM;
import dnc;
import java.util.ArrayList;

public class TrajectoriesCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    dMM.mdk = !dMM.mdk;
    dMM.mdl = dMM.mdk;
  }

  public boolean X() {
    return false;
  }
}