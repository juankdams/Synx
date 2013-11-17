import java.util.Enumeration;
import java.util.Vector;

public abstract class bAo extends dwE
{
  private String edR = "condition";

  private Vector gpc = new Vector();

  protected bAo()
  {
    this.edR = "component";
  }

  protected bAo(String paramString)
  {
    this.edR = paramString;
  }

  protected int bIG()
  {
    return this.gpc.size();
  }

  protected final Enumeration bIH()
  {
    return this.gpc.elements();
  }

  public void dt(String paramString)
  {
    this.edR = paramString;
  }

  public String aSI()
  {
    return this.edR;
  }

  public void a(ayp paramayp)
  {
    this.gpc.addElement(paramayp);
  }

  public void a(cnX paramcnX)
  {
    this.gpc.addElement(paramcnX);
  }

  public void a(cl paramcl)
  {
    this.gpc.addElement(paramcl);
  }

  public void a(blQ paramblQ)
  {
    this.gpc.addElement(paramblQ);
  }

  public void a(cdp paramcdp)
  {
    this.gpc.addElement(paramcdp);
  }

  public void a(aCs paramaCs)
  {
    this.gpc.addElement(paramaCs);
  }

  public void a(dvg paramdvg)
  {
    this.gpc.addElement(paramdvg);
  }

  public void a(aCt paramaCt)
  {
    this.gpc.addElement(paramaCt);
  }

  public void a(ckv paramckv)
  {
    this.gpc.addElement(paramckv);
  }

  public void a(Yj paramYj)
  {
    this.gpc.addElement(paramYj);
  }

  public void a(bAs parambAs)
  {
    this.gpc.addElement(parambAs);
  }

  public void a(cea paramcea)
  {
    this.gpc.addElement(paramcea);
  }

  public void a(cMW paramcMW)
  {
    this.gpc.addElement(paramcMW);
  }

  public void a(aPg paramaPg)
  {
    this.gpc.addElement(paramaPg);
  }

  public void a(aus paramaus)
  {
    this.gpc.addElement(paramaus);
  }

  public void a(dEK paramdEK)
  {
    this.gpc.addElement(paramdEK);
  }

  public void a(bRJ parambRJ)
  {
    this.gpc.addElement(parambRJ);
  }

  public void c(cjq paramcjq)
  {
    this.gpc.addElement(paramcjq);
  }
}