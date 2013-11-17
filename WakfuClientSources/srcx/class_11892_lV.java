public class lV
  implements dUd
{
  private dOc aPS;
  private long aPT;

  public lV(dOc paramdOc, int paramInt)
  {
    this.aPS = paramdOc;
    this.aPT = cAo.cxf().a(this, paramInt, 0, 1);
  }

  public long getId()
  {
    return 1L;
  }

  public void a(long paramLong)
  {
  }

  public void stop()
  {
    cAo.cxf().ia(this.aPT);
    this.aPT = 0L;
  }

  public boolean a(cWG paramcWG)
  {
    if ((paramcWG instanceof dKQ)) {
      dKQ localdKQ = (dKQ)paramcWG;
      if (localdKQ.czk() == this.aPT) {
        if ((this.aPS.isElementMapRoot()) && (this.aPS.getElementMap() != null))
          cBQ.cxL().mW(this.aPS.getElementMap().getId());
        else {
          this.aPS.beH();
        }
      }
    }
    return false;
  }
}