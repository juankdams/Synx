public class dTO
  implements Cloneable
{
  private static final String bdh = "@(#) $RCSfile: Format.java,v $ $Revision: 1.10 $ $Date: 2004/09/07 06:37:20 $ $Name: jdom_1_0 $";
  private static final String mqK = "  ";
  private static final String mqL = "\r\n";
  private static final String mqM = "UTF-8";
  String mqN = null;

  String mqO = "\r\n";

  String encoding = "UTF-8";

  boolean mqP = false;

  boolean mqQ = false;

  boolean mqR = false;

  boolean mqS = false;

  aFu mqT = aFu.eby;

  bfL mqU = new iq(this, this.encoding);
  static Class bRr;

  static Class cd(String paramString)
  {
    try
    {
      return Class.forName(paramString); } catch (ClassNotFoundException localClassNotFoundException) { throw new NoClassDefFoundError(localClassNotFoundException.getMessage()); }

  }

  protected Object clone()
  {
    dTO localdTO = null;
    try
    {
      localdTO = (dTO)super.clone();
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
    }
    return localdTO;
  }

  public static dTO dtL()
  {
    dTO localdTO = new dTO();
    localdTO.a(aFu.ebA);
    return localdTO;
  }

  public String getEncoding()
  {
    return this.encoding;
  }

  public bfL dtM()
  {
    return this.mqU;
  }

  public boolean dtN()
  {
    return this.mqR;
  }

  public boolean dtO()
  {
    return this.mqS;
  }

  public String dtP()
  {
    return this.mqN;
  }

  public String getLineSeparator()
  {
    return this.mqO;
  }

  public boolean dtQ()
  {
    return this.mqP;
  }

  public boolean dtR()
  {
    return this.mqQ;
  }

  public static dTO dtS()
  {
    dTO localdTO = new dTO();
    localdTO.si("  ");
    localdTO.a(aFu.ebz);
    return localdTO;
  }

  public static dTO dtT()
  {
    return new dTO();
  }

  public aFu dtU()
  {
    return this.mqT;
  }

  public dTO sh(String paramString)
  {
    this.encoding = paramString;
    this.mqU = new iq(this, paramString);
    return this;
  }

  public dTO a(bfL parambfL)
  {
    this.mqU = parambfL;
    return this;
  }

  public dTO ly(boolean paramBoolean)
  {
    this.mqR = paramBoolean;
    return this;
  }

  public void lz(boolean paramBoolean)
  {
    this.mqS = paramBoolean;
  }

  public dTO si(String paramString)
  {
    if ("".equals(paramString)) {
      paramString = null;
    }
    this.mqN = paramString;
    return this;
  }

  public dTO sj(String paramString)
  {
    this.mqO = paramString;
    return this;
  }

  public dTO lA(boolean paramBoolean)
  {
    this.mqP = paramBoolean;
    return this;
  }

  public dTO lB(boolean paramBoolean)
  {
    this.mqQ = paramBoolean;
    return this;
  }

  public dTO a(aFu paramaFu)
  {
    this.mqT = paramaFu;
    return this;
  }
}