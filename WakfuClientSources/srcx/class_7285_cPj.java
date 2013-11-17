import java.io.File;
import java.util.StringTokenizer;

public class cPj extends bRt
{
  public int min = -1;

  public int max = -1;
  public static final String kyb = "min";
  public static final String kyc = "max";

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{depthselector min: ");
    localStringBuilder.append(this.min);
    localStringBuilder.append(" max: ");
    localStringBuilder.append(this.max);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }

  public void setMin(int paramInt)
  {
    this.min = paramInt;
  }

  public void setMax(int paramInt)
  {
    this.max = paramInt;
  }

  public void a(daL[] paramArrayOfdaL)
  {
    super.a(paramArrayOfdaL);
    if (paramArrayOfdaL != null)
      for (int i = 0; i < paramArrayOfdaL.length; i++) {
        String str = paramArrayOfdaL[i].getName();
        if ("min".equalsIgnoreCase(str)) {
          try {
            setMin(Integer.parseInt(paramArrayOfdaL[i].getValue()));
          } catch (NumberFormatException localNumberFormatException1) {
            be("Invalid minimum value " + paramArrayOfdaL[i].getValue());
          }
        }
        else if ("max".equalsIgnoreCase(str)) {
          try {
            setMax(Integer.parseInt(paramArrayOfdaL[i].getValue()));
          } catch (NumberFormatException localNumberFormatException2) {
            be("Invalid maximum value " + paramArrayOfdaL[i].getValue());
          }
        }
        else
          be("Invalid parameter " + str);
      }
  }

  public void cd()
  {
    if ((this.min < 0) && (this.max < 0)) {
      be("You must set at least one of the min or the max levels.");
    }

    if ((this.max < this.min) && (this.max > -1))
      be("The maximum depth is lower than the minimum.");
  }

  public boolean a(File paramFile1, String paramString, File paramFile2)
  {
    validate();

    int i = -1;

    String str1 = paramFile1.getAbsolutePath();
    String str2 = paramFile2.getAbsolutePath();
    StringTokenizer localStringTokenizer1 = new StringTokenizer(str1, File.separator);

    StringTokenizer localStringTokenizer2 = new StringTokenizer(str2, File.separator);

    while (localStringTokenizer2.hasMoreTokens()) {
      String str3 = localStringTokenizer2.nextToken();
      if (localStringTokenizer1.hasMoreTokens()) {
        String str4 = localStringTokenizer1.nextToken();

        if (!str4.equals(str3)) {
          throw new cJ("File " + paramString + " does not appear within " + str1 + "directory");
        }
      }
      else
      {
        i++;
        if ((this.max > -1) && (i > this.max)) {
          return false;
        }
      }
    }
    if (localStringTokenizer1.hasMoreTokens()) {
      throw new cJ("File " + paramString + " is outside of " + str1 + "directory tree");
    }

    if ((this.min > -1) && (i < this.min)) {
      return false;
    }
    return true;
  }
}