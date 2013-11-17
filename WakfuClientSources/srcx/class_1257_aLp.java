import java.util.ArrayList;

public class aLp
  implements azp
{
  private final dGy epC = new afu(this);
  dkr der;
  private final cgT epD;
  private final int aQF;

  public aLp(cgT paramcgT, int paramInt)
  {
    this.epD = paramcgT;
    this.aQF = paramInt;
  }

  public void acY() {
    this.der = null;
  }

  public void a(air paramair) {
    paramair.q(this.epC);
  }

  public boolean c(dSc paramdSc) {
    return (paramdSc != null) && (((this.der != null) && (this.der.contains(paramdSc.bJ()))) || (this.epD.c(paramdSc)));
  }

  public Rx d(dSc paramdSc)
  {
    bcO();

    Rx localRx = this.der.fc(paramdSc.bJ());
    if (localRx != null)
      return localRx;
    if (this.epD.c(paramdSc)) {
      return e((eu)paramdSc);
    }
    return null;
  }

  private Rx e(eu parameu) {
    Rx localRx = f(parameu);
    return g(localRx);
  }

  private Rx g(Rx paramRx) {
    eu localeu = paramRx.Ce();
    paramRx.setMin(localeu.lq());
    if (localeu.isExpandable()) {
      paramRx.setMax(this.epD.c(localeu, this.aQF));
      paramRx.cpx();
    } else {
      paramRx.setMax(localeu.lr());
      paramRx.set(this.epD.c(localeu, this.aQF));
    }
    return paramRx;
  }

  private Rx f(eu parameu) {
    Rx localRx = new Rx(parameu, parameu.lo(), parameu.lp());
    this.der.a(parameu.bJ(), localRx);
    return localRx;
  }

  public int e(dSc paramdSc) {
    if (this.der != null) {
      Rx localRx = this.der.fc(paramdSc.bJ());
      if (localRx != null)
        return localRx.value();
    }
    if (this.epD.c(paramdSc))
      return this.epD.c((eu)paramdSc, this.aQF);
    return -1;
  }

  public int f(dSc paramdSc) {
    if (this.der != null) {
      Rx localRx = this.der.fc(paramdSc.bJ());
      if (localRx != null)
        return localRx.max();
    }
    if (this.epD.c(paramdSc)) {
      if (paramdSc.isExpandable())
        return this.epD.c((eu)paramdSc, this.aQF);
      return paramdSc.lr();
    }
    return -1;
  }

  public boolean a(cZr paramcZr)
  {
    paramcZr.clear();
    if (this.der != null) {
      this.der.c(new afw(this, paramcZr));
    }

    return true;
  }

  public boolean a(cZr paramcZr, dSc[] paramArrayOfdSc)
  {
    paramcZr.clear();
    if (this.der != null) {
      for (int i = 0; i < paramArrayOfdSc.length; i++) {
        byte b = paramArrayOfdSc[i].bJ();
        Rx localRx = this.der.fc(b);
        if (localRx != null) {
          cpD localcpD = new cpD();
          localcpD.cUJ = b;
          localcpD.current = localRx.crh;
          localcpD.min = localRx.crj;
          localcpD.max = localRx.cri;
          paramcZr.kMW.add(localcpD);
        }
      }
    }
    return true;
  }

  public boolean b(cZr paramcZr)
  {
    if (!paramcZr.kMW.isEmpty()) {
      bcO();
    }

    for (cpD localcpD : paramcZr.kMW) {
      eu localeu = eu.a(Byte.valueOf(localcpD.cUJ));
      Rx localRx = this.der.fc(localeu.bJ());
      if (localRx == null) {
        localRx = new Rx(localeu, localeu.lo(), localeu.lp());
        this.der.a(localeu.bJ(), localRx);
      }
      localRx.crh = localcpD.current;
      localRx.crj = localcpD.min;
      localRx.cri = localcpD.max;
    }
    return true;
  }

  private void bcO() {
    if (this.der == null)
      this.der = new dkr();
  }

  public cgT bcP() {
    return this.epD;
  }

  private void bcQ() {
    bcO();

    for (eu localeu : eu.values())
      if (!this.der.contains(localeu.bJ()))
        e(localeu);
  }

  public void a(caY paramcaY)
  {
    bcQ();

    this.der.M(new afx(this, paramcaY));
  }

  public void b(caY paramcaY)
  {
    if (this.der == null) {
      return;
    }
    this.der.M(new afy(this, paramcaY));
  }
}