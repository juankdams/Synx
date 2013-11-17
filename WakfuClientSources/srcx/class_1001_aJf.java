import java.io.IOException;
import java.util.ArrayList;
import org.apache.log4j.Logger;

class aJf
  implements aRn
{
  private final ArrayList eju;
  private final ArrayList bI;

  aJf(aWc paramaWc)
  {
    this.eju = new ArrayList();
    this.bI = new ArrayList();

    this.eju.add(cpT.hZc);
    this.eju.add(cpT.hZd);
    this.eju.add(cpT.hZh);
    this.eju.add(cpT.hZg);
    this.eju.add(cpT.hZe);
    this.eju.add(cpT.hZi);
    this.eju.add(cpT.hZj);
    this.eju.add(cpT.hZf);
  }

  private cpT ea(long paramLong) {
    int i = 0; for (int j = this.eju.size(); i < j; i++) {
      cpT localcpT = (cpT)this.eju.get(i);
      if (localcpT.hE(paramLong)) {
        return localcpT;
      }
    }

    return null;
  }

  public aVB a(long paramLong1, float paramFloat, int paramInt1, long paramLong2, long paramLong3, int paramInt2) {
    if (!this.ejv.isRunning()) {
      return null;
    }

    long l = beq.fq(paramLong1);
    cpT localcpT = ea(l);

    if (localcpT == null) {
      return null;
    }

    dJZ localdJZ = localcpT.cpd();
    if (!localdJZ.bfm()) {
      return null;
    }

    byz localbyz = byv.bFN().bFO();
    if ((localbyz != null) && (localcpT.cpf())) {
      localObject1 = localbyz.bGv();
      if (l != 530L) {
        if (localObject1 == null) {
          paramFloat *= (paramInt2 <= 0 ? 1.0F : 0.25F); } else {
          if (((arl)localObject1).getId() != paramInt2)
          {
            return null;
          }
          if (l == 111L) {
            paramFloat *= aWc.a(this.ejv).sZ();
          }
        }
      }
    }
    paramFloat = bCO.t(paramFloat, 0.0F, 1.0F);

    Object localObject1 = new aKI(cFl.cAH().cAI(), paramLong1, paramFloat, paramInt1, paramLong2, paramLong3, paramInt2);
    synchronized (this.bI) {
      this.bI.add(localObject1);
    }
    return localObject1;
  }

  public aVB a(long paramLong1, float paramFloat, int paramInt1, long paramLong2, long paramLong3, int paramInt2, cbI paramcbI, int paramInt3) {
    return a(paramLong1, paramFloat, paramInt1, paramLong2, paramLong3, paramInt2, paramcbI, paramInt3, true);
  }

  public aVB a(long paramLong1, float paramFloat, int paramInt1, long paramLong2, long paramLong3, int paramInt2, cbI paramcbI, int paramInt3, boolean paramBoolean) {
    if (!this.ejv.isRunning()) {
      return null;
    }

    long l = beq.fq(paramLong1);
    cpT localcpT = ea(l);

    if (localcpT == null) {
      return null;
    }

    kk localkk = localcpT.cpe();
    if (!localkk.bfm()) {
      return null;
    }

    byz localbyz = byv.bFN().bFO();
    if (localcpT.cpf()) {
      localaKI = localbyz != null ? localbyz.bGv() : null;
      if (l != 530L) {
        if (localaKI == null) {
          paramFloat *= (paramInt2 <= 0 ? 1.0F : 0.25F); } else {
          if (localaKI.getId() != paramInt2)
          {
            return null;
          }
          if (l == 111L) {
            paramFloat *= aWc.a(this.ejv).sZ();
          }
        }
      }
    }
    paramFloat = Math.max(Math.min(1.0F, paramFloat), 0.0F);

    aKI localaKI = new aKI(cFl.cAH().cAI(), paramLong1, paramFloat, paramInt1, paramLong2, paramLong3, paramInt2, paramcbI, paramInt3, paramBoolean);
    synchronized (this.bI) {
      this.bI.add(localaKI);
    }

    return localaKI;
  }

  private void a(aKI paramaKI) {
    long l1 = paramaKI.alu();

    long l2 = beq.fq(l1);
    cpT localcpT = ea(l2);

    if (localcpT == null) {
      return;
    }

    dJZ localdJZ = localcpT.cpd();
    if (!localdJZ.bfm()) {
      return;
    }
    blq localblq;
    try
    {
      localblq = localdJZ.bfh().gL(l1);
    } catch (IOException localIOException) {
      aWc.i().debug("Impossible de charger le son d'id " + l1);
      return;
    }

    if (localblq == null) {
      aWc.an().debug("Impossible de préparer le son d'id " + l1);
      return;
    }

    ZG localZG = localdJZ.a(localblq, paramaKI.akM());
    if (localZG == null) {
      return;
    }

    localZG.ae(paramaKI.alh());
    int i = paramaKI.bcm();
    if (i == 0)
      localZG.bE(true);
    else if (i > 1) {
      localZG.hy(i);
    }

    long l3 = paramaKI.bcn();
    if (l3 != -1L) {
      localZG.cv(l3);
    }

    long l4 = paramaKI.bco();
    if (l4 != -1L) {
      localZG.cw(l4);
    }

    localdJZ.a(localZG);
  }

  private void b(aKI paramaKI) {
    long l1 = paramaKI.alu();

    long l2 = beq.fq(l1);
    cpT localcpT = ea(l2);

    if (localcpT == null) {
      return;
    }

    kk localkk = localcpT.cpe();
    if (!localkk.bfm()) {
      return;
    }
    blq localblq;
    try
    {
      localblq = localkk.bfh().gL(l1);
    } catch (IOException localIOException) {
      aWc.Re().debug("Impossible de charger le son d'id " + l1);
      return;
    }

    if (localblq == null) {
      aWc.gV().debug("Impossible de préparer le son d'id " + l1);
      return;
    }

    int i = paramaKI.bcq();
    dCo localdCo = this.ejv.og(i);
    if (localdCo == null) {
      aWc.aiN().debug("Les rollOffs n'ont pas été initialisés");
      return;
    }

    float f = paramaKI.alh();
    cbI localcbI = paramaKI.bcp();
    try
    {
      localkk.a(localblq, f, localcbI, localdCo.btj(), localdCo.btg(), localdCo.bti(), 0, 0, paramaKI.bcm() == 0, false, paramaKI.bcr(), 0.0F, paramaKI.akM());
    }
    catch (Exception localException) {
      aWc.asu().debug("Exception levée lors de la création d'une source positionnée", localException);
    }
  }

  public void bbb() {
    synchronized (this.bI) {
      int i = 0; for (int j = this.bI.size(); i < j; i++) {
        aKI localaKI = (aKI)this.bI.get(i);
        if (localaKI.bcp() == null)
          a(localaKI);
        else {
          b(localaKI);
        }
      }
      this.bI.clear();
    }
  }

  public void a(long paramLong, ZG paramZG) {
    if (paramZG != null) {
      if (paramZG.akZ()) {
        paramZG.ald();
      } else {
        paramZG.q(0.0F, 300.0F);
        paramZG.bH(true);
      }
    }
    else
      synchronized (this.bI) {
        for (int i = this.bI.size() - 1; i >= 0; i--) {
          aKI localaKI = (aKI)this.bI.get(i);
          if (localaKI.akM() == paramLong) {
            this.bI.remove(i);
            break;
          }
        }
      }
  }

  public void bbc()
  {
    if (!this.ejv.isRunning()) {
      return;
    }

    int i = 0; for (int j = this.eju.size(); i < j; i++) {
      dJZ localdJZ = ((cpT)this.eju.get(i)).cpd();
      if (localdJZ != null)
      {
        localdJZ.bbc();
      }
    }
  }

  public void G(float paramFloat1, float paramFloat2) { if (!this.ejv.isRunning()) {
      return;
    }

    int i = 0; for (int j = this.eju.size(); i < j; i++) {
      dJZ localdJZ = ((cpT)this.eju.get(i)).cpd();
      if (localdJZ != null)
      {
        localdJZ.dy(paramFloat1);
        if (paramFloat2 != -1.0F)
          localdJZ.dz(paramFloat2);
      }
    }
  }
}