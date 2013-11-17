public class dNn extends Cf
{
  public static final String TAG = "RadioButtonAppearance";

  public String getTag()
  {
    return "RadioButtonAppearance";
  }

  public boolean Li()
  {
    if (this.ayD) {
      return false;
    }

    bmG localbmG = this.aPS.getElementMap().lG(((aHd)this.aPS).getGroupId());
    if (localbmG == null) {
      return false;
    }
    localbmG.K(new oA(this));

    return super.Li();
  }

  public void dpU()
  {
    if (this.ayD)
      super.Li();
  }
}