import org.apache.log4j.Logger;

public class brT extends cMb
{
  private static final Logger K = Logger.getLogger(brT.class);
  private int RZ;
  private String dtk;
  private int fNX;
  private kb fNY;
  private boolean coU;
  private final cCH kC;

  public brT()
  {
    this.dtk = "";

    this.kC = new bfR(this, 1);
  }

  public void a(abc paramabc)
  {
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    d(paramdJO);

    if (paramdJO == dJO.lVv) {
      sM();
      byz localbyz = byv.bFN().bFO();

      gA localgA = (gA)localbyz.bGP().ye(this.RZ);
      if (localgA == null) {
        CM.LV().f(bU.fH().getString("inventory.error.lackItem"), 3);
        return false;
      }

      if (this.coU) {
        CM.LV().f(bU.fH().getString("boat.cantTravel"), 3);

        return false;
      }

      a(paramdJO);
    }
    return true;
  }

  protected cCH ak()
  {
    return this.kC;
  }

  public int gw() {
    return this.RZ;
  }

  public dJO eR()
  {
    return dJO.lVv;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVv };
  }

  public csx[] am()
  {
    csx[] arrayOfcsx = new csx[1];

    csl localcsl = (csl)aiI.dfO.avt();
    localcsl.iT(this.fNX);
    arrayOfcsx[0] = localcsl;

    return arrayOfcsx;
  }

  public short OL()
  {
    return 60;
  }

  public String getName()
  {
    return bU.fH().getString(this.dtk);
  }

  public void al()
  {
    super.al();
    String[] arrayOfString = this.fgH.split(";");
    if (arrayOfString.length != 9) {
      K.error("[LevelDesign] La controlleuse de ticket " + this.aTz + " doit avoir 3 paramètres : itemId, id translator, et id mruGfx");
      return;
    }
    this.RZ = Integer.valueOf(arrayOfString[0]).intValue();
    this.dtk = arrayOfString[1];
    this.fNX = Integer.valueOf(arrayOfString[2]).intValue();
    int i = Short.valueOf(arrayOfString[3]).shortValue();
    this.fNY = new kb(0, Integer.valueOf(arrayOfString[4]).intValue(), 0, 0);
    kb localkb = new kb(0, Integer.valueOf(arrayOfString[5]).intValue(), 0, 0);
    int j = Integer.valueOf(arrayOfString[6]).intValue();
    int k = Short.valueOf(arrayOfString[7]).shortValue();
    int m = Integer.valueOf(arrayOfString[8]).intValue();
  }

  public void bc()
  {
    super.bc();
    this.fNY = null;
  }

  public void aJ()
  {
    super.aJ();
    this.aTn = 1;
    setVisible(true);
    eu(false);
    ev(true);
    this.krb = true;
    this.haI = true;

    this.RZ = 0;
    this.dtk = "";
    this.fNX = 0;
    if ((!bB) && (this.fNY != null)) throw new AssertionError();
    this.coU = false;
  }

  public cds bAn() {
    return this.fNY;
  }

  public void setLocked(boolean paramBoolean) {
    this.coU = paramBoolean;
  }
}