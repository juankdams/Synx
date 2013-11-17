public class dyM extends cgs
{
  private dOc aPS;

  public dyM(dOc paramdOc)
  {
    this.aPS = paramdOc;
  }

  public int getValue()
  {
    if (this.aPS != null) {
      return this.aPS.getHeight();
    }
    return 0;
  }

  public void setValue(int paramInt)
  {
    this.aPS.setSize(this.aPS.haN.width, paramInt);
  }

  public void bc()
  {
    super.bc();
    this.aPS = null;
  }
}