import java.util.ArrayList;
import org.apache.log4j.Logger;

public class wx extends biK
{
  private static final Logger K = Logger.getLogger(wx.class);
  private final dGK SI;
  private int[] bmq;
  private bhb aIb;
  private short[] bmr;
  private short[] bms;
  protected int bmt = -1;

  public wx(dGK paramdGK) {
    this.SI = paramdGK;
  }

  public final int getFrameCount()
  {
    return this.bmq.length / (this.bms == null ? 2 : 3);
  }

  public int qg()
  {
    int i = 0;
    for (int j = 0; j < this.bmr.length; j++) {
      i += this.bmr[j];
      j += this.bmr[j];
    }
    return i;
  }

  public int qh()
  {
    return 0;
  }

  public void d(aYQ paramaYQ)
  {
    super.d(paramaYQ);
    int i = paramaYQ.readShort() & 0xFFFF;
    this.bmq = paramaYQ.ov(i);

    i = paramaYQ.readShort() & 0xFFFF;
    this.bmr = paramaYQ.ou(i);

    i = paramaYQ.readShort() & 0xFFFF;
    this.bms = (i == 0 ? null : paramaYQ.ou(i));

    this.aIb = bhb.n(paramaYQ);
    for (int j = 0; j < this.bmr.length; j++) {
      if (this.bmr[j] > this.Sz)
        this.Sz = this.bmr[j];
      j += this.bmr[j];
    }
  }

  public void b(int paramInt, ArrayList paramArrayList)
  {
    if (this.bms == null) {
      return;
    }
    int i = this.bmq[(paramInt * 3 + 2)];
    int j = this.bms[i];
    if (j == 0)
      return;
    aLA[] arrayOfaLA = this.SI.gSZ;
    i++;
    int k = i + j;
    for (int m = i; m < k; m++) {
      aLA localaLA = arrayOfaLA[this.bms[m]];
      localaLA.mY(paramInt);
      paramArrayList.add(localaLA);
    }
  }

  public short[] aT(int paramInt)
  {
    int i = this.bmq[(paramInt * 2 + 1)];
    short[] arrayOfShort = new short[this.bmr[i]];
    int j = i + 1;
    for (int k = 0; k < arrayOfShort.length; k++) {
      arrayOfShort[k] = this.bmr[(j + k)];
    }
    return arrayOfShort;
  }

  public final boolean qi()
  {
    return false;
  }

  public final short qj()
  {
    throw new UnsupportedOperationException("devrait etre du type AnmSpriteDefinitionSingle");
  }

  public final void qk()
  {
    this.bmt += 1;
  }

  public final int aU(int paramInt)
  {
    int i = paramInt * (this.bms == null ? 2 : 3);
    this.aIb.begin(this.bmq[i]);
    this.bmt = this.bmq[(i + 1)];
    return this.bmr[this.bmt];
  }

  public final short b(axM paramaxM1, axM paramaxM2)
  {
    int i = this.aIb.read();
    aPv.nv(i).a(this.aIb, this.SI, paramaxM1, paramaxM2);
    return this.bmr[this.bmt];
  }
}