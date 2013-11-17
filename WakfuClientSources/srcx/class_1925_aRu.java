public class aRu extends bbM
{
  public aRu(bTT parambTT)
  {
    this.flr = parambTT;
    dnm localdnm = parambTT.Hz();
    this.aFh = cxD.ilA.a(((qV)localdnm).xI());
    bqk();
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("smallIconUrl"))
      return ((bTT)this.flr).getFieldValue("iconUrl");
    if (paramString.equals("breedName"))
      return ((bTT)this.flr).getFieldValue("name");
    if (paramString.equals("bonusDescription")) {
      return ((bTT)this.flr).getFieldValue("effectAndCaracteristic");
    }
    return super.getFieldValue(paramString);
  }

  public boolean bhR()
  {
    return false;
  }

  public long bhS()
  {
    return ((bTT)this.flr).getId();
  }

  public int getId()
  {
    return ((bTT)this.flr).oi().getId();
  }

  public String getName()
  {
    String str = this.aFh.getName();
    return (str == null) || (str.length() == 0) ? (String)((bTT)this.flr).getFieldValue("name") : str;
  }
}