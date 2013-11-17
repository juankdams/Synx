public abstract class cZV extends bAw
{
  protected int kNN = 0;

  protected void zv(int paramInt) {
    this.kNN = paramInt;
    for (int i = this.gpF.size() - 1; i >= 0; i--) {
      cAx localcAx = (cAx)this.gpF.hc(i);
      localcAx.hR(rS(localcAx.OV()));
    }
  }

  protected final boolean rS(int paramInt)
  {
    return ayj.aJY().bu(this.kNN, paramInt);
  }
}