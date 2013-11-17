public enum aFG
{
  public int iO(int paramInt)
  {
    switch (chj.dlz[ordinal()]) {
    case 1:
    case 2:
    case 3:
      return 0;
    case 4:
    case 5:
    case 6:
      return (int)Math.max(0.0D, paramInt * 0.5D);
    case 7:
    case 8:
    case 9:
      return Math.max(0, paramInt);
    }
    return 0;
  }

  public int iP(int paramInt)
  {
    switch (chj.dlz[ordinal()]) {
    case 1:
    case 4:
    case 7:
      return Math.max(0, paramInt);
    case 2:
    case 5:
    case 8:
      return (int)Math.max(0.0D, paramInt * 0.5D);
    case 3:
    case 6:
    case 9:
      return 0;
    }
    return 0;
  }

  public int ba(int paramInt1, int paramInt2)
  {
    switch (chj.dlz[ordinal()]) {
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

  public int v(int paramInt1, int paramInt2, int paramInt3) {
    switch (chj.dlz[ordinal()]) {
    case 1:
    case 2:
    case 3:
      return paramInt1 - paramInt3;
    case 4:
    case 5:
    case 6:
      return (int)Math.round((paramInt2 - paramInt3) * 0.5D) + paramInt1;
    case 7:
    case 8:
    case 9:
      return paramInt1 + paramInt2;
    }
    return 0;
  }

  public int w(int paramInt1, int paramInt2, int paramInt3) {
    switch (chj.dlz[ordinal()]) {
    case 1:
    case 4:
    case 7:
      return paramInt1 + paramInt2;
    case 2:
    case 5:
    case 8:
      return (int)Math.round((paramInt2 - paramInt3) * 0.5D) + paramInt1;
    case 3:
    case 6:
    case 9:
      return paramInt1 - paramInt3;
    }
    return 0;
  }

  public int bb(int paramInt1, int paramInt2)
  {
    switch (chj.dlz[ordinal()]) {
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

  public boolean awa()
  {
    return (this == ecg) || (this == ech) || (this == eci);
  }

  public boolean awb()
  {
    return (this == ecm) || (this == ecn) || (this == eco);
  }

  public boolean awc()
  {
    return (this == ecg) || (this == ecj) || (this == ecm);
  }

  public boolean awd()
  {
    return (this == eci) || (this == ecl) || (this == eco);
  }

  public aFG aSc() {
    switch (chj.dlz[ordinal()]) {
    case 1:
      return eci;
    case 7:
      return ecg;
    case 2:
      return ecl;
    case 8:
      return ecj;
    case 3:
      return eco;
    case 9:
      return ecm;
    case 4:
    case 5:
    case 6: } return this;
  }

  public aFG aSd()
  {
    switch (chj.dlz[ordinal()]) {
    case 1:
      return ecm;
    case 4:
      return ecn;
    case 7:
      return eco;
    case 3:
      return ecg;
    case 6:
      return ech;
    case 9:
      return eci;
    case 2:
    case 5:
    case 8: } return this;
  }

  public aFG aSe()
  {
    aFG[] arrayOfaFG = values();
    return arrayOfaFG[(arrayOfaFG.length - 1 - ordinal())];
  }

  public static aFG gr(String paramString) {
    aFG[] arrayOfaFG1 = values();
    String str = paramString.toUpperCase();

    for (aFG localaFG : arrayOfaFG1) {
      if (localaFG.name().equals(str)) {
        return localaFG;
      }
    }

    return arrayOfaFG1[0];
  }
}