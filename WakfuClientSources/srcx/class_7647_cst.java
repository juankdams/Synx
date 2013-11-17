public class cst
  implements bqp
{
  public int icp;
  public int icq;
  public int ia;
  public int ib;
  public cpa evB;

  public int getDisplayX()
  {
    return this.icp;
  }

  public int getDisplayY() {
    return this.icq;
  }

  public int getWidth() {
    return this.ia;
  }

  public int getHeight() {
    return this.ib;
  }

  public cpa getElementMap() {
    return this.evB;
  }

  public void wq(int paramInt) {
    this.icp = paramInt;
  }

  public void wr(int paramInt) {
    this.icq = paramInt;
  }

  public void setWidth(int paramInt) {
    this.ia = paramInt;
  }

  public void setHeight(int paramInt) {
    this.ib = paramInt;
  }

  public void e(cpa paramcpa) {
    this.evB = paramcpa;
  }
}