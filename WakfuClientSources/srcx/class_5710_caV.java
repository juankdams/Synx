public class caV extends cGj
  implements bbk
{
  public static final String bwu = "animName";
  public static final String fdZ = "actorDescriptorLibrary";
  public static final String hrM = "equipedItem";
  private rb hrN;

  public caV(rb paramrb)
  {
    this.hrN = paramrb;
    this.hrN.a(this);
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("animName"))
      return this.hrN.getAnimName();
    if (paramString.equals("actorDescriptorLibrary"))
      return this.hrN.xM();
    if (paramString.equals("equipedItem")) {
      return this.hrN.getItem();
    }
    return null;
  }

  public rb ceS() {
    return this.hrN;
  }

  public void a(bNz parambNz) {
    dLE.doY().a(this, new String[] { "actorDescriptorLibrary", "animName", "equipedItem" });
  }
}