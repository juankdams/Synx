package com.ankamagames.wakfu.client.chat.console.command;

import CM;
import FJ;
import aYD;
import aeF;
import bU;
import byv;
import byz;
import bzH;
import cWG;
import ceb;
import cth;
import cyx;
import dnc;
import java.util.ArrayList;

public class GuildMessageCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    String str = (String)paramArrayList.get(2);
    str = FJ.bT(str);
    str = ceb.cgG().kS(str);
    str = aYD.hD(str);
    if (str.length() == 0) {
      FJ.d("error.chat.operationNotPermited", new Object[0]);
      return;
    }

    byz localbyz = byv.bFN().bFO();
    Object localObject;
    if (localbyz.bSw()) {
      localObject = new bzH();
      ((bzH)localObject).ca(str);
      ((bzH)localObject).aS(localbyz.CD());
      byv.bFN().aJK().d((cWG)localObject);
    } else {
      localObject = bU.fH().getString("group.error.not_in_guild");
      CM.LV().f((String)localObject, 3);
    }
  }

  public boolean X() {
    return false;
  }
}