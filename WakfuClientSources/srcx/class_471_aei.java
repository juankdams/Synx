public class aei extends cgs
{
  private dOc aPS;

  public aei(dOc paramdOc)
  {
    this.aPS = paramdOc;
  }

  public int getValue()
  {
    if (this.aPS != null) {
      return this.aPS.getX();
    }
    return 0;
  }

  public void setValue(int paramInt)
  {
    this.aPS.setX(paramInt);
  }

  public void bc()
  {
    super.bc();
    this.aPS = null;
  }
}