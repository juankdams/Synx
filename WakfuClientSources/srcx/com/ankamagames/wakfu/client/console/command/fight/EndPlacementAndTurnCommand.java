package com.ankamagames.wakfu.client.console.command.fight;

import Ca;
import aDd;
import aeF;
import byv;
import bzu;
import cth;
import dnc;
import java.util.ArrayList;

public class EndPlacementAndTurnCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (byv.bFN().c(Ca.Lc()))
      bzu.cf((short)18007);
    else if (byv.bFN().c(aDd.aPo()))
      bzu.cf((short)18001);
  }

  public boolean X()
  {
    return false;
  }
}