public class bzm extends cGj
{
  private dBv cQT;

  public bzm(dBv paramdBv)
  {
    this.cQT = paramdBv;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("isEnabled")) {
      return Boolean.valueOf(false);
    }

    return this.cQT.getFieldValue(paramString);
  }

  public dBv aoo() {
    return this.cQT;
  }
}