import java.util.Enumeration;

public abstract class aGK extends dwE
{
  protected wZ aOL;
  protected String edR;
  protected String edS;
  protected bTW aOP;
  private boolean invalid;
  private aQS edT;

  public void d(wZ paramwZ)
  {
    this.aOL = paramwZ;
  }

  public wZ aSH()
  {
    return this.aOL;
  }

  public void dt(String paramString)
  {
    this.edR = paramString;
  }

  public String aSI()
  {
    return this.edR;
  }

  public void gu(String paramString)
  {
    this.edS = paramString;
  }

  public void init()
  {
  }

  public void execute()
  {
  }

  public bTW aSJ()
  {
    if (this.aOP == null) {
      this.aOP = new bTW(this, aSI());
    }
    return this.aOP;
  }

  public void b(bTW parambTW)
  {
    this.aOP = parambTW;
  }

  public void aSK()
  {
    if (!this.invalid) {
      if (this.aOP != null)
        this.aOP.N(Ga());
    }
    else
      aSO();
  }

  public void aSL()
  {
    if (this.aOP != null)
      this.aOP.O(Ga());
  }

  protected void gv(String paramString)
  {
    d(paramString, 2);
  }

  protected void gw(String paramString)
  {
    gv(paramString);
  }

  protected int g(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return Ga().c(paramArrayOfByte, paramInt1, paramInt2);
  }

  protected void gx(String paramString)
  {
    d(paramString, 1);
  }

  protected void gy(String paramString)
  {
    gx(paramString);
  }

  public void log(String paramString)
  {
    d(paramString, 2);
  }

  public void d(String paramString, int paramInt)
  {
    if (Ga() != null)
      Ga().a(this, paramString, paramInt);
    else
      super.d(paramString, paramInt);
  }

  public void a(Throwable paramThrowable, int paramInt)
  {
    if (paramThrowable != null)
      a(paramThrowable.getMessage(), paramThrowable, paramInt);
  }

  public void a(String paramString, Throwable paramThrowable, int paramInt)
  {
    if (Ga() != null)
      Ga().a(this, paramString, paramThrowable, paramInt);
    else
      super.d(paramString, paramInt);
  }

  public final void perform()
  {
    Object localObject1;
    if (!this.invalid) {
      Ga().b(this);
      localObject1 = null;
      try {
        aSK();
        aqR.aa(this);
      } catch (cJ localcJ1) {
        if (localcJ1.gu() == aaA.cOW) {
          localcJ1.a(gu());
        }
        localObject1 = localcJ1;
        throw localcJ1;
      } catch (Exception localException) {
        localObject1 = localException;
        cJ localcJ2 = new cJ(localException);
        localcJ2.a(gu());
        throw localcJ2;
      } catch (Error localError) {
        localObject1 = localError;
        throw localError;
      } finally {
        Ga().a(this, (Throwable)localObject1);
      }
    } else {
      localObject1 = aSO();
      aGK localaGK = ((aQS)localObject1).anB();
      localaGK.perform();
    }
  }

  final void aSM()
  {
    this.invalid = true;
  }

  protected final boolean aSN()
  {
    return this.invalid;
  }

  private aQS aSO()
  {
    if (this.edT == null) {
      this.edT = new aQS(this.edS);
      this.edT.b(Ga());
      this.edT.gu(this.edS);
      this.edT.dt(this.edR);
      this.edT.a(gu());
      this.edT.d(this.aOL);
      this.edT.b(this.aOP);
      this.aOP.aD(this.edT);
      a(this.aOP, this.edT);
      this.aOL.a(this, this.edT);
      this.edT.aSK();
    }
    return this.edT;
  }

  private void a(bTW parambTW, aQS paramaQS)
  {
    Enumeration localEnumeration = parambTW.cae();
    while (localEnumeration.hasMoreElements()) {
      bTW localbTW = (bTW)localEnumeration.nextElement();
      aQS localaQS = new aQS(localbTW.cag());

      paramaQS.a(localaQS);
      localaQS.b(Ga());
      localaQS.b(localbTW);
      localbTW.aD(localaQS);
      a(localbTW, localaQS);
    }
  }

  public String aSP()
  {
    return this.edS;
  }

  protected bTW aSQ()
  {
    return this.aOP;
  }

  public final void c(aGK paramaGK)
  {
    b(paramaGK.Ga());
    d(paramaGK.aSH());
    dt(paramaGK.aSI());
    setDescription(paramaGK.getDescription());
    a(paramaGK.gu());
    gu(paramaGK.aSP());
  }
}