public final class bPk
{
  private final rU gVW = new rU();
  private boolean gVX = false;

  public bPk() {
  }

  public bPk(byte paramByte1, byte paramByte2, byte paramByte3) {
    m(eu.ayN.bJ(), paramByte1);
    m(eu.ayO.bJ(), paramByte2);
    m(eu.ayP.bJ(), paramByte3);
  }

  public void m(byte paramByte1, byte paramByte2) {
    if (paramByte2 <= 0)
      return;
    this.gVW.d(paramByte1, paramByte2);
  }

  public byte j(eu parameu) {
    if (parameu == null)
      return 0;
    if (!this.gVW.contains(parameu.bJ()))
      return 0;
    return this.gVW.A(parameu.bJ());
  }

  public boolean bVR() {
    return this.gVX;
  }

  public void gv(boolean paramBoolean) {
    this.gVX = paramBoolean;
  }
}