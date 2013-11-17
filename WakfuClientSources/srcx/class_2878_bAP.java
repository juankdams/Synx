class bAP
  implements Runnable
{
  bAP(hF paramhF)
  {
  }

  public void run()
  {
    if (hF.b(this.gqW) > hF.c(this.gqW).length - 1) {
      hF.a(this.gqW, 0);
    }
    Jd.f(this.gqW.iO).setDirection(hF.c(this.gqW)[hF.b(this.gqW)].getIndex());
    hF.d(this.gqW);
    hF.a(this.gqW);
  }
}