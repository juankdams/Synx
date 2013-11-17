import java.util.Comparator;

public enum bXe
  implements ccI
{
  private final int aw;
  private final String aKM;
  private final byte hlG;
  private bNa bPo;
  private static final Comparator hlH = new cVc();

  private bXe(int parambNa, String paramInt2, bNa arg5, int arg6)
  {
    this.aw = parambNa;
    this.aKM = paramInt2;
    Object localObject;
    this.bPo = localObject;
    int i;
    this.hlG = ((byte)i);
  }

  public String bK() {
    return toString();
  }

  public String bL() {
    return this.aKM;
  }

  public String bN() {
    return null;
  }

  public bNa getColor() {
    return this.bPo;
  }

  public byte ccr() {
    return this.hlG;
  }

  public static Comparator getComparator()
  {
    return hlH;
  }
}