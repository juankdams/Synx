import java.util.ArrayList;
import java.util.Comparator;
import org.apache.log4j.Logger;

public class azX extends dCb
  implements bWU, dgG
{
  private static final Comparator dSg = new bEK();

  private static final aNA dSh = new bEM();

  public static boolean dSi = true;

  private static final aee dSj = new bOO(new bEP());
  protected dxy dSk;
  private String kd;
  private byte dSl = 0;
  protected boolean bQF;
  protected boolean dSm = false;

  private boolean aTf = false;
  private boolean dSn;
  private float dSo = 1.0F;
  private bGL dSp;

  public static azX a(int paramInt1, int paramInt2, short paramShort, int paramInt3, byte paramByte, boolean paramBoolean1, boolean paramBoolean2)
  {
    azX localazX;
    try
    {
      localazX = (azX)dSj.Mm();
    } catch (Exception localException) {
      K.error("Erreur lors de l'extraction d'une resource du pool", localException);
      localazX = new azX();
    }

    if (!localazX.b(paramInt1, paramInt2, paramShort, paramInt3, paramByte, paramBoolean1, paramBoolean2)) {
      return null;
    }

    return localazX;
  }

  protected boolean b(int paramInt1, int paramInt2, short paramShort, int paramInt3, byte paramByte, boolean paramBoolean1, boolean paramBoolean2) {
    long l = bCO.cM(paramInt1, paramInt2);
    a(l);
    this.dcl = paramInt1;
    this.dcm = paramInt2;
    this.cQv = (paramShort - 1);
    this.bQF = paramBoolean2;
    this.dSm = false;

    this.dSk = ((dxy)fj.mh().hH(paramInt3));
    if (this.dSk == null) {
      K.error("Error reference inexistante pour la ressource d'ID " + paramInt3);
      return false;
    }

    es(iM.qM().a((byte)1, paramByte));
    i(paramByte, paramBoolean1);
    id(dLw.mbf.asR());
    bdB.b(this);
    return true;
  }

  protected azX() {
    super(0L, 0.0F, 0.0F);

    a(new bEO(this));
  }

  public String l(azX paramazX)
  {
    if (!paramazX.aLM()) {
      return null;
    }

    bcz localbcz = bcz.bH(paramazX.aLV().bqt());
    if (localbcz == null) {
      return null;
    }

    if (!localbcz.bqI()) {
      return null;
    }

    cIB localcIB = sS.Al().Aq().abJ();
    if (localcIB == null) {
      return null;
    }
    float f = localcIB.aIQ();
    dxy localdxy = paramazX.aLV();
    String str = dUS.a(f, localdxy.bqx(), localdxy.Bu(), localdxy.Bv(), localdxy.bqy()).name();

    return ay.bd().a("temperatureInfluenceIconUrl", "defaultIconPath", new Object[] { str });
  }

  private void aLK() {
    if (this.dSp != null) {
      btL.gcv.cA(this.dSp.getId(), 500);
      this.dSp = null;
    }
  }

  private void aLL() {
    aLK();

    cRm localcRm = (cRm)this.dSk.cE(this.dSl);

    if (!localcRm.cHP()) {
      return;
    }

    this.dSp = ((bGL)bSj.hcO.y());
    this.dSp.b(this);

    float[] arrayOfFloat = localcRm.cHN();
    this.dSp.p(0.0F, 0.0F, 0.0F);
    this.dSp.q(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2]);
    this.dSp.o(0.0F, 0.0F, 0.2F);
    this.dSp.aG(localcRm.cHO());
    this.dSp.fw(false);
    btL.gcv.a(this.dSp);
  }

  public boolean aLM()
  {
    byz localbyz = byv.bFN().bFO();
    cRm localcRm = (cRm)this.dSk.cE(this.dSl);

    int i = 0; for (int j = localcRm.coe(); i < j; i++) {
      bKi localbKi = (bKi)localcRm.vW(i);
      if (localbKi.axX() == 0) {
        return true;
      }
      if (localbyz.aTn().contains(localbKi.axX())) {
        return true;
      }
    }
    return false;
  }

  private boolean aeH() {
    if (aLR() == 16) {
      return false;
    }

    return this.dSk.isBlocking();
  }

  public void aJ() {
    this.dSl = 0;
    this.dSk = null;
    this.bQF = false;
    this.aTf = false;
    setVisible(false);
    a(dSh);
    c(CG.bFG);
  }

  public void bc() {
    if (this.dSn) {
      aOf.eup.h(this);
      this.dSn = false;
    }

    aLK();

    dispose();
    this.dSl = 0;
    this.dSk = null;
    this.dSm = false;

    daO.cML().a(this);
  }

  public boolean a(aLA paramaLA)
  {
    if (paramaLA.en() == cuh.ies) {
      this.kd = iM.qM().a((byte)4, this.dSl);
      eq(this.kd);
      return true;
    }
    return false;
  }

  public void t(ArrayList paramArrayList)
  {
    for (aLA localaLA : paramArrayList)
      if (localaLA.en() == cuh.iet)
      {
        this.aTf = (!this.bQF);
        if (this.bQF) {
          setVisible(false);
        }

      }
      else if (localaLA.en() == cuh.ieu) {
        h(this.dSl, false);
      } else {
        localaLA.a(this);
      }
  }

  public boolean vL()
  {
    return this.aTf;
  }

  public csx[] aLN() {
    if (!aLO()) {
      return csx.icw;
    }
    if (byv.bFN().bFO().c(dKm.lXV)) {
      return csx.icw;
    }
    Ej localEj = new Ej(dSg);

    cRm localcRm = (cRm)this.dSk.cE(this.dSl);

    int i = 0; for (int j = localcRm.coe(); i < j; i++) {
      bKi localbKi = (bKi)localcRm.vW(i);
      localEj.add(new bxP(this, localbKi));
    }
    return (csx[])localEj.toArray(new csx[localEj.size()]);
  }

  private boolean aLO() {
    return this.dSk.fD(this.dSl);
  }

  public bKi lq(int paramInt) {
    return (bKi)((cRm)this.dSk.cE(this.dSl)).vV(paramInt);
  }

  protected void f(int[] paramArrayOfInt, int paramInt)
  {
    long l1 = System.nanoTime();
    try {
      String str = this.dSk.af((int)this.dcl, (int)this.dcm, paramInt);
      if (str != null) {
        b(str, true);
        em(str);
        this.dSm = true;
      }
    }
    catch (Exception localException)
    {
      long l2;
      K.error("Erreur de création de ressource ", localException);
    }
    finally
    {
      long l3;
      long l4 = System.nanoTime();
      int tmp116_115 = 0;
      int[] tmp116_114 = paramArrayOfInt; tmp116_114[tmp116_115] = ((int)(tmp116_114[tmp116_115] - (l4 - l1) / 1000000L));
    }
  }

  public void release() {
    if (dSj != null)
      try {
        dSj.y(this);
      } catch (Exception localException) {
        K.error("Erreur lors du retour d'une resource au pool", localException);
      }
    else
      bc();
  }

  private void h(byte paramByte, boolean paramBoolean)
  {
    if (paramByte == 16) {
      return;
    }

    setVisible(true);

    if (paramByte == 0) {
      daO.cML().a(this);
      this.kd = iM.qM().a((byte)0, this.dSl);
    } else if (paramByte < this.dSl)
    {
      if (this.dSl == 16) {
        if (paramBoolean) {
          this.kd = iM.qM().a((byte)1, paramByte);
        } else {
          this.kd = iM.qM().a((byte)2, paramByte);
          es(this.kd);
        }
      }
      else {
        this.kd = iM.qM().a((byte)3, this.dSl, paramByte);
        es(iM.qM().a((byte)2, paramByte));
      }
    }
    else if (paramBoolean) {
      this.kd = iM.qM().a((byte)1, paramByte);
    } else {
      this.kd = iM.qM().a((byte)2, paramByte);
      es(this.kd);
    }

    eq(this.kd);
  }

  public void i(byte paramByte, boolean paramBoolean)
  {
    h(paramByte, paramBoolean);
    this.dSl = paramByte;

    aLP();
    aLQ();
  }

  public void aLP() {
    tF localtF = cwO.dV((short)fa(), (short)fb());
    if (localtF != null)
      localtF.a(fa(), fb(), aeH());
    else
      K.warn("mise à jour de l'état d'une ressource en (" + fa() + ", " + fb() + ") alors que la map est inconnue/pas chargée\t");
  }

  public boolean a(adG paramadG, int paramInt, int[] paramArrayOfInt)
  {
    if (!this.dSm) {
      if (paramArrayOfInt[0] <= 0) {
        return false;
      }
      f(paramArrayOfInt, bOh.D());
    }

    return super.b(paramadG, paramInt);
  }

  public void b(String paramString, boolean paramBoolean)
  {
    super.b(paramString, paramBoolean);

    aLQ();
  }

  private void aLQ() {
    aLL();

    if ((this.dSl == 0) || (this.dSl == 16)) {
      return;
    }
    cSO localcSO = ((cRm)this.dSk.cE(this.dSl)).cHM();
    if (localcSO == null) {
      K.warn("resource sans resourceSizeCategory " + aLT() + " m_evolutionStep=" + this.dSl);
      return;
    }

    ax((short)(localcSO.getHeight() / 10));

    ce(localcSO.bZ());

    if (localcSO.cIH()) {
      if (!this.dSn) {
        aOf.eup.k(this);
        this.dSn = true;
      }
    }
    else if (this.dSn) {
      aOf.eup.h(this);
      this.dSn = false;
    }

    if (cSO.b(localcSO))
      id(dLw.mbf.asR());
    else
      id(dLw.mbn.asR());
  }

  public byte aLR()
  {
    return this.dSl;
  }

  public boolean Ry() {
    return this.bQF;
  }

  public void db(boolean paramBoolean) {
    this.bQF = paramBoolean;
  }

  public boolean aLS() {
    return (this.dSl != 0) && (this.dSl != 16);
  }

  public short BC()
  {
    if (this.dSk != null) {
      return this.dSk.BC();
    }
    return super.BC();
  }

  private String aLT() {
    if (aLN().length == 0) {
      return "";
    }

    StringBuilder localStringBuilder = new StringBuilder();

    boolean bool = asQ();

    if (bool) {
      localStringBuilder.append("[").append(getId()).append("] ");
    }

    localStringBuilder.append(this.dSk.dcv());

    if (bool) {
      localStringBuilder.append(" [").append(fa()).append(", ").append(fb()).append(", ").append(fc()).append("]");
      if (this.bQF) {
        localStringBuilder.append(" (autoRespawn)");
      }
    }

    return localStringBuilder.toString();
  }

  public int fd()
  {
    return 0;
  }

  public bNa ff()
  {
    return bNa.gRA;
  }

  public String fe()
  {
    return aLT();
  }

  public cSO aLU() {
    cRm localcRm = (cRm)this.dSk.cE(this.dSl);
    return localcRm.cHM();
  }

  public dxy aLV() {
    return this.dSk;
  }

  public String atp()
  {
    return iM.qM().a((byte)2, aLR());
  }

  public void aJ(float paramFloat) {
    this.dSo = paramFloat;
  }

  public void d(float[] paramArrayOfFloat)
  {
    paramArrayOfFloat[0] *= this.dSo;
    paramArrayOfFloat[1] *= this.dSo;
    paramArrayOfFloat[2] *= this.dSo;
    super.d(paramArrayOfFloat);
  }

  public boolean apP()
  {
    return (aLN().length > 0) && (super.apP());
  }

  public cYk ML() {
    return this.dcn;
  }

  public int nn() {
    return this.dSk.bqt();
  }

  public short Lk() {
    throw new UnsupportedOperationException("On ne devrait pas faire appel à getInstanceId dans le client");
  }
}