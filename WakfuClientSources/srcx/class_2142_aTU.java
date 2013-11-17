import org.apache.log4j.Logger;

public class aTU extends cTU
{
  private static final Logger K = Logger.getLogger(aTU.class);
  private dIJ eUn;
  private int eUo;
  private boolean eUp;
  private cYq eUq;
  private cYq eUr;
  private final cCH kC;
  private Runnable eUs;

  public aTU()
  {
    this.kC = new dvH(this, 15);
  }

  protected cCH ak()
  {
    return this.kC;
  }

  public void bc()
  {
    super.bc();
    this.eUn = null;
    this.eUq = null;
    this.eUr = null;
    if (this.eUs != null) {
      dka.cSF().j(this.eUs);
      this.eUs = null;
    }
  }

  public void aJ() {
    super.aJ();
    this.eUo = 0;
    this.eUp = false;
    if ((!bB) && (this.eUn != null)) throw new AssertionError();
    if ((!bB) && (this.eUq != null)) throw new AssertionError();
    if ((!bB) && (this.eUr != null)) throw new AssertionError();
    if ((!bB) && (this.eUs != null)) throw new AssertionError(); 
  }

  protected void bja()
  {
    String str = "interactiveBubbleDialog" + dbI.cNt().cNu();

    this.eUn = ((dIJ)cBQ.cxL().a(str, VV.dJ("interactiveBubbleDialog2"), 256L, (short)30000));

    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setAlign(ajb.dhZ);
    this.eUn.a(localcwP);
    this.eUn.setVisible(false);
    this.eUn.setForcedDisplaySpark(false);
    this.eUn.setUseTargetPositionning(false);

    this.eUn.a(CH.bGw, new dvJ(this, str), false);

    this.eUs = new dvK(this);

    dka.cSF().b(this.eUs, 1000L);

    this.eUn.show();
  }

  public String getName()
  {
    return bU.fH().getString("ie.boatBoard.small." + this.aTz);
  }

  private String bjb() {
    dxL localdxL = dDE.dft().VN();
    kb localkb1 = localdxL.V(this.eUq);
    kb localkb2 = localdxL.V(this.eUr);

    String str1 = bU.fH().getString("boatBoard.nextArrival", new Object[] { E(this.eUq), h(localkb1) });

    String str2 = bU.fH().getString("boatBoard.nextDeparture", new Object[] { E(this.eUr), h(localkb2) });

    String str3 = bU.fH().getString(this.eUp ? "boatBoard.boatDocked" : "boatBoard.boatLeaved");
    String str4;
    String str5;
    if (this.eUp) {
      str4 = str2;
      str5 = str1;
    } else {
      str4 = str1;
      str5 = str2;
    }

    return bU.fH().getString("ie.boatBoard.large." + this.aTz, new Object[] { E(localdxL), str3, str4, str5 });
  }

  private String h(cds paramcds) {
    StringBuilder localStringBuilder = new StringBuilder("");
    if (paramcds.getHours() != 0)
      localStringBuilder.append(paramcds.getHours()).append("H");
    if (paramcds.getMinutes() != 0)
      localStringBuilder.append(paramcds.getMinutes()).append("m");
    return paramcds.getSeconds() + "s";
  }

  private String E(dxL paramdxL) {
    StringBuilder localStringBuilder = new StringBuilder("");
    if (paramdxL.getHours() != 0)
      localStringBuilder.append(paramdxL.getHours()).append("H");
    if (paramdxL.getMinutes() != 0)
      localStringBuilder.append(paramdxL.getMinutes()).append("m");
    return paramdxL.getSeconds() + "s";
  }

  public int bjc() {
    return this.eUo;
  }

  public void al()
  {
    super.al();
    String[] arrayOfString = this.fgH.split(";");
    this.eUo = Integer.valueOf(arrayOfString[1]).intValue();
  }

  public void i(cds paramcds) {
    this.eUq.n(paramcds);
  }

  public void j(cds paramcds) {
    this.eUr.n(paramcds);
  }

  public dxL bjd() {
    return this.eUq;
  }

  public dxL bje() {
    return this.eUr;
  }

  public void eb(boolean paramBoolean) {
    this.eUp = paramBoolean;
  }

  public boolean ta()
  {
    byz localbyz = byv.bFN().bFO();

    return bGP.gDx.a(new aGH[] { localbyz });
  }
}