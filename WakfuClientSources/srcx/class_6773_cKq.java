import java.util.ArrayList;

public abstract class cKq
{
  public static final int iJd = -1;
  protected ddp dRn;
  protected int bmM;
  protected int aKS;
  protected int iJe = 1;
  protected boolean iJf = true;
  protected int iJg = 0;
  protected int aGf = 0;
  protected Object iJh;
  protected Object iJi;
  protected boolean dbs = false;
  protected LM iJj;
  private ArrayList aBf = null;

  public void a(ddy paramddy)
  {
    if (this.aBf == null) {
      this.aBf = new ArrayList(3);
    }

    this.aBf.add(paramddy);
  }

  public void b(ddy paramddy) {
    if (this.aBf != null)
      this.aBf.remove(paramddy);
  }

  public boolean isPaused()
  {
    return this.dbs;
  }

  public void setPaused(boolean paramBoolean) {
    this.dbs = paramBoolean;
  }

  public long getDuration()
  {
    return this.aKS;
  }

  public void setDuration(int paramInt)
  {
    this.aKS = paramInt;
  }

  public int getDelay()
  {
    return this.aGf;
  }

  public void setDelay(int paramInt)
  {
    this.aGf = paramInt;
  }

  public boolean cDZ() {
    return this.iJf;
  }

  public void ip(boolean paramBoolean) {
    this.iJf = paramBoolean;
  }

  public Object cEa()
  {
    return this.iJh;
  }

  public void be(Object paramObject)
  {
    this.iJh = paramObject;
  }

  public Object cEb()
  {
    return this.iJi;
  }

  public void bf(Object paramObject)
  {
    this.iJi = paramObject;
  }

  public int cEc()
  {
    return this.iJe;
  }

  public void yc(int paramInt)
  {
    if ((!bB) && (paramInt != -1) && (paramInt <= 0)) throw new AssertionError("La valeur de repeat définie n'est pas valide ( inférieure ou égale à 0)");
    this.iJe = paramInt;
  }

  public void setTweenFunction(ddp paramddp)
  {
    this.dRn = paramddp;
  }

  public void a(LM paramLM)
  {
    this.iJj = paramLM;
  }

  public LM cEd()
  {
    return this.iJj;
  }

  public boolean aH(int paramInt)
  {
    if (this.dbs) {
      return true;
    }

    if (this.aGf > 0) {
      this.aGf -= paramInt;
    }

    if (this.aGf > 0) {
      return false;
    }

    if (this.aGf < 0) {
      this.bmM -= this.aGf;
      this.aGf = 0;
    } else {
      this.bmM += paramInt;
    }

    if (this.bmM >= this.aKS) {
      this.iJg += 1;

      if (this.iJg != this.iJe) {
        if (this.iJf) {
          Object localObject = this.iJh;
          this.iJh = this.iJi;
          this.iJi = localObject;
        }
        if (this.aKS != 0)
          this.bmM %= this.aKS;
        else
          this.bmM = 0;
      }
      else {
        this.bmM = this.aKS;
      }

    }

    if ((this.iJe != -1) && (this.iJg >= this.iJe)) {
      this.iJj.b(this);
      return false;
    }

    return true;
  }

  public void nv()
  {
    cleanUp();
    if (this.aBf != null)
      for (int i = this.aBf.size() - 1; i >= 0; i--)
        ((ddy)this.aBf.get(i)).a(this, byN.gmm);
  }

  public void cleanUp()
  {
  }
}