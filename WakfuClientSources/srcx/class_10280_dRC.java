import java.util.StringTokenizer;

public final class dRC
  implements Vj
{
  public static final Class caa = Or.class;

  public Or rR(String paramString) {
    return m(caa, paramString);
  }

  public Or m(Class paramClass, String paramString) {
    if (paramString != null) {
      StringTokenizer localStringTokenizer = new StringTokenizer(paramString, ",");
      Or localOr = new Or();
      String str;
      if (localStringTokenizer.hasMoreTokens()) {
        str = localStringTokenizer.nextToken().trim();
        if (str.endsWith("%"))
          localOr.V(Float.parseFloat(str.substring(0, str.length() - 1)));
        else {
          localOr.setWidth(Integer.parseInt(str));
        }
      }
      if (localStringTokenizer.hasMoreTokens()) {
        str = localStringTokenizer.nextToken().trim();
        if (str.endsWith("%"))
          localOr.U(Float.parseFloat(str.substring(0, str.length() - 1)));
        else {
          localOr.setHeight(Integer.parseInt(str));
        }
      }
      return localOr;
    }
    return null;
  }

  public Class WY() {
    return caa;
  }

  public boolean WZ() {
    return true;
  }

  public boolean Xa() {
    return true;
  }

  public String a(deg paramdeg, uk paramuk, Class paramClass, String paramString, cDA paramcDA) {
    if (paramString != null) {
      paramdeg.al(caa);
      StringTokenizer localStringTokenizer = new StringTokenizer(paramString, ",");
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("new Dimension(");
      String str;
      if (localStringTokenizer.hasMoreTokens()) {
        str = localStringTokenizer.nextToken().trim();
        if (str.endsWith("%"))
          localStringBuilder.append(str.substring(0, str.length() - 1)).append("f");
        else
          localStringBuilder.append(str);
      }
      else {
        localStringBuilder.append(0);
      }

      localStringBuilder.append(", ");

      if (localStringTokenizer.hasMoreTokens()) {
        str = localStringTokenizer.nextToken().trim();
        if (str.endsWith("%"))
          localStringBuilder.append(str.substring(0, str.length() - 1)).append("f");
        else
          localStringBuilder.append(str);
      }
      else {
        localStringBuilder.append(0);
      }

      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
    return "null";
  }
}