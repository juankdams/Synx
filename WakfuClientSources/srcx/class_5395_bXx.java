public class bXx extends dRq
{
  public static final String TAG = "dndc";
  private bmy hmx = null;
  private boolean hmy = true;
  private boolean hmz = true;
  private boolean hmA = false;

  public static final int hmB = "validateDrop".hashCode();
  public static final int hmC = "dragEnabled".hashCode();
  public static final int hmD = "dropEnabled".hashCode();

  public void setDragEnabled(boolean paramBoolean)
  {
    this.hmy = paramBoolean;
  }

  public void setDropEnabled(boolean paramBoolean) {
    this.hmz = paramBoolean;
  }

  public boolean isDragEnabled() {
    return this.hmy;
  }

  public boolean isDropEnabled() {
    return this.hmz;
  }

  public void setValidateDrop(bmy parambmy)
  {
    this.hmx = parambmy;
  }

  public String getTag() {
    return "dndc";
  }

  public dOc getWidget(int paramInt1, int paramInt2) {
    if (isCopy()) {
      return null;
    }
    return super.getWidget(paramInt1, paramInt2);
  }

  public boolean isCopy() {
    return this.hmA;
  }

  public void setCopy(boolean paramBoolean) {
    this.hmA = paramBoolean;
  }

  public void aT(Object paramObject)
  {
    if (!this.hmy)
      return;
    bvN localbvN = bvN.a(bsP.getInstance().getCurrentMouseEvent(), this, paramObject);
    g(localbvN);
  }

  public void a(bXx parambXx, Object paramObject)
  {
    if (!this.hmz)
      return;
    Qa localQa = Qa.c(bsP.getInstance().getCurrentMouseEvent(), this, parambXx, paramObject);
    g(localQa);
  }

  public void aU(Object paramObject)
  {
    if (!this.hmz)
      return;
    cTo localcTo = cTo.a(bsP.getInstance().getCurrentMouseEvent(), this, paramObject);
    g(localcTo);
  }

  public void b(bXx parambXx, Object paramObject)
  {
    if (!this.hmy)
      return;
    GA localGA = GA.b(bsP.getInstance().getCurrentMouseEvent(), this, parambXx, paramObject);
    g(localGA);
  }

  public void c(bXx parambXx, Object paramObject)
  {
    if (!this.hmy)
      return;
    MQ.WK().rollOver();

    kx localkx = kx.a(bsP.getInstance().getCurrentMouseEvent(), this, parambXx, paramObject);
    g(localkx);
  }

  public boolean isDropValid(bXx parambXx, Object paramObject)
  {
    if (!this.hmz) {
      return false;
    }

    if (this.hmx != null) {
      Object localObject = this.hmx.b(parambXx, this, paramObject);
      if (localObject != null) {
        return ((Boolean)localObject).booleanValue();
      }
    }
    return true;
  }

  public void ccT()
  {
    super.ccT();
  }

  public void c(bdj parambdj)
  {
    bXx localbXx = (bXx)parambdj;
    super.c(parambdj);
    localbXx.hmx = this.hmx;
    localbXx.hmy = this.hmy;
    localbXx.hmz = this.hmz;
  }

  public void bc()
  {
    super.bc();
    this.hmx = null;
  }

  public void aJ()
  {
    super.aJ();

    this.hmA = false;

    a(CH.bGq, new YP(this), false);

    a(CH.bGq, new YO(this), true);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == hmB)
      setValidateDrop((bmy)paramaKN.b(bmy.class, paramString));
    else if (paramInt == hmC)
      setDragEnabled(bUD.getBoolean(paramString));
    else if (paramInt == hmD)
      setDropEnabled(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == hmC)
      setDragEnabled(bUD.getBoolean(paramObject));
    else if (paramInt == hmD)
      setDropEnabled(bUD.getBoolean(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}