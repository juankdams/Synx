package com.ankamagames.wakfu.client.chat.console.command;

import CM;
import FJ;
import aEe;
import aYD;
import aeF;
import bOt;
import bU;
import byv;
import byz;
import cWG;
import ceb;
import cth;
import cvY;
import cyx;
import dfI;
import dnc;
import java.util.ArrayList;

public class PoliticMessageCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    String str = (String)paramArrayList.get(2);
    str = FJ.bT(str);
    str = ceb.cgG().kS(str);

    byz localbyz = byv.bFN().bFO();
    Object localObject1;
    if (localbyz.cJf().HK() != null)
    {
      Object localObject2;
      if (str.startsWith("#")) {
        str = str.replaceFirst("#", "");
        localObject1 = new dfI();
        ((dfI)localObject1).ca(str);
        byv.bFN().aJK().d((cWG)localObject1);

        str = aYD.hD(str);

        if (str.equals(""))
        {
          localObject2 = bU.fH().getString("error.chat.operationNotPermited");
          aEe localaEe = new aEe((String)localObject2);
          localaEe.mm(3);
          CM.LV().a(localaEe);
          return;
        }

        localObject2 = new aEe(localbyz.cQF(), localbyz.getId(), str);
        ((aEe)localObject2).mm(8);
        CM.LV().a((aEe)localObject2);
      }
      else {
        str = aYD.hD(str);

        if (str.equals(""))
        {
          localObject1 = bU.fH().getString("error.chat.operationNotPermited");
          localObject2 = new aEe((String)localObject1);
          ((aEe)localObject2).mm(3);
          CM.LV().a((aEe)localObject2);
          return;
        }

        localObject1 = new bOt();
        ((bOt)localObject1).ca(str);
        byv.bFN().aJK().d((cWG)localObject1);
      }
    } else {
      localObject1 = bU.fH().getString("unknown");
      CM.LV().f((String)localObject1, 3);
    }
  }

  public boolean X() {
    return false;
  }
}