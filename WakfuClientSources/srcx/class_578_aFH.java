public enum aFH
{
  public int iO(int paramInt)
  {
    switch (bWA.hiN[ordinal()]) {
    case 1:
    case 2:
    case 3:
      return 0;
    case 4:
    case 5:
      return (int)Math.max(0.0D, paramInt * 0.5D);
    case 6:
    case 7:
    case 8:
      return Math.max(0, paramInt);
    }
    return 0;
  }

  public int iP(int paramInt)
  {
    switch (bWA.hiN[ordinal()]) {
    case 1:
    case 4:
    case 6:
      return Math.max(0, paramInt);
    case 2:
    case 7:
      return (int)Math.max(0.0D, paramInt * 0.5D);
    case 3:
    case 5:
    case 8:
      return 0;
    }
    return 0;
  }

  public int ba(int paramInt1, int paramInt2)
  {
    switch (bWA.hiN[ordinal()]) {
    case 1:
    case 2:
    case 3:
      return 0;
    case 4:
    case 5:
      return (int)Math.round((paramInt2 - paramInt1) * 0.5D);
    case 6:
    case 7:
    case 8:
      return Math.max(0, paramInt2 - paramInt1);
    }
    return 0;
  }

  public int bb(int paramInt1, int paramInt2)
  {
    switch (bWA.hiN[ordinal()]) {
    case 1:
    case 4:
    case 6:
      return paramInt2 - paramInt1;
    case 2:
    case 7:
      return (int)Math.round((paramInt2 - paramInt1) * 0.5D);
    case 3:
    case 5:
    case 8:
      return 0;
    }
    return 0;
  }

  public aFH aSf()
  {
    switch (bWA.hiN[ordinal()]) {
    case 1:
      return ecx;
    case 4:
      return ecw;
    case 6:
      return ecv;
    case 2:
      return ecu;
    case 7:
      return ect;
    case 3:
      return ecs;
    case 5:
      return ecr;
    case 8:
      return ecq;
    }
    return null;
  }

  public boolean awa()
  {
    return (this == ecq) || (this == ecr) || (this == ecs);
  }

  public boolean awb()
  {
    return (this == ecv) || (this == ecw) || (this == ecx);
  }

  public boolean awc()
  {
    return (this == ecq) || (this == ect) || (this == ecv);
  }

  public boolean awd()
  {
    return (this == ecs) || (this == ecu) || (this == ecx);
  }

  public static aFH gs(String paramString) {
    aFH[] arrayOfaFH1 = values();
    String str = paramString.toUpperCase();

    for (aFH localaFH : arrayOfaFH1) {
      if (localaFH.name().equals(str)) {
        return localaFH;
      }
    }

    return arrayOfaFH1[0];
  }
}