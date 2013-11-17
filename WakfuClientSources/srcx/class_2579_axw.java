final class axw
{
  private final alz dMF = new alz(2);

  cbQ az(byte paramByte) {
    cbQ localcbQ = (cbQ)this.dMF.bf(paramByte);
    if (localcbQ == null) {
      localcbQ = new cbQ();
      this.dMF.a(paramByte, localcbQ);
    }
    return localcbQ;
  }

  void c(byte paramByte, int paramInt1, int paramInt2) {
    cbQ localcbQ = az(paramByte);
    localcbQ.add(bCO.cM(paramInt1, paramInt2));
  }
}