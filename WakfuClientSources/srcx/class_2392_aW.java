import java.nio.ByteBuffer;

class aW
{
  private static final bep[] iL = bep.brZ();
  private final UG iM;

  aW(UG paramUG)
  {
    this.iM = paramUG;
  }

  public void b(cXr paramcXr) {
    int i = this.iM.D();
    short s = this.iM.Lk();

    dQx localdQx = alf.d(this.iM);
    for (int j = localdQx.hqw; j < localdQx.hqx; j++)
      for (int k = localdQx.hqu; k < localdQx.hqv; k++) {
        tF localtF = cwO.a(i, (short)k, (short)j, s);
        bCy localbCy = a(localtF, j, k);

        localbCy.b(paramcXr);
      }
  }

  private bCy a(tF paramtF, int paramInt1, int paramInt2)
  {
    bCy localbCy = new bCy(paramInt2, paramInt1);
    dCl localdCl = (dCl)paramtF.BV();

    for (int i = 0; i < 18; i++) {
      for (int j = 0; j < 18; j++) {
        int k = localbCy.hY + j;
        int m = localbCy.hZ + i;

        short s = a(localdCl, k, m);
        localbCy.J(k, m, s);
      }
    }

    return localbCy;
  }

  private static short a(dCl paramdCl, int paramInt1, int paramInt2) {
    if (paramdCl.I(paramInt1, paramInt2)) {
      return -32768;
    }

    int i = paramdCl.a(paramInt1, paramInt2, iL, 0);
    if (i != 1) {
      return -32768;
    }
    bep localbep = iL[0];
    if ((localbep.RV() != 0) || (localbep.flI == -1)) {
      return -32768;
    }
    return localbep.aOl;
  }

  public void i(ByteBuffer paramByteBuffer) {
    int i = this.iM.D();
    short s = this.iM.Lk();

    dQx localdQx = alf.d(this.iM);
    for (int j = localdQx.hqw; j < localdQx.hqx; j++)
      for (int k = localdQx.hqu; k < localdQx.hqv; k++) {
        bCy localbCy = new bCy(k, j);
        localbCy.i(paramByteBuffer);
        cwO.a(i, (short)k, (short)j, s, localbCy);
      }
  }
}