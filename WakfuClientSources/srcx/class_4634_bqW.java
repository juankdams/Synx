import org.apache.log4j.Logger;

public class bqW extends Sj
{
  private static Logger K = Logger.getLogger(cOk.class);
  public static final String TAG = "isFalse";

  public String getTag()
  {
    return "isFalse";
  }

  public boolean isValid(Object paramObject)
  {
    if (this.crU) {
      paramObject = this.crT;
    }
    if ((paramObject instanceof Boolean)) {
      return !((Boolean)paramObject).booleanValue();
    }

    return false;
  }
}