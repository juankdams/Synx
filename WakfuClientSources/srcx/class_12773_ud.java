import java.nio.ByteBuffer;

public class ud
  implements bMG
{
  private cyS bgA;
  private int bgB;
  private float bgC;

  public long CD()
  {
    return this.bgA != null ? this.bgA.getId() : 0L;
  }

  public aCl ay(long paramLong)
  {
    if (this.bgA == null)
      return null;
    return this.bgA.ay(paramLong);
  }

  public aUJ az(long paramLong) {
    return this.bgA.az(paramLong);
  }

  public long CE() {
    return this.bgA.CE();
  }

  public int CF() {
    return this.bgB;
  }

  public adz xf() {
    if (this.bgA == null)
      return new adz();
    pQ localpQ = new pQ();
    this.bgA.C(localpQ);
    return localpQ.xf();
  }

  public cyS CG()
  {
    return this.bgA;
  }

  public String getName() {
    return this.bgA != null ? this.bgA.getName() : "";
  }

  public long CH() {
    return this.bgA != null ? this.bgA.CH() : 0L;
  }

  public short nU()
  {
    return this.bgA != null ? this.bgA.nU() : 0;
  }

  public int CI() {
    return this.bgA != null ? this.bgA.CI() : 0;
  }

  public void l(byte[] paramArrayOfByte) {
    cyS localcyS = this.bgA;

    dqB.cXD().clean();
    aOq.euI.clean();

    if (this.bgA == null)
      this.bgA = (paramArrayOfByte != null ? dPy.aR(ByteBuffer.wrap(paramArrayOfByte)) : null);
    else if (paramArrayOfByte == null)
      this.bgA = null;
    else
      dPy.a(ByteBuffer.wrap(paramArrayOfByte), this.bgA);
    String str1;
    String str2;
    String str3;
    String str4;
    az localaz;
    if (this.bgA != null) {
      aOq.euI.init();
      dqB.cXD().init();
      if ((localcyS == null) && (this.bgA.getMessage() != null) && (this.bgA.getMessage().length() > 0)) {
        dqB.cXD().cXI();
      }
      if ((byv.bFN().c(dKb.djg())) && (dqB.cXD().size() == 1)) {
        str1 = null;
        str2 = null;
        str1 = "notification.guildCreateTitle";
        str2 = bU.fH().getString("notification.guildCreateText", new Object[] { this.bgA.getName() });

        str3 = bU.fH().getString(str1);
        str4 = cda.createLink(str2, ana.dqj);
        localaz = new az(str3, str4, ana.dqj);
        cjO.clE().j(localaz);

        byv.bFN().b(dKb.djg());
      }
    } else if (localcyS != null) {
      str1 = null;
      str2 = null;

      str1 = "notification.guildQuitTitle";
      str2 = bU.fH().getString("notification.guildSelfQuitText", new Object[] { localcyS.getName() });

      str3 = bU.fH().getString(str1);
      str4 = cda.createLink(str2, ana.dqj);
      localaz = new az(str3, str4, ana.dqj);
      cjO.clE().j(localaz);
      dqB.cXD().clean();

      if (byv.bFN().c(vt.Ek())) {
        byv.bFN().b(vt.Ek());
      }
      if ((byv.bFN().c(Nj.Xh())) && ((Nj.Xh().Xi() instanceof mG)))
      {
        byv.bFN().b(Nj.Xh());
      }
    }
    dLE.doY().a(byv.bFN().bFO(), new String[] { "hasGuild" });
  }

  public void cW(int paramInt) {
    this.bgB = paramInt;
  }

  public void K(float paramFloat) {
    this.bgC = paramFloat;
  }

  public float CJ() {
    return this.bgC;
  }

  public void clear() {
    this.bgA = null;
    this.bgB = 0;
  }

  public String toString()
  {
    return "GuildLocalInformationHandler{m_guild=" + this.bgA + '}';
  }
}