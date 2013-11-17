public enum aFN
{
  public static aFN gt(String paramString)
  {
    aFN[] arrayOfaFN = values();
    for (int i = 0; i < arrayOfaFN.length; i++) {
      aFN localaFN = arrayOfaFN[i];
      if (localaFN.toString().equals(paramString))
        return localaFN;
    }
    return null;
  }
}