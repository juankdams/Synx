public class amK
  implements bbk, cfI
{
  private final byz bSY;
  private int aQF = -1;

  public amK(byz parambyz) {
    this.bSY = parambyz;
  }

  public void a(bNz parambNz) {
    dzF localdzF = parambNz.bVg();
    dNP localdNP;
    cUb localcUb;
    if ((localdzF == dzF.lGs) || (localdzF == dzF.lGt)) {
      localdNP = (dNP)((YS)parambNz).akr();
      if (!localdNP.nI()) {
        return;
      }
      localcUb = localdNP.nJ();
      localcUb.c(this);
    } else if ((localdzF == dzF.lGu) || (localdzF == dzF.lGv)) {
      localdNP = (dNP)((YS)parambNz).akr();
      if (!localdNP.nI()) {
        return;
      }
      localcUb = localdNP.nJ();
      localcUb.d(this);
    }
  }

  public void eu(String paramString) {
  }

  public void ih(int paramInt) {
  }

  public void ii(int paramInt) {
  }

  public void ij(int paramInt) {
  }

  public void ik(int paramInt) {
    gA localgA = (gA)this.bSY.ayJ().dB((short)azO.dRT.hV);
    if ((localgA == null) || (!localgA.nI()))
      return;
    cUb localcUb = localgA.nJ();
    int i = localcUb.nU();
    if (this.aQF == i) {
      return;
    }
    this.bSY.ayD();
    this.aQF = i;
  }

  public void aT(byte paramByte)
  {
  }

  public void n(dxL paramdxL)
  {
  }

  public void o(dxL paramdxL)
  {
  }

  public void p(dxL paramdxL)
  {
  }

  public void q(dxL paramdxL)
  {
  }

  public void il(int paramInt)
  {
  }
}