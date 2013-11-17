import java.util.ArrayList;
import org.apache.log4j.Logger;

public class Hx extends biK
{
  private static final short[] bPO = new short[0];
  private static final Logger K = Logger.getLogger(Hx.class);
  private final dGK SI;
  private bhb aIb;
  private short[] bms;
  private short[] bPP;
  protected int bmt = -1;

  public Hx(dGK paramdGK) {
    this.SI = paramdGK;
  }

  public final int getFrameCount()
  {
    return 1;
  }

  public final int qg()
  {
    return this.bPP.length;
  }

  public final int qh()
  {
    return this.bPP.length;
  }

  public final void d(aYQ paramaYQ)
  {
    super.d(paramaYQ);
    int i = paramaYQ.readShort() & 0xFFFF;
    this.bPP = (i == 0 ? bPO : paramaYQ.ou(i));

    int j = paramaYQ.readShort() & 0xFFFF;
    this.bms = (j == 0 ? null : paramaYQ.ou(j));

    this.aIb = bhb.n(paramaYQ);

    if ((i == 0) && (j != 0)) {
      buF();
    }
    this.Sz = i;
  }

  public final void b(int paramInt, ArrayList paramArrayList)
  {
    if ((!bB) && (paramInt != 0)) throw new AssertionError();
    if (this.bms == null) {
      return;
    }
    aLA[] arrayOfaLA = this.SI.gSZ;
    for (int i = 0; i < this.bms.length; i++) {
      aLA localaLA = arrayOfaLA[this.bms[i]];
      localaLA.mY(paramInt);
      paramArrayList.add(localaLA);
    }
  }

  public final short[] aT(int paramInt)
  {
    if ((!bB) && (paramInt != 0)) throw new AssertionError();
    return this.bPP;
  }

  public final boolean qi()
  {
    if ((!bB) && (this.bPP.length == 1)) throw new AssertionError();
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
    this.aIb.begin(0);
    this.bmt = -1;
    return this.bPP.length;
  }

  public final short b(axM paramaxM1, axM paramaxM2)
  {
    int i = this.aIb.read();
    aPv.nv(i).a(this.aIb, this.SI, paramaxM1, paramaxM2);
    return this.bPP[this.bmt];
  }
}