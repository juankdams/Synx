final class bRg
  implements buF
{
  bRg(czN paramczN, dvC paramdvC)
  {
  }

  public void a(dCb paramdCb, boolean paramBoolean)
  {
    if (paramBoolean) {
      dOc localdOc = bsP.getInstance().getMouseOver();
      if ((localdOc != null) && (localdOc != bsP.getInstance()))
        return;
      beo.c(paramdCb);

      dD localdD = new dD(paramdCb, 0);
      if (dkh.b(this.haf, this.hag.daX(), localdD))
        cjO.clE().j(localdD);
    } else {
      daO.cML().a(paramdCb);
      beo.e(paramdCb);
    }
  }
}