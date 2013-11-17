public class anD extends IllegalArgumentException
{
  private static final String bdh = "@(#) $RCSfile: IllegalTargetException.java,v $ $Revision: 1.14 $ $Date: 2004/02/06 09:28:30 $ $Name: jdom_1_0 $";

  public anD(String paramString)
  {
    super(paramString);
  }

  anD(String paramString1, String paramString2)
  {
    super(
      "The target \"" + 
      paramString1 + 
      "\" is not legal for JDOM/XML Processing Instructions: " + 
      paramString2 + 
      ".");
  }
}