public class dHQ extends djh
{
  private static final String bdh = "@(#) $RCSfile: EntityRef.java,v $ $Revision: 1.21 $ $Date: 2004/02/27 11:32:57 $ $Name: jdom_1_0 $";
  protected String name;
  protected String publicID;
  protected String systemID;

  protected dHQ()
  {
  }

  public dHQ(String paramString)
  {
    this(paramString, null, null);
  }

  public dHQ(String paramString1, String paramString2)
  {
    this(paramString1, null, paramString2);
  }

  public dHQ(String paramString1, String paramString2, String paramString3)
  {
    rg(paramString1);
    rh(paramString2);
    ri(paramString3);
  }

  public String getName()
  {
    return this.name;
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

  public dHQ rg(String paramString)
  {
    String str = asE.fF(paramString);
    if (str != null) {
      throw new cCz(paramString, "EntityRef", str);
    }
    this.name = paramString;
    return this;
  }

  public dHQ rh(String paramString)
  {
    String str = asE.fC(paramString);
    if (str != null) {
      throw new aim(paramString, "EntityRef", str);
    }
    this.publicID = paramString;
    return this;
  }

  public dHQ ri(String paramString)
  {
    String str = asE.fD(paramString);
    if (str != null) {
      throw new aim(paramString, "EntityRef", str);
    }
    this.systemID = paramString;
    return this;
  }

  public String toString()
  {
    return 
      "[EntityRef: " + 
      "&" + 
      this.name + 
      ";" + 
      "]";
  }
}