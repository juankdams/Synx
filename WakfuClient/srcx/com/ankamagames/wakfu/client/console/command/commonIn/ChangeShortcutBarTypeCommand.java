package com.ankamagames.wakfu.client.console.command.commonIn;

import aFy;
import aeF;
import byv;
import byz;
import cth;
import dnc;
import dpr;
import java.util.ArrayList;

public class ChangeShortcutBarTypeCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (!paramArrayList.isEmpty()) {
      dpr localdpr = byv.bFN().bFO().bGD();
      if (localdpr.cWR())
        return;
      localdpr.a(localdpr.cWy() == aFy.ebH ? aFy.ebG : aFy.ebH, true);
    }
  }

  public boolean X()
  {
    return false;
  }
}