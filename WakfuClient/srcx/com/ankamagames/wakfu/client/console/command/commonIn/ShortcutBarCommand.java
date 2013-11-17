package com.ankamagames.wakfu.client.console.command.commonIn;

import aFy;
import aeF;
import byv;
import byz;
import cth;
import dnc;
import dpr;
import java.util.ArrayList;

public class ShortcutBarCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (!paramArrayList.isEmpty()) {
      int i = Byte.parseByte((String)paramArrayList.get(2));
      dpr localdpr = byv.bFN().bFO().bGD();
      localdpr.q((byte)(localdpr.cWy().aRP() + i), true);
    }
  }

  public boolean X() {
    return false;
  }
}