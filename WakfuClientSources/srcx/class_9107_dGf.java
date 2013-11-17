import java.util.EnumMap;
import java.util.Map.Entry;
import org.apache.log4j.Logger;

public abstract class dGf
  implements aRi, bhh
{
  private static final Logger K = Logger.getLogger(dGf.class);
  public static final byte lQH = 6;
  private static final cSR lQI = new cSR();
  protected final cgT lQJ;
  private final short aSi;
  private final int aDH;
  private final short cMR;
  private final short cMS;
  private cSR lQK;
  private final int[] lQL;
  private final int[] lQM;
  private final short lQN;
  private final short cNS;
  private final byte lQO;
  private final short[] cNW;
  private final int cOl;
  private final aqh lQP;
  private final aqh lQQ;
  private final int lQR;
  private final int lQS;
  private int cOh = 1;
  private int[] lQT;
  private int cOj;

  protected dGf(short paramShort1, int paramInt1, short paramShort2, short paramShort3, EnumMap paramEnumMap, int[] paramArrayOfInt1, int[] paramArrayOfInt2, short[] paramArrayOfShort, short paramShort4, short paramShort5, byte paramByte, int paramInt2, aqh paramaqh1, aqh paramaqh2, int paramInt3, int paramInt4, bwA parambwA)
  {
    this.aSi = paramShort1;
    this.aDH = paramInt1;

    this.cMR = paramShort2;
    this.cMS = paramShort3;

    this.lQN = paramShort4;
    this.cNS = paramShort5;
    this.lQO = paramByte;

    this.lQJ = new cgT(this.cMR);

    for (Map.Entry localEntry : paramEnumMap.entrySet()) {
      Cs localCs = (Cs)localEntry.getValue();
      this.lQJ.a((eu)localEntry.getKey(), ((Integer)localCs.getFirst()).intValue(), ((Float)localCs.Lp()).floatValue());
    }

    this.lQM = paramArrayOfInt1;
    this.lQL = paramArrayOfInt2;

    if (paramArrayOfShort.length % 3 == 0) {
      this.cNW = paramArrayOfShort;
    } else {
      K.error("INITIALISATION ERROR : the natural states array is not well built (%3 != 0 : all entries are not a stateId/level pair) sur la breed " + paramShort1);
      this.cNW = null;
    }

    this.cOl = paramInt2;

    this.lQP = paramaqh1;
    this.lQQ = paramaqh2;
    this.lQR = paramInt3;
    this.lQS = paramInt4;
  }

  public int b(eu parameu) {
    return this.lQJ.h(parameu);
  }

  public int afz() {
    return this.lQJ.h(eu.ayX);
  }

  public aYV afA() {
    return null;
  }

  public float a(ceU paramceU)
  {
    return 1.0F;
  }

  public byte bY() {
    return 6;
  }

  public int a(int paramInt, eu parameu) {
    return this.lQJ.c(parameu, paramInt);
  }

  public void a(bGZ parambGZ) {
    if (this.lQK == null)
      this.lQK = new cSR();
    this.lQK.put(parambGZ.getId(), parambGZ);
  }

  public bGZ vV(int paramInt)
  {
    return this.lQK == null ? null : (bGZ)this.lQK.get(paramInt);
  }

  public dmn dhl() {
    return this.lQK == null ? lQI.yF() : this.lQK.yF();
  }

  public int[] dhm() {
    return this.lQK == null ? aUP.eWj : this.lQK.qe();
  }

  public int[] afB() {
    return this.lQM;
  }

  public int[] afC() {
    return this.lQL;
  }

  public boolean b(cfY paramcfY) {
    for (int k : this.lQM)
      if (k == paramcfY.bJ())
        return true;
    return false;
  }

  public short uO() {
    return this.aSi;
  }

  public int nn() {
    return this.aDH;
  }

  public short alN() {
    return this.cMS;
  }

  public short alM() {
    return this.cMR;
  }

  public short[] amY() {
    return this.cNW;
  }

  public short amU() {
    return this.cNS;
  }

  public short bFB() {
    return this.lQN;
  }

  public byte afD() {
    return this.lQO;
  }

  public cgT dhn() {
    return this.lQJ;
  }

  public int afI() {
    return this.cOl;
  }

  public int afE() {
    return this.lQR;
  }

  public int afF() {
    return this.lQS;
  }

  public aqh afG() {
    return this.lQP;
  }

  public aqh afH() {
    return this.lQQ;
  }

  public int anj() {
    return this.cOh;
  }

  protected void oW(int paramInt) {
    this.cOh = paramInt;
  }

  public int[] dho() {
    return this.lQT;
  }

  public void ab(int[] paramArrayOfInt) {
    this.lQT = paramArrayOfInt;
  }

  public int afJ() {
    return this.cOj;
  }

  public void CE(int paramInt) {
    this.cOj = paramInt;
  }

  public String toString() {
    return "AbstractMonsterBreed{m_breedId=" + this.aSi + ", m_familyId=" + this.aDH + "} ";
  }
}