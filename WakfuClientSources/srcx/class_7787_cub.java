import java.util.ArrayList;

public class cub
{
  public static final int ieh = 25;
  private final dPx iei = new dPx();
  private final aoL iej = new aoL();

  public Xi b(cuU paramcuU) {
    return (Xi)this.iei.bf(paramcuU.bUy);
  }

  public dym hN(long paramLong) {
    return (dym)this.iej.get(paramLong);
  }

  public void a(Xi paramXi) {
    this.iei.c(paramXi.ajm().bUy, paramXi);
  }

  public void a(dym paramdym) {
    this.iej.put(paramdym.getId(), paramdym);
  }

  public void C(long paramLong) {
    this.iej.remove(paramLong);
  }

  public void b(bIq parambIq) {
    d(parambIq);
    e(parambIq);
  }

  public void c(bIq parambIq) {
    f(parambIq);
    g(parambIq);
  }

  private void d(bIq parambIq) {
    parambIq.biP.clear();
    for (aJp localaJp = this.iei.dqF(); localaJp.hasNext(); ) {
      localaJp.fl();
      Kw localKw = new Kw();
      ((Xi)localaJp.value()).a(localKw.bXb);
      parambIq.biP.add(localKw);
    }
  }

  private void e(bIq parambIq) {
    parambIq.biQ.clear();
    for (cHu localcHu = this.iej.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      OC localOC = new OC();
      ((dym)localcHu.value()).a(localOC.cfM);
      parambIq.biQ.add(localOC);
    }
  }

  private void f(bIq parambIq) {
    this.iei.clear();
    for (int i = 0; i < parambIq.biP.size(); i++) {
      Xi localXi = new Xi();
      localXi.b(((Kw)parambIq.biP.get(i)).bXb);
      a(localXi);
    }
  }

  private void g(bIq parambIq) {
    this.iej.clear();
    for (int i = 0; i < parambIq.biQ.size(); i++) {
      dym localdym = new dym();
      localdym.b(((OC)parambIq.biQ.get(i)).cfM);
      a(localdym);
    }
  }

  public Ej csz() {
    Ej localEj = new Ej(new bqt(this));

    for (cHu localcHu = this.iej.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      localEj.add(localcHu.value());
    }
    return localEj;
  }

  public String toString()
  {
    return "DimBagRights{m_groupRights=" + this.iei.size() + ", m_individualRights=" + this.iej.size() + '}';
  }
}