public enum dRJ
{
  public int iO(int paramInt)
  {
    switch (cfV.hAW[ordinal()]) {
    case 1:
    case 2:
    case 3:
      return 0;
    case 4:
    case 5:
    case 6:
      return (int)-Math.max(0.0D, paramInt * 0.5D);
    case 7:
    case 8:
    case 9:
      return -Math.max(0, paramInt);
    }
    return 0;
  }

  public int iP(int paramInt) {
    switch (cfV.hAW[ordinal()]) {
    case 1:
    case 4:
    case 7:
      return -Math.max(0, paramInt);
    case 2:
    case 5:
    case 8:
      return (int)-Math.max(0.0D, paramInt * 0.5D);
    case 3:
    case 6:
    case 9:
      return 0;
    }
    return 0;
  }

  public int ba(int paramInt1, int paramInt2)
  {
    switch (cfV.hAW[ordinal()]) {
    case 1:
    case 2:
    case 3:
      return 0;
    case 4:
    case 5:
    case 6:
      return (int)Math.round((paramInt2 - paramInt1) * 0.5D);
    case 7:
    case 8:
    case 9:
      return Math.max(0, paramInt2 - paramInt1);
    }
    return 0;
  }

  public int bb(int paramInt1, int paramInt2) {
    switch (cfV.hAW[ordinal()]) {
    case 1:
    case 4:
    case 7:
      return paramInt2 - paramInt1;
    case 2:
    case 5:
    case 8:
      return (int)Math.round((paramInt2 - paramInt1) * 0.5D);
    case 3:
    case 6:
    case 9:
      return 0;
    }
    return 0;
  }
}