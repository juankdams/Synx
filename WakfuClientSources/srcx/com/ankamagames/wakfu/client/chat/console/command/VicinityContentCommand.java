package com.ankamagames.wakfu.client.chat.console.command;

import CM;
import FJ;
import aEe;
import aJ;
import aYD;
import abi;
import aeF;
import byv;
import byz;
import ceb;
import cth;
import cyx;
import dnc;
import java.util.ArrayList;

public class VicinityContentCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return;
    }

    String str = kK(((String)paramArrayList.get(0)).trim());
    if (str == null) {
      return;
    }

    if (str.startsWith("/")) {
      return;
    }

    aJ localaJ = new aJ();
    localaJ.ca(str);
    byv.bFN().aJK().d(localaJ);

    str = aYD.hD(str);

    if (str.length() == 0) {
      FJ.d("error.chat.operationNotPermited", new Object[0]);
      return;
    }

    aEe localaEe = new aEe(localbyz.cQF(), localbyz.getId(), str);
    localaEe.mm(1);
    CM.LV().a(localaEe);
  }

  private String kK(String paramString)
  {
    String str = FJ.u(paramString, abi.cPs.anI());
    if ((str == null) || (str.length() == 0)) {
      return null;
    }

    str = FJ.bT(str);
    if (str == null) {
      return null;
    }

    return ceb.cgG().kS(str).trim();
  }

  public boolean X() {
    return false;
  }
}