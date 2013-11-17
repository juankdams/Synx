public class Vf extends cLP
{
  public Vf(bgr parambgr)
  {
    super(parambgr);
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("isGovernor")) {
      return Boolean.valueOf(true);
    }
    return super.getFieldValue(paramString);
  }
}