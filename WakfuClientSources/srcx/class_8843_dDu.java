public class dDu extends aPn
{
  public static final String TAG = "Not";

  public String getTag()
  {
    return "Not";
  }

  public boolean isValid(Object paramObject)
  {
    if (this.crU)
      paramObject = this.crT;
    if (this.drJ != null) {
      return !this.drJ.isValid(paramObject);
    }
    return false;
  }

  public Sj aAb() {
    dDu localdDu = new dDu();
    c(localdDu);
    return localdDu;
  }
}