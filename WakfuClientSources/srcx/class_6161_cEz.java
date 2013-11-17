import java.util.ArrayList;

public abstract class cEz
{
  private final ArrayList iyl;
  private int iym = -1;
  private int iyn = -1;
  private int iyo = -1;
  private boolean bur = true;
  private boolean iyp = false;
  private int iyq = 0;
  private int iyr = 0;
  private cZL iys = null;

  public cEz() {
    this.iyl = new ArrayList();
  }

  public boolean isEnabled() {
    return this.bur;
  }

  public void setEnabled(boolean paramBoolean) {
    this.bur = paramBoolean; } 
  public abstract String Dh();

  public abstract String Di();

  public abstract int Dk();

  public abstract int Dj();

  public int cAb() { return this.iym; }

  public int cAc()
  {
    return this.iyn;
  }

  public void update() {
    this.iys = null;
    cZL localcZL = new cZL();
    localcZL.kNx = Dk();
    localcZL.kNy = Dj();
    this.iyl.add(localcZL);

    if (localcZL.kNx > this.iyn)
      this.iyn = localcZL.kNx;
    if (localcZL.kNy > this.iym)
      this.iym = localcZL.kNy;
    if (localcZL.kNy + localcZL.kNx > this.iyo)
      this.iyo = (localcZL.kNy + localcZL.kNx);
  }

  public int cAd() {
    return this.iyo;
  }

  public cZL cAe() {
    if (this.iys != null) {
      return this.iys;
    }
    cZL localcZL = cAf();
    if (localcZL == null) {
      return null;
    }
    if (!this.iyp)
      this.iys = localcZL;
    else {
      this.iys = new amV(localcZL.kNx, localcZL.kNy, this.iyr, this.iyq);
    }

    return this.iys;
  }

  private cZL cAf() {
    int i = this.iyl.size();
    if (i == 0)
      return null;
    return (cZL)this.iyl.get(i - 1);
  }

  public int cAg() {
    return this.iyl.size();
  }

  public cZL xC(int paramInt) {
    if (paramInt < 0)
      return cZL.kNw;
    int i = this.iyl.size();
    if (paramInt >= i)
      return cZL.kNw;
    return (cZL)this.iyl.get(i - paramInt - 1);
  }

  public void mark() {
    this.iys = null;
    this.iyp = true;

    cZL localcZL = cAf();
    if (localcZL != null)
    {
      if (this.iys != null)
      {
        this.iyq = localcZL.kNy;
        this.iyr = localcZL.kNx;
      }
      else
      {
        this.iyq = Dj();
        this.iyr = Dk();
      }
    }
  }

  public int cAh() { return this.iyq; }

  public int cAi()
  {
    return this.iyr;
  }

  public void cAj() {
    this.iys = null;
    this.iyp = false;
  }

  public void cAk()
  {
    if (hasMark())
      cAj();
    else
      mark();
  }

  public boolean hasMark()
  {
    return this.iyp;
  }

  public String toString() {
    return Dh();
  }
}