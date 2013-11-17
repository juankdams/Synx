package com.ankamagames.wakfu.client.console.command.debug;

import VV;
import abM;
import aeF;
import bNa;
import beu;
import cBQ;
import cDA;
import cKL;
import cpa;
import cth;
import cxr;
import dnc;
import dwT;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class GraphTestCommand
  implements dnc
{
  protected static final Logger K = Logger.getLogger(GraphTestCommand.class);

  private static Runnable cGC = null;

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    String str = "graphDialog";

    if (cBQ.cxL().mZ("graphDialog")) {
      cBQ.cxL().mW("graphDialog");
      return;
    }

    cBQ.cxL().a("graphDialog", VV.dJ("graphDialog"), (short)10000);
    cpa localcpa = cBQ.cxL().coO().nf("graphDialog");

    int[] arrayOfInt1 = new int[5];
    bNa[] arrayOfbNa1 = { new bNa(1.0F, 0.8F, 0.3F, 1.0F), new bNa(0.0F, 0.5F, 1.0F, 1.0F) };
    bNa[] arrayOfbNa2 = { new bNa(1.0F, 0.8F, 0.3F, 0.3F), new bNa(0.0F, 0.5F, 1.0F, 0.3F) };

    beu localbeu1 = new beu();
    localbeu1.a(arrayOfbNa1, arrayOfInt1);
    localbeu1.w(new float[] { 12.0F, 8.5F, 9.0F, 10.0F, 15.0F });

    int[] arrayOfInt2 = new int[5];
    arrayOfInt2[1] = 1;
    beu localbeu2 = new beu();
    localbeu2.a(arrayOfbNa1, arrayOfInt2);
    localbeu2.w(new float[] { 11.0F, -5.0F, 3.0F, 8.0F, 7.0F });

    int[] arrayOfInt3 = new int[10];
    arrayOfInt3[3] = 1;
    cKL localcKL = new cKL();
    localcKL.a(arrayOfbNa2, arrayOfInt3);
    localcKL.a(localbeu1);
    localcKL.a(localbeu2);

    cxr localcxr1 = new cxr();
    localcxr1.o(null);
    localcxr1.setModulationColor(new bNa(0.9F, 0.9F, 1.0F, 1.0F));
    cxr localcxr2 = new cxr();
    localcxr2.o(null);
    localcxr2.setModulationColor(new bNa(0.9F, 1.0F, 0.9F, 1.0F));

    abM localabM = (abM)localcpa.fi("graph");
    dwT localdwT = new dwT();

    localdwT.a(localbeu1);
    localdwT.a(localbeu2);
    localdwT.a(localcKL);

    for (int i = 0; i < 3; i++) {
      localdwT.a(localcxr1);
    }
    for (i = 0; i < 2; i++) {
      localdwT.a(localcxr2);
    }

    localdwT.ds(-8.0F);
    localdwT.dt(22.0F);

    localabM.setContent(localdwT);
  }

  public boolean X()
  {
    return false;
  }
}