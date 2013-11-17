public class ju extends cGj
{
  public static final String aLn = "isNewEntry";
  private final bZw aLo;
  private dDO aLp;

  private ju(bZw parambZw)
  {
    this.aLo = parambZw.uy();
  }

  public static ju a(bZw parambZw) {
    return new ju(parambZw);
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("isNewEntry")) {
      return Boolean.valueOf(this.aLp.pI() == dtv.lwh);
    }

    return this.aLo.getFieldValue(paramString);
  }

  public String getName() {
    return this.aLo.getName();
  }

  public bZw ri() {
    return this.aLo;
  }

  public dDO rj() {
    return this.aLp;
  }

  public void a(dDO paramdDO) {
    this.aLp = paramdDO;
  }
}