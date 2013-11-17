import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bzZ
  implements agk, aqg
{
  private static final Logger K = Logger.getLogger(bzZ.class);
  public static final bzZ goz = new bzZ();

  private static dPx goA = new dPx();

  private bWV goB = new bWV(0.0F, 0.0F, 0.0F);
  private aWz goC;
  private float goD;
  private float goE;
  private float goF;
  private boolean goG;
  private float bOZ;
  private float bPa;
  private float bPb;
  private int goH;
  private float goI;
  private boolean eaB = false;

  public void dm(boolean paramBoolean) {
    this.eaB = paramBoolean;
  }

  public void a(aWz paramaWz) {
    this.goC = paramaWz;
  }

  public void rP(int paramInt) {
    this.goH = paramInt;
  }

  public void a(aQm paramaQm, aKS paramaKS) {
    switch (cwq.bSf[paramaQm.ordinal()]) {
    case 1:
      e(paramaKS);
    }
  }

  public void bIx()
  {
    this.goD = (this.bOZ = 1.0F);
    this.goE = (this.bPa = 1.0F);
    this.goF = (this.bPb = 1.0F);

    this.goB.m(1.0F, 1.0F, 1.0F);
  }

  public int getPriority() {
    return 0;
  }

  public boolean wS() {
    return (byn.S(this.bOZ, 1.0F)) && (byn.S(this.bPa, 1.0F)) && (byn.S(this.bPb, 1.0F));
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat)
  {
    paramArrayOfFloat[0] *= this.bOZ;
    paramArrayOfFloat[1] *= this.bPa;
    paramArrayOfFloat[2] *= this.bPb;
  }

  public void update(int paramInt) {
    this.goB.update(paramInt);

    this.bOZ = this.goB.QC();
    this.bPa = this.goB.QD();
    this.bPb = this.goB.QE();

    if (this.goG) {
      this.goB.c(this.goD, this.goE, this.goF, 1000);
      this.goG = false;
    }

    float f = bIy();
    btL.gcv.bv(f);
  }

  private float bIy()
  {
    if (!this.eaB) {
      return 1.0F;
    }

    float f1 = 0.3705F;
    float f2 = 2.318223F;
    return 2.318223F * bIz() * bIz() + 1.0F - 2.318223F;
  }

  public float bIz() {
    return this.bOZ * 0.212671F + this.bPa * 0.71516F + this.bPb * 0.072169F;
  }

  public void jv(String paramString)
  {
    bpA localbpA = bpA.byM();
    bwZ localbwZ = localbpA.byN();

    localbpA.iy(paramString);
    localbpA.a(localbwZ, new cdJ[0]);
    localbpA.close();

    ArrayList localArrayList1 = localbwZ.bEx().c("season");
    if (localArrayList1 == null) {
      K.error("Unable to find a season node");
      return;
    }

    int i = localArrayList1.size();
    for (int j = 0; j < i; j++) {
      K localK1 = (K)localArrayList1.get(j);
      byte b1 = localK1.e("id").af();
      ArrayList localArrayList2 = localK1.c("hour");
      if (localArrayList2 == null) {
        K.error("Unable to find hour node");
        return;
      }

      int k = localArrayList2.size();
      for (int m = 0; m < k; m++) {
        K localK2 = (K)localArrayList2.get(m);
        byte b2 = localK2.e("dayPercentage").af();
        float f1 = localK2.e("red").getIntValue() / 255.0F;
        float f2 = localK2.e("green").getIntValue() / 255.0F;
        float f3 = localK2.e("blue").getIntValue() / 255.0F;
        a(b1, b2, f1, f2, f3);
      }
    }
  }

  private static void a(byte paramByte1, byte paramByte2, float paramFloat1, float paramFloat2, float paramFloat3) {
    djQ localdjQ = (djQ)goA.bf(paramByte1);

    if (localdjQ == null) {
      localdjQ = new djQ();
      goA.c(paramByte1, localdjQ);
    }

    localdjQ.a(paramByte2, paramFloat1, paramFloat2, paramFloat3);
  }

  private float c(aKS paramaKS) {
    if (this.goC == null) {
      return paramaKS.bcv();
    }
    return this.goC.b(paramaKS);
  }

  public void d(aKS paramaKS) {
    e(paramaKS);
    this.goB.m(this.goD, this.goE, this.goF);
  }

  public void e(aKS paramaKS)
  {
    if (!paramaKS.isSynchronized()) {
      return;
    }

    dxL localdxL = paramaKS.VN();
    if ((localdxL == null) || (localdxL.avJ())) {
      K.error("Pas de date définie dans le calendar");
      return;
    }

    clK localclK = paramaKS.abK();
    if (localclK == null) {
      K.error("Pas de saison définie dans le calendar");
      return;
    }
    djQ localdjQ = (djQ)goA.bf(localclK.VH());

    if (localdjQ == null) {
      K.error("Saison " + localclK + " inconnu du DayLightDefinitionManager");
      return;
    }

    float f1 = c(paramaKS);
    this.goI = f1;

    dmV localdmV1 = localdjQ.Ar((int)f1);
    dmV localdmV2 = localdjQ.a(localdmV1);
    int i = localdmV1.cUq();
    int j = localdmV2.cUq();

    if (f1 < i) {
      f1 += 100.0F;
    }
    if (f1 > j) {
      j += 100;
    }

    float f2 = (f1 - i) / (j - i);

    if (this.eaB) {
      this.goD = bCO.s(localdmV1.QC(), localdmV2.QC(), f2);
      this.goE = bCO.s(localdmV1.QD(), localdmV2.QD(), f2);
      this.goF = bCO.s(localdmV1.QE(), localdmV2.QE(), f2);
      this.goG = true;
    } else {
      this.goD = (this.goE = this.goF = 1.0F);
      this.goG = true;
      this.goB.m(0.0F, 0.0F, 0.0F);
    }
  }
}