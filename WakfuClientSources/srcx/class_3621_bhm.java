import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.util.List;

public final class bhm
  implements Zj
{
  private final int bdj;
  private final adz fvY = new adz();
  private final bKR fvZ = new bKR();

  public bhm(int paramInt) {
    this.bdj = paramInt;
  }

  public void a(azw paramazw) {
    btM();
    List localList1 = paramazw.Hn();
    for (List localList2 : localList1)
      if (localList2.size() >= 3)
      {
        x(localList2);
      }
  }

  private void x(List paramList) {
    for (awr localawr : paramList) {
      int i = localawr.fa();
      int j = localawr.fb();
      cm(i, j);
    }
  }

  private void cm(int paramInt1, int paramInt2) {
    cn(paramInt1, paramInt2);
    cn(paramInt1 + 1, paramInt2);
    cn(paramInt1, paramInt2 + 1);
    cn(paramInt1 + 1, paramInt2 + 1);
    cn(paramInt1 - 1, paramInt2);
    cn(paramInt1, paramInt2 - 1);
    cn(paramInt1 - 1, paramInt2 - 1);
    cn(paramInt1 - 1, paramInt2 + 1);
    cn(paramInt1 + 1, paramInt2 - 1);
  }

  private void cn(int paramInt1, int paramInt2) {
    long l = bCO.cM(paramInt1, paramInt2);
    if (this.fvZ.N(l)) {
      return;
    }
    ckT localckT = cjS.clP().vz(this.bdj);
    if (localckT == null) {
      return;
    }
    int i = localckT.LB().aw(paramInt1, paramInt2);

    FreeParticleSystem localFreeParticleSystem = cof.cop().vY(1013002);
    localFreeParticleSystem.k(paramInt1, paramInt2, i);
    localFreeParticleSystem.cS(this.bdj);
    this.fvY.hL(localFreeParticleSystem.getId());
    this.fvZ.add(l);
    cWS.cKD().b(localFreeParticleSystem);
  }

  public void btM() {
    kr localkr = this.fvY.apz();
    while (localkr.hasNext()) {
      int i = localkr.next();
      cWS.cKD().A(i, true);
    }
    this.fvY.clear();
    this.fvZ.clear();
  }
}