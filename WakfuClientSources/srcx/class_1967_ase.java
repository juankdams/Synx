public class ase extends cGj
{
  public static final String dBU = "titleText";
  public final String[] bF = { "titleText" };
  private final aon dBV;

  public ase(aon paramaon)
  {
    this.dBV = paramaon;
  }

  public String[] getFields() {
    return new String[0];
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("titleText")) {
      return this.dBV == null ? null : bU.fH().getString(this.dBV.qa());
    }
    return null;
  }

  public aon aEC() {
    return this.dBV;
  }

  public short mU() {
    return this.dBV == null ? -1 : this.dBV.nc();
  }
}