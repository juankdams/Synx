package com.ankamagames.wakfu.client.console.command.nation;

import aYr;
import aeF;
import aoK;
import byv;
import byz;
import cth;
import cvY;
import dnc;
import dqU;
import dsh;
import java.util.ArrayList;

public final class ShowDiplomacy
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    aYr localaYr1 = byv.bFN().bFO().cJf().UI();

    int[] arrayOfInt = dsh.luB.cYT();
    for (int i = 0; i < arrayOfInt.length; i++) {
      int j = arrayOfInt[i];
      aYr localaYr2 = dsh.luB.BA(j);
      aoK localaoK1 = localaYr2.aMP();
      aoK localaoK2 = localaYr1.aMP();
      dqU localdqU1 = localaoK2.jq(j);
      cth.cqP().log(j + " -> " + localdqU1);
      dqU localdqU2 = localaoK1.jp(localaYr1.bP());
      if (localdqU2 != null)
        cth.cqP().log(j + " attend une réponse pour : " + localdqU2);
      dqU localdqU3 = localaoK2.jp(j);
      if (localdqU3 != null)
        cth.cqP().log(j + " doit répondre pour : " + localdqU1);
    }
  }

  public boolean X() {
    return false;
  }
}