package com.ankamagames.wakfu.client.console.command.debug;

import CA;
import Su;
import aeF;
import aje;
import byv;
import byz;
import cEl;
import cRJ;
import cSR;
import cYk;
import cth;
import dmn;
import dnc;
import java.util.ArrayList;

public class ListCharacterInfoCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    paramcth.trace("Liste des personnages enregistrés : ");

    cSR localcSR = new cSR();
    CA.Lv().a(new aje(this, localcSR));

    ArrayList localArrayList1 = new ArrayList();

    dmn localdmn = localcSR.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      ArrayList localArrayList2 = (ArrayList)localdmn.value();
      localArrayList1.addAll(ab(localArrayList2));
    }

    int i = byv.bFN().bFO().aKb().getX();
    int j = byv.bFN().bFO().aKb().getY();

    int k = 0; for (int m = localArrayList1.size(); k < m; k++) {
      cRJ localcRJ = (cRJ)localArrayList1.get(k);
      int n = (int)cEl.ag(localcRJ.getX() - i, localcRJ.getY() - j);
      if (n <= 200)
      {
        paramcth.trace(" Liste pour la famille " + localcRJ.nn() + " (pos : x=" + localcRJ.getX() + ", y=" + localcRJ.getY() + ")");
        int i1 = 0;
        int i2 = 0; for (int i3 = localcRJ.cId().size(); i2 < i3; i2++) {
          Su localSu = (Su)localcRJ.cId().get(i2);
          paramcth.trace("    " + ++i1 + "- " + localSu.getName());
        }
      }
    }
  }

  private ArrayList ab(ArrayList paramArrayList) {
    ArrayList localArrayList = new ArrayList();

    for (int i = paramArrayList.size() - 1; i >= 0; i--) {
      Su localSu = (Su)paramArrayList.get(i);
      Object localObject = null;

      for (int j = localArrayList.size() - 1; j >= 0; j--) {
        cRJ localcRJ = (cRJ)localArrayList.get(j);
        if (localcRJ.bf(localSu)) {
          localObject = localcRJ;
          break;
        }
      }

      if (localObject == null) {
        localObject = new cRJ(null);
        localArrayList.add(localObject);
      }

      ((cRJ)localObject).bg(localSu);
    }

    return localArrayList;
  }

  public boolean X()
  {
    return false;
  }
}