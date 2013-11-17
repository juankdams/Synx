public class aim extends IllegalArgumentException
{
  private static final String bdh = "@(#) $RCSfile: IllegalDataException.java,v $ $Revision: 1.13 $ $Date: 2004/02/06 09:28:30 $ $Name: jdom_1_0 $";

  public aim(String paramString)
  {
    super(paramString);
  }

  aim(String paramString1, String paramString2)
  {
    super(
      "The data \"" + 
      paramString1 + 
      "\" is not legal for a JDOM " + 
      paramString2 + 
      ".");
  }

  aim(String paramString1, String paramString2, String paramString3)
  {
    super(
      "The data \"" + 
      paramString1 + 
      "\" is not legal for a JDOM " + 
      paramString2 + 
      ": " + 
      paramString3 + 
      ".");
  }
}