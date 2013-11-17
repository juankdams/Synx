package com.ankamagames.wakfu.client.console.command.common;

import Jd;
import NW;
import aVQ;
import aeF;
import aoT;
import bBq;
import bNO;
import bU;
import bsP;
import byv;
import bzu;
import cBQ;
import cKX;
import cOP;
import ckU;
import cmZ;
import cqp;
import cth;
import dRq;
import dnc;
import hx;
import java.util.ArrayList;

public class CloseWindowCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    process();
  }

  public static void process()
  {
    int i = bBq.bKG().bjq();

    switch (i) {
    case 1:
      if (byv.bFN().c(aoT.aBl())) {
        byv.bFN().b(aoT.aBl());
        return;
      }
      dRq localdRq = bsP.getInstance().getLayeredContainer().getContainerFromLayer(-30000);
      int j = (localdRq == null) || (!localdRq.getVisible()) ? 1 : 0;

      if (hx.aGS.getState() == 1) {
        String str = bU.fH().getString("krosmoz.boardGame.loadingCancelQuestion");
        NW localNW = new NW(102, 1, str, 24L);
        cKX localcKX = cBQ.cxL().a(localNW);
        localcKX.a(new cqp());

        return;
      }if ((j != 0) || (ckU.cmE().isRunning()) || (byv.bFN().c(cmZ.cnK())))
      {
        byv.bFN().brw();
        return;
      }if (byv.bFN().c(aVQ.blh())) {
        bzu.cf((short)16414);
        return;
      }if (byv.bFN().c(Jd.Ss())) {
        if (!Jd.Ss().Su().bVk())
          byv.bFN().brw();
        else {
          bzu.cf((short)16513);
        }
        return;
      }
      byv.bFN().a(aoT.aBl());

      break;
    }
  }

  public boolean X()
  {
    return false;
  }
}