class dEj extends amp
{
  private dEj(ddG paramddG)
  {
  }

  public boolean Iv()
  {
    return false;
  }

  public Or getContentMinSize(dRq paramdRq) {
    return this.ePq.getContentPrefSize();
  }

  public Or getContentPreferedSize(dRq paramdRq) {
    Or localOr1 = ddG.a(this.ePq) != null ? ddG.a(this.ePq).getPrefSize() : new Or();
    Or localOr2 = ddG.b(this.ePq) != null ? ddG.b(this.ePq).getPrefSize() : new Or();

    localOr1.height = Math.max(localOr1.height, localOr2.height);
    localOr1.width += localOr2.width;

    return localOr1;
  }

  public void a(dRq paramdRq) {
    int i = 0;
    if ((ddG.b(this.ePq) != null) && (ddG.b(this.ePq).getVisible())) {
      ddG.b(this.ePq).setSizeToPrefSize();
      i = ddG.b(this.ePq).getSize().width;
      ddG.b(this.ePq).setPosition(this.ePq.czl.getContentWidth() - i, (this.ePq.czl.getContentHeight() - ddG.b(this.ePq).getHeight()) / 2);
    }

    if ((ddG.a(this.ePq) != null) && (ddG.a(this.ePq).getVisible())) {
      ddG.a(this.ePq).setPosition(0, 0);
      ddG.a(this.ePq).setSize(new Or(this.ePq.czl.getContentWidth() - i, this.ePq.czl.getContentHeight()));
    }
  }
}