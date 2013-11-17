class dci extends amp
{
  private dci(bZh parambZh)
  {
  }

  public boolean Iv()
  {
    return false;
  }

  public Or getContentMinSize(dRq paramdRq) {
    return this.aAS.getContentPrefSize();
  }

  public Or getContentPreferedSize(dRq paramdRq) {
    return bZh.a(this.aAS) != null ? bZh.a(this.aAS).getPrefSize() : new Or();
  }

  public void a(dRq paramdRq) {
    if ((bZh.a(this.aAS) != null) && (bZh.a(this.aAS).getVisible())) {
      bZh.a(this.aAS).setPosition(0, 0);
      bZh.a(this.aAS).setSize(new Or(this.aAS.czl.getContentWidth(), this.aAS.czl.getContentHeight()));
    }
  }
}