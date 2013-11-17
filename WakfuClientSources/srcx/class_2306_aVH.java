class aVH
{
  private final bkA eXI;
  private final cyd eXJ = new cyd();
  private final cyd eXK = new cyd();
  private byte eXL = 0;

  private boolean eXM = false;

  private aVH(Xm paramXm, bkA parambkA) {
    this.eXI = parambkA;
    this.eXJ.setSpeed(2.1F);
    this.eXJ.cs(0.01F);
    this.eXK.setSpeed(2.1F);
    this.eXK.cs(0.01F);
  }

  public void a(Xg paramXg) {
    for (int i = Xm.a(this.eXN).size() - 1; i >= 0; i--)
      this.eXM |= ((bfn)Xm.a(this.eXN).hc(i)).cH(this.eXI.bJ());
  }
}