import org.apache.log4j.Logger;

public class dsk extends aSv
{
  private static final Logger K = Logger.getLogger(dsk.class);
  private byte[] flv;
  private byte[] flw;
  private byte[] flx;
  private byte[] flA;
  private short[] fly;
  private byte[] flz;
  private long[] luC;

  public final int a(int paramInt1, int paramInt2, bep[] paramArrayOfbep, int paramInt3)
  {
    if ((!bB) && (!a(paramInt1, paramInt2, paramArrayOfbep))) throw new AssertionError();

    bep localbep = paramArrayOfbep[paramInt3];
    localbep.hY = paramInt1;
    localbep.hZ = paramInt2;

    int i = ch(paramInt1, paramInt2);
    localbep.aOl = this.fly[i];
    localbep.gPY = ((this.flA[i] & 0x1) == 1);
    localbep.io = this.flz[i];
    localbep.flI = this.flv[i];
    localbep.frm = this.flw[i];
    localbep.frn = this.flx[i];
    return 1;
  }

  private int ch(int paramInt1, int paramInt2) {
    int i = paramInt1 - this.hY;
    int j = paramInt2 - this.hZ;
    int k = j * 18 + i;

    return Jv.a(this.luC, k, this.flv.length);
  }

  public int a(int paramInt1, int paramInt2, cZc[] paramArrayOfcZc, int paramInt3)
  {
    if ((!bB) && (!a(paramInt1, paramInt2, paramArrayOfcZc))) throw new AssertionError();

    cZc localcZc = paramArrayOfcZc[paramInt3];
    localcZc.hY = paramInt1;
    localcZc.hZ = paramInt2;

    int i = ch(paramInt1, paramInt2);
    localcZc.aOl = this.fly[i];
    localcZc.gPY = ((this.flA[i] & 0x2) == 2);
    localcZc.io = this.flz[i];
    return 1;
  }

  public void d(aYQ paramaYQ)
  {
    super.d(paramaYQ);

    int i = paramaYQ.readByte() & 0xFF;
    this.flv = new byte[i];
    this.flw = new byte[i];
    this.flx = new byte[i];
    this.fly = new short[i];
    this.flz = new byte[i];
    this.flA = new byte[i];
    for (int j = 0; j < i; j++) {
      this.flv[j] = paramaYQ.readByte();
      this.flw[j] = paramaYQ.readByte();
      this.flx[j] = paramaYQ.readByte();
      this.fly[j] = paramaYQ.readShort();
      this.flz[j] = paramaYQ.readByte();
      this.flA[j] = paramaYQ.readByte();
    }

    j = paramaYQ.readByte() & 0xFF;
    this.luC = Jv.a(this.luC, j, paramaYQ);
  }
}