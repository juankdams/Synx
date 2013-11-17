class bVF
{
  private final int window;
  private final int left;
  private final int right;

  private bVF(int paramInt1, int paramInt2, int paramInt3)
  {
    this.window = paramInt1;
    this.left = paramInt2;
    this.right = paramInt3;
  }

  public boolean equals(Object paramObject) {
    bVF localbVF = (bVF)paramObject;

    return (this.left == localbVF.left) && (this.right == localbVF.right) && (this.window == localbVF.window);
  }

  public int hashCode()
  {
    return this.window << 20 | this.left << 10 | this.right;
  }
}