public class cCz extends IllegalArgumentException
{
  private static final String bdh = "@(#) $RCSfile: IllegalNameException.java,v $ $Revision: 1.13 $ $Date: 2004/02/06 09:28:30 $ $Name: jdom_1_0 $";

  public cCz(String paramString)
  {
    super(paramString);
  }

  cCz(String paramString1, String paramString2)
  {
    super(
      "The name \"" + 
      paramString1 + 
      "\" is not legal for JDOM/XML " + 
      paramString2 + 
      "s.");
  }

  cCz(String paramString1, String paramString2, String paramString3)
  {
    super(
      "The name \"" + 
      paramString1 + 
      "\" is not legal for JDOM/XML " + 
      paramString2 + 
      "s: " + 
      paramString3 + 
      ".");
  }
}