import java.util.ArrayList;

class aWY extends amp
{
  private aWY(cow paramcow)
  {
  }

  private int getFirstConstraint()
  {
    if (cow.a(this.fcp) <= 0) {
      return (int)Math.round(Math.sqrt(cow.b(this.fcp).size()));
    }

    return cow.a(this.fcp);
  }

  private int getSecondConstraint(int paramInt) {
    return (int)Math.ceil(cow.b(this.fcp).size() / paramInt);
  }

  public Or getContentMinSize(dRq paramdRq) {
    if (cow.b(this.fcp).size() == 0)
      return new Or(0, 0);
    int j;
    int i;
    if (cow.c(this.fcp)) {
      j = getFirstConstraint();
      i = getSecondConstraint(j);
    } else {
      i = getFirstConstraint();
      j = getSecondConstraint(i);
    }

    Or localOr = ((dRq)cow.b(this.fcp).get(0)).getMinSize();

    localOr.setWidth(localOr.width * j);
    localOr.setHeight(localOr.height * i);

    return localOr;
  }

  public Or getContentPreferedSize(dRq paramdRq) {
    if (cow.b(this.fcp).size() == 0)
      return new Or(0, 0);
    int j;
    int i;
    if (cow.c(this.fcp)) {
      j = getFirstConstraint();
      i = getSecondConstraint(j);
    } else {
      i = getFirstConstraint();
      j = getSecondConstraint(i);
    }

    Or localOr = ((dRq)cow.b(this.fcp).get(0)).getPrefSize();

    localOr.setWidth(localOr.width * j);
    localOr.setHeight(localOr.height * i);

    return localOr;
  }

  public void a(dRq paramdRq) {
    if (cow.b(this.fcp).size() == 0)
      return;
    int j;
    int i;
    if (cow.c(this.fcp)) {
      j = getFirstConstraint();
      i = getSecondConstraint(j);
    } else {
      i = getFirstConstraint();
      j = getSecondConstraint(i);
    }

    int k = 0; for (int m = cow.b(this.fcp).size(); k < m; k++) {
      ((dRq)cow.b(this.fcp).get(k)).setSizeToPrefSize();
    }

    k = cow.b(this.fcp).size();

    m = ((dRq)cow.b(this.fcp).get(0)).getWidth();
    int n = ((dRq)cow.b(this.fcp).get(0)).getHeight();

    int i1 = 0;
    int i2 = paramdRq.getAppearance().getContentHeight() - n;
    int i3;
    int i4;
    int i5;
    dRq localdRq;
    if (cow.c(this.fcp))
    {
      for (i3 = 0; i3 < i; i3++) {
        for (i4 = 0; i4 < j; i4++) {
          i5 = i4 + i3 * j;
          if (i5 >= k) {
            return;
          }
          localdRq = (dRq)cow.b(this.fcp).get(i5);
          localdRq.setPosition(i1, i2);
          i1 += m;
        }
        i1 = 0;
        i2 -= n;
      }
    }
    else
      for (i3 = 0; i3 < j; i3++) {
        for (i4 = 0; i4 < i; i4++) {
          i5 = i3 + i4 * j;
          if (i5 >= k) {
            return;
          }
          localdRq = (dRq)cow.b(this.fcp).get(i4 + i3 * i);
          localdRq.setPosition(i1, i2);
          i2 -= n;
        }
        i2 = paramdRq.getAppearance().getContentHeight() - n;
        i1 += m;
      }
  }
}