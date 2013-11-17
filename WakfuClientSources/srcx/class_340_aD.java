import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;

public final class aD
{
  private static final int YYEOF = -1;
  private static final int hn = 16384;
  private static final int ho = 0;
  private static final int[] hp = { 0, 0 };
  private static final String hq = "";
  private static final char[] hr = p("");

  private static final int[] hs = by();
  private static final String ht = "";
  private static final int[] hu = bz();
  private static final String hv = "";
  private static final int[] hw = bA();
  private static final String hx = "";
  private static final int hy = 0;
  private static final int hz = 1;
  private static final int hA = 2;
  private static final String[] hB = { "Unkown internal scanner error", "Error: could not match input", "Error: pushback value was too large" };

  private static final int[] hC = bB();
  private static final String hD = "";
  private Reader hE;
  private int hF;
  private int hG = 0;

  private char[] hH = new char[16384];
  private int hI;
  private int hJ;
  private int hK;
  private int hL;
  private int hM;
  private int hN;
  private int hO;
  private boolean hP = true;
  private boolean hQ;

  private static int[] by()
  {
    int[] arrayOfInt = new int[14];
    int i = 0;
    i = a("", i, arrayOfInt);
    return arrayOfInt;
  }

  private static int a(String paramString, int paramInt, int[] paramArrayOfInt) {
    int i = 0;
    int j = paramInt;
    int k = paramString.length();
    int m;
    for (; i < k; 
      m > 0)
    {
      m = paramString.charAt(i++);
      int n = paramString.charAt(i++);

      paramArrayOfInt[(j++)] = n; m--;
    }
    return j;
  }

  private static int[] bz()
  {
    int[] arrayOfInt = new int[14];
    int i = 0;
    i = b("", i, arrayOfInt);
    return arrayOfInt;
  }

  private static int b(String paramString, int paramInt, int[] paramArrayOfInt) {
    int i = 0;
    int j = paramInt;
    int k = paramString.length();
    while (i < k) {
      int m = paramString.charAt(i++) << '\020';
      paramArrayOfInt[(j++)] = (m | paramString.charAt(i++));
    }
    return j;
  }

  private static int[] bA()
  {
    int[] arrayOfInt = new int[36];
    int i = 0;
    i = c("", i, arrayOfInt);
    return arrayOfInt;
  }

  private static int c(String paramString, int paramInt, int[] paramArrayOfInt) {
    int i = 0;
    int j = paramInt;
    int k = paramString.length();
    int m;
    for (; i < k; 
      m > 0)
    {
      m = paramString.charAt(i++);
      int n = paramString.charAt(i++);
      n--;

      paramArrayOfInt[(j++)] = n; m--;
    }
    return j;
  }

  private static int[] bB()
  {
    int[] arrayOfInt = new int[14];
    int i = 0;
    i = d("", i, arrayOfInt);
    return arrayOfInt;
  }

  private static int d(String paramString, int paramInt, int[] paramArrayOfInt) {
    int i = 0;
    int j = paramInt;
    int k = paramString.length();
    int m;
    for (; i < k; 
      m > 0)
    {
      m = paramString.charAt(i++);
      int n = paramString.charAt(i++);

      paramArrayOfInt[(j++)] = n; m--;
    }
    return j;
  }

  private static void main(String[] paramArrayOfString)
  {
    try
    {
      Object localObject1;
      if (paramArrayOfString.length > 0) {
        localObject2 = new File(paramArrayOfString[0]);
        if (((File)localObject2).exists()) {
          if (((File)localObject2).canRead())
            localObject1 = new FileInputStream((File)localObject2);
          else
            throw new IOException("Could not open " + paramArrayOfString[0]);
        }
        else
          throw new IOException("Could not find " + paramArrayOfString[0]);
      }
      else {
        localObject1 = System.in;
      }
      Object localObject2 = new aD((InputStream)localObject1);
      String str;
      while ((str = ((aD)localObject2).bC()) != null)
        System.out.println(str);
    }
    catch (IOException localIOException) {
      System.out.println(localIOException.getMessage());
    }
  }

  public String bC()
  {
    return bI();
  }

  private static String unescape(String paramString) {
    StringBuffer localStringBuffer = new StringBuffer(paramString.length());
    for (int i = 0; i < paramString.length(); i++) {
      if ((paramString.charAt(i) == '\\') && (i < paramString.length())) {
        i++;
      }
      localStringBuffer.append(paramString.charAt(i));
    }
    return localStringBuffer.toString();
  }

