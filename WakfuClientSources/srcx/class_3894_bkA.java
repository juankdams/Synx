public enum bkA
{
  private final byte hV;
  private cbI aZS;
  private final byu fBc;

  private bkA(byte arg3, byu arg4)
  {
    byte b;
    this.hV = b;
    Object localObject;
    this.fBc = localObject;
  }

  public byte bJ() {
    return this.hV;
  }

  public cbI yn() {
    if (this.aZS == null) {
      this.aZS = new bbu(this);
    }
    return this.aZS;
  }

  public byu bvv() {
    return this.fBc;
  }
}