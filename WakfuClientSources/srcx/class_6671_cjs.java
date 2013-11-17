public class cjs extends ciH
{
  public cjs()
  {
    this(0);
  }

  public cjs(int paramInt) {
    super(4);
    setValue(paramInt);
  }

  public void setValue(int paramInt) {
    sF().setInt(0L, paramInt);
  }

  public int getValue() {
    return sF().getInt(0L);
  }
}