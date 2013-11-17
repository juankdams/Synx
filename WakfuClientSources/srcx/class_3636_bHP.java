import java.util.ArrayList;

public class bHP extends biK
{
  private final dGK SI;
  private bhb aIb;
  private short[] bms;
  private short aIc;

  public bHP(dGK paramdGK)
  {
    this.SI = paramdGK;
  }

  public final int getFrameCount()
  {
    return 1;
  }

  public final int qg()
  {
    return 1;
  }

  public final int qh()
  {
    return 1;
  }

  public final void d(aYQ paramaYQ)
  {
    super.d(paramaYQ);
    this.aIc = paramaYQ.readShort();
    int i = paramaYQ.readShort() & 0xFFFF;
    this.bms = paramaYQ.ou(i);

    this.aIb = bhb.n(paramaYQ);
    this.Sz = 1;
  }

  public final void b(int paramInt, ArrayList paramArrayList)
  {
    if (this.bms == null) {
      return;
    }
    if ((!bB) && (paramInt != 0)) throw new AssertionError();
    aLA[] arrayOfaLA = this.SI.gSZ;
    for (int i = 0; i < this.bms.length; i++) {
      aLA localaLA = arrayOfaLA[this.bms[i]];
      localaLA.mY(paramInt);
      paramArrayList.add(localaLA);
    }
  }

  public final short[] aT(int paramInt)
  {
    return new short[] { this.aIc };
  }

  public final boolean qi()
  {
    return true;
  }

  public final short qj()
  {
    return this.aIc;
  }

  public final void qk()
  {
  }

  public final int aU(int paramInt)
  {
    this.aIb.begin(0);
    return 1;
  }

  public final short b(axM paramaxM1, axM paramaxM2)
  {
    int i = this.aIb.read();
    aPv.nv(i).a(this.aIb, this.SI, paramaxM1, paramaxM2);
    return this.aIc;
  }
}