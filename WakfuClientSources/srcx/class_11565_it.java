import java.util.ArrayList;

public class it extends biK
{
  private final dGK SI;
  private bhb aIb;
  private short aIc;

  public it(dGK paramdGK)
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
    this.aIb = bhb.n(paramaYQ);
    this.Sz = 1;
  }

  public final void b(int paramInt, ArrayList paramArrayList)
  {
    if ((!bB) && (paramInt != 0)) throw new AssertionError();
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