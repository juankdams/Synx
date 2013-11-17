public class su extends cgs
{
  private dOc aPS;

  public su(dOc paramdOc)
  {
    this.aPS = paramdOc;
  }

  public int getValue()
  {
    if (this.aPS != null) {
      return this.aPS.getWidth();
    }
    return 0;
  }

  public void setValue(int paramInt)
  {
    this.aPS.setSize(paramInt, this.aPS.haN.height);
  }

  public void bc()
  {
    super.bc();
    this.aPS = null;
  }
}