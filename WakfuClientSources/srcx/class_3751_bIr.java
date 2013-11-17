import java.awt.Point;
import java.util.ArrayList;

public class bIr extends amp
  implements bJM
{
  public bIr(ccG paramccG)
  {
  }

  public boolean Iv()
  {
    return false;
  }

  public Or getContentMinSize(dRq paramdRq) {
    int i = (int)Math.ceil(this.buw.cm.size() / ccG.B(this.buw));

    int j = (int)Math.ceil(ccG.i(this.buw).getWidth() / 2.0D * (i + ccG.B(this.buw)));
    int k = (int)Math.ceil(ccG.i(this.buw).getHeight() / 2.0D * (i + ccG.B(this.buw)));

    return new Or(j, k);
  }

  public Or getContentPreferedSize(dRq paramdRq) {
    int i = (int)Math.ceil(this.buw.cm.size() / ccG.B(this.buw));

    int j = (int)Math.ceil(ccG.i(this.buw).getWidth() / 2.0D * (i + ccG.B(this.buw)));
    int k = (int)Math.ceil(ccG.i(this.buw).getHeight() / 2.0D * (i + ccG.B(this.buw)));

    return new Or(j, k);
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

    int n = (int)Math.min(Math.floor(i / k * 2.0F), Math.floor(j / m * 2.0F)) - ccG.B(this.buw) + 1;

    int i1 = n * ccG.B(this.buw);
    axU localaxU1;
    if (i1 > this.buw.ca.size()) {
      this.buw.ca.ensureCapacity(i1);
      ccG.q(this.buw).ensureCapacity(i1);
      for (i2 = this.buw.ca.size(); i2 < i1; i2++) {
        localaxU1 = new axU();
        localaxU1.aJ();
        localaxU1.setCollection(this.buw);
        localaxU1.setNonBlocking(this.buw.meQ);
        localaxU1.setRendererManager(ccG.l(this.buw));
        localaxU1.setEnableDND(ccG.r(this.buw));
        localaxU1.setEnabled(this.buw.bur);
        localaxU1.setNetEnabled(this.buw.meS);
        localaxU1.getAppearance().setShape(bGn.gCB);

        localaxU1.a(CH.bGw, new bjQ(this), false);

        localaxU1.a(CH.bGs, new bjP(this), false);

        localaxU1.a(CH.bGt, new bjO(this), false);

        this.buw.ca.add(localaxU1);
        a(localaxU1);
        ccG.q(this.buw).add(new Point());
      }

    }

    for (int i2 = this.buw.ca.size() - 1; (i2 >= 0) && 
      (i2 >= i1); i2--)
    {
      localaxU1 = (axU)this.buw.ca.remove(i2);
      if (localaxU1 == ccG.w(this.buw)) {
        ccG.b(this.buw, null);
      }
      this.buw.i(localaxU1);
    }

    for (i2 = 0; i2 < ccG.B(this.buw); i2++)
    {
      int i4;
      int i3;
      if (i2 < ccG.B(this.buw) / 2) {
        i4 = 0;
        if (ccG.C(this.buw))
          i3 = -m * (2 * i2 - ccG.B(this.buw) + 1);
        else
          i3 = m * (2 * i2 - ccG.B(this.buw)) + j;
      }
      else {
        i3 = 0;
        if (ccG.C(this.buw))
          i4 = (int)(m / 2.0F * (2 * i2 - ccG.B(this.buw) + 1));
        else {
          i4 = (int)(m / 2.0F * (2 * i2 - ccG.B(this.buw) - 1)) + j;
        }
      }

      for (int i5 = 0; i5 < n; i5++) {
        int i6 = (ccG.B(this.buw) - i2 - 1) * n + i5;
        axU localaxU2 = (axU)this.buw.ca.get(i6);
        localaxU2.setPosition(i3, i4);
        localaxU2.setSize(k, m);
        i3 += k / 2;
        i4 += (ccG.C(this.buw) ? m / 2 : -m / 2);
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