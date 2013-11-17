import org.apache.log4j.Logger;

public class bcg
{
  private static final Logger K = Logger.getLogger(bcg.class);

  public static void a(aMl paramaMl, Su paramSu) {
    if (paramaMl == null) {
      return;
    }
    if (!paramaMl.bdy()) {
      return;
    }
    String str;
    try
    {
      str = ay.bd().getString("ANMEquipmentPath");
    } catch (bdh localbdh) {
      K.error("", localbdh);
      return;
    }

    cew localcew = paramSu.aeL();
    paramaMl.D(new bsT(str, localcew));
  }

  public static void b(aMl paramaMl, Su paramSu)
  {
    if (paramaMl == null) {
      return;
    }
    amu[] arrayOfamu1 = paramaMl.bdz();
    if (arrayOfamu1 == null) {
      return;
    }
    cew localcew = paramSu.aeL();
    for (amu localamu : arrayOfamu1)
      switch (localamu.cPb) {
      case 1:
        localcew.es(localamu.kj);
        localcew.eq(localamu.kj);
        break;
      case 2:
        localcew.et(localamu.kj);
        break;
      case 3:
        localcew.eq(localamu.kj);
      }
  }

  public static void c(aMl paramaMl, Su paramSu)
  {
    if (paramaMl == null) {
      return;
    }

    cew localcew = paramSu.aeL();
    paramaMl.E(new bsV(localcew));
  }

  public static void a(cUo paramcUo, bas parambas)
  {
    float[] arrayOfFloat = parambas.bPo.bUT();
    arrayOfFloat[0] *= 1.25F;
    arrayOfFloat[1] *= 1.25F;
    arrayOfFloat[2] *= 1.25F;
    paramcUo.e(parambas.fiq, arrayOfFloat);
  }
}