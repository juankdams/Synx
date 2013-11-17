public class cPr
{
  float[][] kyo;
  final cf kyp = new cf();
  int kyq;
  int kyr;
  int kys;
  int kyt;
  int mode;
  int kyu;
  long iqy;
  long kyv;
  dPO kyw;

  public cPr(dPO paramdPO)
  {
    this.kyw = paramdPO;
  }

  public void a(dPO paramdPO) {
    this.kyw = paramdPO;
  }

  public int xn() {
    return 0;
  }

  public int b(cAE paramcAE) {
    apK localapK = this.kyw.miW;

    this.kyp.a(paramcAE.iqt, paramcAE.iqu, paramcAE.iqv);

    if (this.kyp.read(1) != 0)
    {
      return -1;
    }

    int i = this.kyp.read(this.kyw.miX);
    if (i == -1) {
      return -1;
    }
    this.mode = i;
    this.kyr = localapK.dwh[this.mode].bmc;
    if (this.kyr != 0) {
      this.kyq = this.kyp.read(1);
      this.kys = this.kyp.read(1);
      if (this.kys == -1)
        return -1;
    } else {
      this.kyq = 0;
      this.kys = 0;
    }

    this.iqy = paramcAE.iqy;
    this.kyv = (paramcAE.gSE - 3L);
    this.kyu = paramcAE.iqx;

    this.kyt = localapK.dwa[this.kyr];
    if ((this.kyo == null) || (this.kyo.length < localapK.dvV)) {
      this.kyo = new float[localapK.dvV][];
    }
    for (int j = 0; j < localapK.dvV; j++) {
      if ((this.kyo[j] == null) || (this.kyo[j].length < this.kyt))
        this.kyo[j] = new float[this.kyt];
      else {
        for (int k = 0; k < this.kyt; k++) {
          this.kyo[j][k] = 0.0F;
        }
      }

    }

    if ((!bB) && (localapK.dwi[localapK.dwh[this.mode].bmf].aGs != 0)) throw new AssertionError();
    return Vw.aiK().a(this, this.kyw.mjg[this.mode]);
  }
}