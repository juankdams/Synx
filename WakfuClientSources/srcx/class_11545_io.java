public class io extends aPn
{
  public static final String TAG = "BitwiseOperation";
  public static final String aHT = "and";
  public static final String aHU = "or";
  public static final String aHV = "not";

  public String getTag()
  {
    return "BitwiseOperation";
  }

  public boolean isValid(Object paramObject)
  {
    if (this.crU) {
      paramObject = this.crT;
    }

    Object localObject = null;
    if (this.hX != null) {
      if (this.hX.equalsIgnoreCase("and")) {
        if ((paramObject instanceof Integer))
          localObject = Integer.valueOf(bUD.aR(paramObject) & bUD.aR(this.aOd));
        else if ((paramObject instanceof Short))
          localObject = Integer.valueOf(bUD.getShort(paramObject) & bUD.getShort(this.aOd));
        else if ((paramObject instanceof Long)) {
          localObject = Long.valueOf(bUD.getLong(paramObject) & bUD.getLong(this.aOd));
        }
      }
      if (this.hX.equalsIgnoreCase("or")) {
        if ((paramObject instanceof Integer))
          localObject = Integer.valueOf(bUD.aR(paramObject) | bUD.aR(this.aOd));
        else if ((paramObject instanceof Short))
          localObject = Integer.valueOf(bUD.getShort(paramObject) | bUD.getShort(this.aOd));
        else if ((paramObject instanceof Long)) {
          localObject = Long.valueOf(bUD.getLong(paramObject) | bUD.getLong(this.aOd));
        }
      }

    }

    return this.drJ.isValid(localObject);
  }
}