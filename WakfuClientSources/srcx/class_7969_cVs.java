class cVs
  implements Runnable
{
  cVs(awI paramawI)
  {
  }

  public void run()
  {
    if (!this.kHT.dLX.isVisible()) {
      return;
    }
    String str = this.kHT.dLY + "\n" + this.kHT.dLZ;
    dBz.g(this.kHT.dLX).setText(str);
    dBz.h(this.kHT.dLX).b(this.kHT.bXI);
  }
}