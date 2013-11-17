import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class se
{
  private static final Logger K = Logger.getLogger(se.class);

  private final cSR bal = new cSR();
  private final List aEZ = new ArrayList();

  private final cYq bam = new cYq(0, 0, 0, 0, 0, 0);

  public void a(cjD paramcjD) {
    this.bal.put(paramcjD.getId(), paramcjD);
  }

  public void a(awt paramawt) {
    if (!this.aEZ.contains(paramawt))
      this.aEZ.add(paramawt);
  }

  public void b(awt paramawt)
  {
    this.aEZ.remove(paramawt);
  }

  public awq cE(int paramInt) {
    return (awq)this.bal.get(paramInt);
  }

  public void H(int paramInt1, int paramInt2) {
    cjD localcjD = (cjD)this.bal.get(paramInt1);
    if (localcjD == null) {
      K.warn("[LOCK] On essaye de modifier un Lock inconnu id=" + paramInt1);
      return;
    }

    localcjD.vv(paramInt2);
  }

  public void c(int paramInt, dxL paramdxL) {
    cjD localcjD = (cjD)this.bal.get(paramInt);
    if (localcjD == null) {
      K.warn("[LOCK] On essaye de modifier un Lock inconnu id=" + paramInt);
      return;
    }

    localcjD.M(paramdxL);
  }

  public void d(int paramInt, dxL paramdxL) {
    cjD localcjD = (cjD)this.bal.get(paramInt);
    if (localcjD == null) {
      K.warn("[LOCK] On essaye de modifier un Lock inconnu id=" + paramInt);
      return;
    }

    localcjD.K(paramdxL);
  }

  public void a(int paramInt, dxL paramdxL1, dxL paramdxL2) {
    cjD localcjD = (cjD)this.bal.get(paramInt);
    if (localcjD == null) {
      K.warn("[LOCK] On essaye de modifier un Lock inconnu id=" + paramInt);
      return;
    }

    localcjD.K(paramdxL1);
    localcjD.L(paramdxL2);
  }

  public boolean cF(int paramInt) {
    awq localawq = (awq)this.bal.get(paramInt);
    if (localawq == null) {
      K.warn("[LOCK] On essaye de vérifier qu'un Lock inconnu est actif id=" + paramInt);
      return false;
    }

    dxL localdxL = dDE.dft().VN();
    if (a(localawq, localdxL)) {
      return true;
    }

    return a(localawq, localdxL);
  }

  public boolean cG(int paramInt) {
    awq localawq = (awq)this.bal.get(paramInt);
    if (localawq == null) {
      K.warn("[LOCK] On essaye de vérifier qu'un Lock inconnu est actif id=" + paramInt);
      return false;
    }

    dxL localdxL = dDE.dft().VN();
    return a(localawq, localdxL);
  }

  private boolean a(awq paramawq, dxL paramdxL) {
    if (!paramawq.tu().rN()) {
      return false;
    }

    if (paramawq.aIl().avJ()) {
      return false;
    }

    dxL localdxL = paramdxL.a(paramawq.tv(), paramawq.tu());
    this.bam.P(paramawq.aIl());

    return localdxL.R(this.bam);
  }

  public boolean cH(int paramInt) {
    awq localawq = (awq)this.bal.get(paramInt);
    if (localawq == null) {
      K.warn("[LOCK] On essaye de vérifier qu'un Lock inconnu est actif id=" + paramInt);
      return false;
    }

    dxL localdxL = dDE.dft().VN();
    return a(localawq, localdxL);
  }

  private static boolean a(bFp parambFp, dxL paramdxL) {
    return (!parambFp.tw().avJ()) && (paramdxL.Q(parambFp.tw()));
  }

  public dxL cI(int paramInt) {
    awq localawq = (awq)this.bal.get(paramInt);
    if (localawq == null) {
      K.warn("[LOCK] On essaye de vérifier qu'un Lock inconnu est actif id=" + paramInt);
      return cYq.cLM();
    }

    dxL localdxL = dDE.dft().VN();
    return localdxL.b(localawq.tv(), localawq.tu(), true);
  }

  public int cJ(int paramInt) {
    awq localawq = (awq)this.bal.get(paramInt);
    if (localawq == null) {
      K.warn("[LOCK] On essaye de vérifier qu'un Lock inconnu est actif id=" + paramInt);
      return 0;
    }

    if (localawq.tt() == 0) {
      return 0;
    }
    cYq localcYq = dDE.dft().bcF();
    if ((localawq.tu().rN()) && (!localawq.aIm().avJ())) {
      dxL localdxL = localcYq.a(localawq.tv(), localawq.tu());
      this.bam.P(localawq.aIm());
      if (!localdxL.R(this.bam)) {
        return 0;
      }
    }

    return localawq.aIn();
  }

  public void cK(int paramInt) {
    cjD localcjD = (cjD)this.bal.get(paramInt);
    if (localcjD == null) {
      K.warn("[LOCK] On essaye de verrouiller un Lock inconnu id=" + paramInt);
      return;
    }

    cYq localcYq = dDE.dft().bcF();
    localcjD.K(localcYq);

    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((awt)this.aEZ.get(i)).f(paramInt, localcYq);
  }

  public void cL(int paramInt)
  {
    cjD localcjD = (cjD)this.bal.get(paramInt);
    if (localcjD == null) {
      K.warn("[LOCK] On essaye de verrouiller un Lock inconnu id=" + paramInt);
      return;
    }

    cYq localcYq = dDE.dft().bcF();
    if ((localcjD.tu().rN()) && (!localcjD.aIm().avJ())) {
      dxL localdxL = localcYq.a(localcjD.tv(), localcjD.tu());
      this.bam.P(localcjD.aIm());
      if (!localdxL.R(this.bam)) {
        localcjD.clm();
      }
    }

    localcjD.cll();
    localcjD.M(localcYq);

    int i = 0; for (int j = this.aEZ.size(); i < j; i++) {
      ((awt)this.aEZ.get(i)).a(paramInt, localcjD.aIn(), localcjD.aIm());
    }

    if (localcjD.aIn() >= localcjD.tt())
      cK(paramInt);
  }

  public dmn yF() {
    return this.bal.yF();
  }

  public void cleanUp() {
    this.bal.clear();
    this.aEZ.clear();
  }
}