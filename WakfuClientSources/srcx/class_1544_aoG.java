class aoG extends amp
{
  private aoG(dRR paramdRR)
  {
  }

  public boolean Iv()
  {
    return false;
  }

  public Or getContentMinSize(dRq paramdRq)
  {
    Or localOr1 = dRR.b(this.dtZ).getMinSize();
    Or localOr2 = dRR.c(this.dtZ).getMinSize();
    Or localOr3 = dRR.d(this.dtZ).getMinSize();

    if (dRR.e(this.dtZ)) {
      return new Or(localOr1.width + localOr2.width + localOr3.width, Math.max(localOr1.height, Math.max(localOr2.height, localOr3.height)));
    }

    return new Or(Math.max(localOr1.width, Math.max(localOr2.width, localOr3.width)), localOr1.height + localOr2.height + localOr3.height);
  }

  public Or getContentPreferedSize(dRq paramdRq)
  {
    Or localOr1 = dRR.b(this.dtZ).getPrefSize();
    Or localOr2 = dRR.c(this.dtZ).getPrefSize();
    Or localOr3 = dRR.d(this.dtZ).getPrefSize();

    if (dRR.e(this.dtZ)) {
      return new Or(localOr1.width + localOr2.width + localOr3.width, Math.max(localOr1.height, Math.max(localOr2.height, localOr3.height)));
    }

    return new Or(Math.max(localOr1.width, Math.max(localOr2.width, localOr3.width)), localOr1.height + localOr2.height + localOr3.height);
  }

  public void a(dRq paramdRq)
  {
    if (dRR.e(this.dtZ)) {
      int i = this.dtZ.getAppearance().getContentHeight();
      dRR.b(this.dtZ).setSize((int)dRR.b(this.dtZ).getPrefSize().getWidth(), i);
      dRR.c(this.dtZ).setSize((int)dRR.c(this.dtZ).getPrefSize().getWidth(), i);
      dRR.d(this.dtZ).setSize(this.dtZ.getAppearance().getContentWidth() - dRR.b(this.dtZ).getWidth() - dRR.c(this.dtZ).getWidth(), i);
    }
    else {
      int j = this.dtZ.getAppearance().getContentWidth();

      dRR.b(this.dtZ).setSize(j, (int)dRR.b(this.dtZ).getPrefSize().getHeight());
      dRR.c(this.dtZ).setSize(j, (int)dRR.c(this.dtZ).getPrefSize().getHeight());
      dRR.d(this.dtZ).setSize(j, this.dtZ.getAppearance().getContentHeight() - dRR.b(this.dtZ).getHeight() - dRR.c(this.dtZ).getHeight());
    }

    this.dtZ.dsA();
  }
}