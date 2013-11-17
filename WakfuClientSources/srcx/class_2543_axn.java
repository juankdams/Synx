import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class axn
  implements Vj
{
  private Class caa = bNa.class;
  private static final Pattern dMA = Pattern.compile("([0-9\\.]+),?");
  private static final Pattern dMB = Pattern.compile("[0-9A-Fa-f][0-9A-Fa-f]");

  public bNa fM(String paramString) {
    return d(this.caa, paramString);
  }

  public bNa d(Class paramClass, String paramString)
  {
    if ((paramString != null) && 
      (paramClass.equals(bNa.class))) {
      if (paramString.charAt(0) == '#') {
        localObject = paramString.substring(1);
        Matcher localMatcher = dMB.matcher((CharSequence)localObject);
        f2 = 0.0F;
        if (localMatcher.find()) {
          f2 = Integer.parseInt(localMatcher.group(), 16) / 255.0F;
        }
        f3 = 0.0F;
        if (localMatcher.find()) {
          f3 = Integer.parseInt(localMatcher.group(), 16) / 255.0F;
        }
        f4 = 0.0F;
        if (localMatcher.find()) {
          f4 = Integer.parseInt(localMatcher.group(), 16) / 255.0F;
        }
        float f5 = 1.0F;
        if (localMatcher.find()) {
          f5 = Integer.parseInt(localMatcher.group(), 16) / 255.0F;
        }
        return new bNa(f2, f3, f4, f5);
      }
      Object localObject = new StringTokenizer(paramString, ",");

      float f1 = 0.0F;
      if (((StringTokenizer)localObject).hasMoreTokens()) {
        f1 = Float.parseFloat(((StringTokenizer)localObject).nextToken().trim());
      }
      float f2 = 0.0F;
      if (((StringTokenizer)localObject).hasMoreTokens()) {
        f2 = Float.parseFloat(((StringTokenizer)localObject).nextToken().trim());
      }
      float f3 = 0.0F;
      if (((StringTokenizer)localObject).hasMoreTokens()) {
        f3 = Float.parseFloat(((StringTokenizer)localObject).nextToken().trim());
      }
      float f4 = 1.0F;
      if (((StringTokenizer)localObject).hasMoreTokens()) {
        f4 = Float.parseFloat(((StringTokenizer)localObject).nextToken().trim());
      }

      return new bNa(f1, f2, f3, f4);
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

  public String a(deg paramdeg, uk paramuk, Class paramClass, String paramString, cDA paramcDA) {
    if ((paramString != null) && 
      (paramClass.equals(bNa.class)))
    {
      float f1 = 0.0F;
      float f2 = 0.0F;
      float f3 = 0.0F;
      float f4 = 1.0F;
      Object localObject;
      if (paramString.charAt(0) == '#') {
        localObject = paramString.substring(1);
        Matcher localMatcher = dMB.matcher((CharSequence)localObject);
        if (localMatcher.find()) {
          f1 = Integer.parseInt(localMatcher.group(), 16) / 255.0F;
        }
        if (localMatcher.find()) {
          f2 = Integer.parseInt(localMatcher.group(), 16) / 255.0F;
        }
        if (localMatcher.find()) {
          f3 = Integer.parseInt(localMatcher.group(), 16) / 255.0F;
        }
        if (localMatcher.find())
          f4 = Integer.parseInt(localMatcher.group(), 16) / 255.0F;
      }
      else {
        localObject = new StringTokenizer(paramString, ",");
        if (((StringTokenizer)localObject).hasMoreTokens()) {
          f1 = Float.parseFloat(((StringTokenizer)localObject).nextToken().trim());
        }
        if (((StringTokenizer)localObject).hasMoreTokens()) {
          f2 = Float.parseFloat(((StringTokenizer)localObject).nextToken().trim());
        }
        if (((StringTokenizer)localObject).hasMoreTokens()) {
          f3 = Float.parseFloat(((StringTokenizer)localObject).nextToken().trim());
        }
        if (((StringTokenizer)localObject).hasMoreTokens()) {
          f4 = Float.parseFloat(((StringTokenizer)localObject).nextToken().trim());
        }

      }

      paramdeg.al(this.caa);

      return "new " + this.caa.getName() + "(" + f1 + "f, " + f2 + "f, " + f3 + "f, " + f4 + "f)";
    }

    return "null";
  }
}