import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

public class LJ
{
  private static final LJ bYz = new LJ();
  private static final short bYA = 20;
  private static final int bYB = -2147483648;
  private static int bYC = -2147483647;

  private Xg bYD = new Xg();
  private ArrayList bYE = new ArrayList();

  private final Rectangle bYF = new Rectangle();

  private static final ArrayList bYG = new ArrayList();
  private static final String bYH = "stickData";

  public static LJ Wo()
  {
    return bYz;
  }

  public Xg Wp()
  {
    return this.bYD;
  }

  public void a(bpn parambpn, boolean paramBoolean) {
    a(parambpn, paramBoolean, true);
  }

  public void a(bpn parambpn, boolean paramBoolean1, boolean paramBoolean2) {
    parambpn.setStickData(new clA(paramBoolean1));
    this.bYE.add(parambpn);
    parambpn.getStickData().vJ(-2147483648);

    if (paramBoolean2)
      parambpn.a(new arA(this, parambpn));
  }

  public void a(bpn parambpn)
  {
    b(parambpn);

    this.bYE.remove(parambpn);
  }

  public void a(bpn parambpn, int paramInt) {
    if (parambpn.getStickData().cmW() == paramInt) {
      return;
    }

    b(parambpn);

    parambpn.getStickData().vJ(paramInt);
    avh localavh = (avh)this.bYD.get(paramInt);
    if (localavh == null) {
      localavh = new avh(null);
      this.bYD.put(paramInt, localavh);
    }
    localavh.f(parambpn);
  }

  public void b(bpn parambpn) {
    int i = parambpn.getStickData().cmW();
    avh localavh = (avh)this.bYD.get(i);
    if (localavh != null) {
      localavh.g(parambpn);
    }

    parambpn.getStickData().vJ(-2147483648);
  }

  private static int Wq() {
    return ++bYC;
  }

  public bCo fL(int paramInt) {
    avh localavh = (avh)this.bYD.get(paramInt);
    if ((localavh == null) || (localavh.isEmpty())) {
      return bCo.gwz;
    }

    a(paramInt, this.bYF);
    return bCo.a(this.bYF.x, this.bYF.y, this.bYF.width, this.bYF.height, localavh.aHi().getContainer());
  }

  public void a(int paramInt, Rectangle paramRectangle)
  {
    paramRectangle.setBounds(0, 0, 0, 0);

    avh localavh = (avh)this.bYD.get(paramInt);
    if ((localavh == null) || (localavh.isEmpty())) {
      return;
    }

    double d1 = 2147483647.0D;
    double d2 = 2147483647.0D;
    double d3 = -2147483648.0D;
    double d4 = -2147483648.0D;

    ArrayList localArrayList = localavh.aHj();
    int i = 1; for (int j = localArrayList.size(); i < j; i++) {
      bpn localbpn = (bpn)localArrayList.get(i);
      d1 = Math.min(d1, localbpn.getX());
      d2 = Math.min(d2, localbpn.getY());
      d3 = Math.max(d3, localbpn.getX() + localbpn.getWidth());
      d4 = Math.max(d4, localbpn.getY() + localbpn.getHeight());
    }

    paramRectangle.setBounds((int)d1, (int)d2, (int)(d3 - d1), (int)(d4 - d2));
  }

