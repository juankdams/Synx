public class cft extends djh
{
  private static final String bdh = "@(#) $RCSfile: Comment.java,v $ $Revision: 1.32 $ $Date: 2004/02/11 21:12:43 $ $Name: jdom_1_0 $";
  protected String text;

  protected cft()
  {
  }

  public cft(String paramString)
  {
    kW(paramString);
  }

  public String getText()
  {
    return this.text;
  }

  public String getValue()
  {
    return this.text;
  }

  public cft kW(String paramString)
  {
    String str;
    if ((str = asE.fw(paramString)) != null) {
      throw new aim(paramString, "comment", str);
    }

    this.text = paramString;
    return this;
  }

  public String toString()
  {
    return 
      "[Comment: " + 
      new cpV().a(this) + 
      "]";
  }
}