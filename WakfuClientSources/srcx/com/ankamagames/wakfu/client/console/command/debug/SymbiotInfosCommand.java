package com.ankamagames.wakfu.client.console.command.debug;

import QT;
import aeF;
import byv;
import byz;
import csi;
import cth;
import dnc;
import java.util.ArrayList;

public class SymbiotInfosCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    byv localbyv = byv.bFN();
    byz localbyz = localbyv.bFO();

    QT localQT = localbyz.bGo();
    if (localQT != null)
      for (byte b = 0; b < localQT.aad(); b = (byte)(b + 1)) {
        csi localcsi = localQT.aj(b);
        cth.cqP().s(localcsi.toString() + "\n", 11141375);
      }
    else
      cth.cqP().log("pas de symbiote");
  }

  public boolean X()
  {
    return false;
  }
}