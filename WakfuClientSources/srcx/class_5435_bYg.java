import java.util.Arrays;

public class bYg extends bXI
{
  public final float[] bRQ;
  public final int m_index;

  public bYg(doA paramdoA, float[] paramArrayOfFloat, int paramInt)
  {
    super((dpI)paramdoA.bkc());
    this.bRQ = J(paramArrayOfFloat);
    this.m_index = paramInt;
  }

  private bYg(bYg parambYg)
  {
    super(parambYg.cwt);
    this.m_index = parambYg.m_index;
    this.bRQ = parambYg.bRQ;
  }

  private static float[] J(float[] paramArrayOfFloat) {
    return new float[] { paramArrayOfFloat[0] * 1.25F, paramArrayOfFloat[1] * 1.25F, paramArrayOfFloat[2] * 1.25F, 1.0F };
  }

  public void a(cew paramcew)
  {
    a(paramcew, true);
  }

  public void a(cew paramcew, boolean paramBoolean) {
    paramcew.e(this.m_index, this.bRQ);
    if (paramBoolean)
      paramcew.cbD().aek();
  }

  public boolean a(bXI parambXI) {
    if (!super.a(parambXI))
      return false;
    if ((!bB) && (!(parambXI instanceof bYg))) throw new AssertionError();
    bYg localbYg = (bYg)parambXI;
    return (this.m_index == localbYg.m_index) && (Arrays.equals(this.bRQ, localbYg.bRQ));
  }

  public bYg cdo() {
    return new bYg(this);
  }
}