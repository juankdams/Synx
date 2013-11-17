public class tk extends djh
{
  private static final String bdh = "@(#) $RCSfile: DocType.java,v $ $Revision: 1.31 $ $Date: 2004/02/27 11:32:57 $ $Name: jdom_1_0 $";
  protected String bdi;
  protected String publicID;
  protected String systemID;
  protected String internalSubset;

  protected tk()
  {
  }

  public tk(String paramString)
  {
    this(paramString, null, null);
  }

  public tk(String paramString1, String paramString2)
  {
    this(paramString1, null, paramString2);
  }

  public tk(String paramString1, String paramString2, String paramString3)
  {
    aA(paramString1);
    aB(paramString2);
    aC(paramString3);
  }

  public String getElementName()
  {
    return this.bdi;
  }

  public String getInternalSubset()
  {
    return this.internalSubset;
  }

  public String AJ()
  {
    return this.publicID;
  }

  public String AK()
  {
    return this.systemID;
  }

  public String getValue()
  {
    return "";
  }

  public tk aA(String paramString)
  {
    String str = asE.fF(paramString);
    if (str != null) {
      throw new cCz(paramString, "DocType", str);
    }
    this.bdi = paramString;
    return this;
  }

  public void setInternalSubset(String paramString)
  {
    this.internalSubset = paramString;
  }

  public tk aB(String paramString)
  {
    String str = asE.fC(paramString);
    if (str != null) {
      throw new aim(paramString, "DocType", str);
    }
    this.publicID = paramString;

    return this;
  }

  public tk aC(String paramString)
  {
    String str = asE.fD(paramString);
    if (str != null) {
      throw new aim(paramString, "DocType", str);
    }
    this.systemID = paramString;

    return this;
  }

  public String toString()
  {
    return 
      "[DocType: " + 
      new cpV().b(this) + 
      "]";
  }
}