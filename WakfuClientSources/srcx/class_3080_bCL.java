public class bCL extends cng
{
  public static final String bsS = "quantity";
  private gA aUe;

  public bCL(dJz paramdJz)
  {
    super(paramdJz);
    this.aUe = new gA();
    this.aUe.b(Hu());
    this.aUe.a(paramdJz.diS(), false);
  }

  public Object getFieldValue(String paramString)
  {
    Object localObject = super.getFieldValue(paramString);
    if (localObject != null) {
      return localObject;
    }

    if (paramString.equals("quantity")) {
      return Short.valueOf(((dJz)this.hTb).nP());
    }

    return this.aUe.getFieldValue(paramString);
  }

  public gA getItem() {
    return this.aUe;
  }

  private bVw Hu() {
    return (bVw)Hh.QM().dh(((dJz)this.hTb).tc());
  }

  protected int getType()
  {
    return 0;
  }
}