public abstract class dIA extends blM
{
  private ClassLoader lTq;
  private bDN lTr;

  protected boolean dik()
  {
    return this.lTr != null;
  }

  public void fX(boolean paramBoolean)
  {
    dio().fX(paramBoolean);
    d("The reverseloader attribute is DEPRECATED. It will be removed", 1);
  }

  public aoo bwY()
  {
    return dio().bwY();
  }

  public boolean bMB()
  {
    return dio().bMB();
  }

  public String dil()
  {
    return dio().bMA();
  }

  public String dim()
  {
    return dio().bMA();
  }

  public void h(aoo paramaoo)
  {
    dio().h(paramaoo);
  }

  public aoo aKw()
  {
    return dio().aKw();
  }

  public void b(cxK paramcxK)
  {
    dio().c(paramcxK);
  }

  public void d(cxK paramcxK)
  {
    dio().d(paramcxK);
  }

  protected ClassLoader din()
  {
    if ((bwO() != null) && (this.lTr == null)) {
      return bwO();
    }
    if (this.lTq == null) {
      this.lTq = dio().getClassLoader();

      ((iA)this.lTq).T("org.apache.tools.ant");
    }

    return this.lTq;
  }

  public void init()
  {
    super.init();
  }

  private bDN dio() {
    if (this.lTr == null) {
      this.lTr = bmR.a(this);
    }
    return this.lTr;
  }
}