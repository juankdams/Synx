public enum bvc
{
  public static bvc iT(String paramString)
  {
    bvc[] arrayOfbvc = values();
    for (int i = 0; i < arrayOfbvc.length; i++) {
      bvc localbvc = arrayOfbvc[i];
      if (localbvc.toString().equals(paramString))
        return localbvc;
    }
    return null;
  }
}