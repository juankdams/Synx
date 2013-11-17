class cKB extends dqm
{
  aNZ c(apK paramapK, cf paramcf)
  {
    aNZ localaNZ = new aNZ(paramcf);

    if ((localaNZ.order < 1) || (localaNZ.dvW < 1) || (localaNZ.eui < 1) || (localaNZ.eul < 1)) {
      return null;
    }

    for (int i = 0; i < localaNZ.eul; i++) {
      localaNZ.eum[i] = paramcf.read(8);
      if ((localaNZ.eum[i] < 0) || (localaNZ.eum[i] >= paramapK.dwg)) {
        return null;
      }
    }
    return localaNZ;
  }

  aRE a(dPO paramdPO, wm paramwm, aNZ paramaNZ) {
    aRE localaRE = new aRE(paramaNZ, paramdPO.miW.dwa[paramwm.bmc] / 2);

    float f = localaRE.eOF / cQ((float)(paramaNZ.dvW / 2.0D));
    for (int i = 0; i < localaRE.n; i++) {
      int j = (int)Math.floor(cQ((float)(paramaNZ.dvW / 2.0D / localaRE.n * i)) * f);
      if (j >= localaRE.eOF)
        j = localaRE.eOF;
      localaRE.eOH[i] = j;
    }
    return localaRE;
  }

  private static float cQ(float paramFloat) {
    return (float)(13.1D * Math.atan(0.00074D * paramFloat) + 2.24D * Math.atan(paramFloat * paramFloat * 1.85E-008D) + 0.0001D * paramFloat);
  }

  void O(Object paramObject)
  {
  }

  float[] a(cPr paramcPr, aRE paramaRE, Object paramObject) {
    aNZ localaNZ = paramaRE.eOI;
    float[] arrayOfFloat = null;
    if ((paramObject instanceof float[])) {
      arrayOfFloat = (float[])paramObject;
    }

    int i = paramcPr.kyp.read(localaNZ.euj);
    if (i > 0) {
      int j = (1 << localaNZ.euj) - 1;
      float f1 = i / j * localaNZ.euk;
      int k = paramcPr.kyp.read(bhz.pE(localaNZ.eul));

      if ((k != -1) && (k < localaNZ.eul)) {
        aaN localaaN = paramcPr.kyw.fhm[localaNZ.eum[k]];

        if ((arrayOfFloat == null) || (arrayOfFloat.length < paramaRE.eOG + 1))
          arrayOfFloat = new float[paramaRE.eOG + 1];
        else {
          for (m = 0; m < arrayOfFloat.length; m++) {
            arrayOfFloat[m] = 0.0F;
          }
        }
        for (int m = 0; m < paramaRE.eOG; m += localaaN.cPc) {
          if (localaaN.c(arrayOfFloat, m, paramcPr.kyp, localaaN.cPc) == -1) {
            return null;
          }
        }

        float f2 = 0.0F;
        for (int n = 0; n < paramaRE.eOG; ) {
          for (int i1 = 0; i1 < localaaN.cPc; n++) {
            arrayOfFloat[n] += f2;

            i1++;
          }
          f2 = arrayOfFloat[(n - 1)];
        }
        arrayOfFloat[paramaRE.eOG] = f1;
        return arrayOfFloat;
      }
    }
    return null;
  }

  int a(cPr paramcPr, aRE paramaRE, Object paramObject, float[] paramArrayOfFloat) {
    aNZ localaNZ = paramaRE.eOI;

    if (paramObject != null) {
      float[] arrayOfFloat = (float[])paramObject;
      float f = arrayOfFloat[paramaRE.eOG];

      bHG.a(paramArrayOfFloat, paramaRE.eOH, paramaRE.n, paramaRE.eOF, arrayOfFloat, paramaRE.eOG, f, localaNZ.euk);

      return 1;
    }
    for (int i = 0; i < paramaRE.n; i++) {
      paramArrayOfFloat[i] = 0.0F;
    }
    return 0;
  }
}