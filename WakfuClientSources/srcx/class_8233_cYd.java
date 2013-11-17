public class cYd extends cwV
  implements Cloneable
{
  protected aqp kLx = null;
  protected String classname = null;
  protected aoo cdY = null;
  protected String eoE = null;
  protected String eoF = null;

  private aio kLy = null;

  public cYd(FF paramFF)
  {
    b(paramFF);
  }

  public void a(aqp paramaqp)
  {
    if (cum()) {
      throw cuq();
    }
    this.kLx = paramaqp;
  }

  public void b(Jf paramJf)
  {
    a(paramJf);
  }

  public void a(Jf paramJf)
  {
    if (cum()) {
      throw cur();
    }
    if (this.kLy == null) {
      if ((this.kLx == null) && (this.classname == null)) {
        this.kLy = new cqj();
      } else {
        Jf localJf = cLA();
        if ((localJf instanceof aio))
          this.kLy = ((aio)localJf);
        else {
          throw new cJ(String.valueOf(localJf) + " mapper implementation does not support nested mappers!");
        }
      }
    }

    this.kLy.a(paramJf);
    setChecked(false);
  }

  public void a(cYd paramcYd)
  {
    a(paramcYd.cLA());
  }

  public void setClassname(String paramString)
  {
    if (cum()) {
      throw cuq();
    }
    this.classname = paramString;
  }

  public void h(aoo paramaoo)
  {
    if (cum()) {
      throw cuq();
    }
    if (this.cdY == null)
      this.cdY = paramaoo;
    else
      this.cdY.e(paramaoo);
  }

  public aoo aKw()
  {
    if (cum()) {
      throw cur();
    }
    if (this.cdY == null) {
      this.cdY = new aoo(Ga());
    }
    setChecked(false);
    return this.cdY.aAD();
  }

  public void b(cxK paramcxK)
  {
    if (cum()) {
      throw cuq();
    }
    aKw().a(paramcxK);
  }

  public void setFrom(String paramString)
  {
    if (cum()) {
      throw cuq();
    }
    this.eoE = paramString;
  }

  public void setTo(String paramString)
  {
    if (cum()) {
      throw cuq();
    }
    this.eoF = paramString;
  }

  public void a(cxK paramcxK)
  {
    if ((this.kLx != null) || (this.eoE != null) || (this.eoF != null)) {
      throw cuq();
    }
    super.a(paramcxK);
  }

  public Jf cLA()
  {
    Object localObject1;
    Object localObject2;
    if (cum()) {
      cuo();
      localObject1 = cut();
      localObject2 = ((cxK)localObject1).V(Ga());
      if ((localObject2 instanceof Jf)) {
        return (Jf)localObject2;
      }
      if ((localObject2 instanceof cYd)) {
        return ((cYd)localObject2).cLA();
      }
      String str = localObject2 == null ? "null" : localObject2.getClass().getName();
      throw new cJ(str + " at reference '" + ((cxK)localObject1).cuW() + "' is not a valid mapper reference.");
    }

    if ((this.kLx == null) && (this.classname == null) && (this.kLy == null)) {
      throw new cJ("nested mapper or one of the attributes type or classname is required");
    }

    if (this.kLy != null) {
      return this.kLy;
    }

    if ((this.kLx != null) && (this.classname != null)) {
      throw new cJ("must not specify both type and classname attribute");
    }

    try
    {
      localObject1 = (Jf)getImplementationClass().newInstance();
      localObject2 = Ga();
      if (localObject2 != null) {
        ((FF)localObject2).G(localObject1);
      }
      ((Jf)localObject1).setFrom(this.eoE);
      ((Jf)localObject1).setTo(this.eoF);

      return localObject1;
    } catch (cJ localcJ) {
      throw localcJ;
    } catch (Throwable localThrowable) {
      throw new cJ(localThrowable);
    }
  }

  protected Class getImplementationClass()
  {
    String str = this.classname;
    if (this.kLx != null) {
      str = this.kLx.aCu();
    }

    iA localiA = this.cdY == null ? getClass().getClassLoader() : Ga().b(this.cdY);

    return Class.forName(str, true, localiA).asSubclass(Jf.class);
  }

  protected cYd cLB()
  {
    return (cYd)i(cYd.class, cun());
  }
}