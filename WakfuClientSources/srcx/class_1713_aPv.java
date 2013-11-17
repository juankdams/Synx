import org.apache.log4j.Logger;

 enum aPv
{
  private static final Logger K = Logger.getLogger(aPv.class);
  static final int eLP = 1;
  static final int eLQ = 2;
  static final int eLR = 4;
  static final int eLS = 8;

  static aPv nv(int paramInt)
  {
    switch (paramInt) {
    case 3:
      return eLH;
    case 2:
      return eLL;
    case 0:
      return eLz;
    case 8:
      return eLA;
    case 12:
      return eLB;
    case 4:
      return eLC;
    case 1:
      return eLD;
    case 9:
      return eLE;
    case 13:
      return eLF;
    case 5:
      return eLG;
    case 11:
      return eLI;
    case 15:
      return eLJ;
    case 7:
      return eLK;
    case 10:
      return eLM;
    case 14:
      return eLN;
    case 6:
      return eLO;
    }
    K.error("type inconnu " + paramInt);
    return null;
  }

  protected abstract void a(bhb parambhb, dGK paramdGK, axM paramaxM1, axM paramaxM2);

  static void c(axM paramaxM1, axM paramaxM2)
  {
    paramaxM2.bOZ = paramaxM1.bOZ;
    paramaxM2.bPa = paramaxM1.bPa;
    paramaxM2.bPb = paramaxM1.bPb;
    paramaxM2.bPc = paramaxM1.bPc;
  }

  static void d(axM paramaxM1, axM paramaxM2) {
    paramaxM2.dNe = paramaxM1.dNe;
    paramaxM2.dNb = paramaxM1.dNb;
    paramaxM2.dNc = paramaxM1.dNc;
  }

  static void e(axM paramaxM1, axM paramaxM2) {
    paramaxM2.dNd = paramaxM1.dNd;
    paramaxM2.dMX = paramaxM1.dMX;
    paramaxM2.dMZ = paramaxM1.dMZ;
    paramaxM2.dMY = paramaxM1.dMY;
    paramaxM2.dNa = paramaxM1.dNa;
  }

  static void a(axM paramaxM1, axM paramaxM2, float[] paramArrayOfFloat, int paramInt)
  {
    paramaxM1.bOZ += paramArrayOfFloat[paramInt];
    paramaxM1.bPa += paramArrayOfFloat[(paramInt + 1)];
    paramaxM1.bPb += paramArrayOfFloat[(paramInt + 2)];
    paramaxM1.bPc += paramArrayOfFloat[(paramInt + 3)];
  }

  static void b(axM paramaxM1, axM paramaxM2, float[] paramArrayOfFloat, int paramInt)
  {
    paramaxM1.bOZ *= paramArrayOfFloat[paramInt];
    paramaxM1.bPa *= paramArrayOfFloat[(paramInt + 1)];
    paramaxM1.bPb *= paramArrayOfFloat[(paramInt + 2)];
    paramaxM1.bPc *= paramArrayOfFloat[(paramInt + 3)];
  }

  static void a(axM paramaxM1, axM paramaxM2, float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    paramaxM2.bOZ = (paramaxM1.bOZ * paramArrayOfFloat[paramInt2] + paramArrayOfFloat[paramInt1]);
    paramaxM2.bPa = (paramaxM1.bPa * paramArrayOfFloat[(paramInt2 + 1)] + paramArrayOfFloat[(paramInt1 + 1)]);
    paramaxM2.bPb = (paramaxM1.bPb * paramArrayOfFloat[(paramInt2 + 2)] + paramArrayOfFloat[(paramInt1 + 2)]);
    paramaxM2.bPc = (paramaxM1.bPc * paramArrayOfFloat[(paramInt2 + 3)] + paramArrayOfFloat[(paramInt1 + 3)]);
  }

  static void c(axM paramaxM1, axM paramaxM2, float[] paramArrayOfFloat, int paramInt)
  {
    paramaxM2.dNd = false;

    float f1 = paramArrayOfFloat[paramInt];
    float f2 = paramArrayOfFloat[(paramInt + 1)];
    float f3 = paramArrayOfFloat[(paramInt + 2)];
    float f4 = paramArrayOfFloat[(paramInt + 3)];

    if (paramaxM1.dNd) {
      paramaxM2.dMX = f1;
      paramaxM2.dMY = f2;
      paramaxM2.dMZ = f3;
      paramaxM2.dNa = f4;
    } else {
      paramaxM2.dMX = (f1 * paramaxM1.dMX + f2 * paramaxM1.dMZ);
      paramaxM2.dMY = (f1 * paramaxM1.dMY + f2 * paramaxM1.dNa);
      paramaxM2.dMZ = (f3 * paramaxM1.dMX + f4 * paramaxM1.dMZ);
      paramaxM2.dNa = (f3 * paramaxM1.dMY + f4 * paramaxM1.dNa);
    }
  }

  static void d(axM paramaxM1, axM paramaxM2, float[] paramArrayOfFloat, int paramInt)
  {
    paramaxM2.dNe = false;

    float f1 = paramArrayOfFloat[paramInt];
    float f2 = paramArrayOfFloat[(paramInt + 1)];
    if (paramaxM1.dNd) {
      paramaxM2.dNb = (f1 + paramaxM1.dNb);
      paramaxM2.dNc = (f2 + paramaxM1.dNc);
    } else {
      paramaxM2.dNb = (f1 * paramaxM1.dMX + f2 * paramaxM1.dMZ + paramaxM1.dNb);
      paramaxM2.dNc = (f1 * paramaxM1.dMY + f2 * paramaxM1.dNa + paramaxM1.dNc);
    }
  }

  static void a(axM paramaxM1, axM paramaxM2, float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2)
  {
    paramaxM2.dNd = false;
    paramaxM2.dNe = false;

    float f1 = paramArrayOfFloat1[paramInt1];
    float f2 = paramArrayOfFloat1[(paramInt1 + 1)];
    float f3 = paramArrayOfFloat1[(paramInt1 + 2)];
    float f4 = paramArrayOfFloat1[(paramInt1 + 3)];

    float f5 = paramArrayOfFloat2[paramInt2];
    float f6 = paramArrayOfFloat2[(paramInt2 + 1)];
    if (paramaxM1.dNd) {
      paramaxM2.dMX = f1;
      paramaxM2.dMY = f2;
      paramaxM2.dMZ = f3;
      paramaxM2.dNa = f4;

      paramaxM2.dNb = (f5 + paramaxM1.dNb);
      paramaxM2.dNc = (f6 + paramaxM1.dNc);
    } else {
      paramaxM2.dMX = (f1 * paramaxM1.dMX + f2 * paramaxM1.dMZ);
      paramaxM2.dMY = (f1 * paramaxM1.dMY + f2 * paramaxM1.dNa);
      paramaxM2.dMZ = (f3 * paramaxM1.dMX + f4 * paramaxM1.dMZ);
      paramaxM2.dNa = (f3 * paramaxM1.dMY + f4 * paramaxM1.dNa);

      paramaxM2.dNb = (f5 * paramaxM1.dMX + f6 * paramaxM1.dMZ + paramaxM1.dNb);
      paramaxM2.dNc = (f5 * paramaxM1.dMY + f6 * paramaxM1.dNa + paramaxM1.dNc);
    }
  }
}