  public void a(bpn parambpn, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Point paramPoint, boolean paramBoolean)
  {
    clA localclA = parambpn.getStickData();
    int i = localclA != null ? localclA.cmW() : -2147483648;

    avh localavh1 = (avh)this.bYD.get(i);
    bpn localbpn1;
    bCo localbCo2;
    if ((localavh1 != null) && (!localclA.isMainWindow()) && (!paramBoolean))
    {
      ArrayList localArrayList1 = localavh1.aHj();
      for (k = localArrayList1.size() - 1; k >= 0; k--) {
        localbpn1 = (bpn)localArrayList1.get(k);
        if (localbpn1 != parambpn)
        {
          localbCo2 = bCo.a(paramInt3, paramInt4, parambpn, localbpn1);
          if (localbCo2 != bCo.gwz)
          {
            paramInt3 = localbCo2.a(paramInt3, localbpn1, parambpn);
            paramInt4 = localbCo2.b(paramInt4, localbpn1, parambpn);
          }
        }
      }
      if ((paramInt3 == paramInt1) && (paramInt4 == paramInt2))
      {
        paramPoint.setLocation(paramInt3, paramInt4);
        return;
      }
      a(parambpn, paramInt3, paramInt4);
      a(localavh1);
    }

    int j = 0; for (int k = this.bYE.size(); j < k; j++) {
      localbpn1 = (bpn)this.bYE.get(j);
      if ((localbpn1 != parambpn) && ((localbpn1.getStickData().cmW() != parambpn.getStickData().cmW()) || (localbpn1.getStickData().cmW() == -2147483648)))
      {
        localbCo2 = bCo.a(paramInt3, paramInt4, parambpn, localbpn1);

        if (localbCo2 != bCo.gwz)
        {
          paramInt3 = localbCo2.a(paramInt3, localbpn1, parambpn);
          paramInt4 = localbCo2.b(paramInt4, localbpn1, parambpn);
        }
      }
    }
    bCo localbCo1 = bCo.a(paramInt3, paramInt4, parambpn, parambpn.getContainer());
    paramInt3 = localbCo1.a(paramInt3, parambpn);
    paramInt4 = localbCo1.b(paramInt4, parambpn);

    if (((paramBoolean) || (parambpn.getStickData().isMainWindow())) && (parambpn.getStickData().cmW() != -2147483648)) {
      avh localavh2 = (avh)this.bYD.get(parambpn.getStickData().cmW());
      int m = paramInt3 - paramInt1;
      int n = paramInt4 - paramInt2;
      ArrayList localArrayList2 = localavh2.aHj();
      int i1 = 0; for (int i2 = localArrayList2.size(); i1 < i2; i1++) {
        bpn localbpn2 = (bpn)localArrayList2.get(i1);
        if (localbpn2 != parambpn)
        {
          localbpn2.setPosition(localbpn2.getX() + m, localbpn2.getY() + n);
        }
      }
    }
    paramPoint.x = paramInt3;
    paramPoint.y = paramInt4;
  }

  private void a(avh paramavh) {
    ArrayList localArrayList = paramavh.aHj();
    for (int i = localArrayList.size() - 1; i >= 0; i--) {
      bYG.add(localArrayList.get(i));
    }
    for (i = bYG.size() - 1; i >= 0; i--) {
      bpn localbpn = (bpn)bYG.get(i);

      a(localbpn, localbpn.getX(), localbpn.getY());
    }
    bYG.clear();
  }

  private void a(bpn parambpn, int paramInt1, int paramInt2) {
    clA localclA = parambpn.getStickData();

    if (localclA.cmW() == -2147483648) {
      return;
    }

    ArrayList localArrayList = ((avh)this.bYD.get(localclA.cmW())).aHj();
    int i = 0;

    for (int j = localArrayList.size() - 1; j >= 0; j--) {
      bpn localbpn = (bpn)localArrayList.get(j);
      if (localbpn != parambpn)
      {
        bCo localbCo = bCo.a(paramInt1, paramInt2, parambpn, localbpn);

        if (localbCo != bCo.gwz)
        {
          i = 1;
          break;
        }
      }
    }
    if (i == 0)
    {
      localArrayList.remove(parambpn);
      localclA.vJ(-2147483648);
    }
  }

  public void b(bpn parambpn, int paramInt1, int paramInt2)
  {
    avh localavh = c(parambpn);
    if (localavh != null) {
      a(localavh);
    }

    int i = 0;
    Object localObject;
    int i1;
    for (int j = this.bYE.size(); i < j; i++) {
      bpn localbpn1 = (bpn)this.bYE.get(i);
      if ((localbpn1 != parambpn) && ((localbpn1.getStickData().cmW() != parambpn.getStickData().cmW()) || (localbpn1.getStickData().cmW() == -2147483648)))
      {
        localObject = bCo.a(paramInt1, paramInt2, parambpn, localbpn1);
        if (localObject != bCo.gwz)
        {
          int m = parambpn.getStickData().cmW();
          int n = localbpn1.getStickData().cmW();

          i1 = m != -2147483648 ? m : n;
          if (i1 == -2147483648) {
            i1 = Wq();
          }

          if (m != i1)
          {
            a(parambpn, i1);
          }

          if (n != i1) {
            if (n == -2147483648)
            {
              a(localbpn1, i1);
            } else {
              ArrayList localArrayList2 = ((avh)this.bYD.get(n)).aHj();
              for (int i3 = localArrayList2.size() - 1; i3 >= 0; i3--)
                a((bpn)localArrayList2.get(i3), i1);
            }
          }
        }
      }
    }
    i = 0; for (j = this.bYD.size(); i < j; i++) {
      int k = this.bYD.uM(i);
      localObject = (avh)this.bYD.hc(i);
      ArrayList localArrayList1 = ((avh)localObject).aHj();
      bCo localbCo = fL(k);
      i1 = 0; for (int i2 = localArrayList1.size(); i1 < i2; i1++) {
        bpn localbpn3 = (bpn)localArrayList1.get(i1);
        localbpn3.getStickData().a(localbCo);
      }

      ((avh)localObject).aHk();
    }

    i = 0; for (j = this.bYE.size(); i < j; i++) {
      bpn localbpn2 = (bpn)this.bYE.get(i);
      if (localbpn2.getStickData().cmW() == -2147483648)
      {
        localbpn2.getStickData().a(bCo.a(localbpn2.getX(), localbpn2.getY(), localbpn2.getWidth(), localbpn2.getHeight(), localbpn2.getContainer()));
      }
    }
  }

