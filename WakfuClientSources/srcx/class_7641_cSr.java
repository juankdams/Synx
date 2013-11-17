import java.io.IOException;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cSr extends biK
{
  private static final Logger K = Logger.getLogger(cSr.class);
  bNU[] kEL;
  bNU kEM;
  final boolean kEN;
  protected int bmt = -1;

  public cSr(boolean paramBoolean)
  {
    this.kEN = paramBoolean;
  }

  public final void d(aYQ paramaYQ)
  {
    super.d(paramaYQ);
    int k;
    if (!this.kEN) {
      i = paramaYQ.readByte() & 0xFF;
      if (i != 0) {
        K.warn("Sprite Def avec des shapes");
        for (j = 0; j < i; j++) {
          aYK.m(paramaYQ);
        }
      }

      j = paramaYQ.readByte() & 0xFF;
      if (j != 0) {
        K.warn("Sprite Def avec des sprites def");
        for (k = 0; k < j; k++) {
          aYK.m(paramaYQ);
        }
      }
    }

    int i = paramaYQ.readShort() & 0xFFFF;
    this.kEL = new bNU[i];
    for (int j = 0; j < this.kEL.length; j++) {
      this.kEL[j] = new bNU();
      k = this.kEL[j].c(paramaYQ, j);

      if (k > 0) {
        try {
          bNU localbNU = bNU.a(this.kEL[j]);
          for (int n = 0; n < k; n++)
            this.kEL[(++j)] = localbNU;
        }
        catch (Exception localException) {
          throw new IOException("erreur avec la definition " + this.m_name + ". nombre de frame incorrete");
        }
      }
      int m = this.kEL[j].bVo().length;
      if (m > this.Sz) {
        this.Sz = m;
      }
    }

    if (this.kEL.length == 1) {
      aLA[] arrayOfaLA = this.kEL[0].gSZ;
      for (k = 0; k < arrayOfaLA.length; k++)
        switch (cPY.bKo[arrayOfaLA[k].en().ordinal()]) {
        case 1:
        case 2:
        case 3:
        case 4:
          buF();
          return;
        }
    }
  }

  public void b(int paramInt, ArrayList paramArrayList)
  {
    if (paramInt >= this.kEL.length)
      return;
    aLA[] arrayOfaLA = this.kEL[paramInt].gSZ;
    for (int i = 0; i < arrayOfaLA.length; i++)
      paramArrayList.add(arrayOfaLA[i]);
  }

  public short[] aT(int paramInt) {
    dMA[] arrayOfdMA = this.kEL[paramInt].gSY;
    short[] arrayOfShort = new short[arrayOfdMA.length];
    for (int i = 0; i < arrayOfdMA.length; i++) {
      arrayOfShort[i] = arrayOfdMA[i].aDx;
    }
    return arrayOfShort;
  }

  public final boolean qi() {
    return (this.kEL.length == 1) && (this.kEL[0].gSY.length == 1);
  }

  public final short qj() {
    if ((!bB) && (!qi())) throw new AssertionError();
    return this.kEL[0].gSY[0].aDx;
  }

  public final int getFrameCount() {
    return this.kEL.length;
  }

  public final void qk() {
    this.bmt += 1;
  }

  public final int aU(int paramInt) {
    this.bmt = -1;
    this.kEM = this.kEL[paramInt];
    return this.kEM.gSY.length;
  }

  public final short b(axM paramaxM1, axM paramaxM2) {
    dMA localdMA = this.kEM.gSY[this.bmt];
    localdMA.a(paramaxM1, paramaxM2);
    return localdMA.aDx;
  }

  public int qg() {
    int i = 0;
    Object localObject = null;
    for (bNU localbNU : this.kEL) {
      if ((!bB) && (localbNU == null)) throw new AssertionError();
      if (localbNU != localObject) {
        i += localbNU.bVo().length;
      }
      localObject = localbNU;
    }
    return i;
  }

  public int qh() {
    int i = 0;
    for (bNU localbNU : this.kEL) {
      if ((!bB) && (localbNU == null)) throw new AssertionError();
      i += localbNU.bVo().length;
    }
    return i;
  }
}