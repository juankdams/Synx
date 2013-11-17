import java.util.Collection;

public class dFV extends aPn
{
  public static final String TAG = "CollectionCondition";
  public static final String eks = "size";

  public String getTag()
  {
    return "CollectionCondition";
  }

  public boolean isValid(Object paramObject)
  {
    if (this.crU) {
      paramObject = this.crT;
    }

    if ((this.hX != null) && 
      (this.hX.equalsIgnoreCase("size"))) {
      if ((paramObject instanceof Collection))
        return this.drJ.isValid(Integer.valueOf(((Collection)paramObject).size()));
      if ((paramObject instanceof Object[])) {
        return this.drJ.isValid(Integer.valueOf(((Object[])paramObject).length));
      }
      return false;
    }

    return false;
  }
}