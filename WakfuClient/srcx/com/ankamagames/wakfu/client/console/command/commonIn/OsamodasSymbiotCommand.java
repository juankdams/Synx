package com.ankamagames.wakfu.client.console.command.commonIn;

import SB;
import aeF;
import byv;
import byz;
import bzu;
import cth;
import dnc;
import java.util.ArrayList;
import zV;

public class OsamodasSymbiotCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (byv.bFN().bFO().aii() == SB.ctB) {
      if (!byv.bFN().aCA().contains(zV.IH())) {
        byv.bFN().a(zV.IH());
      }
      bzu.cf((short)16422);
    }
  }

  public boolean X() {
    return false;
  }
}