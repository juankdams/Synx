class dco extends cDn
{
  private int[] kUV;

  dco(int paramInt1, int paramInt2)
  {
    this.kUV = new int[] { paramInt1, paramInt2 };
  }

  public int[] R(int[] paramArrayOfInt)
  {
    return new int[] { paramArrayOfInt[0] + this.kUV[0], paramArrayOfInt[1] + this.kUV[1] };
  }

  public int[] S(int[] paramArrayOfInt) {
    return new int[] { paramArrayOfInt[0] - this.kUV[0], paramArrayOfInt[1] - this.kUV[1] };
  }
}