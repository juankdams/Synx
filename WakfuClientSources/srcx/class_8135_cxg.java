import java.util.Arrays;
import java.util.Comparator;

public enum cxg
  implements ccI
{
  private final int aw;
  private final String aKM;
  private final byte hlG;
  private final bNa bPo;
  private static final Comparator ijZ = new bNV();

  private cxg(int parambNa, String paramInt2, bNa arg5, int arg6)
  {
    this.aw = parambNa;
    this.aKM = paramInt2;
    Object localObject;
    this.bPo = localObject;
    int i;
    this.hlG = ((byte)i);
  }

  public int getId() {
    return this.aw;
  }

  public String bK() {
    return String.valueOf(this.aw);
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

  public static Comparator cuz()
  {
    return ijZ;
  }

  public cxg cuA() {
    cxg[] arrayOfcxg = values();
    Arrays.sort(arrayOfcxg, cuz());
    int i = aUP.a(arrayOfcxg, this);
    return i == 0 ? null : arrayOfcxg[(i - 1)];
  }

  public static cxg dp(short paramShort) {
    for (cxg localcxg : values()) {
      if (localcxg.aw == paramShort) {
        return localcxg;
      }
    }
    return ijR;
  }
}