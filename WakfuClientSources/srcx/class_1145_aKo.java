public class aKo extends cGj
{
  public static final String cTy = "item";
  public static final String TEXT = "text";
  private bVw ekN;
  private String hi;

  public aKo(int paramInt, String paramString)
  {
    this.ekN = ((bVw)Hh.QM().dh(paramInt));
    this.hi = paramString;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("item"))
      return this.ekN;
    if (paramString.equals("text")) {
      return this.hi;
    }

    return null;
  }
}