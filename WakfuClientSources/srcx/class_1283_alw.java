public abstract class alw extends cGj
{
  public static final String RI = "description";
  public static final String dmg = "progressionText";
  public static final String dmh = "isCompleted";
  public static final String dmi = "isCompassed";
  public static final String dmj = "canBeCompassed";
  public static final String dmk = "canBeCompassedNow";
  public static final String[] bF = { "description", "progressionText", "isCompleted", "isCompassed", "canBeCompassedNow" };

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("description"))
      return getDescription();
    if (paramString.equals("progressionText")) {
      long l = P();
      return l == -1L ? null : Long.valueOf(l);
    }if (paramString.equals("isCompleted"))
      return Boolean.valueOf(Q());
    if (paramString.equals("isCompassed"))
      return Boolean.valueOf(R());
    if (paramString.equals("canBeCompassed"))
      return Boolean.valueOf(S());
    if (paramString.equals("canBeCompassedNow")) {
      return Boolean.valueOf(T());
    }
    return null;
  }

  protected abstract String getDescription();

  protected abstract long P();

  protected abstract boolean Q();

  protected abstract boolean R();

  protected abstract boolean S();

  protected abstract boolean T();
}