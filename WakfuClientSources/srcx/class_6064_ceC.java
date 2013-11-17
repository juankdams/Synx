public class ceC extends cng
{
  public static final String esF = "amount";

  public ceC(aMn paramaMn)
  {
    super(paramaMn);
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("amount")) {
      return bU.fH().getString("bigNumberWithSeparator", new Object[] { Integer.valueOf(Math.abs(((aMn)this.hTb).bdA())) }) + "§";
    }
    return super.getFieldValue(paramString);
  }

  protected int getType()
  {
    return 1;
  }
}