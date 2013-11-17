public abstract class Sj extends bxE
{
  protected String hX = null;
  protected Object aOd = null;
  protected Object crT = null;
  protected boolean crU = false;
  protected anQ crV;
  public static final boolean crW = false;
  public static final int crX = "value".hashCode();
  public static final int crY = "comparedValue".hashCode();
  public static final int crZ = "key".hashCode();

  public Object getValue()
  {
    return this.aOd;
  }

  public void setValue(Object paramObject)
  {
    if (((paramObject != null) && (!paramObject.equals(this.aOd))) || ((this.aOd != null) && (!this.aOd.equals(paramObject))))
    {
      this.aOd = paramObject;
      bm(true);
    }
  }

  public Object getComparedValue() {
    return this.crT;
  }

  public void setComparedValue(Object paramObject) {
    if (((paramObject != null) && (!paramObject.equals(this.crT))) || ((this.crT != null) && (!this.crT.equals(paramObject))) || ((paramObject == null) && (this.crT == null)))
    {
      this.crT = paramObject;
      this.crU = true;
      bm(true);
    }
  }

  public void bm(boolean paramBoolean) {
    if ((this.etK instanceof Sj))
      ((Sj)this.etK).bm(paramBoolean);
    else if ((this.etK instanceof anQ))
      ((anQ)this.etK).bm(paramBoolean);
  }

  public String getKey()
  {
    return this.hX;
  }

  public void setKey(String paramString)
  {
    this.hX = paramString;
  }

  public anQ getConditionParent()
  {
    return this.crV;
  }

  public void setConditionParent(anQ paramanQ) {
    this.crV = paramanQ;
  }

  public void c(bdj parambdj)
  {
    Sj localSj = (Sj)parambdj;
    localSj.setKey(this.hX);
    localSj.setValue(this.aOd);
    if (this.crU) {
      localSj.setComparedValue(this.crT);
    }
    super.c(localSj);
  }

  public abstract boolean isValid(Object paramObject);

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == crY)
      setComparedValue(paramaKN.gL(paramString));
    else if (paramInt == crX)
      setValue(paramaKN.gL(paramString));
    else if (paramInt == crZ)
      setKey(paramaKN.gL(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == crY)
      setComparedValue(paramObject);
    else if (paramInt == crX)
      setValue(paramObject);
    else if (paramInt == crZ)
      setKey(String.valueOf(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}