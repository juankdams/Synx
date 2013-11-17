import org.apache.log4j.Logger;

public class dkA
{
  private static final Logger K = Logger.getLogger(dkA.class);

  public static void b(doA paramdoA, String paramString1, String paramString2, String paramString3) {
    bvc localbvc = bvc.iT(paramString1);

    if (localbvc == null)
    {
      K.error("Mauvais paramètres " + paramString1 + "ne correspondant à aucun HMIProviderType", new IllegalArgumentException());
      return;
    }

    aFN localaFN = aFN.gt(paramString3);

    if (localaFN == null)
    {
      K.error("Mauvais paramètres " + paramString3 + "ne correspondant à aucun HMIPropertyValueType", new IllegalArgumentException());
      return;
    }

    Object localObject = a(paramdoA, localaFN);

    a(localbvc, localObject);
  }

  private static void a(bvc parambvc, Object paramObject) {
    byz localbyz = byv.bFN().bFO();
    switch (qk.aXh[parambvc.ordinal()]) {
    case 1:
      K.warn("TODO prison : refaire le system de HMI Action de prison");
    }
  }

  public static void m(String paramString1, String paramString2, String paramString3)
  {
    bvc localbvc = bvc.iT(paramString1);

    if (localbvc == null)
    {
      K.error("Mauvais paramètres " + paramString1 + "ne correspondant à aucun HMIProviderType", new IllegalArgumentException());
      return;
    }

    a(localbvc);
  }

  private static void a(bvc parambvc) {
    byz localbyz = byv.bFN().bFO();
    switch (qk.aXh[parambvc.ordinal()]) {
    case 1:
      K.warn("TODO prison : refaire le system de HMI Action de prison");
    }
  }

  private static Object a(doA paramdoA, aFN paramaFN)
  {
    Integer localInteger = null;
    switch (qk.aXi[paramaFN.ordinal()]) {
    case 1:
      localInteger = Integer.valueOf(paramdoA.bWm());
    }
    return localInteger;
  }
}