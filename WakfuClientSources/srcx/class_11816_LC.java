import java.io.IOException;
import java.nio.ByteOrder;
import org.apache.log4j.Logger;

public class LC
{
  private static final Logger K = Logger.getLogger(LC.class);

  private static final LC bYm = new LC();
  private Je bYn;
  private int bYo = 0;

  private String SK = "./";

  public static LC We() {
    return bYm;
  }

  public final void clear() {
    this.bYn = null;
    this.bYo = 0;
  }

  public final void setPath(String paramString) {
    this.SK = paramString;
  }

  public final void fK(int paramInt) {
    clear();
    String str = String.format(this.SK, new Object[] { Integer.valueOf(paramInt) });
    try {
      load(str);
    } catch (IOException localIOException) {
      K.error("Problème lors du chargement des infos de group " + str, localIOException);
    }
  }

  private void load(String paramString) {
    aYQ localaYQ = aYQ.V(dtb.readFile(paramString));
    localaYQ.a(ByteOrder.LITTLE_ENDIAN);
    this.bYo = (1 + localaYQ.readUnsignedShort());
    this.bYn = new Je(this.bYo * this.bYo);

    int i = localaYQ.readUnsignedShort();
    for (int j = 0; j < i; j++) {
      int k = localaYQ.readShort();
      int m = localaYQ.bnS();

      short[] arrayOfShort = localaYQ.ou(m);
      a(k, arrayOfShort, true);
    }
  }

  private void a(int paramInt, short[] paramArrayOfShort, boolean paramBoolean) {
    int i = Math.abs(paramInt) * this.bYo;
    for (int j = 0; j < paramArrayOfShort.length; j++)
      this.bYn.set(i + Math.abs(paramArrayOfShort[j]), paramBoolean);
  }

  public final boolean ad(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 0) {
      return paramInt2 <= 0;
    }

    int i = paramInt1 < 0 ? -paramInt1 : paramInt1;
    int j = paramInt2 < 0 ? -paramInt2 : paramInt2;
    return this.bYn.get(i * this.bYo + j);
  }

  public final int Wf() {
    return this.bYo;
  }

  public void a(int paramInt, bPu parambPu) {
    this.bYo = (paramInt + 1);
    this.bYn = new Je(this.bYo * this.bYo);
    this.bYn.set(0, true);

    parambPu.a(new dBZ(this));
  }
}