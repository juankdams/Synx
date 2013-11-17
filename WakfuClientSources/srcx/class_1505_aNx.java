class aNx extends cGj
  implements ccw
{
  public static final String NAME = "name";
  public static final String etA = "lastAdded";
  private final arK etB;
  private String etC = null;

  private aNx(bxU parambxU, arK paramarK) {
    this.etB = paramarK;
    this.etB.a(this);
  }

  public void clear() {
    this.etB.a(null);
  }

  public void d(ZG paramZG) {
    this.etC = paramZG.als();
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return this.etB.getName();
    if (paramString.equals("lastAdded")) {
      return this.etC;
    }
    return null;
  }
}