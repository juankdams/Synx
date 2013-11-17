import java.awt.Point;
import java.util.ArrayList;

public class dex extends amp
  implements bJM
{
  private static final int kYr = 4;
  private static final int kYs = 6;

  public dex(ccG paramccG)
  {
  }

  public boolean Iv()
  {
    return false;
  }

  public Or getContentMinSize(dRq paramdRq) {
    int i = (int)Math.ceil(ccG.i(this.buw).getWidth() * 4.0D);
    int j = (int)Math.ceil(ccG.i(this.buw).getHeight() * 6.0D);

    return new Or(i, j);
  }

  public Or getContentPreferedSize(dRq paramdRq) {
    int i = (int)Math.ceil(ccG.i(this.buw).getWidth() * 4.0D);
    int j = (int)Math.ceil(ccG.i(this.buw).getHeight() * 6.0D);

    return new Or(i, j);
  }

  public void ap(boolean paramBoolean)
  {
    if (ccG.l(this.buw) == null) {
      return;
    }

    ccG.a(this.buw, true);
    int i = this.buw.czl.getContentWidth();
    int j = this.buw.czl.getContentHeight();

    int k = ccG.i(this.buw).width;
    int m = ccG.i(this.buw).height;

    ccG.a(this.buw).setVisible(false);

    int n = this.buw.cm.size();
    axU localaxU1;
    if (n > this.buw.ca.size()) {
      this.buw.ca.ensureCapacity(n);
      ccG.q(this.buw).ensureCapacity(n);
      for (i1 = this.buw.ca.size(); i1 < n; i1++) {
        localaxU1 = new axU();
        localaxU1.aJ();
        localaxU1.setCollection(this.buw);
        localaxU1.setNonBlocking(this.buw.meQ);
        localaxU1.setRendererManager(ccG.l(this.buw));
        localaxU1.setEnableDND(ccG.r(this.buw));
        localaxU1.setEnabled(this.buw.bur);
        localaxU1.setNetEnabled(this.buw.meS);

        localaxU1.a(CH.bGw, new NZ(this), false);

        localaxU1.a(CH.bGs, new NX(this), false);

        localaxU1.a(CH.bGt, new NY(this), false);

        this.buw.ca.add(localaxU1);
        a(localaxU1);
        ccG.q(this.buw).add(new Point());
      }

    }

    for (int i1 = this.buw.ca.size() - 1; (i1 >= 0) && 
      (i1 >= n); i1--)
    {
      localaxU1 = (axU)this.buw.ca.remove(i1);
      if (localaxU1 == ccG.w(this.buw)) {
        ccG.b(this.buw, null);
      }
      this.buw.i(localaxU1);
    }

    i1 = 0;
    for (int i2 = 0; i2 < 4; i2++)
    {
      int i3 = i2 * k;
      int i5;
      int i4;
      if (i2 == 0) {
        i5 = 3;
        i4 = m * 6 - m * 2;
      } else if (i2 == 3) {
        i5 = 4;
        i4 = m * 6 - m * 3;
      } else {
        i5 = 5;
        i4 = m * 6 - m * i2;
      }

      for (int i6 = 0; i6 < i5; i6++) {
        axU localaxU2 = (axU)this.buw.ca.get(i1++);
        localaxU2.setPosition(i3, i4);
        localaxU2.setSize(k, m);
        i4 -= m;
      }
    }

    ccG.a(this.buw, false);

    float f = this.buw.huJ;
    ccG.A(this.buw);
    if (Math.abs(f - this.buw.huJ) > 0.0001D) {
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