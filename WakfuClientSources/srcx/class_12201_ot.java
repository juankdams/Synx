public class ot extends cGj
  implements dTe
{
  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("iconUrl"))
      return ay.bd().v(47212409);
    if (paramString.equals("name"))
      return bU.fH().getString("fakeGiftItemName") + " x" + 1;
    if (paramString.equals("quantity"))
      return Integer.valueOf(1);
    if (paramString.equals("allowControls")) {
      return Boolean.valueOf(false);
    }
    return null;
  }

  public boolean K(boolean paramBoolean) {
    return false;
  }
}