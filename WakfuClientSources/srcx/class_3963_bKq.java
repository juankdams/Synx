public enum bKq
{
  private byte hV;
  private int aSg;
  private deh gNj;

  private bKq(byte arg3, int arg4)
  {
    byte b;
    this.hV = b;
    int i;
    this.aSg = i;
  }

  public byte bJ() {
    return this.hV;
  }

  public int oc() {
    return this.aSg;
  }

  public deh bSF() {
    return this.gNj;
  }

  public void a(deh paramdeh) {
    this.gNj = paramdeh;
  }

  public static bKq ds(byte paramByte) {
    for (bKq localbKq : values())
      if (localbKq.bJ() == paramByte)
        return localbKq;
    return null;
  }
}