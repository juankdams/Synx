import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class Rx extends cqm
{
  protected static final Logger K = Logger.getLogger(Rx.class);
  private final eu crd;
  private List cre;
  private boolean crf;
  public static final byte crg = 12;
  protected int crh;
  protected int cri;
  protected int crj;
  protected int aAr;
  protected int aAq;
  private int crk;

  public Rx(eu parameu, int paramInt1, int paramInt2)
  {
    this.crd = parameu;
    an(paramInt1, paramInt2);
  }

  public eu Ce()
  {
    return this.crd;
  }

  public void a(bmw parambmw) {
    if (parambmw == null)
      return;
    if (this.cre == null) {
      this.cre = new ArrayList();
      this.cre.add(parambmw);
    } else if (!this.cre.contains(parambmw)) {
      this.cre.add(parambmw);
    }
  }

  public boolean b(bmw parambmw) { if (this.cre == null) {
      return false;
    }
    return this.cre.remove(parambmw); }

  public boolean c(bmw parambmw)
  {
    if (this.cre == null) {
      return false;
    }
    return this.cre.contains(parambmw);
  }

  private void a(Xh paramXh, int paramInt) {
    if ((this.cre != null) && (!this.cre.isEmpty()))
      for (bmw localbmw : this.cre)
        localbmw.b(paramXh, paramInt);
  }

  public int acU()
  {
    return this.crh;
  }

  public int value()
  {
    if (this.crh > max())
      return max();
    if (this.crh < min())
      return min();
    return this.crh;
  }

  public int acV() {
    return this.cri;
  }

  public int acW() {
    return this.crj;
  }

  public int max()
  {
    int i = this.cri + this.cri * this.crk / 100;
    return bCO.J(i, this.aAq, this.aAr);
  }

  public int acX()
  {
    return this.cri;
  }

  public int min()
  {
    return bCO.J(this.crj, this.aAq, this.aAr);
  }

  public int gu(int paramInt)
  {
    int i = this.crk;
    this.crk += paramInt;
    cpB();
    return this.crk - i;
  }

  public int lo() {
    return this.aAq;
  }

  public int lp() {
    return this.aAr;
  }

  public void set(int paramInt)
  {
    set(paramInt, true);
  }

  private void set(int paramInt, boolean paramBoolean) {
    if (this.crf)
      return;
    int i = value();
    if ((this.crd != null) && (this.crd.lC()))
      this.crh = bCO.J(paramInt, min(), this.aAr);
    else {
      this.crh = bCO.J(paramInt, min(), max());
    }
    if (i != value()) {
      if (paramBoolean)
        cpB();
      if (value() > i)
        a(Xh.cHl, value() - i);
      else
        a(Xh.cHm, i - value());
    }
  }

  public void a(Rx paramRx)
  {
    if (paramRx.crd != this.crd) {
      K.error("Trying to assign a " + paramRx.crd + " charac to a " + this.crd + " one.");
      return;
    }
    gA(paramRx.lo());
    gz(paramRx.lp());
    setMax(paramRx.cri);
    this.crk = paramRx.crk;
    setMin(paramRx.min());
    set(paramRx.value());
  }

  public int gv(int paramInt)
  {
    if (this.crf) {
      return 0;
    }
    int i = this.crh;
    long l = max() - value();
    int j = this.crh + paramInt;
    if (paramInt > l)
      set(max());
    else
      set(j);
    return this.crh - i;
  }

  public int gw(int paramInt)
  {
    if (this.crf) {
      return 0;
    }
    int i = this.crh;
    long l = value() - min();
    if (paramInt > l)
      set(min());
    else
      set(this.crh - paramInt);
    return i - this.crh;
  }

  public void setMax(int paramInt)
  {
    f(paramInt, true);
  }

  private void f(int paramInt, boolean paramBoolean)
  {
    this.cri = paramInt;

    this.cri = (this.cri > this.crj ? this.cri : this.crj);

    if ((!this.crf) && (this.crh > max()) && ((this.crd == null) || (!this.crd.lC()))) {
      this.crh = max();
    }
    a(Xh.cHn, max());

    if (paramBoolean)
      cpB();
  }

  public void setMin(int paramInt)
  {
    g(paramInt, true);
  }

  private void g(int paramInt, boolean paramBoolean)
  {
    this.crj = paramInt;

    this.crj = (this.cri < this.crj ? this.cri : this.crj);

    if ((!this.crf) && (this.crh < min())) {
      this.crh = min();
    }
    if (paramBoolean) {
      cpB();
    }
    a(Xh.cHo, min());
  }

  public int gx(int paramInt)
  {
    if (this.cri == 2147483647)
      return this.cri;
    setMax(this.cri + paramInt);
    return this.cri;
  }

  public int gy(int paramInt)
  {
    if (this.crj == -2147483648)
      return this.crj;
    setMin(this.crj + paramInt);
    return this.crj;
  }

  private void an(int paramInt1, int paramInt2)
  {
    this.aAq = (paramInt1 < paramInt2 ? paramInt1 : paramInt2);
    this.aAr = (paramInt1 > paramInt2 ? paramInt1 : paramInt2);
  }

  public void gz(int paramInt)
  {
    this.aAr = Math.max(paramInt, this.aAq);
  }

  public void gA(int paramInt) {
    this.aAq = Math.min(paramInt, this.aAr);
  }

  public void acY()
  {
    g(this.crd.lq(), false);
    f(this.crd.lr(), false);
    this.crh = 0;
    this.crk = 0;
    set(this.crd.getDefaultValue(), false);
    if (this.cre != null) {
      this.cre.clear();
    }
    cpB();
  }

  public void b(Rx paramRx) {
    setMax(paramRx.cri);
    setMin(paramRx.crj);
    set(paramRx.crh);
  }

  public void c(Rx paramRx) {
    setMax(paramRx.cri);
    setMin(paramRx.crj);
    set(paramRx.crh);
    this.crk = paramRx.crk;
  }

  public void a(Rx paramRx, int paramInt) {
    setMax(paramRx.cri * paramInt / 100);
    setMin(paramRx.crj * paramInt / 100);
    set(paramRx.crh * paramInt / 100);
    this.crk = (paramRx.crk * paramInt / 100);
  }

  public void acZ() {
    this.crf = true;
  }

  public void ada() {
    this.crf = false;
  }
}