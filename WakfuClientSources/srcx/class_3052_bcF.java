public class bcF
{
  public static final bcF fmQ = new bcF();

  private final cSR fmR = new cSR();

  public void ci(int paramInt1, int paramInt2) {
    adz localadz = (adz)this.fmR.get(paramInt1);
    if (localadz == null) {
      localadz = new adz();
      this.fmR.put(paramInt1, localadz);
    }
    localadz.hL(paramInt2);
  }

  public adz oR(int paramInt) {
    return (adz)this.fmR.get(paramInt);
  }
}