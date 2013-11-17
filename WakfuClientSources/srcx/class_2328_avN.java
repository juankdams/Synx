import java.awt.Dimension;
import org.apache.log4j.Logger;

public class avN
  implements bBz
{
  protected static final Logger K = Logger.getLogger(avN.class);

  private static final aee aOr = new dyu(new LG(), 1000);
  private int hY;
  private int hZ;
  private int ia;
  private int ib;

  public static avN aHC()
  {
    return m(0, 0, 0, 0);
  }

  public static avN m(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    try {
      avN localavN = (avN)aOr.Mm();
      localavN.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
      return localavN;
    } catch (Exception localException) {
      throw new RuntimeException("Erreur lors d'un checkOut sur un Item : ", localException);
    }
  }

  private avN(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.hY = paramInt1;
    this.hZ = paramInt2;
    this.ia = paramInt3;
    this.ib = paramInt4;
  }

  public void release() {
    try {
      aOr.y(this);
    } catch (Exception localException) {
      K.error("Exception dans le release de " + getClass().toString() + " (normalement impossible)");
    }
  }

  public void aJ()
  {
  }

  public void bc() {
    this.hY = 0;
    this.hZ = 0;
    this.ia = 0;
    this.ib = 0;
  }

  public avN a(avN paramavN) {
    int i = Math.min(this.hY, paramavN.hY);
    int j = Math.min(this.hZ, paramavN.hZ);
    int k = Math.max(this.hY + this.ia, paramavN.hY + paramavN.ia);
    int m = Math.max(this.hZ + this.ib, paramavN.hZ + paramavN.ib);

    return m(i, j, k - i, m - j);
  }

  public void b(avN paramavN) {
    int i = Math.min(this.hY, paramavN.hY);
    int j = Math.min(this.hZ, paramavN.hZ);
    int k = Math.max(this.hY + this.ia, paramavN.hY + paramavN.ia);
    int m = Math.max(this.hZ + this.ib, paramavN.hZ + paramavN.ib);

    setBounds(i, j, k - i, m - j);
  }

  public avN c(avN paramavN)
  {
    avN localavN = aHC();
    localavN.a(this, paramavN);
    return localavN;
  }

  public void a(avN paramavN1, avN paramavN2) {
    int i = paramavN1.hY;
    int j = paramavN1.hZ;
    int k = paramavN2.hY;
    int m = paramavN2.hZ;
    long l1 = i;
    l1 += paramavN1.ia;
    long l2 = j;
    l2 += paramavN1.ib;
    long l3 = k;
    l3 += paramavN2.ia;
    long l4 = m;
    l4 += paramavN2.ib;
    if (i < k)
      i = k;
    if (j < m)
      j = m;
    if (l1 > l3)
      l1 = l3;
    if (l2 > l4)
      l2 = l4;
    l1 -= i;
    l2 -= j;

    if (l1 < -2147483648L)
      l1 = -2147483648L;
    if (l2 < -2147483648L) {
      l2 = -2147483648L;
    }
    this.hY = i;
    this.hZ = j;
    this.ia = ((int)l1);
    this.ib = ((int)l2);
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    int i = paramInt1;
    int j = paramInt2;
    long l1 = i;
    l1 += paramInt3;
    long l2 = j;
    l2 += paramInt4;
    long l3 = paramInt5;
    l3 += paramInt7;
    long l4 = paramInt6;
    l4 += paramInt8;
    if (i < paramInt5)
      i = paramInt5;
    if (j < paramInt6)
      j = paramInt6;
    if (l1 > l3)
      l1 = l3;
    if (l2 > l4)
      l2 = l4;
    l1 -= i;
    l2 -= j;

    if (l1 < -2147483648L)
      l1 = -2147483648L;
    if (l2 < -2147483648L) {
      l2 = -2147483648L;
    }
    this.hY = i;
    this.hZ = j;
    this.ia = ((int)l1);
    this.ib = ((int)l2);
  }

  public boolean d(avN paramavN)
  {
    int i = this.ia;
    int j = this.ib;
    int k = paramavN.ia;
    int m = paramavN.ib;
    if ((k <= 0) || (m <= 0) || (i <= 0) || (j <= 0)) {
      return false;
    }
    int n = this.hY;
    int i1 = this.hZ;
    int i2 = paramavN.hY;
    int i3 = paramavN.hZ;
    k += i2;
    m += i3;
    i += n;
    j += i1;

    return ((k < i2) || (k > n)) && ((m < i3) || (m > i1)) && ((i < n) || (i > i2)) && ((j < i1) || (j > i3));
  }

  public static boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    int i = paramInt3;
    int j = paramInt4;
    int k = paramInt7;
    int m = paramInt8;
    if ((k <= 0) || (m <= 0) || (i <= 0) || (j <= 0)) {
      return false;
    }
    k += paramInt5;
    m += paramInt6;
    i += paramInt1;
    j += paramInt2;

    return ((k < paramInt5) || (k > paramInt1)) && ((m < paramInt6) || (m > paramInt2)) && ((i < paramInt1) || (i > paramInt5)) && ((j < paramInt2) || (j > paramInt6));
  }

  public void e(avN paramavN)
  {
    this.hY = paramavN.hY;
    this.hZ = paramavN.hZ;
    this.ia = paramavN.ia;
    this.ib = paramavN.ib;
  }

  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.hY = paramInt1;
    this.hZ = paramInt2;
    this.ia = paramInt3;
    this.ib = paramInt4;
  }

  public void setLocation(int paramInt1, int paramInt2) {
    this.hY = paramInt1;
    this.hZ = paramInt2;
  }

  public void setSize(Dimension paramDimension) {
    setSize(paramDimension.width, paramDimension.height);
  }

  public void setSize(int paramInt1, int paramInt2) {
    this.ia = paramInt1;
    this.ib = paramInt2;
  }

  public int getHeight() {
    return this.ib;
  }

  public int getWidth() {
    return this.ia;
  }

  public int getX() {
    return this.hY;
  }

  public int getY() {
    return this.hZ;
  }

  public void setHeight(int paramInt) {
    this.ib = paramInt;
  }

  public void setWidth(int paramInt) {
    this.ia = paramInt;
  }

  public void setX(int paramInt) {
    this.hY = paramInt;
  }

  public void setY(int paramInt) {
    this.hZ = paramInt;
  }
}