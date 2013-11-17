public enum dwA
{
  public static dwA qy(String paramString)
  {
    dwA[] arrayOfdwA1 = values();

    for (dwA localdwA : arrayOfdwA1) {
      if (localdwA.name().equals(paramString.toUpperCase())) {
        return localdwA;
      }
    }

    return arrayOfdwA1[0];
  }

  public static dwA BP(int paramInt) {
    dwA[] arrayOfdwA = values();
    if ((arrayOfdwA.length > paramInt) && (paramInt >= 0)) {
      return arrayOfdwA[paramInt];
    }
    return null;
  }
}