public class asH extends Sj
{
  public static final String TAG = "isLess";

  public String getTag()
  {
    return "isLess";
  }

  public boolean isValid(Object paramObject)
  {
    if (this.crU) {
      paramObject = this.crT;
    }
    if ((paramObject instanceof Integer))
      return bUD.aR(paramObject) < bUD.aR(this.aOd);
    if ((paramObject instanceof Float))
      return bUD.getFloat(paramObject) < bUD.getFloat(this.aOd);
    if ((paramObject instanceof Double))
      return bUD.getDouble(paramObject) < bUD.getDouble(this.aOd);
    if ((paramObject instanceof Short))
      return bUD.getShort(paramObject) < bUD.getShort(this.aOd);
    if ((paramObject instanceof Long))
      return bUD.getLong(paramObject) < bUD.getLong(this.aOd);
    if ((paramObject instanceof Byte))
      return bUD.getByte(paramObject) < bUD.getByte(this.aOd);
    if ((paramObject instanceof String))
    {
      return bUD.getDouble(paramObject) < bUD.getDouble(this.aOd);
    }

    return false;
  }
}