import org.apache.log4j.Logger;

public class cYL extends bhK
{
  private static final Logger K = Logger.getLogger(cYL.class);
  private static final int kMy = 255;
  private static final int kMz = 255;
  private static final int kMA = 4;
  private static final byte kMB = 3;
  public static final int hUn = 255;
  public static final int kMC = (int)Math.ceil(81.0D);
  public static final int VERSION = 0;
  public static final int kMD = -1;
  private brS[] kME = null;

  private dsc[] kMF = null;
  private static final dsc[] kMG = new dsc[0];

  private cCc[] kMH = null;

  private cyB[] kMI = null;
  int[] kMJ;
  byte[] kMK;
  boolean cdg;

  public cYL()
  {
  }

  public cYL(short paramShort1, short paramShort2)
  {
    super(paramShort1, paramShort2);
  }

  public byte cob() {
    return 0;
  }

  public cCc[] aDf() {
    return this.kMH;
  }

  public cyB[] aDg() {
    return this.kMI;
  }

  public int[] cLZ() {
    return this.kMJ;
  }

  public int eF(int paramInt1, int paramInt2)
  {
    if (this.kMJ == null) {
      return -1;
    }
    if (this.kMK == null) {
      return this.kMJ[0];
    }
    paramInt1 -= this.aEd * 18;
    paramInt2 -= this.aEe * 18;
    if ((!bB) && ((paramInt1 < 0) || (paramInt1 >= 18))) throw new AssertionError();
    if ((!bB) && ((paramInt2 < 0) || (paramInt2 >= 18))) throw new AssertionError();
    int i = paramInt1 + paramInt2 * 18;
    int j = this.kMK[(i / 4)] >>> i % 4 * 2;
    return this.kMJ[(j & 0x3)];
  }

  public brS[] cMa() {
    return this.kME;
  }

  public dsc[] aDh() {
    return this.kMF;
  }

  public void a(cyB[] paramArrayOfcyB)
  {
    this.kMI = paramArrayOfcyB;
  }

  public void a(cCc[] paramArrayOfcCc) {
    this.kMH = paramArrayOfcCc;
  }

  public void Y(int[] paramArrayOfInt)
  {
    this.kMJ = paramArrayOfInt;
    if ((!bB) && (this.kMJ.length > 4)) throw new AssertionError("Trop d'ambiance différentes");
    if (this.kMJ.length >= 1)
      this.kMK = new byte[kMC];
  }

  public void ab(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((!bB) && ((paramInt1 < 0) || (paramInt1 >= 18))) throw new AssertionError();
    if ((!bB) && ((paramInt2 < 0) || (paramInt2 >= 18))) throw new AssertionError();
    if ((!bB) && (this.kMK == null)) throw new AssertionError("Il faut d'abord appeler setAmbiancesId");
    if ((!bB) && (paramInt3 >= this.kMJ.length)) throw new AssertionError();
    int i = paramInt1 + paramInt2 * 18;
    int tmp110_109 = (i / 4);
    byte[] tmp110_103 = this.kMK; tmp110_103[tmp110_109] = ((byte)(tmp110_103[tmp110_109] | paramInt3 << i % 4 * 2));
  }

  public void a(brS[] paramArrayOfbrS) {
    this.kME = paramArrayOfbrS;
  }

  public void a(dsc[] paramArrayOfdsc) {
    this.kMF = paramArrayOfdsc;
  }

  public void clear()
  {
    this.kMH = null;
    this.kMI = null;
    this.kMK = null;
    this.kMJ = null;
  }

  public void d(aYQ paramaYQ)
  {
    super.d(paramaYQ);

    z(paramaYQ);
    A(paramaYQ);
    B(paramaYQ);
    C(paramaYQ);
    D(paramaYQ);
  }

  public void b(dSw paramdSw)
  {
    super.b(paramdSw);

    i(paramdSw);
    j(paramdSw);
    k(paramdSw);
    h(paramdSw);
    l(paramdSw);
  }

  private void z(aYQ paramaYQ) {
    int i = paramaYQ.readByte() & 0xFF;
    if (i == 0) {
      return;
    }

    this.kMH = new cCc[i];
    for (int j = 0; j < i; j++) {
      cCc localcCc = new cCc();
      localcCc.d(paramaYQ);
      this.kMH[j] = localcCc;
    }
  }

