package com.ankamagames.wakfu.client.chat.console.command;

import CM;
import FJ;
import abp;
import aeF;
import bU;
import byv;
import byz;
import cWG;
import ceb;
import cth;
import cyx;
import dnc;
import java.util.ArrayList;

public class TeamMessageCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    String str = (String)paramArrayList.get(2);
    str = FJ.bT(str);
    str = ceb.cgG().kS(str);

    byz localbyz = byv.bFN().bFO();
    Object localObject;
    if (localbyz.byc()) {
      localObject = new abp();
      ((abp)localObject).ca(str);
      byv.bFN().aJK().d((cWG)localObject);
    } else {
      localObject = bU.fH().getString("fight.error.notInFight");
      CM.LV().f((String)localObject, 3);
    }
  }

  public boolean X() {
    return false;
  }
}