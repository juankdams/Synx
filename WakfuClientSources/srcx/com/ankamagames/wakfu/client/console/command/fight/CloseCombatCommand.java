package com.ankamagames.wakfu.client.console.command.fight;

import Hh;
import aFy;
import aeF;
import bBn;
import bZH;
import byv;
import byz;
import cGl;
import cWG;
import cjO;
import cth;
import dKD;
import dnc;
import dpr;
import gA;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class CloseCombatCommand
  implements dnc
{
  protected static final Logger K = Logger.getLogger(CloseCombatCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList) {
    if (((String)paramArrayList.get(2)).length() >= 1) {
      dpr localdpr = byv.bFN().bFO().bGD();

      dKD localdKD = null;
      if (localdpr.cWy() == aFy.ebI) {
        return;
      }

      switch (((String)paramArrayList.get(2)).charAt(0)) {
      case 'l':
        localdKD = localdpr.cWY();
        break;
      case 'r':
        localdKD = localdpr.cWZ();
        break;
      }
      gA localgA1;
      byte b;
      if (localdKD.ok() == 2145) {
        localObject = Hh.QM().dh(2145);
        gA localgA2 = new gA(-1L);
        localgA2.b((bBn)localObject);
        localgA2.l((short)1);
        localgA1 = localgA2;
        b = 15;
      } else {
        localgA1 = (gA)byv.bFN().bFO().ayJ().ci(localdKD.oj());
        b = (byte)byv.bFN().bFO().ayJ().il(localgA1.oj());
      }
      if (localgA1 == null) {
        K.error("impossible de retrouver l'item d'id " + localdKD.oj() + " supposé placé dans les mains du personnage");
        return;
      }if (!localgA1.isActive()) {
        return;
      }
      Object localObject = new cGl();
      ((cGl)localObject).e(localgA1, b);
      ((cGl)localObject).d(18009);
      cjO.clE().j((cWG)localObject);
    }
  }

  public boolean X() {
    return false;
  }
}