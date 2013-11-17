public class uI
  implements clT
{
  private EJ biH = null;
  private cfr biI = null;
  private String biJ = null;
  private int index = -1;

  uI() {
    this.biJ = "aaa";
  }

  void setIndex(int paramInt) {
    this.index = paramInt;
  }

  public Object clone() {
    Object localObject = null;
    try {
      localObject = super.clone();
    } catch (CloneNotSupportedException localCloneNotSupportedException) {
      localCloneNotSupportedException.printStackTrace();
    }
    return localObject;
  }

  public String toString() {
    return "[Text]" + this.biJ;
  }

  public String DF() {
    return this.biJ;
  }

  public void aN(String paramString) {
    this.biJ = paramString;
  }

  public int DG()
  {
    return 0;
  }

  public EJ DH()
  {
    return null;
  }

  public int DI()
  {
    return 0;
  }

  public String DJ()
  {
    return null;
  }

  public int getIndex() {
    return this.index;
  }
}