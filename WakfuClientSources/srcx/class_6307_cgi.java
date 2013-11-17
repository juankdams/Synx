public abstract class cgi extends UX
  implements dxR
{
  private CH hDM;
  public static final int hDN = "triggerAction".hashCode();

  public CH getTriggerAction()
  {
    return this.hDM;
  }

  public void setTriggerAction(CH paramCH)
  {
    this.hDM = paramCH;
  }

  public void bc()
  {
    super.bc();
    this.hDM = null;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == hDN)
      setTriggerAction(CH.bu(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == hDN)
      setTriggerAction((CH)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}