import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.WeakHashMap;

public class bBl extends OutputStream
{
  private static final int gtE = 1024;
  private static final int bjm = 132;
  private static final int bjn = 13;
  private static final int bjo = 10;
  private WeakHashMap gtF = new WeakHashMap();
  private FF aIn;
  private boolean gtG;

  public bBl(FF paramFF, boolean paramBoolean)
  {
    this.aIn = paramFF;
    this.gtG = paramBoolean;
  }

  private bMN bKa()
  {
    Thread localThread = Thread.currentThread();
    bMN localbMN = (bMN)this.gtF.get(localThread);
    if (localbMN == null) {
      localbMN = new bMN(null);
      bMN.a(localbMN, new ByteArrayOutputStream(132));
      bMN.a(localbMN, false);
      this.gtF.put(localThread, localbMN);
    }
    return localbMN;
  }

  private void bKb()
  {
    Thread localThread = Thread.currentThread();
    bMN localbMN = (bMN)this.gtF.get(localThread);
    try {
      bMN.a(localbMN).close();
    }
    catch (IOException localIOException) {
    }
    bMN.a(localbMN, new ByteArrayOutputStream());
    bMN.a(localbMN, false);
  }

  private void bKc()
  {
    Thread localThread = Thread.currentThread();
    this.gtF.remove(localThread);
  }

  public void write(int paramInt)
  {
    int i = (byte)paramInt;

    bMN localbMN = bKa();

    if (i == 10)
    {
      bMN.a(localbMN).write(paramInt);
      a(bMN.a(localbMN));
    } else {
      if (bMN.b(localbMN))
      {
        a(bMN.a(localbMN));
      }

      bMN.a(localbMN).write(paramInt);
    }
    bMN.a(localbMN, i == 13);
    if ((!bMN.b(localbMN)) && (bMN.a(localbMN).size() > 1024))
      a(bMN.a(localbMN));
  }

  protected void a(ByteArrayOutputStream paramByteArrayOutputStream)
  {
    String str = paramByteArrayOutputStream.toString();
    this.aIn.h(str, this.gtG);
    bKb();
  }

  protected void b(ByteArrayOutputStream paramByteArrayOutputStream)
  {
    String str = paramByteArrayOutputStream.toString();
    this.aIn.i(str, this.gtG);
    bKb();
  }

  public void close()
  {
    flush();
    bKc();
  }

  public void flush()
  {
    bMN localbMN = bKa();
    if (bMN.a(localbMN).size() > 0)
      b(bMN.a(localbMN));
  }

  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    int j = i;
    int k = paramInt2;
    bMN localbMN = bKa();
    while (k > 0) {
      while ((k > 0) && (paramArrayOfByte[i] != 10) && (paramArrayOfByte[i] != 13)) {
        i++;
        k--;
      }

      int m = i - j;
      if (m > 0) {
        bMN.a(localbMN).write(paramArrayOfByte, j, m);
      }
      while ((k > 0) && ((paramArrayOfByte[i] == 10) || (paramArrayOfByte[i] == 13))) {
        write(paramArrayOfByte[i]);
        i++;
        k--;
      }
      j = i;
    }
  }
}