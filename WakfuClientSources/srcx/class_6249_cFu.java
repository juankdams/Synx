public enum cFu
{
  public static cFu nl(String paramString)
  {
    cFu[] arrayOfcFu1 = values();

    for (cFu localcFu : arrayOfcFu1) {
      if (localcFu.name().equals(paramString.toUpperCase())) {
        return localcFu;
      }
    }

    return arrayOfcFu1[0];
  }
}