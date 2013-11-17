class cnD
  implements Runnable
{
  cnD(aNP paramaNP)
  {
  }

  public void run()
  {
    if ((aNP.a(this.hUo) != null) && (!aNP.a(this.hUo).bhE())) {
      return;
    }
    dka.cSF().j(aNP.b(this.hUo));
    dLE.doY().t("isNewWorldReady", Boolean.valueOf(true));
  }
}