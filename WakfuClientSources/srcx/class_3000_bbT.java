import org.apache.log4j.Logger;

public class bbT extends aSv
{
  private static final Logger K = Logger.getLogger(bbT.class);

  private final byte[] flv = new byte[324];
  private final byte[] flw = new byte[324];
  private final byte[] flx = new byte[324];

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
    return j * 18 + i;
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

    for (int i = 0; i < 324; i++) {
      this.flv[i] = paramaYQ.readByte();
      this.flw[i] = paramaYQ.readByte();
      this.flx[i] = paramaYQ.readByte();
    }
  }
}