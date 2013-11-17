class dwi extends KA
{
  private dwi(bUT parambUT)
  {
    super(parambUT);
  }

  protected dUy BO(int paramInt) {
    return new dUy(paramInt, 1.0F);
  }

  protected void a(long paramLong, bUT parambUT) {
    ((dUy)this.bXd).G(paramLong, parambUT.getInt());
  }

  public int bJ(long paramLong)
  {
    return ((dUy)this.bXd).N(paramLong) ? 1 : 0;
  }

  public int e(long paramLong, int paramInt) {
    return ((dUy)this.bXd).kZ(paramLong);
  }
}