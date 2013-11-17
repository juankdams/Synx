import java.io.File;

public class arQ extends bRt
{
  private String pattern = null;
  private String aVj = null;
  private boolean cyh = true;

  private boolean dAZ = false;
  public static final String dBa = "name";
  public static final String cyk = "casesensitive";
  public static final String dBb = "negate";
  public static final String dBc = "regex";
  private aeB dBd;
  private cyp dBe;

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{filenameselector name: ");
    if (this.pattern != null) {
      localStringBuilder.append(this.pattern);
    }
    if (this.aVj != null) {
      localStringBuilder.append(this.aVj).append(" [as regular expression]");
    }
    localStringBuilder.append(" negate: ").append(this.dAZ);
    localStringBuilder.append(" casesensitive: ").append(this.cyh);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }

  public void setName(String paramString)
  {
    paramString = paramString.replace('/', File.separatorChar).replace('\\', File.separatorChar);

    if (paramString.endsWith(File.separator)) {
      paramString = paramString + "**";
    }
    this.pattern = paramString;
  }

  public void setRegex(String paramString)
  {
    this.aVj = paramString;
    this.dBd = null;
  }

  public void bu(boolean paramBoolean)
  {
    this.cyh = paramBoolean;
  }

  public void cN(boolean paramBoolean)
  {
    this.dAZ = paramBoolean;
  }

  public void a(daL[] paramArrayOfdaL)
  {
    super.a(paramArrayOfdaL);
    if (paramArrayOfdaL != null)
      for (int i = 0; i < paramArrayOfdaL.length; i++) {
        String str = paramArrayOfdaL[i].getName();
        if ("name".equalsIgnoreCase(str))
          setName(paramArrayOfdaL[i].getValue());
        else if ("casesensitive".equalsIgnoreCase(str)) {
          bu(FF.bP(paramArrayOfdaL[i].getValue()));
        }
        else if ("negate".equalsIgnoreCase(str))
          cN(FF.bP(paramArrayOfdaL[i].getValue()));
        else if ("regex".equalsIgnoreCase(str))
          setRegex(paramArrayOfdaL[i].getValue());
        else
          be("Invalid parameter " + str);
      }
  }

  public void cd()
  {
    if ((this.pattern == null) && (this.aVj == null))
      be("The name or regex attribute is required");
    else if ((this.pattern != null) && (this.aVj != null))
      be("Only one of name and regex attribute is allowed");
  }

  public boolean a(File paramFile1, String paramString, File paramFile2)
  {
    validate();
    if (this.pattern != null) {
      return dvA.e(this.pattern, paramString, this.cyh) == (!this.dAZ);
    }

    if (this.dBd == null) {
      this.dBd = new aeB();
      this.dBd.setPattern(this.aVj);
      this.dBe = this.dBd.r(Ga());
    }
    int i = afN.bW(this.cyh);
    return this.dBe.u(paramString, i) == (!this.dAZ);
  }
}