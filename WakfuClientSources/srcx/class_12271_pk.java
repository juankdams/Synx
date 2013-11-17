import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;

class pk
  implements Ye
{
  private final int aVe;
  private final int aVf;
  private final int aVg;
  private final int aVh;
  private int aVi;

  pk(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.aVe = paramInt1;
    this.aVf = paramInt2;
    this.aVg = paramInt3;
    this.aVh = paramInt4;
  }

  public void a(ScreenElement paramScreenElement) {
    if (paramScreenElement.ddQ() > this.aVi) {
      this.aVi = paramScreenElement.ddQ();
    }
    paramScreenElement.Cf(paramScreenElement.ddQ() + this.aVe);

    int i = paramScreenElement.ddN();
    paramScreenElement.eA((short)(Math.abs(i) + this.aVf));

    if ((paramScreenElement.RV() != 0) && (i != 0)) {
      paramScreenElement.fk(this.aVh);
      int j = i > 0 ? this.aVg : -this.aVg;
      paramScreenElement.Cg(i + j);
    }
    else {
      paramScreenElement.Cg(0);
    }
  }

  public int wu()
  {
    return this.aVi;
  }
}