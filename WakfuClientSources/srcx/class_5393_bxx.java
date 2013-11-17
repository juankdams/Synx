public class bxx extends aPn
{
  public static final String TAG = "ItemCondition";
  public static final int cez = "field".hashCode();

  public String getTag()
  {
    return "ItemCondition";
  }

  public boolean isValid(Object paramObject)
  {
    if (this.crU) {
      paramObject = this.crT;
    }

    if ((!(paramObject instanceof axU)) && (!(paramObject instanceof dBv))) {
      return false;
    }

    if ((paramObject instanceof dBv)) {
      if (this.hX != null) {
        return this.drJ.isValid(((dBv)paramObject).getFieldValue(this.hX));
      }
      return this.drJ.isValid(paramObject);
    }

    axU localaxU = (axU)paramObject;
    cZd localcZd = localaxU.getItem();
    if ((localcZd != null) && ((localcZd.getValue() instanceof dBv)) && (this.hX != null)) {
      return this.drJ.isValid(localcZd.getFieldValue(this.hX));
    }
    Object localObject = localcZd == null ? null : localcZd.getValue();
    return this.drJ.isValid(localObject);
  }

  public void setField(String paramString)
  {
    setKey(paramString);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == cez)
      setField(paramaKN.gL(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == cez)
      setField(String.valueOf(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }
}