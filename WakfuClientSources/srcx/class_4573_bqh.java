final class bqh
{
  private int fLi;
  private int fLj;
  private int fLk;
  private int fLl = 7500;
  private int fLm;

  bqh()
  {
    dDE localdDE = dDE.dft();
    this.fLm = localdDE.get(3);
  }

  int CI() {
    return this.fLi;
  }

  void lC(int paramInt) {
    this.fLi = paramInt;
  }

  int aNr() {
    return this.fLj;
  }

  void lB(int paramInt) {
    this.fLj = paramInt;
  }

  int aNx() {
    return this.fLk;
  }

  void lE(int paramInt) {
    this.fLk = paramInt;
  }

  int aNw() {
    return this.fLl;
  }

  void lD(int paramInt) {
    this.fLl = paramInt;
  }

  int aNy() {
    return this.fLm;
  }

  void lF(int paramInt) {
    this.fLm = paramInt;
  }
}