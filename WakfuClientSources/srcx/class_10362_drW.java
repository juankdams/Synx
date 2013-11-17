public class drW extends aSv
{
  private byte[] flv;
  private byte[] flw;
  private byte[] flx;
  private int[] lup;

  public final int a(int paramInt1, int paramInt2, bep[] paramArrayOfbep, int paramInt3)
  {
    if ((!bB) && (!a(paramInt1, paramInt2, paramArrayOfbep))) throw new AssertionError();

    bep localbep = paramArrayOfbep[paramInt3];
    localbep.hY = paramInt1;
    localbep.hZ = paramInt2;
    localbep.aOl = this.aOl;
    localbep.gPY = false;
    localbep.io = 0;

    int i = ch(paramInt1, paramInt2);
    localbep.flI = this.flv[i];
    localbep.frm = this.flw[i];
    localbep.frn = this.flx[i];
    return 1;
  }

  private int ch(int paramInt1, int paramInt2) {
    int i = paramInt1 - this.hY;
    int j = paramInt2 - this.hZ;
    int k = j * 18 + i;

    return Jv.a(this.lup, k, this.flv.length);
  }

  public int a(int paramInt1, int paramInt2, cZc[] paramArrayOfcZc, int paramInt3)
  {
    if ((!bB) && (!a(paramInt1, paramInt2, paramArrayOfcZc))) throw new AssertionError();

    cZc localcZc = paramArrayOfcZc[paramInt3];
    localcZc.hY = paramInt1;
    localcZc.hZ = paramInt2;
    localcZc.aOl = this.aOl;
    localcZc.gPY = false;
    localcZc.io = 0;
    return 1;
  }

  public void d(aYQ paramaYQ)
  {
    super.d(paramaYQ);

    int i = paramaYQ.readByte();
    this.flv = new byte[i];
    this.flw = new byte[i];
    this.flx = new byte[i];
    for (int j = 0; j < i; j++) {
      this.flv[j] = paramaYQ.readByte();
      this.flw[j] = paramaYQ.readByte();
      this.flx[j] = paramaYQ.readByte();
    }

    j = paramaYQ.readByte() & 0xFF;
    this.lup = Jv.a(this.lup, j, paramaYQ);
  }
}