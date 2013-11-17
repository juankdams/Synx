import java.util.ArrayList;

public class aLw extends cGj
{
  public static final String RH = "iconUrl";
  public static final String bC = "name";
  public static final String epR = "surface";
  public static final String RI = "description";
  public static final String epS = "effects";
  public static final String aRj = "sidoaNeed";
  public static final String aRk = "buildDelay";
  public static final String aRl = "conditions";
  public static final String epT = "ressourcesCost";
  public static final String epU = "kamasCost";
  public static final String epV = "canBeDestroyed";
  public static final String[] bF = { "iconUrl", "name", "surface", "description", "effects", "sidoaNeed", "buildDelay", "conditions", "ressourcesCost", "kamasCost", "canBeDestroyed" };
  private final cUh epW;
  private final aRa epX;

  public aLw(cUh paramcUh, aRa paramaRa)
  {
    this.epW = paramcUh;
    this.epX = paramaRa;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("iconUrl")) {
      return bcZ();
    }
    if (paramString.equals("name"))
      return getName();
    Object localObject;
    int j;
    if (paramString.equals("kamasCost")) {
      localObject = bda();
      if (localObject == null) {
        return null;
      }
      j = dGu.a((cUh)localObject, dfX.laF.cPy());
      return bU.fH().iK(j);
    }
    if (paramString.equals("surface")) {
      localObject = (dOW)dks.lhB.nN(this.epW.bcY());
      if (localObject == null) {
        return "model de batiment inconnu";
      }
      return ((dOW)localObject).getWidth() + "x" + ((dOW)localObject).getHeight();
    }
    if (paramString.equals("description")) {
      localObject = aDF.ba(this.epW.nc());
      return bU.fH().b(123, ((bOB)localObject).nc(), new Object[0]);
    }
    if (paramString.equals("effects")) {
      return aaP();
    }
    if (paramString.equals("sidoaNeed")) {
      if (this.epW == null) {
        return Integer.valueOf(0);
      }
      return Byte.valueOf(this.epW.cJv());
    }
    if (paramString.equals("buildDelay")) {
      localObject = bcW();
      if (((cds)localObject).isEmpty()) {
        return null;
      }

      j = ((cds)localObject).getDays();
      int k = ((cds)localObject).getHours();
      int m = ((cds)localObject).getMinutes();

      return bU.fH().getString("remainingDurationShort", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), localObject });
    }
    if (paramString.equals("ressourcesCost")) {
      if (this.epW.aTC()) {
        return null;
      }
      int i = dGu.b(this.epW, dfX.laF.cPy());
      return bU.fH().iK(i);
    }
    if (paramString.equals("canBeDestroyed")) {
      return Boolean.valueOf(this.epW.clx());
    }
    return null;
  }

  public ArrayList aaP()
  {
    if (this.epW.aTC()) {
      return null;
    }
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = aDF.h(this.epW);
    if (localArrayList2 != null) {
      localArrayList1.addAll(localArrayList2);
    }

    return localArrayList1.isEmpty() ? null : localArrayList1;
  }

  private cds bcW() {
    if (this.epW.aTC()) {
      return kb.hwQ;
    }
    return aDF.c(this.epW);
  }

  public cds bcX() {
    if (this.epW.aTC()) {
      return kb.hwQ;
    }
    return aDF.d(this.epW);
  }

  public String getName() {
    return bU.fH().b(126, this.epW.nc(), new Object[0]);
  }

  public int bcY() {
    cUh localcUh = bda();
    if (localcUh == null) {
      return -1;
    }
    return localcUh.bcY();
  }

  public uz bcZ() {
    cUh localcUh = bda();
    if (localcUh == null) {
      return null;
    }
    return this.epX.nD(localcUh.bcY());
  }

  private cUh bda() {
    return aDF.e(this.epW);
  }

  public cUh bdb() {
    return this.epW;
  }
}