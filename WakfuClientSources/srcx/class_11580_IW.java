import java.util.ArrayList;

public class IW
{
  private final byte bSa;
  private final byte io;
  private cCf[] bSb;
  private final ArrayList bSc = new ArrayList(10);

  public IW(byte paramByte1, byte paramByte2) {
    this.bSa = paramByte1;
    this.io = paramByte2;
  }

  public IW(IW paramIW) {
    this.bSa = paramIW.bSa;
    this.io = paramIW.io;

    for (cCf localcCf : paramIW.bSc) {
      this.bSc.add(new cCf(localcCf));
    }
    this.bSb = paramIW.bSb;
  }

  public int Sn() {
    return this.bSb.length / (this.bSa * this.io);
  }

  public byte So() {
    return this.bSa;
  }

  public byte bY() {
    return this.io;
  }

  ArrayList Sp() {
    return this.bSc;
  }

  cCf l(int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt1 + (paramInt2 + paramInt3 * this.io) * this.bSa;
    return this.bSb[i];
  }

  public void g(aYQ paramaYQ) {
    int i = this.bSa * this.io;
    this.bSb = dxN.a(this.bSc, i, paramaYQ);
  }
}