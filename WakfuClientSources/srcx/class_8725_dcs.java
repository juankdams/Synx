class dcs extends amp
{
  dcs(cOq paramcOq)
  {
  }

  public boolean Iv()
  {
    return false;
  }

  public Or getContentMinSize(dRq paramdRq)
  {
    int i = 0; int j = 0;
    Or localOr;
    if (cOq.a(this.kVk)) {
      if (cOq.b(this.kVk) != null) {
        localOr = cOq.b(this.kVk).getMinSize();
        i = Math.max(i, localOr.height);
        j += localOr.width;
      }
      if (cOq.c(this.kVk) != null) {
        localOr = cOq.c(this.kVk).getMinSize();
        i = Math.max(i, localOr.height);
        j += localOr.width;
      }
      if (cOq.d(this.kVk) != null) {
        localOr = cOq.d(this.kVk).getMinSize();
        i = Math.max(i, localOr.height);
        j += localOr.width;
      }
    } else {
      if (cOq.b(this.kVk) != null) {
        localOr = cOq.b(this.kVk).getMinSize();
        j = Math.max(j, localOr.width);
        i += localOr.height;
      }
      if (cOq.d(this.kVk) != null) {
        localOr = cOq.d(this.kVk).getMinSize();
        j = Math.max(j, localOr.width);
        i += localOr.height;
      }
    }

    return new Or(j, i);
  }

  public Or getContentPreferedSize(dRq paramdRq)
  {
    int i = 0; int j = 0;
    Or localOr;
    if (cOq.a(this.kVk)) {
      if (cOq.b(this.kVk) != null) {
        localOr = cOq.b(this.kVk).getPrefSize();
        i = Math.max(i, localOr.height);
        j += localOr.width;
      }
      if (cOq.c(this.kVk) != null) {
        localOr = cOq.c(this.kVk).getPrefSize();
        i = Math.max(i, localOr.height);
        j += localOr.width;
      }
      if (cOq.d(this.kVk) != null) {
        localOr = cOq.d(this.kVk).getPrefSize();
        i = Math.max(i, localOr.height);
        j += localOr.width;
      }
    } else {
      if (cOq.b(this.kVk) != null) {
        localOr = cOq.b(this.kVk).getPrefSize();
        j = Math.max(j, localOr.width);
        i += localOr.height;
      }
      if (cOq.d(this.kVk) != null) {
        localOr = cOq.d(this.kVk).getPrefSize();
        j = Math.max(j, localOr.width);
        i += localOr.height;
      }
    }

    return new Or(j, i);
  }

  public void a(dRq paramdRq)
  {
    int i = paramdRq.getAppearance().getContentHeight();
    int j = paramdRq.getAppearance().getContentWidth();
    int k;
    int m;
    Or localOr;
    int n;
    if (cOq.a(this.kVk)) {
      k = 0;
      if (cOq.b(this.kVk) != null) {
        k += cOq.b(this.kVk).getPrefSize().width;
      }
      if (cOq.c(this.kVk) != null) {
        k += cOq.c(this.kVk).getPrefSize().width;
      }
      if (cOq.d(this.kVk) != null) {
        k += cOq.d(this.kVk).getPrefSize().width;
      }
      m = aFG.eck.ba(k, j);
      if (cOq.b(this.kVk) != null) {
        localOr = cOq.b(this.kVk).getPrefSize();
        n = aFG.eck.bb(localOr.height, i);
        cOq.b(this.kVk).setPosition(m, n);
        cOq.b(this.kVk).setSizeToPrefSize();
        m += localOr.width;
      }
      if (cOq.c(this.kVk) != null) {
        localOr = cOq.c(this.kVk).getPrefSize();
        n = aFG.eck.bb(localOr.height, i);
        cOq.c(this.kVk).setPosition(m, n);
        cOq.c(this.kVk).setSizeToPrefSize();
        m += localOr.width;
      }
      if (cOq.d(this.kVk) != null) {
        localOr = cOq.d(this.kVk).getPrefSize();
        n = aFG.eck.bb(localOr.height, i);
        cOq.d(this.kVk).setPosition(m, n);
        cOq.d(this.kVk).setSizeToPrefSize();
      }
    } else {
      k = 0;
      if (cOq.b(this.kVk) != null) {
        k += cOq.b(this.kVk).getPrefSize().height;
      }
      if (cOq.d(this.kVk) != null) {
        k += cOq.d(this.kVk).getPrefSize().height;
      }
      m = aFG.eck.bb(k, i);
      if (cOq.d(this.kVk) != null) {
        localOr = cOq.d(this.kVk).getPrefSize();
        n = aFG.eck.ba(localOr.width, j);
        cOq.d(this.kVk).setPosition(n, m);
        cOq.d(this.kVk).setSizeToPrefSize();
        m += localOr.height;
      }
      if (cOq.b(this.kVk) != null) {
        localOr = cOq.b(this.kVk).getPrefSize();
        n = aFG.eck.ba(localOr.width, j);
        cOq.b(this.kVk).setPosition(n, m);
        cOq.b(this.kVk).setSizeToPrefSize();
      }
      if (cOq.c(this.kVk) != null) {
        localOr = cOq.c(this.kVk).getPrefSize();
        n = aFG.eck.ba(localOr.width, j);
        cOq.c(this.kVk).setPosition(n, cOq.b(this.kVk).getY() - 2);
        cOq.c(this.kVk).setSizeToPrefSize();
      }
    }
  }
}