public class cTq
{
  public static final cTq kFS = new cTq(new ccM[0]);
  private final ccM[] kFT;

  public cTq(ccM[] paramArrayOfccM)
  {
    this.kFT = paramArrayOfccM;
  }

  public boolean a(int paramInt, aly paramaly) {
    ccM localccM = zb(paramInt);

    if (localccM == null) {
      return false;
    }
    return localccM.bKB() == paramaly;
  }

  public ccM zb(int paramInt)
  {
    if (paramInt >= this.kFT.length) {
      return null;
    }
    return this.kFT[paramInt];
  }

  public ccM[] cIY() {
    return this.kFT;
  }

  public int cIZ() {
    return this.kFT.length;
  }
}