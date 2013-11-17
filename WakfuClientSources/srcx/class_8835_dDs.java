public class dDs extends amp
{
  public dDs(dhh paramdhh)
  {
  }

  public boolean Iv()
  {
    return false;
  }

  public Or getContentMinSize(dRq paramdRq) {
    return new Or(this.lLD.czl.getContentWidth(), this.lLD.czl.getContentHeight());
  }

  public Or getContentPreferedSize(dRq paramdRq) {
    return new Or(this.lLD.czl.getContentWidth(), this.lLD.czl.getContentHeight());
  }

  public void a(dRq paramdRq)
  {
    this.lLD.lcm.setSize(this.lLD.getAppearance().getContentWidth(), this.lLD.getAppearance().getContentHeight());
    this.lLD.lcm.setPosition(0, 0);

    this.lLD.lck.setSize(this.lLD.getAppearance().getContentWidth(), this.lLD.getAppearance().getContentHeight());
    this.lLD.lck.setPosition(0, 0);
  }
}