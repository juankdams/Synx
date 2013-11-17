import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import com.ankamagames.baseImpl.graphics.script.MobileFunctionsLibrary;
import com.ankamagames.baseImpl.graphics.script.ParticleSystemFunctionsLibrary;
import com.ankamagames.baseImpl.graphics.script.SoundFunctionsLibrary;
import com.ankamagames.wakfu.client.core.script.InteractiveElementFunctionsLibrary;
import com.ankamagames.wakfu.client.core.script.ResourceFunctionsLibrary;
import org.apache.log4j.Logger;

public class djm extends ob
{
  private static final String lgg = "part";
  protected boolean lgh;
  protected boolean krb;
  private byte fgK = -1;
  protected boolean haI;
  protected String lgi;
  protected int aPt;
  protected int lgj;
  private static final hQ[] dFP = { ParticleSystemFunctionsLibrary.bjA(), MobileFunctionsLibrary.bbd(), SoundFunctionsLibrary.ckJ(), InteractiveElementFunctionsLibrary.yi(), ResourceFunctionsLibrary.ihG };

  public djm()
  {
    aJ();
  }

  public void a(dWu paramdWu)
  {
    super.a(paramdWu);
    this.fgK = ((byte)(paramdWu.boM() ^ 0xFFFFFFFF));
    update();
  }

  public void b(aZK paramaZK) {
    update();
  }

  public void aJ()
  {
    super.aJ();

    this.lgi = "ANMInteractiveElementPath";

    this.lgh = true;

    a(new cec(this));

    this.fgK = -1;

    this.dbT = dHZ.lSN;
  }

  public void bc()
  {
    super.bc();
    cWS.cKD().zk(this.lgj);
    this.aPt = -1;
    this.lgj = -1;

    daO.cML().a(this);
    this.lgi = "ANMInteractiveElementPath";
    deU();
    dispose();
  }

  public boolean apP()
  {
    return (super.apP()) && (vK().isUsable());
  }

  public void update()
  {
    cMb localcMb = (cMb)this.aTk;

    if (localcMb != null)
    {
      duc localduc = localcMb.sR();
      if (localduc.bOr()) {
        cYk localcYk = localduc.bOs();
        k(localcYk.getX(), localcYk.getY(), localcYk.IB());
      } else {
        k(localcMb.fa(), localcMb.fb(), localcMb.fc());
      }

      if (this.aTn == -32768) {
        this.aTn = (localcMb.cwn() ? localcMb.cEZ() : -32768);
      }
      byte b = (byte)localcMb.getState();

      if ((this.aTn == -1) && (b == 0)) {
        localObject = cof.cop().vY(800220);
        if (localObject != null) {
          ((FreeParticleSystem)localObject).f(fa(), fb(), fc());
          cWS.cKD().b((IsoParticleSystem)localObject);
        }
      }
      a(b, localcMb.ti(), localcMb.cFb(), localcMb.E());
      this.aTn = ((short)b);

      setVisible(localcMb.isVisible());
      setSelectable(localcMb.bYk());
      eZ(localcMb.boM());

      Object localObject = cWS.cKD().zj(this.lgj);
      if (localObject != null) {
        ((IsoParticleSystem)localObject).setVisible((localcMb.isVisible()) && (localcMb.isUsable()));
      }

      boolean bool = this.krb;
      this.krb = localcMb.aMB();

      if ((bool) && (!this.krb))
        daO.cML().a(this);
    }
    else {
      K.error("Cet ClientInteractiveElementView n'a pas de modèle associé.");
    }
  }

  private void eZ(byte paramByte) {
    if (this.fgK == paramByte) {
      return;
    }
    for (int i = 0; i < 8; i++) {
      byte b = 1 << i;
      boolean bool1 = (paramByte & b) == b;
      boolean bool2 = (this.fgK & b) == b;
      if (bool2 != bool1)
      {
        n("part" + i, bool1);
      }
    }
    this.fgK = paramByte;
  }

  public void bQ(int paramInt)
  {
    super.bQ(paramInt);
    String str = "";
    try {
      str = ay.bd().getString(this.lgi);
      str = String.format(str, new Object[] { Integer.valueOf(paramInt) });
      em(Integer.toString(paramInt));
      if (paramInt != 0)
        b(str, true);
    }
    catch (Exception localException) {
      K.error("impossible de récupérer le path depuis la config ", localException);
    }
  }

  public void aN(int paramInt1, int paramInt2) {
    this.aPt = paramInt1;
    if (this.aPt > 0) {
      FreeParticleSystem localFreeParticleSystem = cof.cop().vY(this.aPt);
      localFreeParticleSystem.a(this, 0.0F, paramInt2);
      cWS.cKD().b(localFreeParticleSystem);
      this.lgj = localFreeParticleSystem.getId();
    }
  }

  public boolean bYk() {
    return this.haI;
  }

  public void setSelectable(boolean paramBoolean) {
    this.haI = paramBoolean;
  }

  public hQ[] vM()
  {
    return dFP;
  }

  public void pj(String paramString) {
    this.lgi = paramString;
  }

  public String cSk() {
    if ((this.aTk != null) && ((this.aTk instanceof cMb))) {
      return ((cMb)this.aTk).cvk();
    }
    return null;
  }

  protected int hA() {
    if ((this.aTk != null) && ((this.aTk instanceof cMb))) {
      return ((cMb)this.aTk).hA();
    }
    return -1;
  }

  public void k(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if ((getWorldX() != paramFloat1) || (getWorldY() != paramFloat2) || (getAltitude() != paramFloat3))
    {
      bVl.caZ().a(getId(), (int)paramFloat1, (int)paramFloat2);
      super.k(paramFloat1, paramFloat2, paramFloat3);
    }
  }

  public int aeR()
  {
    if (this.aTk == null) {
      return super.aeR();
    }
    return ((cMb)this.aTk).aeR();
  }
}