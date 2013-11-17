public class aWF extends cgs
{
  private dOc aPS;

  public aWF(dOc paramdOc)
  {
    this.aPS = paramdOc;
  }

  public int getValue()
  {
    if (this.aPS != null) {
      return this.aPS.getY();
    }
    return 0;
  }

  public void setValue(int paramInt)
  {
    this.aPS.setY(paramInt);
  }

  public void bc()
  {
    super.bc();
    this.aPS = null;
  }
}