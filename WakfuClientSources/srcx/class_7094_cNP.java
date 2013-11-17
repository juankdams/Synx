import java.io.File;

public class cNP extends bRt
{
  private static final int ktq = 1000;
  private static final int ktr = 1024;
  private static final int kts = 4;
  private static final int ktt = 1000000;
  private static final int ktu = 9;
  private static final int ktv = 1048576;
  private static final int ktw = 13;
  private static final long ktx = 1000000000L;
  private static final int kty = 18;
  private static final long ktz = 1073741824L;
  private static final int ktA = 22;
  private static final long ktB = 1000000000000L;
  private static final int ktC = 27;
  private static final long ktD = 1099511627776L;
  private static final int ktE = 31;
  private static final int ktF = 36;
  public static final String eks = "value";
  public static final String ktG = "units";
  public static final String ktH = "when";
  private long size = -1L;
  private long ktI = 1L;
  private long ktJ = -1L;
  private aer ktK = aer.cVs;

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{sizeselector value: ");
    localStringBuilder.append(this.ktJ);
    localStringBuilder.append("compare: ").append(this.ktK.getValue());
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }

  public void fM(long paramLong)
  {
    this.size = paramLong;
    if ((this.ktI != 0L) && (paramLong > -1L))
      this.ktJ = (paramLong * this.ktI);
  }

  public void a(Xw paramXw)
  {
    int i = paramXw.getIndex();
    this.ktI = 0L;
    if ((i > -1) && (i < 4))
      this.ktI = 1000L;
    else if (i < 9)
      this.ktI = 1024L;
    else if (i < 13)
      this.ktI = 1000000L;
    else if (i < 18)
      this.ktI = 1048576L;
    else if (i < 22)
      this.ktI = 1000000000L;
    else if (i < 27)
      this.ktI = 1073741824L;
    else if (i < 31)
      this.ktI = 1000000000000L;
    else if (i < 36) {
      this.ktI = 1099511627776L;
    }
    if ((this.ktI > 0L) && (this.size > -1L))
      this.ktJ = (this.size * this.ktI);
  }

  public void a(bhe parambhe)
  {
    this.ktK = parambhe;
  }

  public void a(daL[] paramArrayOfdaL)
  {
    super.a(paramArrayOfdaL);
    if (paramArrayOfdaL != null)
      for (int i = 0; i < paramArrayOfdaL.length; i++) {
        String str = paramArrayOfdaL[i].getName();
        if ("value".equalsIgnoreCase(str)) {
          try {
            fM(Long.parseLong(paramArrayOfdaL[i].getValue()));
          } catch (NumberFormatException localNumberFormatException) {
            be("Invalid size setting " + paramArrayOfdaL[i].getValue());
          }
        }
        else
        {
          Object localObject;
          if ("units".equalsIgnoreCase(str)) {
            localObject = new Xw();
            ((Xw)localObject).setValue(paramArrayOfdaL[i].getValue());
            a((Xw)localObject);
          } else if ("when".equalsIgnoreCase(str)) {
            localObject = new bhe();
            ((bhe)localObject).setValue(paramArrayOfdaL[i].getValue());
            a((bhe)localObject);
          } else {
            be("Invalid parameter " + str);
          }
        }
      }
  }

  public void cd()
  {
    if (this.size < 0L)
      be("The value attribute is required, and must be positive");
    else if (this.ktI < 1L)
      be("Invalid Units supplied, must be K,Ki,M,Mi,G,Gi,T,or Ti");
    else if (this.ktJ < 0L)
      be("Internal error: Code is not setting sizelimit correctly");
  }

  public boolean a(File paramFile1, String paramString, File paramFile2)
  {
    validate();

    if (paramFile2.isDirectory()) {
      return true;
    }
    long l = paramFile2.length() - this.ktJ;
    return this.ktK.hN(l == 0L ? 0 : (int)(l / Math.abs(l)));
  }
}