class deC
{
  int cxl;
  int kYv;
  int kYw;
  int dWq;
  int beh;
  int kYx;
  int[] kYy = new int[500];

  final void jD(long paramLong)
  {
    this.dWq = 0;
    this.beh = 0;
    int i = this.kYy.length;
    this.kYy[((int)(paramLong % i))] = this.cxl;
    long l = 0L;
    int j = 0;
    for (int k = 0; k < i; k++) {
      int m = this.kYy[k];
      l += m;
      if ((m < this.dWq) || (this.dWq <= 0)) {
        this.dWq = m;
      }
      if (m > this.beh) {
        this.beh = m;
      }
      if (m != 0) {
        j++;
      }
    }
    this.kYv = ((int)bCO.w(l / j));
    this.kYw = ((int)bCO.w(l / i));
    this.kYx = ((int)l);
    this.cxl = 0;
  }

  final void zO(int paramInt) {
    this.cxl += paramInt;
  }

  final void clear() {
    this.cxl = 0;
    this.kYv = 0;
    this.dWq = 0;
    this.beh = 0;
    for (int i = 0; i < this.kYy.length; i++)
      this.kYy[i] = 0;
  }
}