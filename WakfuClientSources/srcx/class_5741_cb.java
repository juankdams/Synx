import java.util.Iterator;
import org.apache.log4j.Logger;

public abstract class cb extends aRX
{
  public static final int QS = 3;
  public static final int QT = -1;
  public static final int QU = 2;
  public static final short QV = 9;
  protected final dsl QW = new dsl();
  private boolean QX;
  private final cub QY = new cub();
  private int QZ;

  public cb(long paramLong1, String paramString, long paramLong2, cCB paramcCB, bwt parambwt, apG paramapG)
  {
    super(paramLong1, paramString, paramLong2, paramcCB, parambwt, paramapG);
    U(408);
  }

  public dsl fO() {
    return this.QW;
  }

  public cub fP() {
    return this.QY;
  }

  public int fQ() {
    return this.QZ;
  }

  public void U(int paramInt) {
    this.QZ = (paramInt <= 0 ? 408 : paramInt);
    fR();
  }

  public boolean a(cMH paramcMH)
  {
    super.a(paramcMH);

    paramcMH.bYg = this.QW.bDx();
    paramcMH.ayx = this.QZ;

    paramcMH.ayz.clear();
    paramcMH.ayz.biO = this.QX;
    try
    {
      this.QY.b(paramcMH.ayz);
    } catch (Exception localException) {
      K.error("Erreur à la serialisation des permissions" + this, localException);
    }

    return true;
  }

  public boolean a(drq paramdrq, boolean paramBoolean)
  {
    if (!super.a(paramdrq, paramBoolean)) {
      return false;
    }

    if (paramBoolean) {
      paramdrq.ayy = new cnO();
      paramdrq.ayy.bYg = this.QW.bDx();
    } else {
      paramdrq.ayy = null;
    }

    paramdrq.ayx = this.QZ;

    paramdrq.ayz.clear();
    paramdrq.ayz.biO = this.QX;

    this.QY.b(paramdrq.ayz);

    return true;
  }

  public boolean a(drq paramdrq)
  {
    if (!super.a(paramdrq)) {
      return false;
    }

    if (paramdrq.ayy != null) {
      this.QW.BC(paramdrq.ayy.bYg);
    }

    U(paramdrq.ayx);

    this.QX = paramdrq.ayz.biO;
    return a(paramdrq.ayz);
  }

  public boolean b(cMH paramcMH)
  {
    this.QW.BC(paramcMH.bYg);
    U(paramcMH.ayx);

    super.b(paramcMH);

    this.QX = paramcMH.ayz.biO;
    try {
      a(paramcMH.ayz);
    } catch (Exception localException) {
      K.error("Exception à la dé-serialisation des permissions du Havre-sac du joueur " + this.bkK, localException);
    }
    return true;
  }

  public boolean a(bIq parambIq) {
    this.QY.c(parambIq);
    return true;
  }

  public boolean a(short paramShort1, short paramShort2)
  {
    int i;
    int j;
    dQC localdQC1;
    dQC localdQC2;
    if (((paramShort2 == 1) || (paramShort2 == 2) || (paramShort2 == 7) || (paramShort2 == 8) || (paramShort2 == 13) || (paramShort2 == 14)) && (
      (paramShort1 == 4) || (paramShort1 == 5) || (paramShort1 == 10) || (paramShort1 == 11))) {
      i = paramShort1 / 6 * 6;
      j = paramShort2 / 6 * 6;
      localdQC1 = (dQC)this.ePu.bj(i, j);
      localdQC2 = (dQC)this.ePu.bj(i + 6, j);

      if ((localdQC1 == null) || (localdQC2 == null)) {
        K.error("Problème de récupération des salles.");
        return false;
      }

      if ((localdQC1.lm(true) != null) && (localdQC2.lm(true) != null)) {
        return true;
      }
    }

    if (((paramShort1 == 1) || (paramShort1 == 2) || (paramShort1 == 7) || (paramShort1 == 8) || (paramShort1 == 13) || (paramShort1 == 14)) && (
      (paramShort2 == 4) || (paramShort2 == 5) || (paramShort2 == 10) || (paramShort2 == 11))) {
      i = paramShort1 / 6 * 6;
      j = paramShort2 / 6 * 6;
      localdQC1 = (dQC)this.ePu.bj(i, j);
      localdQC2 = (dQC)this.ePu.bj(i, j + 6);

      if ((localdQC1 == null) || (localdQC2 == null)) {
        K.error("Problème de récupération des salles.");
        return false;
      }

      if ((localdQC1.lm(true) != null) && (localdQC2.lm(true) != null)) {
        return true;
      }
    }

    return false;
  }

  protected boolean b(short paramShort1, short paramShort2)
  {
    if (a(paramShort1, paramShort2)) {
      return true;
    }
    boolean bool = false;

    dQC localdQC = (dQC)this.ePu.bj(paramShort1, paramShort2);
    if (localdQC != null) {
      short s1 = localdQC.aCK();
      short s2 = localdQC.aCL();
      short s3 = localdQC.So();
      short s4 = localdQC.bY();
      bool = (paramShort1 >= s1) && (paramShort1 < s1 + s3) && (paramShort2 >= s2) && (paramShort2 < s2 + s4) && (localdQC.lm(true) != null);
    }

    return bool;
  }

