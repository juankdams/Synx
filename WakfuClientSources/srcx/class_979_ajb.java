public enum ajb
{
  public int iO(int paramInt)
  {
    switch (OL.aHB[ordinal()]) {
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
    case 10:
      return (int)Math.max(0.0D, paramInt * 0.5D);
    case 11:
    case 12:
      return (int)Math.max(0.0D, paramInt * 0.75D);
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
      return Math.max(0, paramInt);
    }
    return 0;
  }

  public int iP(int paramInt)
  {
    switch (OL.aHB[ordinal()]) {
    case 1:
    case 6:
    case 8:
    case 11:
    case 13:
      return Math.max(0, paramInt);
    case 2:
    case 14:
      return (int)Math.max(0.0D, paramInt * 0.75D);
    case 3:
    case 9:
    case 15:
      return (int)Math.max(0.0D, paramInt * 0.5D);
    case 4:
    case 16:
      return (int)Math.max(0.0D, paramInt * 0.25D);
    case 5:
    case 7:
    case 10:
    case 12:
    case 17:
      return 0;
    }
    return 0;
  }

  public int ba(int paramInt1, int paramInt2)
  {
    switch (OL.aHB[ordinal()]) {
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
    case 10:
      return (int)Math.round((paramInt2 - paramInt1) * 0.5D);
    case 11:
    case 12:
      return (int)Math.round((paramInt2 - paramInt1) * 0.75D);
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
      return Math.max(0, paramInt2 - paramInt1);
    }
    return 0;
  }

  public int bb(int paramInt1, int paramInt2)
  {
    switch (OL.aHB[ordinal()]) {
    case 1:
    case 6:
    case 8:
    case 11:
    case 13:
      return paramInt2 - paramInt1;
    case 2:
    case 14:
      return (int)Math.round((paramInt2 - paramInt1) * 0.75D);
    case 3:
    case 9:
    case 15:
      return (int)Math.round((paramInt2 - paramInt1) * 0.5D);
    case 4:
    case 16:
      return (int)Math.round((paramInt2 - paramInt1) * 0.25D);
    case 5:
    case 7:
    case 10:
    case 12:
    case 17:
      return 0;
    }
    return 0;
  }

  public boolean awa()
  {
    return (this == dhW) || (this == dhR) || (this == dhS) || (this == dhT) || (this == dhU) || (this == dhV) || (this == dhX);
  }

  public boolean awb()
  {
    return (this == dib) || (this == did) || (this == die) || (this == dif) || (this == die) || (this == dih) || (this == dib);
  }

  public boolean awc()
  {
    return (this == dhW) || (this == dhR) || (this == dhS) || (this == dhY) || (this == die) || (this == did) || (this == dib);
  }

  public boolean awd()
  {
    return (this == dhX) || (this == dhV) || (this == dhU) || (this == dia) || (this == dig) || (this == dih) || (this == dic);
  }

  public static ajb eB(String paramString)
  {
    ajb[] arrayOfajb1 = values();
    String str = paramString.toUpperCase();

    for (ajb localajb : arrayOfajb1) {
      if (localajb.name().equals(str)) {
        return localajb;
      }
    }

    return arrayOfajb1[0];
  }
}