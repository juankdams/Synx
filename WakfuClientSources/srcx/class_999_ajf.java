public enum ajf
{
  public int iO(int paramInt)
  {
    switch (Gn.bOC[ordinal()]) {
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
      return 0;
    case 6:
    case 7:
      return (int)Math.max(0.0D, paramInt * 0.25D);
    case 8:
    case 9:
      return (int)Math.max(0.0D, paramInt * 0.5D);
    case 10:
    case 11:
      return (int)Math.max(0.0D, paramInt * 0.75D);
    case 12:
    case 13:
    case 14:
    case 15:
    case 16:
      return Math.max(0, paramInt);
    }
    return 0;
  }

  public int iP(int paramInt)
  {
    switch (Gn.bOC[ordinal()]) {
    case 1:
    case 6:
    case 8:
    case 10:
    case 12:
      return Math.max(0, paramInt);
    case 2:
    case 13:
      return (int)Math.max(0.0D, paramInt * 0.75D);
    case 3:
    case 14:
      return (int)Math.max(0.0D, paramInt * 0.5D);
    case 4:
    case 15:
      return (int)Math.max(0.0D, paramInt * 0.25D);
    case 5:
    case 7:
    case 9:
    case 11:
    case 16:
      return 0;
    }
    return 0;
  }

  public int ba(int paramInt1, int paramInt2)
  {
    switch (Gn.bOC[ordinal()]) {
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
      return 0;
    case 6:
    case 7:
      return (int)Math.round((paramInt2 - paramInt1) * 0.25D);
    case 8:
    case 9:
      return (int)Math.round((paramInt2 - paramInt1) * 0.5D);
    case 10:
    case 11:
      return (int)Math.round((paramInt2 - paramInt1) * 0.75D);
    case 12:
    case 13:
    case 14:
    case 15:
    case 16:
      return Math.max(0, paramInt2 - paramInt1);
    }
    return 0;
  }

  public int bb(int paramInt1, int paramInt2)
  {
    switch (Gn.bOC[ordinal()]) {
    case 1:
    case 6:
    case 8:
    case 10:
    case 12:
      return paramInt2 - paramInt1;
    case 2:
    case 13:
      return (int)Math.round((paramInt2 - paramInt1) * 0.75D);
    case 3:
    case 14:
      return (int)Math.round((paramInt2 - paramInt1) * 0.5D);
    case 4:
    case 15:
      return (int)Math.round((paramInt2 - paramInt1) * 0.25D);
    case 5:
    case 7:
    case 9:
    case 11:
    case 16:
      return 0;
    }
    return 0;
  }

  public boolean awa()
  {
    return (this == dip) || (this == dik) || (this == dil) || (this == dim) || (this == din) || (this == dio) || (this == diq);
  }

  public boolean awb()
  {
    return (this == dit) || (this == div) || (this == diw) || (this == dix) || (this == diw) || (this == diz) || (this == dit);
  }

  public boolean awc()
  {
    return (this == dip) || (this == dik) || (this == dil) || (this == dir) || (this == diw) || (this == div) || (this == dit);
  }

  public boolean awd()
  {
    return (this == diq) || (this == dio) || (this == din) || (this == dis) || (this == diy) || (this == diz) || (this == diu);
  }

  public static ajf eC(String paramString)
  {
    ajf[] arrayOfajf1 = values();
    String str = paramString.toUpperCase();

    for (ajf localajf : arrayOfajf1) {
      if (localajf.name().equals(str)) {
        return localajf;
      }
    }

    return arrayOfajf1[0];
  }
}