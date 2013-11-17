import java.awt.Point;

class atk
  implements doN
{
  atk(dqa paramdqa)
  {
  }

  public boolean a(cSx paramcSx)
  {
    dMr localdMr = (dMr)paramcSx;

    if ((!dqa.c(this.dEz).isMovable()) || (dqa.d(this.dEz))) {
      return false;
    }

    if (!dqa.b(this.dEz)) {
      dqa.a(this.dEz, localdMr.y(dqa.c(this.dEz)));
      dqa.b(this.dEz, localdMr.z(dqa.c(this.dEz)));
      dqa.a(this.dEz, true);
    }

    int i = dqa.c(this.dEz).getX();
    int j = dqa.c(this.dEz).getY();

    if (dqa.e(this.dEz)) {
      i = localdMr.y(dqa.c(this.dEz).getContainer()) - dqa.f(this.dEz);
    }
    if (dqa.g(this.dEz)) {
      j = localdMr.z(dqa.c(this.dEz).getContainer()) - dqa.h(this.dEz);
    }

    if (dqa.c(this.dEz).isStickWithinRootContainer()) {
      int k = i - dqa.c(this.dEz).getX();
      int m = j - dqa.c(this.dEz).getY();

      int n = this.dEz.getX(dqa.i(this.dEz));
      int i1 = this.dEz.getY(dqa.i(this.dEz));

      int i2 = this.dEz.getX(dqa.c(this.dEz));
      int i3 = this.dEz.getY(dqa.c(this.dEz));

      int i4 = Math.min(50, this.dEz.haN.width);
      int i5 = Math.min(50, this.dEz.haN.height);

      if (dqa.e(this.dEz)) {
        if (dqa.c(this.dEz).getStickFullyWithinRootContainer()) {
          if (dqa.c(this.dEz).getX() + k < 0)
            i = 0;
          else if (dqa.c(this.dEz).getX() + dqa.c(this.dEz).getWidth() + k > dqa.i(this.dEz).getWidth()) {
            i = dqa.i(this.dEz).getWidth() - dqa.c(this.dEz).getWidth();
          }
        }
        else if (n + k + this.dEz.haN.width - i4 < 0)
          i = -i2 - this.dEz.haN.width + i4;
        else if (n + k + i4 > dqa.i(this.dEz).getWidth()) {
          i = dqa.i(this.dEz).getWidth() - (i2 + i4);
        }

      }

      if (dqa.g(this.dEz)) {
        if (dqa.c(this.dEz).getStickFullyWithinRootContainer()) {
          if (dqa.c(this.dEz).getY() + m < 0)
            j = 0;
          else if (dqa.c(this.dEz).getY() + dqa.c(this.dEz).getHeight() + m > dqa.i(this.dEz).getHeight()) {
            j = dqa.i(this.dEz).getHeight() - dqa.c(this.dEz).getHeight();
          }
        }
        else if (i1 + m + this.dEz.haN.height - i5 < 0)
          j = -i3 - this.dEz.haN.height + i5;
        else if (i1 + m + i5 > dqa.i(this.dEz).getHeight()) {
          j = dqa.i(this.dEz).getHeight() - (i3 + i5);
        }

      }

    }

    if (dqa.c(this.dEz).getStickData() != null) {
      Point localPoint = new Point(i, j);
      LJ.Wo().a(dqa.c(this.dEz), dqa.c(this.dEz).getX(), dqa.c(this.dEz).getY(), i, j, localPoint, bsP.getInstance().isShiftPressed());
      i = localPoint.x;
      j = localPoint.y;

      if (localdMr.y(dqa.c(this.dEz).getContainer()) <= 0)
        dqa.c(this.dEz).g(new dsf(dqa.c(this.dEz), aFG.ecj));
      else if (localdMr.y(dqa.c(this.dEz).getContainer()) >= dqa.c(this.dEz).getContainer().getWidth())
        dqa.c(this.dEz).g(new dsf(dqa.c(this.dEz), aFG.ecl));
      else if (localdMr.z(dqa.c(this.dEz).getContainer()) <= 0)
        dqa.c(this.dEz).g(new dsf(dqa.c(this.dEz), aFG.ecn));
      else if (localdMr.z(dqa.c(this.dEz).getContainer()) >= dqa.c(this.dEz).getContainer().getHeight()) {
        dqa.c(this.dEz).g(new dsf(dqa.c(this.dEz), aFG.ech));
      }
    }

    dqa.c(this.dEz).setPosition(i, j);

    if (dqa.c(this.dEz).getContainer() != null) {
      dqa.c(this.dEz).getContainer().cfM();
    }

    return false;
  }
}