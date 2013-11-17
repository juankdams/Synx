public class cxR
{
  public static final int bXH = 124;
  public int m_size;
  public int cKl;
  public int ib;
  public int ia;
  public int ilS;
  public int brR;
  public int ilT;
  public int[] ilU;
  public Zg ilV;
  public cll ilW;
  public int hMV;

  public cxR()
  {
    this.ilU = new int[11];
    this.ilV = new Zg(this);
    this.ilW = new cll(this);
  }

  public void i(aYQ paramaYQ) {
    this.m_size = paramaYQ.readInt();
    this.cKl = paramaYQ.readInt();
    this.ib = paramaYQ.readInt();
    this.ia = paramaYQ.readInt();
    this.ilS = paramaYQ.readInt();
    this.brR = paramaYQ.readInt();
    this.ilT = paramaYQ.readInt();
    if (this.ilT == 0)
      this.ilT = 1;
    paramaYQ.setOffset(paramaYQ.getOffset() + 44);
    this.ilV.i(paramaYQ);
    this.ilW.i(paramaYQ);
    this.hMV = paramaYQ.readInt();
  }
}