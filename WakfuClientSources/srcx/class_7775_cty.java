public class cty extends cGj
{
  public String[] getFields()
  {
    return new String[0];
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("isEmptySlot")) {
      return Boolean.valueOf(true);
    }
    if (paramString.equals("isEnabled")) {
      return Boolean.valueOf(true);
    }
    return null;
  }
}