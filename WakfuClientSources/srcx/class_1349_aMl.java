public class aMl
{
  protected cjT erp;
  protected cjT erq;
  protected amu[] ers;

  public void a(cCt[] paramArrayOfcCt)
  {
    if ((paramArrayOfcCt == null) || (paramArrayOfcCt.length == 0)) {
      this.erp = null;
      return;
    }
    this.erp = new cjT();
    for (cCt localcCt : paramArrayOfcCt)
      b(localcCt);
  }

  public void b(cCt paramcCt)
  {
    if (this.erp == null) {
      this.erp = new cjT(new cCt[] { paramcCt });
      return;
    }

    boolean[] arrayOfBoolean = { false };
    D(new WF(this, paramcCt, arrayOfBoolean));

    if (arrayOfBoolean[0] == 0)
      this.erp.add(paramcCt);
  }

  public void a(bas[] paramArrayOfbas) {
    if (paramArrayOfbas == null)
      this.erq = null;
    else
      this.erq = new cjT(paramArrayOfbas);
  }

  public void a(bas parambas)
  {
    if (this.erq == null)
      this.erq = new cjT(new bas[] { parambas });
    else
      this.erq.add(parambas);
  }

  public void a(amu[] paramArrayOfamu)
  {
    this.ers = paramArrayOfamu;
  }

  public boolean bdy() {
    return (this.erp != null) && (this.erp.size() > 0);
  }

  public void D(dGy paramdGy) {
    if (this.erp == null)
      return;
    this.erp.S(paramdGy);
  }

  public void E(dGy paramdGy) {
    if (this.erq == null)
      return;
    this.erq.S(paramdGy);
  }

  public amu[] bdz() {
    return this.ers;
  }
}