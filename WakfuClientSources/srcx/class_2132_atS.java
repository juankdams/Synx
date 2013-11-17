import java.util.ArrayList;
import java.util.Iterator;

public class atS extends cih
{
  public static final short dFI = 0;
  public static final short dFJ = 1;
  public static final short dFK = 2;
  private final int day;
  private final long dFL;
  private final int daA;
  private final int daB;
  private final int daC;
  private final int daD;
  private final ArrayList cub = new ArrayList();

  public atS(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    super(paramInt1, 0, aPb.ewn, 0);
    this.day = paramInt2;
    this.dFL = paramLong;
    this.daA = paramInt3;
    this.daB = paramInt4;
    this.daC = paramInt5;
    this.daD = paramInt6;
  }

  public int ash() {
    return this.day;
  }

  public long aFU() {
    return this.dFL;
  }

  public boolean aFV() {
    return this.dFL >= 0L;
  }

  public int asj() {
    return this.daA;
  }

  public int ask() {
    return this.daB;
  }

  public int asl() {
    return this.daC;
  }

  public int asm() {
    return this.daD;
  }

  public void a(dpI paramdpI) {
    this.cub.add(paramdpI);
  }

  public Iterator aFW() {
    return this.cub.iterator();
  }
}