  private avh c(bpn parambpn) {
    clA localclA = parambpn.getStickData();
    int i = localclA != null ? localclA.cmW() : -2147483648;
    return (avh)this.bYD.get(i);
  }

  public void d(bpn parambpn) {
    b(parambpn, parambpn.getX(), parambpn.getY());
  }

  public void a(cmV paramcmV, int paramInt1, int paramInt2) {
    int i = 0;
    Object localObject;
    int m;
    int n;
    for (int j = this.bYD.size(); i < j; i++) {
      localObject = (avh)this.bYD.hc(i);
      ArrayList localArrayList = ((avh)localObject).aHj();

      if (localArrayList.size() != 0)
      {
        m = (int)((paramcmV.MH() - ((avh)localObject).getWidth()) * ((avh)localObject).aHl()) - ((avh)localObject).getX();
        n = (int)((paramcmV.MI() - ((avh)localObject).getHeight()) * ((avh)localObject).aHm()) - ((avh)localObject).getY();

        bCo localbCo1 = ((bpn)localArrayList.get(0)).getStickData().cmX();
        switch (arz.dAc[localbCo1.ordinal()]) {
        case 1:
        case 2:
        case 3:
          m = paramInt1;
        }

        switch (arz.dAc[localbCo1.ordinal()]) {
        case 3:
        case 4:
        case 5:
          n = paramInt2;
        }

        int i2 = 0; for (int i3 = localArrayList.size(); i2 < i3; i2++) {
          bpn localbpn = (bpn)localArrayList.get(i2);
          localbpn.setPosition(localbpn.getX() + m, localbpn.getY() + n);
        }

        ((avh)localObject).setPosition(avh.b((avh)localObject) + m, avh.c((avh)localObject) + n);
      }
    }

    i = 0; for (j = this.bYE.size(); i < j; i++) {
      localObject = (bpn)this.bYE.get(i);
      if (((bpn)localObject).getStickData().cmW() == -2147483648)
      {
        int k = ((bpn)localObject).getX();
        m = ((bpn)localObject).getY();

        n = (int)((paramcmV.MH() - ((bpn)localObject).getWidth()) * ((bpn)localObject).getXPercInParent()) - k;
        int i1 = (int)((paramcmV.MI() - ((bpn)localObject).getHeight()) * ((bpn)localObject).getYPercInParent()) - m;

        bCo localbCo2 = ((bpn)localObject).getStickData().cmX();
        if (localbCo2 != null)
        {
          switch (arz.dAc[localbCo2.ordinal()]) {
          case 1:
          case 2:
          case 3:
            n = paramInt1;
          }

          switch (arz.dAc[localbCo2.ordinal()]) {
          case 3:
          case 4:
          case 5:
            i1 = paramInt2;
          }

          ((bpn)localObject).setPosition(k + n, m + i1, 0, false, false);
        }
      }
    }
  }

  public boolean cE(String paramString) {
    ciW localciW = cBQ.cxL().mK(paramString);
    return (localciW != null) && (localciW.contains("stickData" + paramString));
  }

  public boolean cF(String paramString) {
    ciW localciW = cBQ.cxL().mK(paramString);
    return (localciW != null) && (localciW.getBoolean("stickData" + paramString));
  }

  public void e(bpn parambpn) {
    String str = parambpn.getElementMap().getId();

    cBQ.cxL().mK(str).H("stickData" + parambpn.getHorizontalDialog(), str.startsWith(parambpn.getVerticalDialog()));
  }
}