  aD(Reader paramReader)
  {
    this.hE = paramReader;
  }

  aD(InputStream paramInputStream)
  {
    this(new InputStreamReader(paramInputStream));
  }

  private static char[] p(String paramString)
  {
    char[] arrayOfChar = new char[65536];
    int i = 0;
    int j = 0;
    int k;
    for (; i < 26; 
      k > 0)
    {
      k = paramString.charAt(i++);
      int m = paramString.charAt(i++);

      arrayOfChar[(j++)] = m; k--;
    }
    return arrayOfChar;
  }

  private boolean bD()
  {
    if (this.hK > 0) {
      System.arraycopy(this.hH, this.hK, this.hH, 0, this.hL - this.hK);

      this.hL -= this.hK;
      this.hJ -= this.hK;
      this.hI -= this.hK;
      this.hK = 0;
    }

    if (this.hJ >= this.hH.length)
    {
      char[] arrayOfChar = new char[this.hJ * 2];
      System.arraycopy(this.hH, 0, arrayOfChar, 0, this.hH.length);
      this.hH = arrayOfChar;
    }

    int i = this.hE.read(this.hH, this.hL, this.hH.length - this.hL);

    if (i > 0) {
      this.hL += i;
      return false;
    }

    if (i == 0) {
      int j = this.hE.read();
      if (j == -1) {
        return true;
      }
      this.hH[(this.hL++)] = ((char)j);
      return false;
    }

    return true;
  }

  private final void bE()
  {
    this.hQ = true;
    this.hL = this.hK;

    if (this.hE != null)
      this.hE.close();
  }

  private final void a(Reader paramReader)
  {
    this.hE = paramReader;
    this.hP = true;
    this.hQ = false;
    this.hL = (this.hK = 0);
    this.hJ = (this.hI = 0);
    this.hM = (this.hN = this.hO = 0);
    this.hG = 0;
  }

  private final int bF()
  {
    return this.hG;
  }

  private final void N(int paramInt)
  {
    this.hG = paramInt;
  }

  private final String bG()
  {
    return new String(this.hH, this.hK, this.hI - this.hK);
  }

  private final char O(int paramInt)
  {
    return this.hH[(this.hK + paramInt)];
  }

  private final int bH()
  {
    return this.hI - this.hK;
  }

  private void P(int paramInt)
  {
    String str;
    try
    {
      str = hB[paramInt];
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException) {
      str = hB[0];
    }

    throw new Error(str);
  }

  private void Q(int paramInt)
  {
    if (paramInt > bH()) {
      P(2);
    }
    this.hI -= paramInt;
  }

  private String bI()
  {
    int n = this.hL;
    char[] arrayOfChar1 = this.hH;
    char[] arrayOfChar2 = hr;

    int[] arrayOfInt1 = hw;
    int[] arrayOfInt2 = hu;
    int[] arrayOfInt3 = hC;
    while (true)
    {
      int m = this.hI;

      int j = -1;

      int k = this.hJ = this.hK = m;

      this.hF = hp[this.hG];
      int i;
      while (true) {
        if (k < n) {
          i = arrayOfChar1[(k++)]; } else {
          if (this.hQ) {
            i = -1;
            break;
          }

          this.hJ = k;
          this.hI = m;
          boolean bool = bD();

          k = this.hJ;
          m = this.hI;
          arrayOfChar1 = this.hH;
          n = this.hL;
          if (bool) {
            i = -1;
            break;
          }
          i = arrayOfChar1[(k++)];
        }

        int i1 = arrayOfInt1[(arrayOfInt2[this.hF] + arrayOfChar2[i])];
        if (i1 == -1)
          break;
        this.hF = i1;

        int i2 = arrayOfInt3[this.hF];
        if ((i2 & 0x1) == 1) {
          j = this.hF;
          m = k;
          if ((i2 & 0x8) == 8)
          {
            break;
          }
        }

      }

      this.hI = m;

      switch (j < 0 ? j : hs[j]) {
      case 3:
        return unescape(bG().substring(1, bG().length() - 1));
      case 4:
        break;
      case 2:
      case 5:
        break;
      case 1:
        return unescape(bG());
      case 6:
        break;
      default:
        if ((i == -1) && (this.hK == this.hJ)) {
          this.hQ = true;
          return null;
        }
        P(1);
      }
    }
  }
}