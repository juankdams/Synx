public class bbu
  implements cbI
{
  private bkA eXI;

  public bbu(bkA parambkA)
  {
    this.eXI = parambkA;
  }

  public float OZ() {
    return Xm.cHv.a(this.eXI) - Xm.cHv.b(this.eXI);
  }

  public float Pa() {
    return -(Xm.cHv.a(this.eXI) + Xm.cHv.b(this.eXI));
  }

  public float Pb() {
    return Xm.cHv.c(this.eXI);
  }

  public boolean Pc() {
    return false;
  }

  public int ca() {
    return 0;
  }
}