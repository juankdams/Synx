class avI
{
  private int dKv;
  private int dKw;
  private int dKx;
  private int dKy;
  private boolean dKz = true;

  private avI() {
    reset();
  }

  private void reset() {
    this.dKv = (this.dKw = this.dKx = this.dKy = 2147483647);
    this.dKz = true;
  }

  public boolean l(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.dKz = ((this.dKv != paramInt1) || (this.dKw != paramInt2) || (this.dKx != paramInt3) || (this.dKy != paramInt4));

    if (this.dKz) {
      this.dKv = paramInt1;
      this.dKw = paramInt2;
      this.dKx = paramInt3;
      this.dKy = paramInt4;
    }
    return this.dKz;
  }
}