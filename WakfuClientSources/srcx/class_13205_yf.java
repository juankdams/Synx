import java.awt.Point;

class yf
  implements doN
{
  yf(bhd parambhd)
  {
  }

  public boolean a(cSx paramcSx)
  {
    dMr localdMr = (dMr)paramcSx;

    if (!bhd.f(this.brB)) {
      return false;
    }

    bhd.a(this.brB, true);

    int i = localdMr.y(this.brB) - bhd.g(this.brB).x;
    int j = localdMr.z(this.brB) - bhd.g(this.brB).y;
    int k = this.brB.fvw + i;
    int m = this.brB.fvx + j;

    bhd.a(this.brB, i);
    bhd.b(this.brB, j);

    this.brB.setDeltaX(k);
    this.brB.setDeltaY(m);

    bhd.a(this.brB, new Point(localdMr.y(this.brB), localdMr.z(this.brB)));
    return false;
  }
}