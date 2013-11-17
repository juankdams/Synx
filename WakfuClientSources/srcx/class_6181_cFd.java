public class cFd extends aPn
{
  public static final String TAG = "StringCondition";

  public String getTag()
  {
    return "StringCondition";
  }

  public boolean isValid(Object paramObject)
  {
    if (this.crU) {
      paramObject = this.crT;
    }
    if ((!(paramObject instanceof String)) || (this.hX == null)) {
      return false;
    }

    String str = (String)paramObject;

    if (this.hX.equalsIgnoreCase("length"))
      return (this.drJ != null) && (this.drJ.isValid(Integer.valueOf(str.length())));
    boolean bool;
    if (this.hX.equalsIgnoreCase("startsWith")) {
      if (!(this.aOd instanceof String)) {
        return false;
      }
      bool = str.startsWith((String)this.aOd);
      return this.drJ == null ? bool : this.drJ.isValid(Boolean.valueOf(bool));
    }
    if (this.hX.equalsIgnoreCase("endsWith")) {
      if (!(this.aOd instanceof String)) {
        return false;
      }
      bool = str.endsWith((String)this.aOd);
      return this.drJ == null ? bool : this.drJ.isValid(Boolean.valueOf(bool));
    }

    return false;
  }

  public Sj aAb()
  {
    cFd localcFd = new cFd();
    c(localcFd);
    return localcFd;
  }
}