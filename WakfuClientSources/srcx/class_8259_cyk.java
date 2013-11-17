class cyk
{
  final int imr;
  int[] ims = new int[256];
  int[] imt;
  int[] imu;
  int imv;
  int[] imw;
  int[] imx;

  cyk(int paramInt)
  {
    this.imr = paramInt;
    this.imt = new int[paramInt];
    this.imu = new int[paramInt];
  }

  void free() {
    this.ims = null;
    this.imt = null;
    this.imu = null;

    this.imw = null;
    this.imx = null;
  }

  public void xe(int paramInt) {
    this.imv = paramInt;
    this.imw = new int[paramInt];
    this.imx = new int[paramInt];
  }
}