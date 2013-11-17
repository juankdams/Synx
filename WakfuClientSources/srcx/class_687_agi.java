public class agi extends cGj
{
  public static final String bsS = "quantity";
  public static final String cZy = "isPossessed";
  public static final String cZz = "nameAndQuantity";
  private final short aFe;
  private final bVw bsZ;

  public agi(short paramShort, bVw parambVw)
  {
    this.aFe = paramShort;
    this.bsZ = parambVw;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("quantity"))
      return Short.valueOf(this.aFe);
    if (paramString.equals("isPossessed"))
      return Boolean.valueOf(arF());
    if (paramString.equals("nameAndQuantity")) {
      lZ locallZ = new lZ();
      return locallZ.o(this.aFe).a("x ").a(this.bsZ.getName()).tP();
    }
    return this.bsZ.getFieldValue(paramString);
  }

  public bVw Hu() {
    return this.bsZ;
  }

  public short nP() {
    return this.aFe;
  }

  public boolean arF() {
    byz localbyz = byv.bFN().bFO();
    if (localbyz.t(this.bsZ.getId(), this.aFe)) {
      return true;
    }
    Vu localVu = (Vu)localbyz.b(RS.cru);
    cEG localcEG = localVu.ha(this.bsZ.getId());
    return (localcEG != null) && (localcEG.nP() >= this.aFe);
  }
}