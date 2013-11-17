import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import org.apache.log4j.Logger;

public class aff
  implements cOB
{
  private static final Logger K = Logger.getLogger(aff.class);
  private SortedSet cXs;
  private short aSh;
  private short bNX;
  private long[] cig;
  private final long cXt;
  private final long cXu;

  protected aff(long[] paramArrayOfLong, int paramInt1, int paramInt2)
  {
    this(paramArrayOfLong, paramInt1, paramInt2, 0L, 9223372036854775807L, 1.0D);
  }

  protected aff(long[] paramArrayOfLong, int paramInt1, int paramInt2, double paramDouble)
  {
    this(paramArrayOfLong, paramInt1, paramInt2, 0L, 9223372036854775807L, paramDouble);
  }

  protected aff(long[] paramArrayOfLong, int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    this(paramArrayOfLong, paramInt1, paramInt2, paramLong1, paramLong2, 1.0D);
  }

  protected aff(long[] paramArrayOfLong, int paramInt1, int paramInt2, long paramLong1, long paramLong2, double paramDouble)
  {
    a(paramArrayOfLong, paramInt1, paramInt2, paramDouble);
    aqH();
    this.cXt = paramLong1;
    this.cXu = paramLong2;
  }

  private void aqH()
  {
    List localList = Arrays.asList(bPR.h(this.cig));
    this.cXs = Collections.unmodifiableSortedSet(new TreeSet(localList));
  }

  private void a(long[] paramArrayOfLong, int paramInt1, int paramInt2, double paramDouble) {
    b(paramArrayOfLong, paramInt1, paramInt2);

    int i = Math.min(paramInt2 - paramInt1 + 1, paramArrayOfLong.length);
    this.bNX = hQ(paramInt1);
    this.aSh = hQ(this.bNX + i - 1);

    this.cig = new long[i];
    if (paramDouble == 1.0D)
      System.arraycopy(paramArrayOfLong, 0, this.cig, 0, i);
    else {
      for (int j = 0; j < i; j++) {
        long l1 = paramArrayOfLong[j];
        double d = l1 * paramDouble;
        long l2 = Math.round(d);
        this.cig[j] = l2;
      }
    }

    aqI();
  }

  private void aqI() {
    for (int i = 0; i < this.cig.length - 1; i++) {
      if (this.cig[(i + 1)] == this.cig[i]) {
        throw new IllegalArgumentException(hT(i));
      }
      if (this.cig[(i + 1)] < this.cig[i])
        throw new IllegalArgumentException(hS(i));
    }
  }

  private short hQ(int paramInt)
  {
    if ((paramInt < -32768) || (paramInt > 32767)) {
      K.error("Dépassement de short pour une limite de niveau dans " + getClass().getSimpleName());
    }
    return (short)paramInt;
  }

  private void b(long[] paramArrayOfLong, int paramInt1, int paramInt2) {
    int i = paramArrayOfLong.length;
    int j = paramInt2 - paramInt1 + 1;

    if (i < j)
      K.error(aW(j, i));
  }

  public short nV()
  {
    return this.aSh;
  }

  public short Qb() {
    return this.bNX;
  }

  private long aqJ() {
    return this.cXu;
  }

  private long aqK() {
    return this.cXt;
  }

  public long hR(int paramInt)
  {
    if (paramInt < Qb()) {
      return aqK();
    }
    if (paramInt > nV()) {
      return aqJ();
    }
    return this.cig[(paramInt - Qb())];
  }

  public short cF(long paramLong) {
    return (short)(this.cXs.headSet(Long.valueOf(paramLong + 1L)).size() + Qb() - 1);
  }

  public long aqL() {
    return hR(Qb());
  }

  public long aqM() {
    return hR(nV());
  }

  public boolean ap(short paramShort) {
    return (paramShort >= Qb()) && (paramShort <= nV());
  }

  public boolean cG(long paramLong) {
    return (paramLong >= aqL()) && (paramLong <= aqM());
  }

  public float d(short paramShort, long paramLong) {
    long l = aq(paramShort);

    if (l == 0L) {
      return 0.0F;
    }

    return bCO.t((float)d(paramLong, paramShort) / (float)l, 0.0F, 1.0F);
  }

  public long cH(long paramLong) {
    return d(paramLong, cF(paramLong));
  }

  private long d(long paramLong, short paramShort) {
    return bCO.e(paramLong - hR(paramShort), 0L, aq(paramShort));
  }

  public long aq(short paramShort) {
    if ((paramShort < Qb()) || (paramShort >= nV())) {
      return 0L;
    }
    return hR(paramShort + 1) - hR(paramShort);
  }

  private String aV(int paramInt1, int paramInt2)
  {
    return "La table de " + getClass().getSimpleName() + " contient trop de valeurs - " + paramInt2 + " au lieu de " + paramInt1 + ", les valeurs supplémentaires ont été ignorées." + bBd.cH(1, 6);
  }

  private String aW(int paramInt1, int paramInt2)
  {
    return "La table de " + getClass().getSimpleName() + " ne contient pas assez de valeurs - " + paramInt2 + " au lieu de " + paramInt1 + ", le niveau maximal a été réduit." + bBd.cH(1, 6);
  }

  private String hS(int paramInt)
  {
    return "Tableau mal trié à " + paramInt + " - " + getClass().getSimpleName();
  }

  private String hT(int paramInt)
  {
    return "Tableau contenant une valeur double à " + paramInt + " - " + getClass().getSimpleName();
  }
}