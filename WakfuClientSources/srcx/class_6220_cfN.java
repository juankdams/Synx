class cfN
  implements buF
{
  cfN(diV paramdiV, dCb paramdCb, aAn paramaAn)
  {
  }

  public void a(dCb paramdCb, boolean paramBoolean)
  {
    if (paramBoolean) {
      dOc localdOc = bsP.getInstance().getMouseOver();
      if ((localdOc != null) && (localdOc != bsP.getInstance())) {
        return;
      }

      dD localdD = new dD(this.gpK, 0);
      localdD.c(this.hAJ.b(this.gpJ), null);
      cjO.clE().j(localdD);
    } else {
      daO.cML().a(this.gpK);
    }
    this.gpJ.dd(paramBoolean);
  }
}