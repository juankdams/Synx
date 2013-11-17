package com.ankamagames.wakfu.client.console.command.debug;

import VV;
import aeF;
import aps;
import aqd;
import bBc;
import byv;
import cBQ;
import cth;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class VideoCommand
  implements dnc
{
  protected static Logger K = Logger.getLogger(VideoCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList) {
    aps localaps = byv.bFN().bFQ();
    if ((localaps != null) && (!bBc.f(localaps.bOR(), bBc.gto)))
      if (cBQ.cxL().mZ("videoDialog")) {
        cBQ.cxL().mW("videoDialog");
        cBQ.cxL().mN("wakfu.video");
      } else {
        cBQ.cxL().a("videoDialog", VV.dJ("videoDialog"), 32769L, (short)30000);

        cBQ.cxL().j("wakfu.video", aqd.class);
        K.info("Chargement de l'ui video");
      }
  }

  public boolean X()
  {
    return false;
  }
}