package com.ankamagames.wakfu.client.chat.console.command;

import CG;
import aeF;
import bRM;
import bmJ;
import byv;
import byz;
import cWG;
import cew;
import cgQ;
import cth;
import cyx;
import dKc;
import dgT;
import dnc;
import doe;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class SitCommand
  implements dnc
{
  protected static final Logger K = Logger.getLogger(SitCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (!c(paramaeF)) {
      return;
    }
    run();
  }

  public static void run() {
    byz localbyz = byv.bFN().bFO();
    dKc localdKc = localbyz.bSe();
    if ((localdKc != null) && (localdKc.fU() != 1))
      return;
    cew localcew = byv.bFN().bFO().aeL();
    CG localCG1 = localcew.E();
    CG localCG2 = null;
    switch (cUm.RE[localCG1.ordinal()]) {
    case 1:
    case 2:
      localCG2 = CG.bFG;

      break;
    case 3:
    case 4:
      localCG2 = CG.bFK;
    }

    if (localCG2 != null) {
      localObject = new cgQ(localCG2);
      byv.bFN().aJK().d((cWG)localObject);
    }
    Object localObject = new dgT();
    byv.bFN().aJK().d((cWG)localObject);
  }

  private boolean c(aeF paramaeF) {
    byz localbyz = byv.bFN().bFO();
    doe localdoe = bmJ.fFu.a(paramaeF);
    if ((localdoe == null) || (!localbyz.bGE().cC(localdoe.getId())))
      return false;
    cew localcew = localbyz.aeL();
    return localcew.dpz() == null;
  }

  public boolean X()
  {
    return false;
  }
}