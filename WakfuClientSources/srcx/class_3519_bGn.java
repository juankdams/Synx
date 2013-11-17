public enum bGn
{
  public boolean r(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    switch (ZK.cMj[ordinal()]) {
    case 1:
      return (paramInt1 >= 0) && (paramInt2 >= 0) && (paramInt1 < paramInt3) && (paramInt2 < paramInt4);
    case 2:
      float f1 = paramInt4 / 2.0F;
      float f2 = f1 / (paramInt3 / 2.0F) * paramInt1;
      return (paramInt2 >= -f2 + f1) && (paramInt2 >= f2 - f1) && (paramInt2 < f2 + f1) && (paramInt2 < -f2 + 3.0F * f1);
    case 3:
      paramInt1 -= paramInt3 / 2;
      paramInt2 -= paramInt4 / 2;
      int i = Math.min(paramInt3, paramInt4) / 2;
      return paramInt1 * paramInt1 + paramInt2 * paramInt2 <= i * i;
    }
    return true;
  }

  public int s(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    switch (ZK.cMj[ordinal()]) {
    case 1:
      if (paramInt1 < 0)
        return 0;
      if (paramInt1 > paramInt3) {
        return paramInt3;
      }
      return paramInt1;
    case 3:
      int i = (int)(Math.min(paramInt3 / 2, paramInt4 / 2) * 0.8F);
      int j = paramInt1 < paramInt3 / 2 ? -1 : 1;
      if (paramInt1 * paramInt1 + paramInt2 * paramInt2 < i * i) {
        return paramInt1;
      }
      return j * (int)Math.sqrt(i * i * (1 / (paramInt2 * paramInt2 / (paramInt1 * paramInt1) + 1)));
    case 2:
      float f1 = paramInt3 / 2.0F;
      float f2 = paramInt4 / 2.0F;
      float f3 = (paramInt2 - f2) / (paramInt1 - f1);
      float f4 = paramInt2 - f3 * paramInt1;
      float f5;
      float f6;
      if (paramInt1 < f1) {
        if (paramInt2 < f2) {
          f5 = -f2 / f1;
          f6 = f2;
        } else {
          f5 = f2 / f1;
          f6 = f2;
        }
      }
      else if (paramInt2 < f2) {
        f5 = f2 / f1;
        f6 = -f2;
      } else {
        f5 = -f2 / f1;
        f6 = 3.0F * f2;
      }

      return (int)((f6 - f4) / (f3 - f5));
    }

    return paramInt1;
  }

  public int t(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    switch (ZK.cMj[ordinal()]) {
    case 1:
      if (paramInt2 < 0)
        return 0;
      if (paramInt2 > paramInt4) {
        return paramInt4;
      }
      return paramInt2;
    case 3:
      int i = (int)(Math.min(paramInt3 / 2, paramInt4 / 2) * 0.8F);
      int j = paramInt2 < paramInt4 / 2 ? -1 : 1;
      if (paramInt1 * paramInt1 + paramInt2 * paramInt2 < i * i) {
        return paramInt2;
      }
      return j * (int)Math.sqrt(i * i * (1 / (paramInt1 * paramInt1 / (paramInt2 * paramInt2) + 1)));
    case 2:
      float f1 = paramInt3 / 2.0F;
      float f2 = paramInt4 / 2.0F;
      float f3 = (paramInt2 - f2) / (paramInt1 - f1);
      float f4 = paramInt2 - f3 * paramInt1;
      float f5;
      float f6;
      if (paramInt1 < f1) {
        if (paramInt2 < f2) {
          f5 = -f2 / f1;
          f6 = f2;
        } else {
          f5 = f2 / f1;
          f6 = f2;
        }
      }
      else if (paramInt2 < f2) {
        f5 = f2 / f1;
        f6 = -f2;
      } else {
        f5 = -f2 / f1;
        f6 = 3.0F * f2;
      }

      float f7 = (f6 - f4) / (f3 - f5);
      return (int)(f3 * f7 + f4);
    }

    return paramInt2;
  }

  public static bGn jJ(String paramString) {
    bGn[] arrayOfbGn1 = values();

    for (bGn localbGn : arrayOfbGn1) {
      if (localbGn.name().equals(paramString.toUpperCase())) {
        return localbGn;
      }
    }

    return arrayOfbGn1[0];
  }
}