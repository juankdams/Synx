import java.awt.Insets;
import java.util.ArrayList;

public class cow extends cTe
{
  public static final String TAG = "basicColorPicker";
  private ArrayList fcK;
  private ArrayList fNJ;
  private ArrayList hVS;
  private boolean bY;
  private int hVT;
  private doN hVU;
  public static final int ct = "horizontal".hashCode();
  public static final int hVV = "numByLines".hashCode();

  public cow()
  {
    this.bY = true;
    this.hVT = 0;
  }

  public String getTag()
  {
    return "basicColorPicker";
  }

  public boolean isHorizontal() {
    return this.bY;
  }

  public void setHorizontal(boolean paramBoolean) {
    if (this.bY == paramBoolean) {
      return;
    }
    this.bY = paramBoolean;
    cfM();
  }

  public int getNumByLines() {
    return this.hVT;
  }

  public void setNumByLines(int paramInt) {
    if (this.hVT == paramInt) {
      return;
    }
    this.hVT = paramInt;
    cfM();
  }

  protected void coy()
  {
    int i = this.fcK.size();
    int j = this.biK.size();
    Object localObject;
    for (int k = i; k < j; k++) {
      localObject = dRq.checkOut();
      ((dRq)localObject).getAppearance().setMargin(new Insets(1, 1, 0, 0));

      czO localczO = new czO();
      localczO.aJ();
      localczO.setAdaptToContentSize(true);
      ((dRq)localObject).a(localczO);

      dRq localdRq = dRq.checkOut();
      cwP localcwP1 = new cwP();
      localcwP1.aJ();
      localcwP1.setSize(new Or(100.0F, 100.0F));
      localdRq.a(localcwP1);
      jO localjO = new jO();
      localjO.aJ();
      localdRq.getAppearance().a(localjO);
      localdRq.getAppearance().setMargin(new Insets(1, 1, 1, 1));

      biy localbiy = new biy();
      localbiy.aJ();
      localbiy.setElementMap(this.cUY);
      String str = getStyle();
      localbiy.setStyle("basicColorPicker" + (str != null ? str : "") + "$button");
      localbiy.setPrefSize(new Or(20, 15));
      cwP localcwP2 = new cwP();
      localcwP2.aJ();
      localcwP2.setSize(new Or(100.0F, 100.0F));
      localbiy.a(localcwP2);
      localbiy.rV();

      ((dRq)localObject).a(localdRq);
      ((dRq)localObject).a(localbiy);
      a((aNL)localObject);

      this.fcK.add(localbiy);
      this.hVS.add(localjO);
      this.fNJ.add(localObject);
    }

    for (k = j; k < i; k++) {
      this.fcK.remove(this.fcK.size() - 1);
      this.hVS.remove(this.hVS.size() - 1);
      localObject = (dRq)this.fNJ.remove(this.fNJ.size() - 1);
      ((dRq)localObject).beH();
    }

    if (i != j) {
      cfM();
    }

    if ((!bB) && (this.fcK.size() != this.biK.size())) throw new AssertionError("m_buttons devrait avoir la même taille que m_colors");

    for (k = 0; k < j; k++) {
      localObject = (jO)this.hVS.get(k);
      ((jO)localObject).setColor((bNa)this.biK.get(k));
    }
  }

  private void registerListeners()
  {
    this.hVU = new boz(this);

    a(CH.bGw, this.hVU, false);
  }

  public void c(bdj parambdj) {
    cow localcow = (cow)parambdj;
    super.c(localcow);

    localcow.hVT = this.hVT;
    localcow.bY = this.bY;

    localcow.b(CH.bGw, this.hVU, false);
  }

  public void bc()
  {
    super.bc();

    this.fcK = null;
    this.hVS = null;
    this.fNJ = null;
    this.hVU = null;
  }

  public void aJ()
  {
    super.aJ();

    aWY localaWY = new aWY(this, null);
    localaWY.aJ();
    a(localaWY);

    this.hVT = 0;
    this.bY = true;

    this.fcK = new ArrayList();
    this.hVS = new ArrayList();
    this.fNJ = new ArrayList();

    registerListeners();
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == ct)
      setHorizontal(bUD.getBoolean(paramString));
    else if (paramInt == hVV)
      setNumByLines(bUD.aR(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == ct)
      setHorizontal(bUD.getBoolean(paramObject));
    else if (paramInt == hVV)
      setNumByLines(bUD.aR(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }
}