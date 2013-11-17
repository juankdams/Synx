public class KP extends bWW
{
  public static final KP bXy = new KP();

  private int aGC = -1;
  private final cSR bXz = new cSR();

  public void aM(int paramInt)
  {
    if (paramInt == this.aGC) {
      return;
    }

    clean();

    if (paramInt == -1) {
      dLE.doY().t("protector", null);
      return;
    }

    this.aGC = paramInt;
    bXy.initialize();
    dLE.doY().t("protector", bXy);
  }

  public void clean() {
    super.clean();
    this.aGC = -1;
    this.bXz.clear();
    biI.fzg.b(this);
  }

  public void a(cWT paramcWT)
  {
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("animation"))
      return a(this.aGC, aDD.dYy);
    if (paramString.equals("name"))
      return bU.fH().getString(String.format("staticProtector.%d", new Object[] { Integer.valueOf(CB()) }));
    if (paramString.equals("description")) {
      ceO localceO = new ceO();
      return localceO.tI().am(auI.dHG.bUV()).a(bU.fH().getString("protector.noBuff")).tJ();
    }
    return super.getFieldValue(paramString);
  }

  public int CB() {
    return this.aGC;
  }

  public boolean Vn() {
    return true;
  }

  public void b(int paramInt, aCc paramaCc) {
    this.bXz.put(paramInt, paramaCc);
  }

  public aCc fF(int paramInt) {
    return (aCc)this.bXz.get(paramInt);
  }

  public bva qv() {
    return null;
  }
}