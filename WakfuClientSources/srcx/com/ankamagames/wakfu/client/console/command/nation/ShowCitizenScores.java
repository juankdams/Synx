package com.ankamagames.wakfu.client.console.command.nation;

import aeF;
import byv;
import byz;
import cth;
import cvY;
import dnc;
import dsh;
import java.util.ArrayList;

public final class ShowCitizenScores
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    byz localbyz = byv.bFN().bFO();
    cvY localcvY = localbyz.cJf();
    int[] arrayOfInt = dsh.luB.cYT();
    for (int i = 0; i < arrayOfInt.length; i++) {
      int j = arrayOfInt[i];
      int k = localcvY.dJ(j);
      cth.cqP().log(j + " score : " + k);
    }
  }

  public boolean X() {
    return false;
  }
}