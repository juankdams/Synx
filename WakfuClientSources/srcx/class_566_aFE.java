public enum aFE
{
  public int iO(int paramInt)
  {
    switch (bFv.gAw[ordinal()]) {
    case 1:
      return 0;
    case 2:
    case 3:
    case 4:
      return (int)Math.max(0.0D, paramInt * 0.5D);
    case 5:
      return Math.max(0, paramInt);
    }
    return 0;
  }

  public int iP(int paramInt)
  {
    switch (bFv.gAw[ordinal()]) {
    case 2:
      return Math.max(0, paramInt);
    case 1:
    case 3:
    case 5:
      return (int)Math.max(0.0D, paramInt * 0.5D);
    case 4:
      return 0;
    }
    return 0;
  }

  public int ba(int paramInt1, int paramInt2)
  {
    switch (bFv.gAw[ordinal()]) {
    case 1:
      return 0;
    case 2:
    case 3:
    case 4:
      return (int)Math.round((paramInt2 - paramInt1) * 0.5D);
    case 5:
      return Math.max(0, paramInt2 - paramInt1);
    }
    return 0;
  }

  public int bb(int paramInt1, int paramInt2)
  {
    switch (bFv.gAw[ordinal()]) {
    case 2:
      return paramInt2 - paramInt1;
    case 1:
    case 3:
    case 5:
      return (int)Math.round((paramInt2 - paramInt1) * 0.5D);
    case 4:
      return 0;
    }
    return 0;
  }

  public boolean awa()
  {
    return this == eca;
  }

  public boolean awb()
  {
    return this == ecb;
  }

  public boolean awc()
  {
    return this == ecd;
  }

  public boolean awd()
  {
    return this == ecc;
  }

  public static aFE gq(String paramString) {
    aFE[] arrayOfaFE1 = values();
    String str = paramString.toUpperCase();

    for (aFE localaFE : arrayOfaFE1) {
      if (localaFE.name().equals(str)) {
        return localaFE;
      }
    }

    return arrayOfaFE1[0];
  }
}