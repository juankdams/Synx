package com.ankamagames.wakfu.client.console.command.display;

import Kn;
import UG;
import aIH;
import acL;
import aeF;
import ahm;
import alt;
import arl;
import bGT;
import bVl;
import bmz;
import btb;
import byv;
import byz;
import cFV;
import cWj;
import cid;
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import cth;
import cyj;
import ddD;
import dnc;
import java.util.ArrayList;
import java.util.Iterator;
import ob;
import org.apache.log4j.Logger;

public class HideFightOccluders
  implements dnc
{
  private static final Logger K = Logger.getLogger(HideFightOccluders.class);
  public static final int SHOW_ALL = 0;
  public static final int kDN = 1;
  public static final int kDO = 2;
  private static int aHa = 0;
  private static float bPc;

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    aHa = (aHa + 1) % 3;
    yV(aHa);
    WakfuClientInstance.awy().awB().a(bmz.fEt, aHa);
  }

  public boolean X() {
    return false;
  }

  public static int cR(float paramFloat)
  {
    return paramFloat == 1.0F ? 0 : paramFloat == 0.0F ? 2 : 1;
  }

  private static int yU(int paramInt) {
    switch (paramInt) {
    case 0:
      return 50;
    case 1:
    case 2:
      return 1000;
    }
    K.error("state inconnu " + paramInt);

    return 0;
  }

  public static void yV(int paramInt) {
    l(paramInt, 0.4F);
  }

  public static void l(int paramInt, float paramFloat) {
    a(paramInt, paramFloat, yU(paramInt));
  }

  public static void a(int paramInt1, float paramFloat, int paramInt2) {
    boolean bool = paramInt1 != 0;
    bPc = paramFloat;
    aHa = paramInt1;

    switch (paramInt1) {
    case 0:
      break;
    case 1:
      bGT.bOB().bR(bPc);
      break;
    case 2:
      bGT.bOB().bR(0.0F);
      break;
    default:
      K.error("state inconnu " + paramInt1);
    }

    byz localbyz = WakfuClientInstance.awy().awz().bFO();
    if (localbyz == null) {
      return;
    }
    bGT.bOB().f(bool, paramInt2);

    arl localarl = localbyz.aeQ();
    if (localarl == null) {
      return;
    }
    localarl.aDC().cN(paramFloat);

    UG localUG = localarl.LB();
    if (localUG == null) {
      return;
    }

    int i = localUG.getMinX();
    int j = localUG.getMinY();
    int k = localUG.ahP();
    int m = localUG.ahQ();

    ArrayList localArrayList1 = new ArrayList(64);
    Iterator localIterator = btb.bBd().bBe();
    int n = -2147483648;
    int i1 = -2147483648;

    ArrayList localArrayList2 = new ArrayList();

    while (localIterator.hasNext()) {
      localObject1 = (Kn)localIterator.next();

      localObject2 = ((Kn)localObject1).UT();
      for (int i2 = 0; i2 < localObject2.length; i2++) {
        Object localObject3 = localObject2[i2];
        ScreenElement localScreenElement = localObject3.bpc();
        if (localScreenElement.ddH() > k)
        {
          int i3 = localScreenElement.ddI();
          int i4 = localScreenElement.ddJ();

          if ((i4 >= j) && (i3 >= i))
          {
            if (localUG.aq(i3, i4)) {
              if ((localScreenElement.ddH() > m) && (!localScreenElement.ddL().cjK())) {
                localArrayList2.add(localObject3);
              }
            }
            else
            {
              if ((i3 != n) || (i4 != i1)) {
                n = i3;
                i1 = i4;

                localArrayList1.clear();
                btb.bBd().a(i3, i4, localArrayList1, cWj.kJk);

                for (int i5 = 0; i5 < localArrayList1.size(); i5++) {
                  for (int i6 = i5 + 1; i6 < localArrayList1.size(); i6++) {
                    DisplayedScreenElement localDisplayedScreenElement1 = (DisplayedScreenElement)localArrayList1.get(i5);
                    DisplayedScreenElement localDisplayedScreenElement2 = (DisplayedScreenElement)localArrayList1.get(i6);
                    if (localDisplayedScreenElement2.bpd() < localDisplayedScreenElement1.bpd()) {
                      localArrayList1.set(i5, localDisplayedScreenElement2);
                      localArrayList1.set(i6, localDisplayedScreenElement1);
                    }
                  }
                }
              }

              if ((localArrayList1.size() == 0) || 
                (localScreenElement.ddH() > ((DisplayedScreenElement)localArrayList1.get(0)).bpc().ddH()))
              {
                localArrayList2.add(localObject3);
              }
            }
          }
        }
      }
    }
    acL.apd().m(new ddD(i, j, k, m, localArrayList2));

    Object localObject1 = bVl.caZ().cbb();
    while (((Iterator)localObject1).hasNext()) {
      localObject2 = (ob)((Iterator)localObject1).next();
      if (!(((ob)localObject2).vK() instanceof cyj))
      {
        if (a((ahm)localObject2, i, j, k, m))
          localArrayList2.add(localObject2);
      }
    }
    for (Object localObject2 = localArrayList2.iterator(); ((Iterator)localObject2).hasNext(); ) { alt localalt = (alt)((Iterator)localObject2).next();
      localalt.m(bool); }
  }

  private static boolean a(ahm paramahm, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramahm.fc() + paramahm.ats() <= paramInt3) {
      return false;
    }
    if ((paramahm.fb() < paramInt2) || (paramahm.fa() < paramInt1)) {
      return false;
    }
    return true;
  }

  public static int getState() {
    return aHa;
  }

  public static void i(ahm paramahm) {
    byz localbyz = WakfuClientInstance.awy().awz().bFO();
    if (localbyz == null) {
      return;
    }
    arl localarl = localbyz.aeQ();
    if (localarl == null) {
      return;
    }
    UG localUG = localarl.LB();
    if (localUG == null) {
      return;
    }
    int i = localUG.getMinX();
    int j = localUG.getMinY();
    int k = localUG.ahP();
    int m = localUG.ahQ();

    if (a(paramahm, i, j, k, m))
      paramahm.m(aHa != 0);
  }
}