public class cWk extends aWd
{
  public static final String TAG = "TextView";
  protected String eQO;

  public void appendText(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }

    if (this.lzM != null) {
      this.lzM += paramString;
    } else {
      if (this.eQO == null) {
        this.eQO = "";
      }

      this.eQO += paramString;
    }
    setNeedsToPreProcess();
  }

  public String getTag()
  {
    return "TextView";
  }

  public void setText(Object paramObject)
  {
    super.setText(paramObject);
    this.eQO = null;
  }

  protected void biM() {
    if (this.eQO != null) {
      getTextBuilder().cC(this.eQO);
      daM();
      this.eQO = null;
    }
  }

  public boolean bb(int paramInt)
  {
    biM();
    return super.bb(paramInt);
  }

  public void c(bdj parambdj)
  {
    cWk localcWk = (cWk)parambdj;
    if (this.eQO != null) {
      localcWk.eQO = this.eQO;
    }
    super.c(parambdj);
  }

  public void aJ()
  {
    super.aJ();

    cwJ localcwJ = cwJ.checkOut();
    localcwJ.setWidget(this);
    a(localcwJ);

    setTextBuilder(new bRi(new KV()));
    getTextBuilder().a(this);

    setMultiline(true);
  }

  public boolean a(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == fyW) {
      appendText(paramaKN.gL(paramString));
      return true;
    }
    return super.a(paramInt, paramString, paramaKN);
  }

  public boolean e(int paramInt, Object paramObject)
  {
    if (paramInt == fyW) {
      appendText(String.valueOf(paramObject));
      return true;
    }
    return super.e(paramInt, paramObject);
  }
}