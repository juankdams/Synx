public class art extends bIU
{
  public static double d(double paramDouble1, double paramDouble2)
  {
    double d = paramDouble1 + paramDouble2;
    d = h(d);
    if (d == 0.0D)
      return 1.0D;
    if (paramDouble1 > paramDouble2)
    {
      d = h(paramDouble1) / d;
      d *= h(paramDouble2);
    }
    else
    {
      d = h(paramDouble2) / d;
      d *= h(paramDouble1);
    }
    return d;
  }

  public static double h(double paramDouble)
  {
    double[] arrayOfDouble1 = { 0.0001601195224767519D, 0.001191351470065864D, 0.01042137975617616D, 0.04763678004571372D, 0.207448227648436D, 0.4942148268014971D, 1.0D };
    double[] arrayOfDouble2 = { -2.315818733241201E-005D, 0.0005396055804933034D, -0.004456419138517973D, 0.01181397852220604D, 0.03582363986054987D, -0.2345917957182434D, 0.0714304917030273D, 1.0D };
    double d3 = Math.abs(paramDouble);
    if (d3 > 33.0D)
    {
      if (paramDouble < 0.0D)
      {
        d1 = Math.floor(d3);
        if (d1 == d3)
          throw new ArithmeticException("gamma: overflow");
        int i = (int)d1;
        d2 = d3 - d1;
        if (d2 > 0.5D)
        {
          d1 += 1.0D;
          d2 = d3 - d1;
        }
        d2 = d3 * Math.sin(3.141592653589793D * d2);
        if (d2 == 0.0D)
          throw new ArithmeticException("gamma: overflow");
        d2 = Math.abs(d2);
        d2 = 3.141592653589793D / (d2 * j(d3));
        return -d2;
      }
      return j(paramDouble);
    }
    for (double d2 = 1.0D; paramDouble >= 3.0D; d2 *= paramDouble)
      paramDouble -= 1.0D;
    while (paramDouble < 0.0D)
    {
      if (paramDouble == 0.0D)
        throw new ArithmeticException("gamma: singular");
      if (paramDouble > -1.E-009D)
        return d2 / ((1.0D + 0.5772156649015329D * paramDouble) * paramDouble);
      d2 /= paramDouble;
      paramDouble += 1.0D;
    }
    while (paramDouble < 2.0D)
    {
      if (paramDouble == 0.0D)
        throw new ArithmeticException("gamma: singular");
      if (paramDouble < 1.E-009D)
        return d2 / ((1.0D + 0.5772156649015329D * paramDouble) * paramDouble);
      d2 /= paramDouble;
      paramDouble += 1.0D;
    }
    if ((paramDouble == 2.0D) || (paramDouble == 3.0D))
      return d2;
    paramDouble -= 2.0D;
    double d1 = tO.b(paramDouble, arrayOfDouble1, 6);
    d3 = tO.b(paramDouble, arrayOfDouble2, 7);
    return d2 * d1 / d3;
  }

  public static double a(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    if ((paramDouble1 <= 0.0D) || (paramDouble2 <= 0.0D))
      throw new ArithmeticException("ibeta: Domain error!");
    if ((paramDouble3 <= 0.0D) || (paramDouble3 >= 1.0D))
    {
      if (paramDouble3 == 0.0D)
        return 0.0D;
      if (paramDouble3 == 1.0D)
        return 1.0D;
      throw new ArithmeticException("ibeta: Domain error!");
    }
    int i = 0;
    if ((paramDouble2 * paramDouble3 <= 1.0D) && (paramDouble3 <= 0.95D))
    {
      d3 = d(paramDouble1, paramDouble2, paramDouble3);
      return d3;
    }
    double d6 = 1.0D - paramDouble3;
    double d1;
    double d2;
    double d5;
    double d4;
    if (paramDouble3 > paramDouble1 / (paramDouble1 + paramDouble2))
    {
      i = 1;
      d1 = paramDouble2;
      d2 = paramDouble1;
      d5 = paramDouble3;
      d4 = d6;
    }
    else
    {
      d1 = paramDouble1;
      d2 = paramDouble2;
      d5 = d6;
      d4 = paramDouble3;
    }
    if ((i != 0) && (d2 * d4 <= 1.0D) && (d4 <= 0.95D))
    {
      d3 = d(d1, d2, d4);
      if (d3 <= 1.110223024625157E-016D)
        d3 = 0.9999999999999999D;
      else
        d3 = 1.0D - d3;
      return d3;
    }
    double d7 = d4 * (d1 + d2 - 2.0D) - (d1 - 1.0D);
    if (d7 < 0.0D)
      d6 = b(d1, d2, d4);
    else
      d6 = c(d1, d2, d4) / d5;
    d7 = d1 * Math.log(d4);
    double d3 = d2 * Math.log(d5);
    if ((d1 + d2 < 171.62437695630271D) && (Math.abs(d7) < 709.78271289338397D) && (Math.abs(d3) < 709.78271289338397D))
    {
      d3 = Math.pow(d5, d2);
      d3 *= Math.pow(d4, d1);
      d3 /= d1;
      d3 *= d6;
      d3 *= h(d1 + d2) / (h(d1) * h(d2));
      if (i != 0)
        if (d3 <= 1.110223024625157E-016D)
          d3 = 0.9999999999999999D;
        else
          d3 = 1.0D - d3;
      return d3;
    }
    d7 += d3 + i(d1 + d2) - i(d1) - i(d2);
    d7 += Math.log(d6 / d1);
    if (d7 < -745.13321910194122D)
      d3 = 0.0D;
    else
      d3 = Math.exp(d7);
    if (i != 0)
      if (d3 <= 1.110223024625157E-016D)
        d3 = 0.9999999999999999D;
      else
        d3 = 1.0D - d3;
    return d3;
  }

  static double b(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    double d8 = paramDouble1;
    double d9 = paramDouble1 + paramDouble2;
    double d10 = paramDouble1;
    double d11 = paramDouble1 + 1.0D;
    double d12 = 1.0D;
    double d13 = paramDouble2 - 1.0D;
    double d14 = d11;
    double d15 = paramDouble1 + 2.0D;
    double d4 = 0.0D;
    double d7 = 1.0D;
    double d3 = 1.0D;
    double d6 = 1.0D;
    double d18 = 1.0D;
    double d16 = 1.0D;
    int i = 0;
    double d19 = 3.33066907387547E-016D;
    do
    {
      double d1 = -(paramDouble3 * d8 * d9) / (d10 * d11);
      double d2 = d3 + d4 * d1;
      double d5 = d6 + d7 * d1;
      d4 = d3;
      d3 = d2;
      d7 = d6;
      d6 = d5;
      d1 = paramDouble3 * d12 * d13 / (d14 * d15);
      d2 = d3 + d4 * d1;
      d5 = d6 + d7 * d1;
      d4 = d3;
      d3 = d2;
      d7 = d6;
      d6 = d5;
      if (d5 != 0.0D)
        d16 = d2 / d5;
      double d17;
      if (d16 != 0.0D)
      {
        d17 = Math.abs((d18 - d16) / d16);
        d18 = d16;
      }
      else
      {
        d17 = 1.0D;
      }
      if (d17 < d19)
        return d18;
      d8 += 1.0D;
      d9 += 1.0D;
      d10 += 2.0D;
      d11 += 2.0D;
      d12 += 1.0D;
      d13 -= 1.0D;
      d14 += 2.0D;
      d15 += 2.0D;
      if (Math.abs(d5) + Math.abs(d2) > 4503599627370496.0D)
      {
        d4 *= 2.220446049250313E-016D;
        d3 *= 2.220446049250313E-016D;
        d7 *= 2.220446049250313E-016D;
        d6 *= 2.220446049250313E-016D;
      }
      if ((Math.abs(d5) < 2.220446049250313E-016D) || (Math.abs(d2) < 2.220446049250313E-016D))
      {
        d4 *= 4503599627370496.0D;
        d3 *= 4503599627370496.0D;
        d7 *= 4503599627370496.0D;
        d6 *= 4503599627370496.0D;
      }
      i++;
    }
    while (i < 300);
    return d18;
  }

  static double c(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    double d8 = paramDouble1;
    double d9 = paramDouble2 - 1.0D;
    double d10 = paramDouble1;
    double d11 = paramDouble1 + 1.0D;
    double d12 = 1.0D;
    double d13 = paramDouble1 + paramDouble2;
    double d14 = paramDouble1 + 1.0D;
    double d15 = paramDouble1 + 2.0D;
    double d4 = 0.0D;
    double d7 = 1.0D;
    double d3 = 1.0D;
    double d6 = 1.0D;
    double d19 = paramDouble3 / (1.0D - paramDouble3);
    double d18 = 1.0D;
    double d16 = 1.0D;
    int i = 0;
    double d20 = 3.33066907387547E-016D;
    do
    {
      double d1 = -(d19 * d8 * d9) / (d10 * d11);
      double d2 = d3 + d4 * d1;
      double d5 = d6 + d7 * d1;
      d4 = d3;
      d3 = d2;
      d7 = d6;
      d6 = d5;
      d1 = d19 * d12 * d13 / (d14 * d15);
      d2 = d3 + d4 * d1;
      d5 = d6 + d7 * d1;
      d4 = d3;
      d3 = d2;
      d7 = d6;
      d6 = d5;
      if (d5 != 0.0D)
        d16 = d2 / d5;
      double d17;
      if (d16 != 0.0D)
      {
        d17 = Math.abs((d18 - d16) / d16);
        d18 = d16;
      }
      else
      {
        d17 = 1.0D;
      }
      if (d17 < d20)
        return d18;
      d8 += 1.0D;
      d9 -= 1.0D;
      d10 += 2.0D;
      d11 += 2.0D;
      d12 += 1.0D;
      d13 += 1.0D;
      d14 += 2.0D;
      d15 += 2.0D;
      if (Math.abs(d5) + Math.abs(d2) > 4503599627370496.0D)
      {
        d4 *= 2.220446049250313E-016D;
        d3 *= 2.220446049250313E-016D;
        d7 *= 2.220446049250313E-016D;
        d6 *= 2.220446049250313E-016D;
      }
      if ((Math.abs(d5) < 2.220446049250313E-016D) || (Math.abs(d2) < 2.220446049250313E-016D))
      {
        d4 *= 4503599627370496.0D;
        d3 *= 4503599627370496.0D;
        d7 *= 4503599627370496.0D;
        d6 *= 4503599627370496.0D;
      }
      i++;
    }
    while (i < 300);
    return d18;
  }

  public static double e(double paramDouble1, double paramDouble2)
  {
    if ((paramDouble2 <= 0.0D) || (paramDouble1 <= 0.0D))
      return 0.0D;
    if ((paramDouble2 > 1.0D) && (paramDouble2 > paramDouble1))
      return 1.0D - f(paramDouble1, paramDouble2);
    double d2 = paramDouble1 * Math.log(paramDouble2) - paramDouble2 - i(paramDouble1);
    if (d2 < -709.78271289338397D)
      return 0.0D;
    d2 = Math.exp(d2);
    double d4 = paramDouble1;
    double d3 = 1.0D;
    double d1 = 1.0D;
    do
    {
      d4 += 1.0D;
      d3 *= paramDouble2 / d4;
      d1 += d3;
    }
    while (d3 / d1 > 1.110223024625157E-016D);
    return d1 * d2 / paramDouble1;
  }

  public static double f(double paramDouble1, double paramDouble2)
  {
    if ((paramDouble2 <= 0.0D) || (paramDouble1 <= 0.0D))
      return 1.0D;
    if ((paramDouble2 < 1.0D) || (paramDouble2 < paramDouble1))
      return 1.0D - e(paramDouble1, paramDouble2);
    double d2 = paramDouble1 * Math.log(paramDouble2) - paramDouble2 - i(paramDouble1);
    if (d2 < -709.78271289338397D)
      return 0.0D;
    d2 = Math.exp(d2);
    double d7 = 1.0D - paramDouble1;
    double d8 = paramDouble2 + d7 + 1.0D;
    double d3 = 0.0D;
    double d11 = 1.0D;
    double d14 = paramDouble2;
    double d10 = paramDouble2 + 1.0D;
    double d13 = d8 * paramDouble2;
    double d1 = d10 / d13;
    double d6;
    do
    {
      d3 += 1.0D;
      d7 += 1.0D;
      d8 += 2.0D;
      double d4 = d7 * d3;
      double d9 = d10 * d8 - d11 * d4;
      double d12 = d13 * d8 - d14 * d4;
      if (d12 != 0.0D)
      {
        double d5 = d9 / d12;
        d6 = Math.abs((d1 - d5) / d5);
        d1 = d5;
      }
      else
      {
        d6 = 1.0D;
      }
      d11 = d10;
      d10 = d9;
      d14 = d13;
      d13 = d12;
      if (Math.abs(d9) > 4503599627370496.0D)
      {
        d11 *= 2.220446049250313E-016D;
        d10 *= 2.220446049250313E-016D;
        d14 *= 2.220446049250313E-016D;
        d13 *= 2.220446049250313E-016D;
      }
    }
    while (d6 > 1.110223024625157E-016D);
    return d1 * d2;
  }

  public static double i(double paramDouble)
  {
    double[] arrayOfDouble1 = { 0.0008116141674705085D, -0.0005950619042843014D, 0.0007936503404577169D, -0.002777777777300997D, 0.0833333333333332D };
    double[] arrayOfDouble2 = { -1378.2515256912086D, -38801.631513463784D, -331612.99273887119D, -1162370.9749276231D, -1721737.0082083966D, -853555.66424576542D };
    double[] arrayOfDouble3 = { -351.81570143652345D, -17064.210665188115D, -220528.59055385445D, -1139334.4436798252D, -2532523.0717758294D, -2018891.4143353277D };
    double d4;
    if (paramDouble < -34.0D)
    {
      d2 = -paramDouble;
      double d3 = i(d2);
      d1 = Math.floor(d2);
      if (d1 == d2)
        throw new ArithmeticException("lgam: Overflow");
      d4 = d2 - d1;
      if (d4 > 0.5D)
      {
        d1 += 1.0D;
        d4 = d1 - d2;
      }
      d4 = d2 * Math.sin(3.141592653589793D * d4);
      if (d4 == 0.0D)
        throw new ArithmeticException("lgamma: Overflow");
      d4 = 1.1447298858494D - Math.log(d4) - d3;
      return d4;
    }
    if (paramDouble < 13.0D)
    {
      for (d4 = 1.0D; paramDouble >= 3.0D; d4 *= paramDouble)
        paramDouble -= 1.0D;
      while (paramDouble < 2.0D)
      {
        if (paramDouble == 0.0D)
          throw new ArithmeticException("lgamma: Overflow");
        d4 /= paramDouble;
        paramDouble += 1.0D;
      }
      if (d4 < 0.0D)
        d4 = -d4;
      if (paramDouble == 2.0D)
        return Math.log(d4);
      paramDouble -= 2.0D;
      d1 = paramDouble * tO.b(paramDouble, arrayOfDouble2, 5) / tO.a(paramDouble, arrayOfDouble3, 6);
      return Math.log(d4) + d1;
    }
    if (paramDouble > 2.556348E+305D)
      throw new ArithmeticException("lgamma: Overflow");
    double d2 = (paramDouble - 0.5D) * Math.log(paramDouble) - paramDouble + 0.9189385332046728D;
    if (paramDouble > 100000000.0D)
      return d2;
    double d1 = 1.0D / (paramDouble * paramDouble);
    if (paramDouble >= 1000.0D)
      d2 += ((0.0007936507936507937D * d1 - 0.002777777777777778D) * d1 + 0.08333333333333333D) / paramDouble;
    else
      d2 += tO.b(d1, arrayOfDouble1, 4) / paramDouble;
    return d2;
  }

  static double d(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    double d8 = 1.0D / paramDouble1;
    double d3 = (1.0D - paramDouble2) * paramDouble3;
    double d4 = d3 / (paramDouble1 + 1.0D);
    double d6 = d4;
    double d2 = d3;
    double d5 = 2.0D;
    double d1 = 0.0D;
    double d7 = 1.110223024625157E-016D * d8;
    while (Math.abs(d4) > d7)
    {
      d3 = (d5 - paramDouble2) * paramDouble3 / d5;
      d2 *= d3;
      d4 = d2 / (paramDouble1 + d5);
      d1 += d4;
      d5 += 1.0D;
    }
    d1 += d6;
    d1 += d8;
    d3 = paramDouble1 * Math.log(paramDouble3);
    if ((paramDouble1 + paramDouble2 < 171.62437695630271D) && (Math.abs(d3) < 709.78271289338397D))
    {
      d2 = h(paramDouble1 + paramDouble2) / (h(paramDouble1) * h(paramDouble2));
      d1 = d1 * d2 * Math.pow(paramDouble3, paramDouble1);
    }
    else
    {
      d2 = i(paramDouble1 + paramDouble2) - i(paramDouble1) - i(paramDouble2) + d3 + Math.log(d1);
      if (d2 < -745.13321910194122D)
        d1 = 0.0D;
      else
        d1 = Math.exp(d2);
    }
    return d1;
  }

  static double j(double paramDouble)
  {
    double[] arrayOfDouble = { 0.0007873113957930937D, -0.0002295499616133781D, -0.002681326178057812D, 0.003472222216054587D, 0.0833333333333482D };
    double d1 = 143.01607999999999D;
    double d2 = 1.0D / paramDouble;
    double d3 = Math.exp(paramDouble);
    d2 = 1.0D + d2 * tO.b(d2, arrayOfDouble, 4);
    if (paramDouble > d1)
    {
      double d4 = Math.pow(paramDouble, 0.5D * paramDouble - 0.25D);
      d3 = d4 * (d4 / d3);
    }
    else
    {
      d3 = Math.pow(paramDouble, paramDouble - 0.5D) / d3;
    }
    d3 = 2.506628274631001D * d3 * d2;
    return d3;
  }
}