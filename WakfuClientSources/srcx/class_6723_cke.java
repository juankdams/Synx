public enum cke
{
  public static cke lj(String paramString)
  {
    cke[] arrayOfcke1 = values();

    for (cke localcke : arrayOfcke1) {
      if (localcke.name().equals(paramString.toUpperCase())) {
        return localcke;
      }
    }

    return arrayOfcke1[0];
  }
}