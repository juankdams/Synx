public enum Pw
{
  public boolean isVertical()
  {
    return (this == chV) || (this == chW);
  }

  public boolean isHorizontal()
  {
    return (this == chY) || (this == chX);
  }

  public static Pw df(String paramString) {
    Pw[] arrayOfPw1 = values();

    for (Pw localPw : arrayOfPw1) {
      if (localPw.name().equals(paramString.toUpperCase())) {
        return localPw;
      }
    }

    return arrayOfPw1[0];
  }
}