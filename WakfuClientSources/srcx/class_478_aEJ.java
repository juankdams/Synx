public class aEJ extends Sj
{
  public static final String TAG = "isGreater";

  public String getTag()
  {
    return "isGreater";
  }

  public boolean isValid(Object paramObject)
  {
    Object localObject = this.crU ? this.crT : paramObject;

    if ((localObject instanceof Integer))
      return bUD.aR(localObject) > bUD.aR(this.aOd);
    if ((localObject instanceof Float))
      return bUD.getFloat(localObject) > bUD.getFloat(this.aOd);
    if ((localObject instanceof Double))
      return bUD.getDouble(localObject) > bUD.getDouble(this.aOd);
    if ((localObject instanceof Short))
      return bUD.getShort(localObject) > bUD.getShort(this.aOd);
    if ((localObject instanceof Long))
      return bUD.getLong(localObject) > bUD.getLong(this.aOd);
    if ((localObject instanceof Byte))
      return bUD.getByte(localObject) > bUD.getByte(this.aOd);
    if ((localObject instanceof String))
    {
      return bUD.getDouble(localObject) > bUD.getDouble(this.aOd);
    }

    return false;
  }
}