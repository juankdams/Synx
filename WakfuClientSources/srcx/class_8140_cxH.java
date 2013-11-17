class cxH
  implements dHJ
{
  private bkH ilC;
  private long gCz;

  cxH()
  {
  }

  cxH(bkH parambkH)
  {
    this.ilC = parambkH;
  }

  public bkH cuU() {
    return this.ilC;
  }

  public void aM(long paramLong) {
    this.gCz = paramLong;
  }

  public long ayX() {
    return this.gCz;
  }

  public short nU() {
    return ble().cF(this.gCz);
  }

  public short nV() {
    return ble().nV();
  }

  public float cuV() {
    return ble().d(nU(), this.gCz);
  }

  public void a(aIY paramaIY) {
  }

  public void b(aIY paramaIY) {
  }

  public boolean b(gZ paramgZ) {
    paramgZ.aGg = this.ilC.getId();
    paramgZ.aGh = this.gCz;
    return true;
  }

  public boolean c(gZ paramgZ) {
    this.ilC = byM.gml.rF(paramgZ.aGg);
    this.gCz = paramgZ.aGh;
    return true;
  }

  public cOB ble() {
    return ahe.abu();
  }

  public String ov() {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("xp(").append(this.gCz).append(")");
    return localStringBuffer.toString();
  }
}