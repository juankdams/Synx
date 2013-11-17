class bXF
  implements dGy
{
  private float hmU;
  private int fiL;
  final cSi hmV = new cSi();

  public boolean d(bGL parambGL) {
    if (parambGL.aBe()) {
      parambGL.bx(this.hmU);
    }
    parambGL.update(this.fiL);
    if (parambGL.isShutdown())
      this.hmV.add(parambGL.getId());
    return true;
  }

  void i(float paramFloat, int paramInt) {
    this.hmU = paramFloat;
    this.fiL = paramInt;
    this.hmV.rH();
  }
}