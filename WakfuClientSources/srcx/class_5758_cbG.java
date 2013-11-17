public class cbG extends cDP
{
  private static final String bdh = "@(#) $RCSfile: CDATA.java,v $ $Revision: 1.30 $ $Date: 2004/02/27 11:32:57 $ $Name: jdom_1_0 $";

  protected cbG()
  {
  }

  public cbG(String paramString)
  {
    kQ(paramString);
  }

  public void append(String paramString)
  {
    if (paramString == null)
      return;
    String str;
    if ((str = asE.fu(paramString)) != null) {
      throw new aim(paramString, "CDATA section", str);
    }

    if (this.value == "")
      this.value = paramString;
    else this.value += paramString;
  }

  public cDP kQ(String paramString)
  {
    if (paramString == null) {
      this.value = "";
      return this;
    }
    String str;
    if ((str = asE.fu(paramString)) != null) {
      throw new aim(paramString, "CDATA section", str);
    }
    this.value = paramString;
    return this;
  }

  public String toString()
  {
    return 64 + 
      "[CDATA: " + 
      getText() + 
      "]";
  }
}