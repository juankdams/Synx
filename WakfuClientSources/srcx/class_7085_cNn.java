final class cNn extends dKU
{
  private cNn(cOS paramcOS)
  {
  }

  public void h(ctQ paramctQ)
  {
    aHA.debug("finished(mediaPlayer={})", new Object[] { paramctQ });

    if (cOS.a(this.dJW) != -1)
    {
      aHA.debug("Raising finished event for sub-item {}", new Object[] { Integer.valueOf(cOS.a(this.dJW)) });
      cOS.a(this.dJW, cOS.d(this.dJW).ep(cOS.a(this.dJW), cOS.c(this.dJW)));
    }

    if (cOS.i(this.dJW))
    {
      this.dJW.C(new String[0]);
    }
  }
}