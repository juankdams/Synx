public class dRy extends RuntimeException
{
  private int errorCode;

  private static String DO(int paramInt)
  {
    return "errno was " + paramInt;
  }

  private static String rQ(String paramString)
  {
    try
    {
      return DO(Integer.parseInt(paramString));
    } catch (NumberFormatException localNumberFormatException) {
    }
    return paramString;
  }

  public dRy(String paramString)
  {
    super(rQ(paramString.trim()));
    try {
      if (paramString.startsWith("[")) {
        paramString = paramString.substring(1, paramString.indexOf("]"));
      }
      this.errorCode = Integer.parseInt(paramString);
    }
    catch (NumberFormatException localNumberFormatException) {
      this.errorCode = -1;
    }
  }

  public int getErrorCode()
  {
    return this.errorCode;
  }

  public dRy(int paramInt) {
    super(DO(paramInt));
    this.errorCode = paramInt;
  }
}