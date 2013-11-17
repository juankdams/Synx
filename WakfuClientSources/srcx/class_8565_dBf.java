import java.lang.reflect.Method;

public class dBf
{
  private static final String lID = "content";
  private Object lIE;
  private Method lIF;
  private Method lIG;
  private Method lIH;
  private dUo lII;
  private String ces;
  private int cOX;
  private String lIJ = null;
  private fu cev = null;
  private boolean lIK = false;
  private PE lIL = null;

  public dBf(Object paramObject, dUo paramdUo, String paramString1, String paramString2, fu paramfu) {
    this.lIE = paramObject;
    this.lII = paramdUo;
    this.ces = paramString1;
    this.cOX = (paramString1 != null ? paramString1.hashCode() : 0);
    this.lIF = paramdUo.rc(paramString1);
    this.lIG = paramdUo.re(paramString1);
    this.lIH = paramdUo.rf(paramString1);
    this.lIJ = paramString2;
    this.cev = paramfu;
  }

  public dBf(Object paramObject, dUo paramdUo, String paramString, fu paramfu) {
    this.lIE = paramObject;
    this.lII = paramdUo;
    this.ces = paramString;
    this.cOX = (paramString != null ? paramString.hashCode() : 0);
    this.cev = paramfu;
  }

  public int getAttributeHash() {
    return this.cOX;
  }

  public String getAttribute()
  {
    return this.ces;
  }

  public void setAttribute(String paramString)
  {
    this.ces = paramString;
    this.cOX = (this.ces != null ? paramString.hashCode() : 0);
  }

  public Object getElement()
  {
    return this.lIE;
  }

  public void bz(Object paramObject)
  {
    this.lIE = paramObject;
  }

  public dUo det()
  {
    return this.lII;
  }

  public void b(dUo paramdUo)
  {
    this.lII = paramdUo;
  }

  public String getFieldName()
  {
    return this.lIJ;
  }

  public void qN(String paramString)
  {
    this.lIJ = paramString;
  }

  public fu getResultProvider()
  {
    return this.cev;
  }

  public void b(fu paramfu)
  {
    this.cev = paramfu;
  }

  public boolean deu()
  {
    return ((this.lIE instanceof vn)) && ("content".equalsIgnoreCase(this.ces));
  }

  public Method dev()
  {
    return this.lIF;
  }

  public Method dew()
  {
    return this.lIG;
  }

  public Method dex()
  {
    return this.lIH;
  }

  public boolean dey()
  {
    return this.lIK;
  }

  public void setModified(boolean paramBoolean)
  {
    this.lIK = paramBoolean;
  }

  PE dez() {
    return this.lIL;
  }

  void a(PE paramPE) {
    this.lIL = paramPE;
  }

  public String toString()
  {
    return "(PropertyClientData Element:" + this.lIE + " attribute=" + this.ces + " field=" + this.lIJ + ")";
  }
}