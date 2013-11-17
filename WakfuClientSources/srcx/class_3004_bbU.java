public class bbU extends dNg
{
  private byte flI;
  private byte flJ;
  private byte flK;

  public final boolean I(int paramInt1, int paramInt2)
  {
    return this.flI == -1;
  }

  public final int a(int paramInt1, int paramInt2, bep[] paramArrayOfbep, int paramInt3)
  {
    if ((!bB) && (!a(paramInt1, paramInt2, paramArrayOfbep))) throw new AssertionError();

    bep localbep = paramArrayOfbep[paramInt3];
    localbep.hY = paramInt1;
    localbep.hZ = paramInt2;
    localbep.aOl = this.aOl;
    localbep.flI = this.flI;
    localbep.gPY = false;
    localbep.io = 0;
    localbep.frm = this.flJ;
    localbep.frn = this.flK;
    return 1;
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
    this.flI = paramaYQ.readByte();
    this.flJ = paramaYQ.readByte();
    this.flK = paramaYQ.readByte();
  }
}