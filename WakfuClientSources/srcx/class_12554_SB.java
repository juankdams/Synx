import org.apache.log4j.Logger;

public enum SB
  implements bhh
{
  private static final int ctR = -1;
  public static final int ctS = 6;
  public static final int ctT = 0;
  private static final Logger K = Logger.getLogger(SB.class);
  private final short aSi;
  private cen ctU;

  private SB(int arg3)
  {
    int j;
    this.aSi = ((short)j);
    this.ctU = cen.hyv;
  }

  public static SB gG(int paramInt) {
    for (SB localSB : values()) {
      if (localSB.uO() == paramInt) {
        return localSB;
      }
    }
    K.warn("breed inconnue id=" + paramInt);
    return ctz;
  }

  public boolean isInitialized() {
    return this.ctU != null;
  }

  public static SB dy(String paramString) {
    String str = paramString.toUpperCase();
    for (SB localSB : values()) {
      if (localSB.toString().equals(str)) {
        return localSB;
      }
    }
    K.warn("breed inconnue " + str);
    return ctz;
  }

  public void a(cen paramcen) {
    this.ctU = paramcen;
  }

  public String toString()
  {
    return name();
  }

  public short uO() {
    return this.aSi;
  }

  public int nn() {
    return -1;
  }

  public int b(eu parameu) {
    return this.ctU.b(parameu);
  }

  public float a(ceU paramceU) {
    return this.ctU.a(paramceU);
  }

  public int afz() {
    return this.ctU.afz();
  }

  public aYV afA() {
    return this.ctU.afA();
  }

  public int[] afB() {
    return bPR.eWj;
  }

  public int[] afC() {
    return bPR.eWj;
  }

  public byte bY() {
    return 6;
  }

  public byte afD()
  {
    return 0;
  }

  public int afE() {
    return 5;
  }

  public int afF() {
    return bDh.gyf;
  }

  public aqh afG() {
    return aqh.dxG;
  }

  public aqh afH() {
    return aqh.dxF;
  }

  public int afI() {
    throw new UnsupportedOperationException("Pas de script de mort pour les perso joueurs");
  }

  public int a(int paramInt, eu parameu) {
    return this.ctU.a(paramInt, parameu);
  }

  public int afJ() {
    return this.ctU.afJ();
  }

  public arv afK() {
    return arv.dzX;
  }

  public doC afL() {
    return this.ctU.afL();
  }

  public void a(cLO paramcLO) {
    this.ctU.a(paramcLO);
  }

  public void l(dGy paramdGy) {
    this.ctU.l(paramdGy);
  }

  public boolean c(bTI parambTI) {
    return this.ctU.c(parambTI);
  }

  public String bK() {
    return Short.toString(uO());
  }

  public void a(eu parameu, int paramInt) {
    this.ctU.a(parameu, paramInt);
  }

  public short afM() {
    return this.ctU.afM();
  }
}