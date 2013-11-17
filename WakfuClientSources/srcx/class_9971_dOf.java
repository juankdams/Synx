public enum dOf
{
  public static dOf rD(String paramString)
  {
    dOf[] arrayOfdOf1 = values();

    for (dOf localdOf : arrayOfdOf1) {
      if (localdOf.name().equals(paramString.toUpperCase())) {
        return localdOf;
      }
    }

    return arrayOfdOf1[0];
  }
}