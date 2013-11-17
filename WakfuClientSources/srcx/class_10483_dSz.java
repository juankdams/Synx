import java.util.ArrayList;

public abstract class dSz extends cXf
{
  private final ArrayList moB = new ArrayList(3);
  private final ArrayList moC = new ArrayList(3);

  private final xn moD = new XY(this);

  private boolean moE = true;

  protected dSz(float paramFloat1, float paramFloat2) {
    super(paramFloat1, paramFloat2);
  }

  public void lv(boolean paramBoolean) {
    this.moE = paramBoolean;
  }

  public void a(aRm paramaRm) {
    if (!paramaRm.bhF()) {
      return;
    }
    paramaRm.W((int)this.bIv, (int)this.bIw);
    if (paramaRm.bhG()) {
      if (!this.moB.contains(paramaRm))
        this.moB.add(paramaRm);
    }
    else if (!this.moC.contains(paramaRm))
      this.moC.add(paramaRm);
  }

  public void b(aRm paramaRm)
  {
    if (paramaRm.bhG())
      this.moB.remove(paramaRm);
    else
      this.moC.remove(paramaRm);
  }

  public void bxI()
  {
    super.bxI();
    for (int i = this.moB.size() - 1; i >= 0; i--) {
      ((aRm)this.moB.get(i)).bxI();
    }

    for (i = this.moC.size() - 1; i >= 0; i--)
      ((aRm)this.moC.get(i)).bxI();
  }

  public void W(int paramInt1, int paramInt2)
  {
    super.W(paramInt1, paramInt2);

    for (int i = this.moB.size() - 1; i >= 0; i--) {
      ((aRm)this.moB.get(i)).W(paramInt1, paramInt2);
    }
    for (i = this.moC.size() - 1; i >= 0; i--)
      ((aRm)this.moC.get(i)).W(paramInt1, paramInt2);
  }

  protected void a(ayc paramayc)
  {
  }

  protected void b(ayc paramayc)
  {
    Pb.aaU().a(this.moD, paramayc);
  }

  public void cz(int paramInt)
  {
    super.cz(paramInt);

    if (!this.moE) {
      return;
    }
    for (int i = this.moB.size() - 1; i >= 0; i--) {
      ((aRm)this.moB.get(i)).cz(paramInt);
    }

    for (i = this.moC.size() - 1; i >= 0; i--)
      ((aRm)this.moC.get(i)).cz(paramInt);
  }

  public void dY(boolean paramBoolean)
  {
    super.dY(paramBoolean);
    dsY();
  }

  public final void dsY() {
    for (int i = this.moB.size() - 1; i >= 0; i--) {
      ((aRm)this.moB.get(i)).reset();
    }

    for (i = this.moC.size() - 1; i >= 0; i--) {
      ((aRm)this.moC.get(i)).reset();
    }
    this.moB.clear();
    this.moC.clear();
  }

  protected void g(cXf paramcXf)
  {
    super.g(paramcXf);
    dSz localdSz = (dSz)paramcXf;
    aRm localaRm;
    for (int i = 0; i < localdSz.moB.size(); i++) {
      localaRm = (aRm)localdSz.moB.get(i);
      this.moB.add((aRm)localaRm.cLe());
      localaRm.cLd();
    }

    for (i = 0; i < localdSz.moC.size(); i++) {
      localaRm = (aRm)localdSz.moC.get(i);
      this.moC.add((aRm)localaRm.cLe());
      localaRm.cLd();
    }
  }
}