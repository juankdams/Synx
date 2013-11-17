import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

public class bDQ
  implements bX, dUd
{
  private static final int gzi = 3000;
  private final Su gzj;
  private FreeParticleSystem dqM = null;

  private final cSi gzk = new cSi();
  private int m_index;

  bDQ(Su paramSu)
  {
    this.gzj = paramSu;
    cAo.cxf().a(this, 3000L, -1);
  }

  void b(bDQ parambDQ) {
    bMC();

    if (parambDQ.dqM != null)
      cQ(parambDQ.dqM.hEY, parambDQ.gzj.aeR());
  }

  void adq()
  {
    bME();

    if (this.gzj.aeQ() == null)
      this.gzj.aem();
  }

  void bMC() {
    if (this.dqM == null) {
      return;
    }
    if (this.gzj.aeF()) {
      this.gzj.aeL().b(this);
    }
    cWS.cKD().zk(this.dqM.getId());

    this.dqM = null;
  }

  private void sw(int paramInt) {
    int i = this.gzj.aeR();
    cQ(paramInt, i);
  }

  private void cQ(int paramInt1, int paramInt2) {
    if (this.dqM != null) {
      throw new UnsupportedOperationException("Tentative d'ajout de particule d'apparence sans avoir dés-appliqué l'ancienne");
    }
    cew localcew = this.gzj.aeL();

    this.dqM = cof.cop().dC(paramInt1, 0);
    this.dqM.a(localcew, 1.0F, 2);
    this.dqM.cS(paramInt2);

    cWS.cKD().b(this.dqM);
    localcew.a(this);
  }

  public boolean a(cWG paramcWG) {
    bMF();
    bMD();
    return false;
  }

  private void bMD() {
    int i = bMG();
    if ((this.dqM != null) && (this.dqM.ciY() != i)) {
      bMC();
    }
    if (i == -1) {
      return;
    }
    if (this.dqM == null)
      sw(i);
  }

  private void bME() {
    int i = bMG();

    this.gzk.clear();

    if (this.gzj.aeQ() == null) {
      byz localbyz = byv.bFN().bFO();
      if (localbyz != null) {
        localObject = localbyz.bHj();
        if ((((Jl)localObject).Td()) && 
          (((Jl)localObject).Ta().N(this.gzj.getId()))) {
          this.gzk.add(800255);
        }
      }
      Object localObject = this.gzj.cJf();
      Yp localYp = ((cvY)localObject).HK();
      int j = fs.a(localYp);
      if (j != -1) {
        this.gzk.add(j);
      }
      int k = (((cvY)localObject).HL()) && (!this.gzj.isDead()) ? 1 : 0;
      if (k != 0) {
        this.gzk.add(800114);
      }
    }
    this.m_index = this.gzk.indexOf(i);
  }

  private void bMF() {
    if (this.gzk.isEmpty()) {
      this.m_index = -1;
      return;
    }

    this.m_index = ((this.m_index + 1) % this.gzk.size());
  }

  private int bMG() {
    if ((this.m_index >= 0) && (this.m_index < this.gzk.size())) {
      return this.gzk.get(this.m_index);
    }
    return -1;
  }

  public long getId() {
    return 1L;
  }

  public void a(long paramLong)
  {
  }

  public void b(boolean paramBoolean, dnS paramdnS)
  {
    this.dqM.setVisible(paramBoolean);
  }

  public void clean() {
    bMC();
    cAo.cxf().b(this);
  }
}