class aRY
  implements doN
{
  aRY(ddG paramddG)
  {
  }

  public boolean a(cSx paramcSx)
  {
    if (!ddG.c(this.ePq).axj()) {
      return false;
    }
    arS localarS1 = (arS)paramcSx;

    if (localarS1.getSelected()) {
      this.ePq.setSelectedValue(localarS1.getValue());
      ddG.f(this.ePq);
    }

    arS localarS2 = new arS(this.ePq, localarS1.aEv(), localarS1.getValue(), localarS1.getSelected());
    this.ePq.g(localarS2);

    return false;
  }
}