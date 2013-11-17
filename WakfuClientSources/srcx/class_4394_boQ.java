public class boQ extends bBJ
{
  public static final String TAG = "Or";

  public String getTag()
  {
    return "Or";
  }

  public boolean isValid(Object paramObject)
  {
    if (this.crU)
      paramObject = this.crT;
    for (Sj localSj : this.bRT) {
      if (localSj.isValid(paramObject)) {
        return true;
      }
    }

    return false;
  }

  public Sj aAb() {
    boQ localboQ = new boQ();
    c(localboQ);
    return localboQ;
  }
}