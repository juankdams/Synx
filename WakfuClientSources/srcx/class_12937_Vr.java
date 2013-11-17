import org.apache.log4j.Logger;

public class Vr
{
  private static final Logger K = Logger.getLogger(Vr.class);

  public static final Vr cAl = new Vr();
  private aIJ aDa;
  private dkc cAm;
  private byte[] cAn;
  private byte[] cAo;
  private bpu cAp;
  private static boolean cAq = false;

  public boolean ai(short paramShort)
  {
    if (this.cAn == null) {
      return false;
    }
    loadLibraries();
    aj(paramShort);

    aiE();
    return true;
  }

  private void aj(short paramShort) {
    this.aDa = new aIJ(paramShort);
    this.aDa.H(this.cAn);
    this.aDa.a(this.cAo, true);
    this.cAm = b(this.aDa);
    bOh.a(paramShort, this.cAm);
  }

  public static void loadLibraries()
  {
    if (cAq) {
      return;
    }
    try
    {
      cyF.inc.load(ay.bd().getString("partitionPatchFile"));
      dks.lhB.load(ay.bd().getString("buildingFile"));
    } catch (Exception localException) {
      K.error("", localException);
    }
    cAq = true;
  }

  private void cleanUp() {
    this.aDa = null;
    this.cAp = null;
    aiE();
  }

  private void aiE() {
    this.cAn = null;
    this.cAo = null;
  }

  public void aiF() {
    cleanUp();
  }

  public void t(byte[] paramArrayOfByte) {
    this.cAn = paramArrayOfByte;
  }

  public void u(byte[] paramArrayOfByte) {
    this.cAo = paramArrayOfByte;
  }

  public void b(bpu parambpu) {
    this.cAp = parambpu;
  }

  private dkc b(aIJ paramaIJ) {
    return new dkc(paramaIJ);
  }

  public aIJ aiG() {
    return this.aDa;
  }

  public dkc aiH() {
    return this.cAm;
  }

  public boolean aiI() {
    return aiG() != null;
  }

  public bpu aiJ() {
    return this.cAp;
  }
}