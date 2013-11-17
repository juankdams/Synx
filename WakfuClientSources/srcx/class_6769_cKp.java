final class cKp extends dKU
{
  private cKp(cOS paramcOS)
  {
  }

  public void a(ctQ paramctQ, jJ paramjJ, String paramString)
  {
    aHA.debug("mediaChanged(mediaPlayer={},media={},mrl={})", new Object[] { paramctQ, paramjJ, paramString });

    if (this.dJW.crt() == -1)
    {
      aHA.debug("Raising event for new media", new Object[0]);
      cOS.a(this.dJW, cOS.d(this.dJW).yA(cOS.c(this.dJW)));
    }
  }
}