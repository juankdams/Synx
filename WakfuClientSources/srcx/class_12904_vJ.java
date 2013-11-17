public class vJ
  implements cNz
{
  private final dOc aPS;

  public vJ(dOc paramdOc)
  {
    this.aPS = paramdOc;
  }

  public int getScreenX() {
    return this.aPS.getScreenX() - bsP.getInstance().getWidth() / 2;
  }

  public int getScreenY() {
    return this.aPS.getScreenY() - bsP.getInstance().getHeight() / 2;
  }

  public int getWidth() {
    return this.aPS.getWidth();
  }

  public int getHeight() {
    return this.aPS.getHeight();
  }
}