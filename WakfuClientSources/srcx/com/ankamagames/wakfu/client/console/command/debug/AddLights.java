package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import bCF;
import bCO;
import bGL;
import btL;
import byv;
import byz;
import cYk;
import cth;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import rI;

public class AddLights
  implements dnc
{
  private static final Logger K = Logger.getLogger(AddLights.class);

  ArrayList gcL = new ArrayList();

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    int i;
    if (paramArrayList.size() != 3) {
      if (this.gcL.size() != 0) {
        for (i = 0; i < this.gcL.size(); i++) {
          btL.gcv.kF(((bGL)this.gcL.get(i)).getId());
        }
        this.gcL.clear();
      }
      return;
    }
    try
    {
      i = Integer.valueOf((String)paramArrayList.get(2)).intValue();

      cYk localcYk = byv.bFN().bFO().ML();
      for (int j = 0; j < i; j++) {
        rI localrI = new rI(new bCF(localcYk.getX(), localcYk.getY(), localcYk.IB()), bCO.U(-0.5F, 0.5F), bCO.U(-0.5F, 0.5F));
        localrI.q(bCO.U(0.3F, 0.8F), bCO.U(0.3F, 0.8F), bCO.U(0.3F, 0.8F));
        localrI.setEnabled(true);
        localrI.aG(3.0F);
        this.gcL.add(localrI);
        btL.gcv.a(localrI);
      }
    } catch (Exception localException) {
      K.error("", localException);
    }
  }

  public boolean X() {
    return false;
  }
}