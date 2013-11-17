public final class dzn
  implements ajF
{
  private QT hzr;
  private byte lFO = 1;

  public QT bGo() {
    return this.hzr;
  }

  public void a(QT paramQT) {
    this.hzr = paramQT;
  }

  public void aX(byte paramByte) {
    csi localcsi = this.hzr.aj(paramByte);
    if ((localcsi.getName() == null) || (localcsi.getName().length() == 0)) {
      String str = bU.fH().b(7, localcsi.Rw(), new Object[0]);
      localcsi.setName(str);
      alc localalc = new alc();
      localalc.bc(paramByte);
      localalc.eK(str);
      byv.bFN().aJK().d(localalc);
    }
    dLE.doY().a(ceR.chM(), ceR.bF);
  }

  public void aY(byte paramByte) {
    bIy localbIy = new bIy();
    localbIy.dn(paramByte);
    byv.bFN().aJK().d(localbIy);
    dLE.doY().a(ceR.chM(), ceR.bF);
  }

  public void awr() {
    if (this.hzr != null) {
      for (byte b = 0; b < 5; b = (byte)(b + 1)) {
        csi localcsi = this.hzr.aj(b);
        if (localcsi == null)
          aY(b);
        else {
          aX(b);
        }
      }
    }
    ceR.chM().a(bGo());
    dLE.doY().t("osamodasSymbiot", ceR.chM());
  }

  public byte aws() {
    return this.lFO;
  }

  public void aZ(byte paramByte) {
    this.lFO = paramByte;
    dLE.doY().a(ceR.chM(), ceR.bF);
  }
}