  public void a(tF paramtF)
  {
    dNg localdNg = paramtF.BV();
    if (localdNg == null) {
      K.error("Topology null !!! (ne devrait pas arriver)");
      return;
    }
    for (int i = 0; i < 18; i++) {
      for (int j = 0; j < 18; j++) {
        paramtF.a(j, i, !b((short)j, (short)i));
      }
    }

    for (aqA localaqA : this.ePu)
      for (cVo localcVo : localaqA.aCM())
        if (!localdNg.p(localcVo.fa(), localcVo.fb())) {
          K.error("Élément dans le sac dimensionnel placé au mauvais endroit " + localcVo + " (" + localcVo.fa() + ";" + localcVo.fb() + ") de type=" + localcVo.sK());
        }
        else
        {
          paramtF.a(localcVo.fa(), localcVo.fb(), localcVo.fc(), localcVo.sO());
        }
  }

  public bKk a(byte paramByte, gA paramgA, boolean paramBoolean1, boolean paramBoolean2)
  {
    aqA localaqA = this.ePu.bi(paramByte);
    if ((localaqA instanceof dQC)) {
      bKk localbKk = ((dQC)localaqA).a(paramgA, paramBoolean1, paramBoolean2);
      return localbKk;
    }
    return null;
  }

  public bKk a(byte paramByte, boolean paramBoolean1, boolean paramBoolean2) {
    aqA localaqA = this.ePu.bi(paramByte);
    if ((localaqA instanceof dQC))
      return ((dQC)localaqA).v(paramBoolean1, paramBoolean2);
    return null;
  }

  public gA a(byte paramByte, boolean paramBoolean) {
    aqA localaqA = this.ePu.bi(paramByte);
    if ((localaqA instanceof dQC))
      return ((dQC)localaqA).lm(paramBoolean);
    return null;
  }

  public bKk a(byte paramByte1, boolean paramBoolean1, byte paramByte2, boolean paramBoolean2, boolean paramBoolean3) {
    if (paramByte1 == paramByte2) {
      return bKk.gMe;
    }
    aqA localaqA1 = this.ePu.bi(paramByte1);
    aqA localaqA2 = this.ePu.bi(paramByte2);

    if ((!(localaqA1 instanceof dQC)) || (!(localaqA2 instanceof dQC))) {
      return bKk.gMe;
    }

    dQC localdQC1 = (dQC)localaqA1;
    dQC localdQC2 = (dQC)localaqA2;

    gA localgA1 = localdQC1.lm(paramBoolean1);

    if (localgA1 == null) {
      return bKk.gMe;
    }

    gA localgA2 = localdQC2.lm(paramBoolean2);
    if (localgA2 == null)
    {
      localbKk1 = localdQC1.v(paramBoolean1, false);
      if (localbKk1 != bKk.gLV) {
        return localbKk1;
      }

      localbKk2 = localdQC2.a(localgA1, paramBoolean2, false);
      if (localbKk2 != bKk.gLV) {
        return localbKk2;
      }

      if (paramBoolean3) {
        localdQC1.v(paramBoolean1, true);
        localdQC2.a(localgA1, paramBoolean2, true);
      }

      return bKk.gLV;
    }

    bKk localbKk1 = localdQC1.v(paramBoolean1, false);
    if (localbKk1 != bKk.gLV) {
      return localbKk1;
    }
    bKk localbKk2 = localdQC2.v(paramBoolean2, false);
    if (localbKk2 != bKk.gLV) {
      return localbKk2;
    }

    localbKk1 = localdQC1.a(paramBoolean1, localgA2, false);
    if (localbKk1 != bKk.gLV) {
      return localbKk1;
    }
    localbKk2 = localdQC2.a(paramBoolean2, localgA1, false);
    if (localbKk2 != bKk.gLV) {
      return localbKk2;
    }

    if (paramBoolean3) {
      localdQC1.a(paramBoolean1, localgA2, true);
      localdQC2.a(paramBoolean2, localgA1, true);
    }
    return bKk.gLV;
  }

  protected bGO h(int paramInt1, int paramInt2)
  {
    short[] arrayOfShort = new short[324];
    int i = (short)(paramInt1 * 18);
    int j = (short)(paramInt2 * 18);

    for (Object localObject = this.ePu.iterator(); ((Iterator)localObject).hasNext(); ) { aqA localaqA = (aqA)((Iterator)localObject).next();
      dQC localdQC = (dQC)localaqA;
      gA localgA = localdQC.lm(true);
      int k;
      if ((localgA != null) && (localgA.ok() == Ka.bWk.UJ()))
        k = 28;
      else {
        k = 0;
      }
      int m = localaqA.aCK();
      int n = localaqA.aCL();
      int i1 = m; for (int i2 = m + localaqA.So(); i1 < i2; i1++) {
        int i3 = n; for (int i4 = n + localaqA.bY(); i3 < i4; i3++) {
          arrayOfShort[(i1 - i + (i3 - j) * 18)] = k;
        }
      }
    }
    try
    {
      return blh.bwj().e(arrayOfShort);
    }
    catch (cbF localcbF) {
      K.error("Exception pendant l'update des types de sol du havre-sac ", localcbF);
    }return null;
  }

  public boolean isLocked()
  {
    return this.QX;
  }

  public void setLocked(boolean paramBoolean) {
    this.QX = paramBoolean;
  }

  protected abstract void fR();
}