import org.apache.log4j.Logger;
import org.lwjgl.openal.EFX10;

public class cAx
{
  private static final Logger K = Logger.getLogger(cAx.class);
  private static final int bDF = 500;
  private final bAw cLJ;
  private final int dco;
  private final int[] hEH = { 0 };
  private final float euR;
  private final float iqp;
  private final cbQ iqq = new cbQ();
  private float cLN;
  private float djC;
  private boolean bG;
  private btr iqr;

  public cAx(float paramFloat1, float paramFloat2, int paramInt, bAw parambAw, boolean paramBoolean)
  {
    this.cLJ = parambAw;
    this.dco = paramInt;

    this.bG = paramBoolean;
    this.euR = paramFloat1;
    this.iqp = paramFloat2;
    this.cLN = (this.bG ? 1.0F : paramFloat1);
    this.djC = (this.bG ? 1.0F : paramFloat2);
  }

  public void cxl()
  {
    this.hEH[0] = EFX10.alGenFilters();

    bAw.check();

    EFX10.alFilteri(this.hEH[0], 32769, 1);

    bAw.check();

    ad(this.cLN, this.djC);
  }

  public void cxm() {
    if (this.hEH[0] != 0)
    {
      bAw.check();

      EFX10.alDeleteFilters(this.hEH[0]);

      bAw.check();

      this.hEH[0] = 0;
    }
  }

  public void hR(boolean paramBoolean) {
    if (this.bG == paramBoolean) {
      return;
    }

    this.bG = paramBoolean;

    this.iqr = (this.bG ? new btr(this, 1.0F, 1.0F, 500) : new btr(this, this.euR, this.iqp, 500));
  }

  public int OV() {
    return this.dco;
  }

  public int cxn() {
    return this.hEH[0];
  }

  public void ib(long paramLong) {
    if ((this.iqr != null) && 
      (!this.iqr.gb(paramLong)))
      this.iqr = null;
  }

  private void ad(float paramFloat1, float paramFloat2)
  {
    EFX10.alFilterf(this.hEH[0], 1, paramFloat1);

    bAw.check();

    EFX10.alFilterf(this.hEH[0], 2, paramFloat2);

    bAw.check();

    for (int i = this.iqq.size() - 1; i >= 0; i--)
      ic(this.iqq.get(i));
  }

  private void ic(long paramLong)
  {
    ZG localZG = cFl.cAH().ir(paramLong);
    if (localZG != null)
      localZG.hw(this.hEH[0]);
  }

  public void id(long paramLong)
  {
    if (!this.iqq.N(paramLong)) {
      this.iqq.add(paramLong);
      ic(paramLong);
    }
  }

  public void ie(long paramLong) {
    Cu.b(this.iqq, paramLong);
    if (this.iqq.isEmpty())
      cxo();
  }

  private void cxo()
  {
    if (this.cLJ != null)
      this.cLJ.mX(this.dco);
  }
}