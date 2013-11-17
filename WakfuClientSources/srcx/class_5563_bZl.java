final class bZl extends dKU
{
  private bZl(cOS paramcOS)
  {
  }

  public void h(ctQ paramctQ)
  {
    aHA.debug("finished(mediaPlayer={})", new Object[] { paramctQ });
    if ((cOS.b(this.dJW)) && (cOS.h(this.dJW) != null)) {
      int i = this.dJW.crs();
      aHA.debug("subitemCount={}", new Object[] { Integer.valueOf(i) });
      if (i == 0) {
        String str = dBU.a(this.dJW.le, this.dJW.le.h(cOS.h(this.dJW)));
        aHA.debug("auto repeat mrl={}", new Object[] { str });

        paramctQ.j(str, new String[0]);
      }
      else {
        aHA.debug("Sub-items handling repeat", new Object[0]);
      }
    }
    else {
      aHA.debug("No repeat", new Object[0]);
    }
  }
}