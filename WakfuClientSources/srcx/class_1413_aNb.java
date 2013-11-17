import java.util.ArrayList;

public abstract class aNb extends cGj
  implements cGb
{
  public static final String esA = "compartments";
  public static final String esB = "selectedCompartment";
  public static final String bC = "name";
  public static final String esC = "prefSize";
  public static final String esD = "idealSizeMaxColumns";
  public static final String esE = "idealSizeMaxRows";
  public static final String esF = "moneyAmount";
  public static final String esG = "canManageMoney";
  public static final String esH = "canTakeMoney";
  public static final String esI = "canPutMoney";
  public static final String esJ = "history";
  public static final String[] bF = { "compartments", "selectedCompartment", "name", "prefSize", "idealSizeMaxColumns", "idealSizeMaxRows", "canManageMoney", "canTakeMoney", "canPutMoney", "moneyAmount" };

  protected ArrayList esK = new ArrayList();
  protected Lh esL;
  protected int esM;

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("compartments"))
      return this.esK;
    if (paramString.equals("selectedCompartment"))
      return this.esL;
    if (paramString.equals("name"))
      return getName();
    if (paramString.equals("prefSize"))
      return getPrefSize();
    if (paramString.equals("idealSizeMaxColumns"))
      return Integer.valueOf(getIdealSizeMaxColumns());
    if (paramString.equals("idealSizeMaxRows"))
      return Integer.valueOf(getIdealSizeMaxRows());
    if (paramString.equals("canManageMoney"))
      return Boolean.valueOf(up());
    if (paramString.equals("canTakeMoney"))
      return Boolean.valueOf(ur());
    if (paramString.equals("canPutMoney"))
      return Boolean.valueOf(uq());
    if (paramString.equals("history"))
      return us();
    if (paramString.equals("moneyAmount")) {
      return bU.fH().getString("bigNumberWithSeparator", new Object[] { Integer.valueOf(this.esM) });
    }
    return null;
  }

  public void nh(int paramInt) {
    this.esM = paramInt;
    dLE.doY().a(this, new String[] { "moneyAmount" });
  }

  public int Fd() {
    return this.esM;
  }

  protected abstract String getName();

  protected abstract Or getPrefSize();

  protected abstract int getIdealSizeMaxColumns();

  protected abstract int getIdealSizeMaxRows();

  protected abstract boolean up();

  protected abstract boolean uq();

  protected abstract boolean ur();

  protected abstract dBv us();

  public abstract int getSize();

  public Lh bdX() {
    return this.esL;
  }

  public Lh bU(byte paramByte) {
    return (Lh)this.esK.get(paramByte);
  }

  public void b(Lh paramLh) {
    this.esL = paramLh;
  }

  public void VF() {
    dLE.doY().a(this, bF);
  }

  public void ni(int paramInt) {
    this.esM = paramInt;
  }

  public void clear()
  {
  }
}