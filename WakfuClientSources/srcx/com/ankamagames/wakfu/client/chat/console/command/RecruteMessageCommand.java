package com.ankamagames.wakfu.client.chat.console.command;

import CM;
import FJ;
import aEe;
import aYD;
import abi;
import aeF;
import bDR;
import bU;
import byv;
import byz;
import ceb;
import cth;
import cyx;
import dnc;
import java.util.ArrayList;

public class RecruteMessageCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    String str = ((String)paramArrayList.get(0)).trim();

    str = FJ.u(str, abi.cPy.anI());
    if (str == null) {
      return;
    }

    byz localbyz = byv.bFN().bFO();

    if (localbyz != null)
    {
      if (!str.equals(""))
      {
        str = FJ.bT(str);

        if (str != null) {
          str = ceb.cgG().kS(str).trim();

          bDR localbDR = new bDR();
          localbDR.ca(str);
          byv.bFN().aJK().d(localbDR);

          str = aYD.hD(str);

          if (str.equals(""))
          {
            localObject = bU.fH().getString("error.chat.operationNotPermited");
            aEe localaEe = new aEe((String)localObject);
            localaEe.mm(3);
            CM.LV().a(localaEe);
            return;
          }

          Object localObject = new aEe(localbyz.cQF(), localbyz.getId(), str);
          ((aEe)localObject).mm(12);
          CM.LV().a((aEe)localObject);
        }
      }
    }
  }

  public boolean X() {
    return false;
  }
}