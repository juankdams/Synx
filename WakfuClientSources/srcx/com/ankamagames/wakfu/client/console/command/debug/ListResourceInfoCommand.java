package com.ankamagames.wakfu.client.console.command.debug;

import UI;
import UK;
import acL;
import aeF;
import alv;
import azX;
import bPu;
import byv;
import byz;
import cYk;
import cth;
import dnc;
import dxy;
import java.util.ArrayList;

public class ListResourceInfoCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    paramcth.trace("Liste des ressources enregistrés : ");

    bPu localbPu = new bPu();

    cYk localcYk = byv.bFN().bFO().aKb();
    int i = localcYk.getX();
    int j = localcYk.getY();

    acL.apd().m(new UI(this, i, j, localbPu));

    ArrayList localArrayList = new ArrayList();

    localbPu.s(new UK(this, localArrayList));

    int k = 0; for (int m = localArrayList.size(); k < m; k++) {
      alv localalv = (alv)localArrayList.get(k);

      paramcth.trace(" Liste pour le type " + localalv.aye() + " (pos : x=" + localalv.getX() + ", y=" + localalv.getY() + ")");
      int n = 0;
      int i1 = 0; for (int i2 = localalv.KA().size(); i1 < i2; i1++) {
        azX localazX = (azX)localalv.KA().get(i1);
        paramcth.trace("    " + ++n + "- " + localazX.aLV().dcv());
      }
    }
  }

  private ArrayList E(ArrayList paramArrayList)
  {
    ArrayList localArrayList = new ArrayList();

    for (int i = paramArrayList.size() - 1; i >= 0; i--) {
      azX localazX = (azX)paramArrayList.get(i);
      Object localObject = null;

      for (int j = localArrayList.size() - 1; j >= 0; j--) {
        alv localalv = (alv)localArrayList.get(j);
        if (localalv.i(localazX)) {
          localObject = localalv;
          break;
        }
      }

      if (localObject == null) {
        localObject = new alv(null);
        localArrayList.add(localObject);
      }

      ((alv)localObject).j(localazX);
    }

    return localArrayList;
  }

  public boolean X()
  {
    return false;
  }
}