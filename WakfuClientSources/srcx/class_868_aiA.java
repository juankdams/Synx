public class aiA extends cGj
{
  public static final String NAME = "name";
  public static final String dfh = "levelRange";
  public static final String dfi = "location";
  public static final String dfj = "isLocked";
  public static final String dfk = "lockDesc";
  private final int aw;
  private final int dfl;

  public aiA(int paramInt)
  {
    this.aw = paramInt;
    this.dfl = NB.cdZ.fZ(paramInt);
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("name"))
      return getName();
    Object localObject;
    if (paramString.equals("levelRange")) {
      localObject = new lZ();
      ((lZ)localObject).o(Qb());
      return bU.fH().getString("levelShort.custom", new Object[] { ((lZ)localObject).tP() });
    }
    if (paramString.equals("location")) {
      return avn();
    }
    if (paramString.equals("isLocked")) {
      return Boolean.valueOf(isLocked());
    }
    if (paramString.equals("lockDesc")) {
      localObject = bSq.c(byv.bFN().bFO(), this.dfl);
      if (((String)localObject).length() == 0) {
        return null;
      }
      lZ locallZ = new lZ();
      locallZ.tz().a((CharSequence)localObject).tA();
      return locallZ.tP();
    }

    return null;
  }

  public int getId() {
    return this.aw;
  }

  private String getName() {
    return bU.fH().b(137, this.aw, new Object[0]);
  }

  public short Qb() {
    PD localPD = bGh.gCn.sK(this.aw);
    return localPD != null ? localPD.Qb() : 0;
  }

  public short nV() {
    PD localPD = bGh.gCn.sK(this.aw);
    return localPD != null ? localPD.nV() : 0;
  }

  public short Lk() {
    PD localPD = bGh.gCn.sK(this.aw);
    return localPD != null ? localPD.Lk() : 0;
  }

  private String avn() {
    PD localPD = bGh.gCn.sK(this.aw);
    if (localPD == null) {
      return "";
    }

    return bU.fH().b(77, localPD.Lk(), new Object[0]);
  }

  public boolean avo() {
    int i = byv.bFN().bFO().nU();
    return i >= Qb();
  }

  public boolean isLocked() {
    return avr().cF(this.dfl);
  }

  private boolean avp() {
    return avr().cH(this.dfl);
  }

  private boolean avq() {
    return avr().cG(this.dfl);
  }

  private se avr() {
    return byv.bFN().bFO().bFZ();
  }
}