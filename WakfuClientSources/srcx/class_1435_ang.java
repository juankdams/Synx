import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

public abstract class ang extends vC
  implements cyG
{
  private FreeParticleSystem dqM;
  protected bye dqN;

  public void azR()
  {
    bVf localbVf = bFd();
    localbVf.a(this);

    this.dqM = cof.cop().dC(800255, 0);
    this.dqM.a(localbVf, 1.0F, 2);

    cWS.cKD().b(this.dqM);
  }

  public void adg()
  {
    bVf localbVf = bFd();
    localbVf.b(this);

    cWS.cKD().zk(this.dqM.getId());
  }

  public void b(boolean paramBoolean, dnS paramdnS) {
    this.dqM.setVisible(paramBoolean);
  }
}