import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.apache.log4j.Logger;

class aCD extends InputStreamReader
{
  private String hX;
  private String bFu;
  private char[] dXl = new char[8192];
  private char[] dXm = new char[1024];
  private int dXn = 0;
  private int dXo = 0;

  public aCD(InputStream paramInputStream) {
    super(paramInputStream, Charset.forName("UTF-8"));
  }

  private void lV(int paramInt)
  {
    for (int i = 1; i < paramInt; i++)
      if (this.dXm[i] == '=')
      {
        this.hX = String.valueOf(this.dXm, 0, i);
        this.bFu = String.valueOf(this.dXm, i + 1, paramInt - i - 1);
        return;
      }
  }

  public boolean abl()
  {
    int i = 0;

    int k = 1;
    int m = 0;
    int n = 1;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;

    this.hX = null;
    this.bFu = null;
    while (true)
    {
      if (this.dXn >= this.dXo) {
        try {
          this.dXo = read(this.dXl);
        } catch (IOException localIOException1) {
          bfQ.K.error("Exception", localIOException1);
        }
        this.dXn = 0;
        if (this.dXo <= 0) {
          if (i != 0) {
            lV(i);
          }
          return false;
        }

      }

      int j = this.dXl[(this.dXn++)];
      if (i3 != 0)
      {
        i3 = 0;
        if (j == 10);
      }
      else if (k != 0) {
        if ((j != 32) && (j != 9) && (j != 12) && (
          (i1 != 0) || ((j != 13) && (j != 10))))
        {
          k = 0;
          i1 = 0;
        }
      } else if (n != 0) {
        n = 0;
        if ((j == 35) || (j == 33)) {
          m = 1;
        }

      }
      else if ((j != 10) && (j != 13)) {
        this.dXm[(i++)] = j;
        if (i == this.dXm.length) {
          int i4 = this.dXm.length * 2;
          if (i4 < 0) {
            i4 = 2147483647;
          }
          char[] arrayOfChar = new char[i4];
          System.arraycopy(this.dXm, 0, arrayOfChar, 0, this.dXm.length);
          this.dXm = arrayOfChar;
        }

        if (j == 92)
          i2 = i2 == 0 ? 1 : 0;
        else {
          i2 = 0;
        }

      }
      else if ((m != 0) || (i == 0)) {
        m = 0;
        n = 1;
        k = 1;
        i = 0;
      }
      else {
        if (this.dXn >= this.dXo) {
          try {
            this.dXo = read(this.dXl);
          } catch (IOException localIOException2) {
            bfQ.K.error("Exception", localIOException2);
          }
          this.dXn = 0;
          if (this.dXo <= 0) {
            if (i != 0) {
              lV(i);
            }
            return false;
          }
        }
        if (i2 == 0) break;
        i--;

        k = 1;
        i1 = 1;
        i2 = 0;
        if (j == 13)
          i3 = 1;
      }
    }
    if (i != 0) {
      lV(i);
    }
    return true;
  }
}