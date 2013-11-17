public class QA extends bYT
{
  private final int cpF;
  private final cBV cpG;

  public QA(ld paramld, int paramInt)
  {
    super(paramld);
    this.cpF = paramInt;
    this.cpG = ((cBV)dPR.mji.Do(paramInt));
  }

  public String getName() {
    String str = this.cpG.getName();
    return str != null ? str : "";
  }

  public bmt aaN() {
    return bmt.fDX;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("description")) {
      String str = this.cpG.getDescription();
      return str != null ? str : "";
    }if (paramString.equals("name"))
      return getName();
    if (paramString.equals("iconUrl")) {
      return ay.bd().a("protectorBuffsIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(this.cpG.oc()) });
    }

    return super.getFieldValue(paramString);
  }

  public int acm() {
    return this.cpF;
  }
}