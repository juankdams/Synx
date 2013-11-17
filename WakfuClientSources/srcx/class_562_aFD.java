public enum aFD
{
  public int iO(int paramInt)
  {
    switch (bjM.bgx[ordinal()]) {
    case 1:
      return 0;
    case 2:
    case 3:
      return (int)Math.max(0.0D, paramInt * 0.5D);
    case 4:
      return Math.max(0, paramInt);
    }
    return 0;
  }

  public int iP(int paramInt)
  {
    switch (bjM.bgx[ordinal()]) {
    case 2:
      return Math.max(0, paramInt);
    case 1:
    case 4:
      return (int)Math.max(0.0D, paramInt * 0.5D);
    case 3:
      return 0;
    }
    return 0;
  }

  public int ba(int paramInt1, int paramInt2)
  {
    switch (bjM.bgx[ordinal()]) {
    case 1:
      return 0;
    case 2:
    case 3:
      return (int)Math.round((paramInt2 - paramInt1) * 0.5D);
    case 4:
      return Math.max(0, paramInt2 - paramInt1);
    }
    return 0;
  }

  public int bb(int paramInt1, int paramInt2)
  {
    switch (bjM.bgx[ordinal()]) {
    case 2:
      return paramInt2 - paramInt1;
    case 1:
    case 4:
      return (int)Math.round((paramInt2 - paramInt1) * 0.5D);
    case 3:
      return 0;
    }
    return 0;
  }

  public boolean awa()
  {
    return this == ebV;
  }

  public boolean awb()
  {
    return this == ebW;
  }

  public boolean awc()
  {
    return this == ebY;
  }

  public boolean awd()
  {
    return this == ebX;
  }

  public static aFD gp(String paramString) {
    aFD[] arrayOfaFD1 = values();
    String str = paramString.toUpperCase();

    for (aFD localaFD : arrayOfaFD1) {
      if (localaFD.name().equals(str)) {
        return localaFD;
      }
    }

    return arrayOfaFD1[0];
  }
}