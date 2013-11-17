import java.awt.Point;

class akH
  implements doN
{
  akH(WV paramWV)
  {
  }

  public boolean a(cSx paramcSx)
  {
    dMr localdMr = (dMr)paramcSx;

    if (!WV.a(this.dly)) {
      WV.a(this.dly, new Point(localdMr.y(WV.b(this.dly).getContainer()), localdMr.z(WV.b(this.dly).getContainer())));
    }

    int i = localdMr.y(WV.b(this.dly).getContainer()) - WV.c(this.dly).x;
    int j = localdMr.z(WV.b(this.dly).getContainer()) - WV.c(this.dly).y;

    int k = WV.b(this.dly).getX() + WV.b(this.dly).getWidth();
    int m = WV.b(this.dly).getY() + WV.b(this.dly).getHeight();

    int n = WV.b(this.dly).getWidth();
    int i1 = WV.b(this.dly).getHeight();
    int i2 = WV.b(this.dly).getX();
    int i3 = WV.b(this.dly).getY();

    switch (akI.dlz[WV.d(this.dly).ordinal()]) {
    case 1:
      n = Math.min(this.dly.setCheckedWidth(WV.b(this.dly).getWidth() + i), WV.e(this.dly).getWidth() - WV.b(this.dly).getX());

      break;
    case 3:
      i1 = Math.min(this.dly.setCheckedHeight(WV.b(this.dly).getHeight() + j), WV.e(this.dly).getHeight() - WV.b(this.dly).getY());

      break;
    case 4:
      i1 = Math.min(this.dly.setCheckedHeight(WV.b(this.dly).getHeight() - j), m);
      i3 = m - i1;
      break;
    case 7:
      n = Math.min(this.dly.setCheckedWidth(WV.b(this.dly).getWidth() + i), WV.e(this.dly).getWidth() - WV.b(this.dly).getX());

      i1 = Math.min(this.dly.setCheckedHeight(WV.b(this.dly).getHeight() + j), WV.e(this.dly).getHeight() - WV.b(this.dly).getY());

      break;
    case 5:
      i1 = Math.min(this.dly.setCheckedHeight(WV.b(this.dly).getHeight() + j), WV.e(this.dly).getHeight() - WV.b(this.dly).getY());

      n = Math.min(this.dly.setCheckedWidth(WV.b(this.dly).getWidth() - i), k);
      i2 = k - n;
      break;
    case 8:
      n = Math.min(this.dly.setCheckedWidth(WV.b(this.dly).getWidth() - i), k);
      i2 = k - n;
      i1 = Math.min(this.dly.setCheckedHeight(WV.b(this.dly).getHeight() - j), m);
      i3 = m - i1;
      break;
    case 6:
      i1 = Math.min(this.dly.setCheckedHeight(WV.b(this.dly).getHeight() - j), m);
      i3 = m - i1;
      n = Math.min(this.dly.setCheckedWidth(WV.b(this.dly).getWidth() + i), WV.e(this.dly).getWidth() - WV.b(this.dly).getX());

      break;
    case 2:
      n = Math.min(this.dly.setCheckedWidth(WV.b(this.dly).getWidth() - i), k);
      i2 = k - n;
      break;
    }

    WV.b(this.dly).setSize(n, i1);
    WV.b(this.dly).setPosition(i2, i3);

    WV.a(this.dly, new Point(localdMr.y(WV.b(this.dly).getContainer()), localdMr.z(WV.b(this.dly).getContainer())));

    if (WV.b(this.dly).getContainer() != null) {
      WV.b(this.dly).getContainer().cfM();
    }

    WV.a(this.dly, true);
    return false;
  }
}