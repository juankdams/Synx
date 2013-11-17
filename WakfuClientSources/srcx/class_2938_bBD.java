public class bBD extends dTY
{
  private dTY guu;
  private aQS guv;

  public bBD(dTY paramdTY, aQS paramaQS)
  {
    if ((paramdTY instanceof bBD)) {
      bBD localbBD = (bBD)paramdTY;
      paramaQS.b(localbBD.guv);
      paramdTY = localbBD.guu;
    }
    this.guu = paramdTY;
    this.guv = paramaQS;
  }

  public void R(Class paramClass)
  {
    throw new cJ("Not supported");
  }

  public void setClassName(String paramString)
  {
    throw new cJ("Not supported");
  }

  public String getClassName()
  {
    return this.guu.getClassName();
  }

  public void S(Class paramClass)
  {
    throw new cJ("Not supported");
  }

  public void T(Class paramClass)
  {
    throw new cJ("Not supported");
  }

  public void setClassLoader(ClassLoader paramClassLoader)
  {
    throw new cJ("Not supported");
  }

  public ClassLoader getClassLoader()
  {
    return this.guu.getClassLoader();
  }

  public Class J(FF paramFF)
  {
    return this.guu.J(paramFF);
  }

  public Class K(FF paramFF)
  {
    return this.guu.K(paramFF);
  }

  public void L(FF paramFF)
  {
    this.guu.L(paramFF);
  }

  public Object M(FF paramFF)
  {
    return this.guu.w(paramFF);
  }

  public aQS bKK()
  {
    return this.guv;
  }

  public Object w(FF paramFF)
  {
    return this;
  }

  public boolean a(dTY paramdTY, FF paramFF)
  {
    return (paramdTY != null) && (paramdTY.getClass() == getClass()) && (this.guu != null) && (this.guu.a(((bBD)paramdTY).guu, paramFF)) && (this.guv.at(((bBD)paramdTY).guv));
  }

  public boolean b(dTY paramdTY, FF paramFF)
  {
    return (paramdTY != null) && (paramdTY.getClass().getName().equals(getClass().getName())) && (this.guu != null) && (this.guu.b(((bBD)paramdTY).guu, paramFF)) && (this.guv.at(((bBD)paramdTY).guv));
  }
}