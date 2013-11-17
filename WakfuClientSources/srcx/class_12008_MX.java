import java.awt.Insets;
import java.util.StringTokenizer;

public class MX
  implements Vj
{
  private Class caa = Insets.class;

  public Insets cI(String paramString) {
    return a(this.caa, paramString);
  }

  public Insets a(Class paramClass, String paramString)
  {
    if ((paramString != null) && 
      (paramClass.equals(Insets.class)))
    {
      StringTokenizer localStringTokenizer = new StringTokenizer(paramString, ",");
      Insets localInsets = new Insets(0, 0, 0, 0);

      if (localStringTokenizer.hasMoreTokens()) {
        localInsets.top = bUD.aR(localStringTokenizer.nextToken().trim());
      }
      if (localStringTokenizer.hasMoreTokens()) {
        localInsets.bottom = bUD.aR(localStringTokenizer.nextToken().trim());
      }
      if (localStringTokenizer.hasMoreTokens()) {
        localInsets.left = bUD.aR(localStringTokenizer.nextToken().trim());
      }
      if (localStringTokenizer.hasMoreTokens()) {
        localInsets.right = bUD.aR(localStringTokenizer.nextToken().trim());
      }

      return localInsets;
    }

    return null;
  }

  public Class WY() {
    return this.caa;
  }

  public boolean WZ() {
    return true;
  }

  public boolean Xa() {
    return true;
  }

  public String a(deg paramdeg, uk paramuk, Class paramClass, String paramString, cDA paramcDA)
  {
    Insets localInsets = a(paramClass, paramString);

    paramdeg.al(paramClass);

    return "new " + paramClass.getSimpleName() + "(" + localInsets.top + ", " + localInsets.left + ", " + localInsets.bottom + ", " + localInsets.right + ")";
  }
}