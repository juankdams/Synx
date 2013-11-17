import java.io.IOException;
import org.apache.log4j.Logger;

public abstract class aoI
{
  private static final Logger K = Logger.getLogger(aoI.class);
  protected byte[] cYU;

  public MD fg(String paramString)
  {
    paramString = paramString.replace('\\', '/');
    try
    {
      return x(dtb.X(paramString, aU()));
    } catch (IOException localIOException) {
      K.error("Erreur au chargement de l'image " + paramString, localIOException);
    }return null;
  }

  public MD x(byte[] paramArrayOfByte)
  {
    try {
      return b(aYQ.V(paramArrayOfByte));
    } catch (IOException localIOException) {
      K.error("Erreur au chargement de l'image", localIOException);
    }return null;
  }

  public crX bU(String paramString)
  {
    paramString = paramString.replace('\\', '/');
    try
    {
      return y(dtb.readFile(paramString));
    } catch (IOException localIOException) {
      K.error("Erreur au chargement de l'image " + paramString, localIOException);
    }return null;
  }

  public final crX y(byte[] paramArrayOfByte)
  {
    try {
      return a(aYQ.V(paramArrayOfByte));
    } catch (IOException localIOException) {
      K.error("Erreur au chargement de l'image", localIOException);
    }return null;
  }

  protected abstract crX a(aYQ paramaYQ);

  protected abstract MD b(aYQ paramaYQ);

  protected abstract int aU();

  public final byte[] getData()
  {
    return this.cYU;
  }

  protected final byte[] a(aYQ paramaYQ, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = bi(paramInt1, paramInt3);
    int j = (i + 3) / 4 * 4;
    int k = j - i;

    byte[] arrayOfByte = new byte[paramInt2 * i];

    for (int m = arrayOfByte.length - i; m >= 0; m -= i) {
      if (paramaYQ.i(arrayOfByte, m, i) != i) {
        K.error("read error");
      }
      if (paramaYQ.os(k) != k) {
        K.error("skip error");
      }
    }

    return arrayOfByte;
  }

  protected final byte[] b(aYQ paramaYQ, int paramInt1, int paramInt2, int paramInt3) {
    int i = bi(paramInt1, paramInt3);
    byte[] arrayOfByte = new byte[paramInt2 * i];
    for (int j = arrayOfByte.length - i; j >= 0; j -= i) {
      if (paramaYQ.i(arrayOfByte, j, i) != i) {
        K.error("read error");
      }
    }
    return arrayOfByte;
  }

  protected final byte[] g(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if ((!bB) && (this.cYU == null)) throw new AssertionError();

    int i = bi(paramInt1, paramInt3);
    int j = (i + 3) / 4 * 4;

    byte[] arrayOfByte = new byte[paramInt2 * i];
    int k = paramInt4 + j * (paramInt2 - 1);
    for (int m = 0; m < arrayOfByte.length; m += i) {
      System.arraycopy(this.cYU, k, arrayOfByte, m, i);
      k -= j;
    }
    return arrayOfByte;
  }

  protected final byte[] h(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if ((!bB) && (this.cYU == null)) throw new AssertionError();

    int i = bi(paramInt1, paramInt3);

    byte[] arrayOfByte = new byte[paramInt2 * i];
    int j = paramInt4 + i * (paramInt2 - 1);
    for (int k = 0; k < arrayOfByte.length; k += i) {
      System.arraycopy(this.cYU, j, arrayOfByte, k, i);
      j -= i;
    }
    return arrayOfByte;
  }

  protected static float jn(int paramInt) {
    return paramInt / 8.0F;
  }

  protected static int bi(int paramInt1, int paramInt2) {
    return (int)(paramInt1 * jn(paramInt2));
  }
}