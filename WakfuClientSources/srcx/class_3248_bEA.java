public class bEA extends amp
{
  public bEA(dTd paramdTd)
  {
  }

  public boolean Iv()
  {
    return false;
  }

  public Or getContentMinSize(dRq paramdRq)
  {
    Or localOr;
    if (dTd.a(this.gzH).getVisible())
      localOr = dTd.a(this.gzH).getMinSize();
    else {
      localOr = new Or(0, 0);
    }

    switch (bYJ.bgx[dTd.b(this.gzH).ordinal()]) {
    case 1:
    case 2:
      localOr.height += dTd.c(this.gzH).getMinSize().height;
      localOr.width = Math.max(localOr.width, dTd.c(this.gzH).getMinSize().width);
      break;
    case 3:
    case 4:
      localOr.width += dTd.c(this.gzH).getMinSize().width;
      localOr.height = Math.max(localOr.height, dTd.c(this.gzH).getMinSize().height);
    }

    return localOr;
  }

  public Or getContentPreferedSize(dRq paramdRq)
  {
    Or localOr;
    if (dTd.a(this.gzH).getVisible())
      localOr = dTd.a(this.gzH).getPrefSize();
    else {
      localOr = new Or(0, 0);
    }

    switch (bYJ.bgx[dTd.b(this.gzH).ordinal()]) {
    case 1:
    case 2:
      localOr.height += dTd.c(this.gzH).getPrefSize().height;
      localOr.width = Math.max(localOr.width, dTd.c(this.gzH).getPrefSize().width);
      break;
    case 3:
    case 4:
      localOr.width += dTd.c(this.gzH).getPrefSize().width;
      localOr.height = Math.max(localOr.height, dTd.c(this.gzH).getPrefSize().height);
    }

    return localOr;
  }

  public void a(dRq paramdRq)
  {
    int i = paramdRq.czl.getContentHeight();
    int j = paramdRq.czl.getContentWidth();

    switch (bYJ.bgx[dTd.b(this.gzH).ordinal()]) {
    case 1:
      dTd.c(this.gzH).setSize(j, dTd.c(this.gzH).getPrefSize().height);
      dTd.c(this.gzH).setPosition(0, i - dTd.c(this.gzH).getHeight());

      if (dTd.a(this.gzH).getVisible()) {
        dTd.a(this.gzH).setSize(j, i - dTd.c(this.gzH).getHeight());
        dTd.a(this.gzH).setPosition(0, 0); } break;
    case 2:
      dTd.c(this.gzH).setSize(j, dTd.c(this.gzH).getPrefSize().height);
      dTd.c(this.gzH).setPosition(0, 0);

      if (dTd.a(this.gzH).getVisible()) {
        dTd.a(this.gzH).setSize(j, i - dTd.c(this.gzH).getHeight());
        dTd.a(this.gzH).setPosition(0, dTd.c(this.gzH).getHeight()); } break;
    case 4:
      dTd.c(this.gzH).setSize(dTd.c(this.gzH).getPrefSize().width, i);
      dTd.c(this.gzH).setPosition(0, 0);

      if (dTd.a(this.gzH).getVisible()) {
        dTd.a(this.gzH).setSize(j - dTd.c(this.gzH).getWidth(), i);
        dTd.a(this.gzH).setPosition(dTd.c(this.gzH).getWidth(), 0); } break;
    case 3:
      dTd.c(this.gzH).setSize(dTd.c(this.gzH).getPrefSize().width, i);
      dTd.c(this.gzH).setPosition(j - dTd.c(this.gzH).getWidth(), 0);

      if (dTd.a(this.gzH).getVisible()) {
        dTd.a(this.gzH).setSize(j - dTd.c(this.gzH).getWidth(), i);
        dTd.a(this.gzH).setPosition(0, 0);
      }
      break;
    }
  }
}