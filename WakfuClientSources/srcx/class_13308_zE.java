import java.awt.Point;
import java.util.ArrayList;

public class zE extends amp
  implements bJM
{
  public zE(ccG paramccG)
  {
  }

  public boolean Iv()
  {
    return false;
  }

  public Or getContentMinSize(dRq paramdRq)
  {
    Or localOr;
    if (ccG.b(this.buw)) {
      localOr = this.buw.getContentIdealSize(ccG.c(this.buw), ccG.d(this.buw), ccG.e(this.buw), ccG.f(this.buw));
    } else {
      int i = 30;
      int j = 30;
      int k = ccG.g(this.buw) ? ccG.h(this.buw) : 1;
      int m = ccG.g(this.buw) ? 1 : ccG.h(this.buw);
      if (ccG.i(this.buw) != null) {
        i = ccG.i(this.buw).width * k;
        j = ccG.i(this.buw).height * m;
      }
      if ((ccG.j(this.buw) == dOf.mfJ) || (ccG.k(this.buw))) {
        if (ccG.g(this.buw))
          j += ccG.a(this.buw).getMinSize().height;
        else {
          i += ccG.a(this.buw).getMinSize().width;
        }
      }
      localOr = new Or(i, j);
    }
    return localOr;
  }

  public Or getContentPreferedSize(dRq paramdRq)
  {
    Or localOr;
    if (ccG.b(this.buw)) {
      localOr = this.buw.getContentIdealSize(ccG.c(this.buw), ccG.d(this.buw), ccG.e(this.buw), ccG.f(this.buw));
    } else {
      int i = 30;
      int j = 30;
      int k = ccG.g(this.buw) ? ccG.h(this.buw) : 1;
      int m = ccG.g(this.buw) ? 1 : ccG.h(this.buw);
      if (ccG.i(this.buw) != null) {
        i = ccG.i(this.buw).width * k;
        j = ccG.i(this.buw).height * m;
      }
      if ((ccG.j(this.buw) == dOf.mfJ) || (ccG.k(this.buw))) {
        if (ccG.g(this.buw))
          j += ccG.a(this.buw).getPrefSize().height;
        else {
          i += ccG.a(this.buw).getPrefSize().width;
        }
      }
      localOr = new Or(i, j);
    }
    return localOr;
  }

  public void ap(boolean paramBoolean)
  {
    if (ccG.l(this.buw) == null) {
      return;
    }

    ccG.a(this.buw, true);
    int i = this.buw.czl.getContentWidth();
    int j = this.buw.czl.getContentHeight();

    ArrayList localArrayList = this.buw.getItems();
    int k = localArrayList == null ? 0 : localArrayList.size();

    int m = 0; int n = 0;
    int i1;
    int i2;
    if (ccG.m(this.buw)) {
      if (k > 0) {
        if (ccG.g(this.buw)) {
          i1 = i / k;
          i2 = j;
        } else {
          i2 = j / k;
          i1 = i;
        }
      } else {
        i2 = j;
        i1 = i;
      }
    } else {
      i1 = ccG.i(this.buw).aay() != -1.0F ? bCO.bD(i * ccG.i(this.buw).aay() / 100.0F) : ccG.i(this.buw).width;
      i2 = ccG.i(this.buw).aaz() != -1.0F ? bCO.bD(j * ccG.i(this.buw).aaz() / 100.0F) : ccG.i(this.buw).height;
    }

    if ((i2 == 0) || (i1 == 0)) {
      return;
    }

    float f1 = ccG.a(this.buw, j, i2);
    float f2 = ccG.b(this.buw, i, i1);

    int i3 = 0; int i4 = 0;

    switch (dPX.fGA[ccG.j(this.buw).ordinal()]) {
    case 2:
      ccG.b(this.buw, false);
      break;
    case 1:
      ccG.b(this.buw, true);
      break;
    case 3:
      if (((ccG.g(this.buw)) && (ccG.c(this.buw, f1) + ccG.n(this.buw) > f2)) || ((!ccG.g(this.buw)) && (ccG.d(this.buw, f2) + ccG.n(this.buw) > f1)))
      {
        ccG.b(this.buw, true);
      }
      else ccG.b(this.buw, false);

      break;
    }

    if (ccG.k(this.buw)) {
      ccG.a(this.buw).setVisible(true);
      int i5;
      if (ccG.g(this.buw)) {
        i5 = ccG.a(this.buw).getPrefSize().height;
        if (paramBoolean)
          ccG.a(this.buw).setSize(i, i5);
        j -= i5;
        if (!ccG.o(this.buw)) {
          if (paramBoolean)
            ccG.a(this.buw).setY(n);
          n += i5;
        }
        else if (paramBoolean) {
          ccG.a(this.buw).setY(n + j);
        }
        if (paramBoolean)
          ccG.a(this.buw).setX(m);
        i2 = ccG.i(this.buw).aaz() != -1.0F ? bCO.bC(j * ccG.i(this.buw).aaz() / 100.0F) : ccG.i(this.buw).height;

        f1 = ccG.a(this.buw, j, i2);
      } else {
        i5 = ccG.a(this.buw).getPrefSize().width;
        if (paramBoolean)
          ccG.a(this.buw).setSize(i5, j);
        i -= i5;
        if (!ccG.o(this.buw)) {
          if (paramBoolean)
            ccG.a(this.buw).setX(m + i);
        } else {
          if (paramBoolean)
            ccG.a(this.buw).setX(m);
          m += i5;
        }
        if (paramBoolean)
          ccG.a(this.buw).setY(n);
        i1 = ccG.i(this.buw).aay() != -1.0F ? bCO.bC(i * ccG.i(this.buw).aay() / 100.0F) : ccG.i(this.buw).width;
        f2 = ccG.b(this.buw, i, i1);
      }
    }
    else if (paramBoolean) {
      ccG.a(this.buw).setVisible(false);
    }

    float f3 = this.buw.huJ - bCO.bD(this.buw.huJ);
    int i6 = ccG.g(this.buw) ? (int)(i1 * f3) : 0;
    int i7 = !ccG.g(this.buw) ? (int)(i2 * f3) : 0;

    int i8 = m;

    if (i4 == 0) {
      if (ccG.p(this.buw).equals(aFG.ecn))
        n = (int)(n + i2 * (f1 - 1.0F));
      else if ((ccG.p(this.buw).equals(aFG.eck)) && (ccG.g(this.buw)))
        n = (int)(n + (j - i2 - (j - i2 * f1) / 2.0F));
      else
        n += j - i2 + i7;
    }
    else {
      n += j - i2 + i7 - i4;
    }

    int i9 = bCO.aB(f1) + (ccG.g(this.buw) ? 0 : 1);
    int i10 = bCO.aB(f2) + (ccG.g(this.buw) ? 1 : 0);

    int i11 = bCO.bD(f1);
    int i12 = bCO.bD(f2);

    int i13 = ccG.g(this.buw) ? i9 - 1 + (i10 - 1) * i11 + 1 : (i9 - 1) * i12 + (i10 - 1) + 1;

    if (i13 > this.buw.ca.size()) {
      this.buw.ca.ensureCapacity(i13);
      ccG.q(this.buw).ensureCapacity(i13);
      for (i14 = this.buw.ca.size(); i14 < i13; i14++) {
        axU localaxU1 = new axU();
        localaxU1.aJ();
        localaxU1.setCollection(this.buw);
        localaxU1.setNonBlocking(this.buw.meQ);
        localaxU1.setRendererManager(ccG.l(this.buw));
        localaxU1.setEnableDND(ccG.r(this.buw));
        localaxU1.setEnabled(this.buw.bur);
        localaxU1.setNetEnabled(this.buw.meS);

        localaxU1.a(CH.bGw, new dhO(this), false);

        localaxU1.a(CH.bGs, new dhP(this), false);

        localaxU1.a(CH.bGt, new ddE(this), false);

        this.buw.ca.add(localaxU1);
        a(localaxU1);
        ccG.q(this.buw).add(new Point());
      }
    }

    int i14 = bCO.aB(ccG.x(this.buw)) + (ccG.g(this.buw) ? 0 : 1);
    int i15 = bCO.aB(ccG.y(this.buw)) + (ccG.g(this.buw) ? 1 : 0);

    if ((i15 > i10) || (i14 > i9)) {
      for (i16 = this.buw.ca.size() - 1; (i16 >= 0) && 
        (i16 >= i10 * i9); i16--)
      {
        axU localaxU2 = (axU)this.buw.ca.remove(i16);
        if (localaxU2 == ccG.w(this.buw)) {
          ccG.b(this.buw, null);
        }
        this.buw.i(localaxU2);
      }

    }

    for (int i16 = 0; i16 < i9; i16++) {
      if (i3 == 0) {
        if (ccG.p(this.buw).equals(aFG.ecl))
          m = i8 + i - (int)(i1 * f2);
        else if (ccG.p(this.buw).equals(aFG.eck))
          m = i8 + (i - (int)(i1 * f2)) / 2;
        else
          m = i8 - i6;
      }
      else {
        m = i8 - i6 + i3;
      }
      for (int i17 = 0; i17 < i10; i17++)
      {
        int i18;
        if (ccG.g(this.buw))
          i18 = i16 + i17 * i11;
        else {
          i18 = i16 * i12 + i17;
        }

        axU localaxU3 = (axU)this.buw.ca.get(i18);

        if (localaxU3 != null) {
          localaxU3.setSize(i1, i2);
          ((Point)ccG.q(this.buw).get(i18)).setLocation(m, n);
          localaxU3.setPosition(m, n, !this.buw.mff);
        }
        m += i1 + i4;
      }
      n -= i2 + i4;
    }

    ccG.e(this.buw, f2);
    ccG.f(this.buw, f1);

    if ((paramBoolean) && (ccG.k(this.buw))) {
      ccG.z(this.buw);
    }

    ccG.a(this.buw, false);

    float f4 = this.buw.huJ;
    ccG.A(this.buw);
    if (Math.abs(f4 - this.buw.huJ) > 0.0001D) {
      this.buw.setOffset(this.buw.huJ);
    }

    ccG.a(this.buw, paramBoolean);
    setNeedsToPostProcess();
  }

  public void a(dRq paramdRq)
  {
    ap(true);
  }
}