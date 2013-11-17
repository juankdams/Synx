public class bDN
{
  private final dwE gzd;
  private aoo cdY;
  private String gze;
  private String className;
  private String gzf;
  private boolean gzg = false;

  bDN(dwE paramdwE)
  {
    this.gzd = paramdwE;
  }

  public void h(aoo paramaoo)
  {
    if (this.cdY == null)
      this.cdY = paramaoo;
    else
      this.cdY.e(paramaoo);
  }

  public aoo aKw()
  {
    if (this.cdY == null) {
      this.cdY = new aoo(this.gzd.Ga());
    }
    return this.cdY.aAD();
  }

  public void setClassname(String paramString)
  {
    this.className = paramString;
  }

  public void c(cxK paramcxK)
  {
    this.gze = paramcxK.cuW();
    aKw().a(paramcxK);
  }

  public void fX(boolean paramBoolean)
  {
    this.gzg = paramBoolean;
  }

  public void d(cxK paramcxK)
  {
    this.gzf = paramcxK.cuW();
  }

  public ClassLoader getClassLoader()
  {
    return bmR.a(bMz(), this.cdY, bMA(), this.gzg, (this.gzf != null) || (bmR.E(bMz())));
  }

  private FF bMz()
  {
    return this.gzd.Ga();
  }

  public String bMA()
  {
    if ((this.gzf == null) && (this.gze != null)) {
      return "ant.loader." + this.gze;
    }
    return this.gzf;
  }

  public Object newInstance()
  {
    return bmR.a(this.className, getClassLoader());
  }

  public aoo bwY()
  {
    return this.cdY;
  }

  public boolean bMB()
  {
    return this.gzg;
  }
}