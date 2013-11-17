import java.util.Arrays;

public class bIx extends bXI
{
  public final float[] bRQ;
  public final float duj;
  public final boolean gHH;
  int aPs;

  public bIx(doA paramdoA, float[] paramArrayOfFloat, float paramFloat, boolean paramBoolean)
  {
    super((dpI)paramdoA.bkc());
    this.bRQ = paramArrayOfFloat;
    this.duj = paramFloat;
    this.gHH = paramBoolean;
  }

  private bIx(bIx parambIx)
  {
    super(parambIx.cwt);
    this.bRQ = parambIx.bRQ;
    this.duj = parambIx.duj;
    this.gHH = parambIx.gHH;
  }

  public bIx bPF() {
    return new bIx(this);
  }

  public void a(cew paramcew)
  {
    bGL localbGL = (bGL)bSj.hcO.y();
    localbGL.b(paramcew);

    localbGL.p(0.0F, 0.0F, 0.0F);
    localbGL.q(this.bRQ[0], this.bRQ[1], this.bRQ[2]);
    localbGL.o(0.0F, 0.0F, 0.2F);
    localbGL.aG(this.duj);

    btL.gcv.a(localbGL);
    if (this.gHH)
      localbGL.shutdown(500);
    else
      this.aPs = localbGL.getId();
  }

  public boolean a(bXI parambXI)
  {
    if (!super.a(parambXI))
      return false;
    if ((!bB) && (!(parambXI instanceof bIx))) throw new AssertionError();
    bIx localbIx = (bIx)parambXI;
    return (this.duj == localbIx.duj) && (this.gHH == localbIx.gHH) && (Arrays.equals(this.bRQ, localbIx.bRQ));
  }
}