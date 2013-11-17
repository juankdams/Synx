import java.util.Hashtable;

public class dEK extends dwE
  implements cjq
{
  private cxK ijI;
  private String type;

  public void a(cxK paramcxK)
  {
    this.ijI = paramcxK;
  }

  public void setType(String paramString)
  {
    this.type = paramString;
  }

  public boolean gh()
  {
    if (this.ijI == null) {
      throw new cJ("No reference specified for isreference condition");
    }

    String str = this.ijI.cuW();
    if (!Ga().bQ(str))
      return false;
    if (this.type == null) {
      return true;
    }
    Object localObject = Ga().bR(str);
    Class localClass = (Class)Ga().PL().get(this.type);

    if (localClass == null) {
      localClass = (Class)Ga().PJ().get(this.type);
    }

    if (localClass == null)
    {
      return false;
    }

    return localClass.isAssignableFrom(localObject.getClass());
  }
}