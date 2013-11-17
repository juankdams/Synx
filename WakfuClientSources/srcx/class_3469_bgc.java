final class bgc
  implements Runnable
{
  private bbp ftZ;

  private bgc(dju paramdju, bbp parambbp)
  {
    this.ftZ = parambbp;
  }

  public void s(bbp parambbp) {
    this.ftZ = parambbp;
  }

  public void run()
  {
    float f = dLE.doY().h("chat.scrollOffset", this.ftZ.getElementMap());
    boolean bool = this.ftZ.bpS();
    if ((bool) && (f == -1.0F))
      dLE.doY().a("chat.scrollOffset", Float.valueOf(0.0F), this.ftZ.getElementMap());
    else if (!bool)
      dLE.doY().a("chat.scrollOffset", Float.valueOf(-1.0F), this.ftZ.getElementMap());
    else if (f > 0.0F)
      ceb.cgG().uY(aAx.aMd().c(this.fua).auq());
  }
}