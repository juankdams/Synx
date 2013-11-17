import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public abstract class vi extends OutputStream
{
  private static final int bjm = 132;
  private static final int bjn = 13;
  private static final int bjo = 10;
  private ByteArrayOutputStream bjp = new ByteArrayOutputStream(132);

  private boolean bjq = false;

  public final void write(int paramInt)
  {
    int i = (byte)paramInt;
    if ((i == 10) || (i == 13)) {
      if (!this.bjq)
        Ee();
    }
    else {
      this.bjp.write(paramInt);
    }
    this.bjq = (i == 13);
  }

  public void flush()
  {
  }

  protected void Ee()
  {
    try
    {
      m(this.bjp.toByteArray());
    } finally {
      this.bjp.reset();
    }
  }

  protected abstract void aO(String paramString);

  protected void m(byte[] paramArrayOfByte)
  {
    aO(new String(paramArrayOfByte));
  }

  public void close()
  {
    if (this.bjp.size() > 0) {
      Ee();
    }
    super.close();
  }

  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    int j = i;
    int k = paramInt2;
    while (k > 0) {
      while ((k > 0) && (paramArrayOfByte[i] != 10) && (paramArrayOfByte[i] != 13)) {
        i++;
        k--;
      }

      int m = i - j;
      if (m > 0) {
        this.bjp.write(paramArrayOfByte, j, m);
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