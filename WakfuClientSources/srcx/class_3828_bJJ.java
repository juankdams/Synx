public class bJJ extends bBJ
{
  public static final String TAG = "And";

  public String getTag()
  {
    return "And";
  }

  public boolean isValid(Object paramObject)
  {
    if (this.crU)
      paramObject = this.crT;
    for (Sj localSj : this.bRT) {
      if (!localSj.isValid(paramObject)) {
        return false;
      }
    }

    return true;
  }

  public Sj aAb() {
    bJJ localbJJ = new bJJ();
    c(localbJJ);
    return localbJJ;
  }

  public Object getEncapsulatedObject()
  {
    return null;
  }
}