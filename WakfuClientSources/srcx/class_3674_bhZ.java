import java.util.ArrayList;

public class bhZ extends cGj
{
  public static final String bD = "elements";
  public static final String bC = "name";
  public static final String fwU = "openned";
  public static final String[] bF = { "elements", "openned" };
  private boolean fwV;
  private int efE;
  private bUj fwW;
  final ArrayList cwY = new ArrayList();

  public String[] getFields()
  {
    return bF;
  }

  public bhZ(bUj parambUj, int paramInt)
  {
    this.fwW = parambUj;
    this.efE = paramInt;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("elements")) {
      return this.cwY;
    }
    if (paramString.equals("name")) {
      switch (jW.aMN[this.fwW.ordinal()]) {
      case 1:
        return Ab.IU().dP(this.efE);
      case 2:
        return Ab.IU().dO(this.efE);
      case 3:
        return Ab.IU().dO(this.efE);
      }
    }

    if (paramString.equals("openned")) {
      return Boolean.valueOf(this.fwV);
    }
    return null;
  }

  public void c(dBv paramdBv) {
    if (this.cwY.contains(paramdBv)) {
      return;
    }
    this.cwY.add(paramdBv);
  }

  public int getOrder() {
    return Ab.IU().dQ(this.efE);
  }

  public void ub() {
    this.fwV = (!this.fwV);
    dLE.doY().a(this, new String[] { "openned" });
  }

  public int aTz() {
    return this.efE;
  }

  public boolean isOpen() {
    return this.fwV;
  }

  public int size() {
    return this.cwY.size();
  }
}