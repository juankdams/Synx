public enum bSi
{
  public static bSi kp(String paramString)
  {
    bSi[] arrayOfbSi1 = values();

    for (bSi localbSi : arrayOfbSi1) {
      if (localbSi.name().equals(paramString.toUpperCase())) {
        return localbSi;
      }
    }

    return arrayOfbSi1[0];
  }
}