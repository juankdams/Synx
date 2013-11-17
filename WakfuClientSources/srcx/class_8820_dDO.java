import java.util.ArrayList;

public abstract class dDO
{
  private final ArrayList lMt = new ArrayList();
  protected final bNi bOP;

  protected dDO(bNi parambNi)
  {
    this.bOP = parambNi;
  }

  public boolean dfG() {
    return !this.lMt.isEmpty();
  }

  public ArrayList dfH() {
    return this.lMt;
  }

  public void al(ArrayList paramArrayList) {
    this.lMt.addAll(paramArrayList);
  }

  public bNi Qw() {
    return this.bOP;
  }

  public abstract dtv pI();

  public abstract void a(aIJ paramaIJ);

  public abstract void b(aLD paramaLD);

  public abstract void a(aLD paramaLD);

  public final void f(aLD paramaLD) {
    a(paramaLD);
  }
  protected void c(aLD paramaLD) {
    a(paramaLD);
  }

  public void g(aLD paramaLD) {
    c(paramaLD);
    for (Gz localGz : dfH())
      if (localGz.yE() == cLT.iLz)
        paramaLD.g(localGz.Qw());
  }

  public MD wr()
  {
    return this.bOP.Qx();
  }

  public bvy bqR() {
    return this.bOP.bqR();
  }
}