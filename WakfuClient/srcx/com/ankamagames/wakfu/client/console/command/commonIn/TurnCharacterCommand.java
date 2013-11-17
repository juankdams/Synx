package com.ankamagames.wakfu.client.console.command.commonIn;

import CG;
import aeF;
import aju;
import arl;
import byv;
import byz;
import cgQ;
import cth;
import cyx;
import dKc;
import dnc;
import java.util.ArrayList;

public class TurnCharacterCommand
  implements dnc
{
  private static final long duf = 500L;
  private static long bYL = -1L;

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList) {
    if (bYL == -1L) {
      bYL = System.currentTimeMillis(); } else {
      if (System.currentTimeMillis() - bYL < 500L) {
        return;
      }
      bYL = -1L;
    }
    CG localCG = null;
    if (!paramArrayList.isEmpty()) {
      try {
        localCG = CG.eu(Integer.parseInt((String)paramArrayList.get(2)));
      } catch (Exception localException) {
        localCG = null;
      }
    }
    if (localCG != null) {
      byz localbyz = byv.bFN().bFO();
      dKc localdKc = localbyz.bSe();
      if ((localdKc != null) && (localdKc.fU() != 1))
        return;
      arl localarl = localbyz.aeQ();
      if (localarl != null) {
        short s = -1;
        switch (cu.RE[localCG.ordinal()]) {
        case 1:
          s = 18006;
          break;
        case 2:
          s = 18003;
          break;
        case 3:
          s = 18005;
          break;
        case 4:
          s = 18004;
        }

        aju.fightSetDirection(localarl, s);
      } else {
        cgQ localcgQ = new cgQ(localCG);
        byv.bFN().aJK().d(localcgQ);
      }
    }
  }

  public boolean X() {
    return false;
  }
}