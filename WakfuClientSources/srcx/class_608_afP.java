import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.apache.log4j.Logger;

public class afP
  implements Closeable
{
  protected static final Logger K = Logger.getLogger(afP.class);
  public static final int DEFAULT_BUFFER_SIZE = 1024;
  public static final int cYS = 1048576;
  private final RandomAccessFile cYT;
  private final byte[] cYU;
  private final int bec;
  private int cYV;
  private int cYW;
  private long cYX;

  public afP(File paramFile, int paramInt)
  {
    this.cYT = new RandomAccessFile(paramFile, "r");
    invalidate();
    if ((paramInt > 0) && (paramInt <= 1048576))
      this.cYU = new byte[paramInt];
    else {
      throw new IOException("Invalid buffer size: " + paramInt);
    }
    this.bec = this.cYU.length;
  }

  public afP(File paramFile)
  {
    this(paramFile, 1024);
  }

  public final void close()
  {
    this.cYT.close();
  }

  public final long length()
  {
    return this.cYT.length();
  }

  public final int read()
  {
    if ((this.cYV >= this.cYW) && 
      (arh() < 0)) {
      return -1;
    }

    if (this.cYW == 0) {
      return -1;
    }
    return this.cYU[(this.cYV++)];
  }

  public final int read(byte[] paramArrayOfByte)
  {
    return read(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((this.cYV >= this.cYW) && 
      (arh() < 0)) {
      return -1;
    }

    int i = Math.min(paramInt2, this.cYW - this.cYV);
    System.arraycopy(this.cYU, this.cYV, paramArrayOfByte, paramInt1, i);
    this.cYV += i;
    return i;
  }

  public final String readLine()
  {
    if ((this.cYV >= this.cYW) && 
      (arh() < 0)) {
      return null;
    }

    int i = -1;
    for (int j = this.cYV; j < this.cYW; j++)
      if (this.cYU[j] == 10) {
        i = j;
        break;
      }
    Object localObject;
    if (i < 0) {
      localObject = new StringBuilder(100);
      int k = read();
      while ((k != -1) && (k != 10)) {
        ((StringBuilder)localObject).append((char)k);
        k = read();
      }
      if ((k == -1) && (((StringBuilder)localObject).length() == 0)) {
        return null;
      }
      if (((StringBuilder)localObject).charAt(((StringBuilder)localObject).length() - 1) == '\r') {
        ((StringBuilder)localObject).deleteCharAt(((StringBuilder)localObject).length() - 1);
      }
      return ((StringBuilder)localObject).toString();
    }

    if ((i > 0) && (this.cYU[(i - 1)] == 13))
      localObject = new String(this.cYU, this.cYV, i - this.cYV - 1);
    else {
      localObject = new String(this.cYU, this.cYV, i - this.cYV);
    }
    this.cYV = (i + 1);
    return localObject;
  }

  public final long getFilePointer()
  {
    return this.cYX - this.cYW + this.cYV;
  }

  public final void seek(long paramLong)
  {
    int i = (int)(this.cYX - paramLong);
    if ((i >= 0) && (i <= this.cYW)) {
      this.cYV = (this.cYW - i);
    } else {
      this.cYT.seek(paramLong);
      invalidate();
    }
  }

  private int arh()
  {
    int i = this.cYT.read(this.cYU, 0, this.bec);
    if (i >= 0) {
      this.cYX += i;
      this.cYW = i;
      this.cYV = 0;
    }
    return i;
  }

  private void invalidate()
  {
    this.cYW = 0;
    this.cYV = 0;
    this.cYX = this.cYT.getFilePointer();
  }
}