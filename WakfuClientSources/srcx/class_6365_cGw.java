import java.util.ArrayList;

public class cGw
{
  protected final ArrayList gaM;
  protected int aEf;
  protected int aEg;
  protected int aEh;
  protected int aEi;
  protected int ia;
  protected int ib;

  public cGw()
  {
    this.gaM = new ArrayList();
    reset();
  }

  public dNg ei(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < this.aEf) || (paramInt1 >= this.aEf + this.ia)) {
      return null;
    }
    if ((paramInt2 < this.aEg) || (paramInt2 >= this.aEg + this.ib)) {
      return null;
    }

    tF localtF = ej(paramInt1, paramInt2);
    if (localtF != null) {
      return localtF.BV();
    }
    return null;
  }

  public boolean p(int paramInt1, int paramInt2)
  {
    return (paramInt1 >= this.aEf) && (paramInt1 < this.aEf + this.ia) && (paramInt2 >= this.aEg) && (paramInt2 < this.aEg + this.ib);
  }

  public tF ej(int paramInt1, int paramInt2) {
    int i = aA(paramInt1, paramInt2);
    if ((i < 0) || (i >= this.gaM.size()))
      return null;
    return (tF)this.gaM.get(i);
  }

  public boolean s(int paramInt1, int paramInt2, short paramShort)
  {
    tF localtF = ej(paramInt1, paramInt2);
    return (localtF == null) || (localtF.i(paramInt1, paramInt2, paramShort));
  }

  public boolean t(int paramInt1, int paramInt2, short paramShort) {
    tF localtF = ej(paramInt1, paramInt2);
    return (localtF == null) || (localtF.i(paramInt1, paramInt2, paramShort));
  }

  public int getMinX() {
    return this.aEf;
  }

  public int getMinY() {
    return this.aEg;
  }

  public int getWidth() {
    return this.ia;
  }

  public int getHeight() {
    return this.ib;
  }

  public int KW() {
    return getMinX() + getWidth() - 1;
  }

  public int KX() {
    return getMinY() + getHeight() - 1;
  }

  public void reset() {
    this.gaM.clear();
    this.aEf = 2147483647;
    this.aEg = 2147483647;
    this.aEh = -2147483648;
    this.aEi = -2147483648;
    this.ia = 0;
    this.ib = 0;
  }

  public void c(tF paramtF, int paramInt1, int paramInt2)
  {
    this.gaM.add(paramtF);

    paramInt1 *= 18;
    paramInt2 *= 18;
    if (paramInt1 < this.aEf) {
      this.aEf = paramInt1;
    }
    if (paramInt1 > this.aEh) {
      this.aEh = paramInt1;
    }
    if (paramInt2 < this.aEg) {
      this.aEg = paramInt2;
    }
    if (paramInt2 > this.aEi) {
      this.aEi = paramInt2;
    }

    this.ia = (18 + this.aEh - this.aEf);
    this.ib = (18 + this.aEi - this.aEg);

    if ((!bB) && (this.gaM.size() >= 100)) throw new AssertionError("C'est pas un peu abusé, comme taille : " + this.gaM.size() + " ?????");
    if ((!bB) && (aA(paramInt1, paramInt2) != this.gaM.size() - 1)) throw new AssertionError(" Map ajoutée non valide. index : " + aA(paramInt1, paramInt2) + " attendu : " + (this.gaM.size() - 1));
  }

  protected int aA(int paramInt1, int paramInt2)
  {
    if (paramInt1 < this.aEf) {
      return -1;
    }
    if (paramInt2 < this.aEg) {
      return -1;
    }

    int i = (paramInt1 - this.aEf) / 18;
    int j = (paramInt2 - this.aEg) / 18;
    if ((!bB) && (i < 0)) throw new AssertionError();
    if ((!bB) && (j < 0)) throw new AssertionError();
    return j * (this.ia / 18) + i;
  }
}