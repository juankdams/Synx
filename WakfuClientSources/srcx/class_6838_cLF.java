final class cLF
  implements aAI
{
  private int cJZ = 0;

  private cLF(KR paramKR) {  } 
  public int akt() { return this.cJZ; }

  public final boolean f(short paramShort, int paramInt)
  {
    this.cJZ += (this.iLd.kOZ.dW(paramShort) ^ asd.jV(paramInt));
    return true;
  }
}