class diu extends amp
{
  private diu(aHr paramaHr)
  {
  }

  public Or getContentPreferedSize(dRq paramdRq)
  {
    Or localOr = aHr.a(this.leO).getPrefSize();

    return new Or(localOr.width * 3, localOr.height * 3);
  }

  public Or getContentMinSize(dRq paramdRq) {
    return getContentPreferedSize(paramdRq);
  }

  public void a(dRq paramdRq) {
    int i = paramdRq.getAppearance().getContentWidth();
    int j = paramdRq.getAppearance().getContentHeight();

    aHr.b(this.leO).setPosition(0, 0);
    aHr.b(this.leO).setSize(i, j);

    aHr.a(this.leO).setSizeToPrefSize();
    aHr.c(this.leO).setSizeToPrefSize();

    int k = i / 2 - aHr.a(this.leO).getWidth() / 2;
    int m = i / 2 + (int)(k * bCO.bI(aHr.d(this.leO)));
    int n = j / 2 + (int)(k * bCO.bH(aHr.d(this.leO)));

    aHr.a(this.leO).setPosition(m - aHr.a(this.leO).getWidth() / 2, n - aHr.a(this.leO).getHeight() / 2);
    aHr.c(this.leO).setPosition(m - aHr.c(this.leO).getWidth() / 2, n - aHr.c(this.leO).getHeight() / 2);
  }
}