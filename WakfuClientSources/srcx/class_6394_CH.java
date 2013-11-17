public enum CH
{
  private static CH[] bGL = values();

  public static CH bu(String paramString)
  {
    CH[] arrayOfCH1 = values();

    for (CH localCH : arrayOfCH1) {
      if (localCH.name().equals(paramString.toUpperCase())) {
        return localCH;
      }
    }

    return arrayOfCH1[0];
  }

  public static CH ex(int paramInt)
  {
    return bGL[paramInt];
  }
}