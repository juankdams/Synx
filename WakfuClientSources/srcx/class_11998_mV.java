public class mV extends bZw
{
  public static final String RH = "iconUrl";
  public static final String RI = "description";
  public static final String aRj = "sidoaNeed";
  public static final String aRk = "buildDelay";
  public static final String aRl = "conditions";
  public static final String aRm = "ressources";
  public static final String[] bF = x(new String[] { "iconUrl", "description", "sidoaNeed", "buildDelay", "conditions", "ressources" });
  private final aRa aRn;

  public String[] getFields()
  {
    return bF;
  }

  public mV(cDs paramcDs, aRa paramaRa)
  {
    super(paramcDs);
    this.aRn = paramaRa;
  }

  public Object getFieldValue(String paramString)
  {
    Object localObject = super.getFieldValue(paramString);
    if (localObject != null) {
      return localObject;
    }

    if (paramString.equals("iconUrl")) {
      return this.aRn.nC(((cDs)this.hpX).bqQ());
    }
    if (paramString.equals("description")) {
      return bU.fH().b(125, ((cDs)this.hpX).nc(), new Object[0]);
    }
    if (paramString.equals("conditions")) {
      return null;
    }
    return super.getFieldValue(paramString);
  }

  public boolean ux() {
    return bvn();
  }

  public int sA() {
    return 0;
  }

  public bZw uy() {
    mV localmV = new mV((cDs)this.hpX, aRa.eNR);
    return localmV;
  }

  public bUj uz()
  {
    return bUj.hfZ;
  }
}