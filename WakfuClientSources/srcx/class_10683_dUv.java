class dUv extends KA
{
  dUv(bUT parambUT)
  {
    super(parambUT);
  }

  protected aoL Ec(int paramInt) {
    return new aoL(paramInt, 1.0F);
  }

  protected void a(long paramLong, bUT parambUT) {
    ((aoL)this.bXd).put(paramLong, parambUT.caR());
  }

  public int bJ(long paramLong) {
    int[] arrayOfInt = (int[])((aoL)this.bXd).get(paramLong);
    return arrayOfInt == null ? 0 : arrayOfInt.length;
  }

  public int e(long paramLong, int paramInt) {
    return ((int[])((aoL)this.bXd).get(paramLong))[paramInt];
  }
}