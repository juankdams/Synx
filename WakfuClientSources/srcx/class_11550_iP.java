final class iP
{
  byte aJo;
  byte aJp;
  int aJq;
  int aJr;
  int aJs;

  private iP()
  {
    reset();
  }

  void reset() {
    this.aJo = 0;
    this.aJp = 0;
    this.aJq = 2147483647;
    this.aJr = 2147483647;
    this.aJs = 2147483647;
  }

  public boolean initialized() {
    return this.aJs != 2147483647;
  }

  boolean d(int paramInt1, int paramInt2, int paramInt3) {
    return (this.aJq == paramInt1) && (this.aJr == paramInt2) && (this.aJs == paramInt3);
  }

  public void setPosition(int paramInt1, int paramInt2, int paramInt3) {
    this.aJq = paramInt1;
    this.aJr = paramInt2;
    this.aJs = paramInt3;
  }

  public String toString()
  {
    return "{" + this.aJq + "," + this.aJr + "," + this.aJs + "}";
  }
}