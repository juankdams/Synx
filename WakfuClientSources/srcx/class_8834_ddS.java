import java.util.ArrayList;

public class ddS extends cTe
{
  public static final String TAG = "tintIntensityColorPicker";
  public static final String kXM = "tintColorPicker";
  public static final String kXN = "intensityColorPicker";
  private cow kXO;
  private cow kXP;
  private int kXQ = 8;
  private float kXR = 0.3F;
  private float kXS = 1.0F;
  private doN kXT;
  public static final int kFO = "colors".hashCode();
  public static final int kXU = "numVariations".hashCode();
  public static final int kXV = "minIntensity".hashCode();
  public static final int kXW = "maxIntensity".hashCode();

  public void d(String paramString, dOc paramdOc)
  {
    super.d(paramString, paramdOc);

    if (paramString.equals("tintColorPicker")) {
      this.kXO = ((cow)paramdOc);
      this.kFN = true;
      setNeedsToPreProcess();
    } else if (paramString.equals("intensityColorPicker")) {
      this.kXP = ((cow)paramdOc);
      this.kFN = true;
      setNeedsToPreProcess();
    }
  }

  public int getNumVariation()
  {
    return this.kXQ;
  }

  public void setNumVariation(int paramInt) {
    this.kXQ = paramInt;
  }

  public float getMinIntensity() {
    return this.kXR;
  }

  public void setMinIntensity(float paramFloat) {
    this.kXR = paramFloat;
  }

  public float getMaxIntensity() {
    return this.kXS;
  }

  public void setMaxIntensity(float paramFloat) {
    this.kXS = paramFloat;
  }

  private void m(bNa parambNa)
  {
    if (this.kXP == null) {
      return;
    }

    ArrayList localArrayList = new ArrayList(this.kXQ);

    for (int i = 0; i < this.kXQ; i++) {
      bNa localbNa = new bNa(parambNa);
      float f = this.kXR + i * (this.kXS - this.kXR) / (this.kXQ - 1);
      localbNa.bx(f);
      localArrayList.add(localbNa);
    }

    this.kXP.setColors(localArrayList);
  }

  protected void coy()
  {
    this.kXO.setColors(this.biK);

    if ((this.biK == null) || (this.biK.size() == 0)) {
      return;
    }

    m((bNa)this.biK.get(0));
  }

  private void registerListeners() {
    this.kXT = new dlA(this);

    a(CH.bGd, this.kXT, true);
  }

  public void bc()
  {
    super.bc();

    this.kXO = null;
    this.kXP = null;

    this.kXT = null;
  }

  public void aJ()
  {
    super.aJ();

    aId localaId = (aId)getLayoutManager();
    localaId.setHorizontal(false);

    this.kXQ = 8;
    this.kXR = 0.3F;
    this.kXS = 1.0F;

    registerListeners();
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == kXU)
      setNumVariation(bUD.aR(paramString));
    else if (paramInt == kXW)
      setMaxIntensity(bUD.getFloat(paramString));
    else if (paramInt == kXV)
      setMinIntensity(bUD.getFloat(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == kFO)
      setColors((ArrayList)paramObject);
    else if (paramInt == kXU)
      setNumVariation(bUD.aR(paramObject));
    else if (paramInt == kXW)
      setMaxIntensity(bUD.getFloat(paramObject));
    else if (paramInt == kXV)
      setMinIntensity(bUD.getFloat(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }
}