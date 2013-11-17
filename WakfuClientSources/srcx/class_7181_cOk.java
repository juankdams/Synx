import org.apache.log4j.Logger;

public class cOk extends Sj
{
  private static Logger K = Logger.getLogger(cOk.class);
  public static final String TAG = "isTrue";

  public String getTag()
  {
    return "isTrue";
  }

  public boolean isValid(Object paramObject)
  {
    if (this.crU)
      paramObject = this.crT;
    if ((paramObject instanceof Boolean)) {
      return ((Boolean)paramObject).booleanValue();
    }

    return false;
  }

  public Sj aAb() {
    cOk localcOk = new cOk();
    c(localcOk);
    return localcOk;
  }
}