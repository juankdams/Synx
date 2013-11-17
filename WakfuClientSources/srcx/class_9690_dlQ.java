public class dlQ extends aPn
{
  public static final String TAG = "ListCondition";
  public static final String ljo = "evenIndex";
  public static final String ljp = "oddIndex";
  public static final String ljq = "index";
  public static final String ljr = "tableIndex";

  public String getTag()
  {
    return "ListCondition";
  }

  public boolean isValid(Object paramObject)
  {
    if (this.crU) {
      paramObject = this.crT;
    }
    if (!(paramObject instanceof axU)) {
      return false;
    }
    axU localaxU = (axU)paramObject;
    cWq localcWq = localaxU.getRenderableCollection();

    if (localcWq == null) {
      return false;
    }

    if (this.hX != null)
    {
      int i;
      if (this.hX.equalsIgnoreCase("evenIndex")) {
        i = localcWq.getTableIndex(localaxU);
        return this.drJ.isValid(Boolean.valueOf(i % 2 == 0));
      }if (this.hX.equalsIgnoreCase("oddIndex")) {
        i = localcWq.getTableIndex(localaxU);
        return this.drJ.isValid(Boolean.valueOf(i % 2 != 0));
      }if (this.hX.equalsIgnoreCase("index")) {
        i = localcWq.getItemIndex(localaxU.getItemValue());
        return this.drJ.isValid(Integer.valueOf(i));
      }if (this.hX.equalsIgnoreCase("tableIndex")) {
        i = localcWq.getTableIndex(localaxU);
        return this.drJ.isValid(Integer.valueOf(i));
      }
    }

    return false;
  }
}