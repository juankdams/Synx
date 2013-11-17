final class cMY
  implements dRH
{
  private int cJZ = 0;

  private cMY(dtw paramdtw) {  } 
  public int akt() { return this.cJZ; }

  public final boolean d(short paramShort, byte paramByte)
  {
    this.cJZ += (this.gwx.kOZ.dW(paramShort) ^ asd.jV(paramByte));
    return true;
  }
}