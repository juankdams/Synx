import java.io.FilterReader;
import java.io.Reader;
import java.io.StringReader;

public abstract class bgQ extends FilterReader
{
  private static final int bt = 8192;
  private boolean initialized = false;

  private FF aIn = null;

  public bgQ()
  {
    super(new StringReader(""));
    wh.e(this);
  }

  public bgQ(Reader paramReader)
  {
    super(paramReader);
  }

  public final int read(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    for (int i = 0; i < paramInt2; i++) {
      int j = read();
      if (j == -1) {
        if (i == 0) {
          return -1;
        }
        return i;
      }

      paramArrayOfChar[(paramInt1 + i)] = ((char)j);
    }
    return paramInt2;
  }

  public final long skip(long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("skip value is negative");
    }

    for (long l = 0L; l < paramLong; l += 1L) {
      if (read() == -1) {
        return l;
      }
    }
    return paramLong;
  }

  protected final void ax(boolean paramBoolean)
  {
    this.initialized = paramBoolean;
  }

  protected final boolean btp()
  {
    return this.initialized;
  }

  public final void b(FF paramFF)
  {
    this.aIn = paramFF;
  }

  protected final FF Ga()
  {
    return this.aIn;
  }

  protected final String readLine()
  {
    int i = this.in.read();

    if (i == -1) {
      return null;
    }

    StringBuffer localStringBuffer = new StringBuffer();

    while (i != -1) {
      localStringBuffer.append((char)i);
      if (i == 10) {
        break;
      }
      i = this.in.read();
    }
    return localStringBuffer.toString();
  }

  protected final String btq()
  {
    return wh.a(this.in, 8192);
  }
}