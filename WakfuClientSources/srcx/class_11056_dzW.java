import java.util.BitSet;

final class dzW
{
  public static bTI t(doA paramdoA)
  {
    if (paramdoA == null)
      return null;
    if (paramdoA.bke() == null) {
      return null;
    }
    bTI[] arrayOfbTI = bTI.values();
    Object localObject = null;
    int i = 0;
    for (int j = 0; j < arrayOfbTI.length; j++) {
      bTI localbTI = arrayOfbTI[j];
      dle localdle = paramdoA.bke();
      if ((localdle.b(localbTI.bZS())) && ((localObject == null) || (i < localdle.e(localbTI.bZS()))))
      {
        localObject = localbTI;
        i = localdle.e(localbTI.bZS());
      }
    }
    return localObject;
  }

  public static bTI u(doA paramdoA)
  {
    if (paramdoA == null)
      return null;
    if (paramdoA.bkf() == null) {
      return null;
    }
    bTI[] arrayOfbTI = bTI.values();
    Object localObject = null;
    int i = 2147483647;
    dle localdle = paramdoA.bkf();
    for (int j = 0; j < arrayOfbTI.length; j++) {
      bTI localbTI = arrayOfbTI[j];
      if (localbTI != bTI.hfb)
      {
        eu localeu = localbTI.bZT();
        if ((localdle.b(localeu)) && ((localObject == null) || (i > localdle.e(localeu))))
        {
          localObject = localbTI;
          i = localdle.e(localeu);
        }
      }
    }
    return localObject;
  }

  public static int au(float paramFloat1, float paramFloat2) {
    if (paramFloat2 >= 0.0F) {
      return (int)Math.floor(paramFloat1);
    }
    return (int)Math.ceil(paramFloat1);
  }

  public static void a(bTI parambTI, uY paramuY) {
    if (parambTI == null) {
      return;
    }
    switch (adZ.cUV[parambTI.ordinal()]) {
    case 1:
      break;
    case 2:
      paramuY.DV().set(8);
      break;
    case 3:
      paramuY.DV().set(5);
      break;
    case 4:
      paramuY.DV().set(6);
      break;
    case 5:
      paramuY.DV().set(7);
      break;
    case 6:
      paramuY.DV().set(9);
    }
  }
}