  private void i(dSw paramdSw) {
    if (this.kMH == null) {
      paramdSw.writeByte((byte)0);
      return;
    }

    int i = this.kMH.length;
    if (i >= 255)
      throw new cJ("trop de particules sur la map (" + this.aEd + " " + this.aEe + ")");
    paramdSw.writeByte((byte)(i & 0xFF));
    for (int j = 0; j < i; j++)
      this.kMH[j].b(paramdSw);
  }

  private void A(aYQ paramaYQ)
  {
    int i = paramaYQ.readByte() & 0xFF;
    if (i == 0) {
      return;
    }

    this.kMI = new cyB[i];
    for (int j = 0; j < i; j++) {
      cyB localcyB = new cyB();
      localcyB.d(paramaYQ);
      this.kMI[j] = localcyB;
    }
  }

  private void j(dSw paramdSw) {
    if (this.kMI == null) {
      paramdSw.writeByte((byte)0);
      return;
    }

    int i = this.kMI.length;
    if (i >= 255)
      throw new cJ("trop de sons sur la map (" + this.aEd + " " + this.aEe + ")");
    paramdSw.writeByte((byte)(i & 0xFF));
    for (int j = 0; j < i; j++)
      this.kMI[j].b(paramdSw);
  }

  private void B(aYQ paramaYQ)
  {
    int i = paramaYQ.readByte() & 0xFF;
    if (i == 0) {
      this.kMK = null;
      this.kMJ = null;
      return;
    }

    this.kMJ = paramaYQ.ov(i);

    int j = paramaYQ.readByte() & 0xFF;
    if (j == 0) {
      if ((!bB) && (this.kMJ.length != 1)) throw new AssertionError();
      this.kMK = null;
      return;
    }

    if ((!bB) && (j != kMC)) throw new AssertionError();
    this.kMK = paramaYQ.ot(j);
  }

  private void k(dSw paramdSw) {
    if (this.kMJ == null) {
      if ((!bB) && (this.kMK != null)) throw new AssertionError();
      paramdSw.writeByte((byte)0);
      return;
    }

    int i = this.kMJ.length;
    if ((!bB) && (this.kMJ.length >= 4)) throw new AssertionError();
    paramdSw.writeByte((byte)(i & 0xFF));
    for (int j = 0; j < i; j++) {
      paramdSw.writeInt(this.kMJ[j]);
    }

    if (this.kMK == null) {
      if ((!bB) && (this.kMJ.length != 1)) throw new AssertionError();
      paramdSw.writeByte((byte)0);
      return;
    }

    if ((!bB) && (this.kMK.length != kMC)) throw new AssertionError();
    paramdSw.writeByte((byte)(this.kMK.length & 0xFF));
    paramdSw.writeBytes(this.kMK);
  }

  protected void C(aYQ paramaYQ)
  {
    int i = paramaYQ.readByte() & 0xFF;
    if (i == 0) {
      return;
    }

    this.kME = new brS[i];
    for (int j = 0; j < i; j++) {
      brS localbrS = new brS();
      localbrS.d(paramaYQ);
      this.kME[j] = localbrS;
    }
  }

  private void h(dSw paramdSw)
  {
    if (this.kME == null) {
      paramdSw.writeByte((byte)0);
      return;
    }

    int i = this.kME.length;
    if (i >= 255)
      throw new cJ("trop de interactivs sur la map (" + this.aEd + " " + this.aEe + ")");
    paramdSw.writeByte((byte)(i & 0xFF));
    for (int j = 0; j < i; j++)
      this.kME[j].b(paramdSw);
  }

  protected void D(aYQ paramaYQ)
  {
    int i = paramaYQ.readByte() & 0xFF;
    if (i == 0) {
      this.kMF = kMG;
      return;
    }

    this.kMF = new dsc[i];
    for (int j = 0; j < i; j++) {
      dsc localdsc = new dsc();
      localdsc.d(paramaYQ);
      this.kMF[j] = localdsc;
    }
  }

  private void l(dSw paramdSw)
  {
    if (this.kMF == null) {
      paramdSw.writeByte((byte)0);
      return;
    }

    int i = this.kMF.length;
    if (i >= 255)
      throw new cJ("trop de dynamic sur la map (" + this.aEd + " " + this.aEe + ")");
    paramdSw.writeByte((byte)(i & 0xFF));
    for (int j = 0; j < i; j++)
      this.kMF[j].b(paramdSw);
  }
}