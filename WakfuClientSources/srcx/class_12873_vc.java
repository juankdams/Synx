public final class vc
{
  private final cSR bjd = new cSR();
  private final PX bje = new PX();

  void a(byte paramByte, int paramInt) {
    b(paramByte, paramInt);
    this.bje.c(paramByte, paramInt);
  }

  void b(byte paramByte, int paramInt) {
    cpy localcpy = (cpy)this.bjd.get(paramInt);
    if (localcpy == null) {
      localcpy = new cpy();
      this.bjd.put(paramInt, localcpy);
    }
    localcpy.dP(paramByte);
  }

  void H(byte paramByte) {
    cpy localcpy = (cpy)this.bjd.get(this.bje.ap(paramByte));
    this.bje.aq(paramByte);
    if (localcpy == null)
      return;
    localcpy.dQ(paramByte);
  }

  void I(byte paramByte) {
    this.bje.aq(paramByte);
    dmn localdmn = this.bjd.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      cpy localcpy = (cpy)localdmn.value();
      localcpy.dQ(paramByte);
    }
  }

  cpy dd(int paramInt) {
    return (cpy)this.bjd.get(paramInt);
  }

  public int J(byte paramByte) {
    return this.bje.ap(paramByte);
  }

  public boolean contains(byte paramByte) {
    return this.bje.contains(paramByte);
  }

  public byte[] DY() {
    return this.bje.yv();
  }
}