import java.awt.Point;

public class aFV extends amp
{
  public aFV(biy parambiy)
  {
  }

  public boolean Iv()
  {
    return false;
  }

  public Or getContentMinSize(dRq paramdRq)
  {
    Or localOr1 = this.bPi.fyP != null ? this.bPi.fyP.getMinSize() : new Or();
    Or localOr2 = this.bPi.eun != null ? this.bPi.eun.getMinSize() : new Or();
    if ((this.bPi.fyQ == aFD.ebY) || (this.bPi.fyQ == aFD.ebX)) {
      localOr1.height = Math.max(localOr1.height, localOr2.height);
      localOr1.width += localOr2.width;
      if ((this.bPi.fyP != null) && (this.bPi.eun != null))
        localOr1.width += this.bPi.getAppearance().getGap();
    }
    else {
      localOr1.height += localOr2.height;
      localOr1.width = Math.max(localOr1.width, localOr2.width);
      if ((this.bPi.fyP != null) && (this.bPi.eun != null)) {
        localOr1.height += this.bPi.getAppearance().getGap();
      }
    }

    return localOr1;
  }

  public Or getContentPreferedSize(dRq paramdRq)
  {
    Or localOr1 = this.bPi.fyP != null ? this.bPi.fyP.getPrefSize() : new Or();
    Or localOr2 = this.bPi.eun != null ? this.bPi.eun.getPrefSize() : new Or();
    if ((this.bPi.fyQ == aFD.ebY) || (this.bPi.fyQ == aFD.ebX)) {
      localOr1.height = Math.max(localOr1.height, localOr2.height);
      localOr1.width += localOr2.width;
      if ((this.bPi.fyP != null) && (this.bPi.eun != null))
        localOr1.width += this.bPi.getAppearance().getGap();
    }
    else {
      localOr1.height += localOr2.height;
      localOr1.width = Math.max(localOr1.width, localOr2.width);
      if ((this.bPi.fyP != null) && (this.bPi.eun != null)) {
        localOr1.height += this.bPi.getAppearance().getGap();
      }
    }

    return localOr1;
  }

  public void a(dRq paramdRq)
  {
    Or localOr1 = new Or(0, 0);
    Point localPoint1 = new Point(0, 0);
    Or localOr2 = new Or(0, 0);
    Point localPoint2 = new Point(0, 0);

    if ((this.bPi.eun != null) && (this.bPi.eun.getVisible())) {
      localOr1 = this.bPi.eun.getPrefSize();
    }
    if ((this.bPi.fyP != null) && (this.bPi.fyP.getVisible())) {
      localOr2 = this.bPi.fyP.getPrefSize();
      switch (OE.bgx[this.bPi.fyQ.ordinal()]) {
      case 1:
        localPoint2.y += localOr1.height;
        if (this.bPi.eun != null)
          localPoint2.y += this.bPi.getAppearance().getGap(); break;
      case 2:
        localPoint1.y += localOr2.height;
        if (this.bPi.eun != null)
          localPoint1.y += this.bPi.getAppearance().getGap(); break;
      case 3:
        localPoint2.x += localOr1.width;
        if (this.bPi.eun != null)
          localPoint2.x += this.bPi.getAppearance().getGap(); break;
      case 4:
        localPoint1.x += localOr2.width;
        if (this.bPi.eun != null) {
          localPoint1.x += this.bPi.getAppearance().getGap();
        }

        break;
      }

    }

    int i = 0; int j = 0;

    switch (OE.bgx[this.bPi.fyQ.ordinal()]) {
    case 1:
    case 2:
      if (localOr1.width > localOr2.width)
        localPoint2.x += (localOr1.width - localOr2.width) / 2;
      else {
        localPoint1.x += (localOr2.width - localOr1.width) / 2;
      }
      i = localOr1.height + localOr2.height;
      j = Math.max(localOr1.width, localOr2.width);
      if ((this.bPi.eun != null) && (this.bPi.fyP != null))
        i += this.bPi.getAppearance().getGap(); break;
    case 3:
    case 4:
      if (localOr1.height > localOr2.height)
        localPoint2.y += (localOr1.height - localOr2.height) / 2;
      else {
        localPoint1.y += (localOr2.height - localOr1.height) / 2;
      }
      i = Math.max(localOr1.height, localOr2.height);
      j = localOr1.width + localOr2.width;
      if ((this.bPi.eun != null) && (this.bPi.fyP != null)) {
        j += this.bPi.getAppearance().getGap();
      }
      break;
    }
    localPoint1.x += this.bPi.aWn.ba(j, this.bPi.czl.getContentWidth());
    localPoint2.x += this.bPi.aWn.ba(j, this.bPi.czl.getContentWidth());
    localPoint1.y += this.bPi.aWn.bb(i, this.bPi.czl.getContentHeight());
    localPoint2.y += this.bPi.aWn.bb(i, this.bPi.czl.getContentHeight());

    if (this.bPi.fyP != null) {
      this.bPi.fyP.setSize(localOr2);
      this.bPi.fyP.setPosition(localPoint2);
    }
    if (this.bPi.eun != null) {
      this.bPi.eun.setSize(localOr1);
      this.bPi.eun.setPosition(localPoint1);
    }
  }
}