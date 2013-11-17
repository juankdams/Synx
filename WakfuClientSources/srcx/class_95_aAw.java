import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class aAw
{
  public static dhJ e(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    axQ localaxQ = f(paramObject1, paramObject2, paramObject3, paramObject4);
    if ((localaxQ instanceof dhJ))
      return (dhJ)localaxQ;
    return null;
  }

  public static dhJ a(boolean paramBoolean, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    axQ localaxQ = b(paramBoolean, paramObject1, paramObject2, paramObject3, paramObject4);
    if ((localaxQ instanceof dhJ))
      return (dhJ)localaxQ;
    return null;
  }

  public static axQ b(boolean paramBoolean, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    Object localObject = paramBoolean ? paramObject2 : paramObject1;
    if ((localObject instanceof axQ)) {
      return (axQ)localObject;
    }
    return a(paramObject2, paramObject3, paramObject4);
  }

  public static List c(boolean paramBoolean, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    Object localObject = paramBoolean ? paramObject2 : paramObject1;
    if ((localObject instanceof axQ)) {
      return Collections.singletonList((axQ)localObject);
    }
    return b(paramObject2, paramObject3, paramObject4);
  }

  public static cYk d(boolean paramBoolean, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    Object localObject = paramBoolean ? paramObject2 : paramObject1;
    if ((localObject instanceof cYk))
      return (cYk)localObject;
    if ((localObject instanceof axQ))
      return ((axQ)localObject).ML();
    return null;
  }

  public static axQ f(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if ((paramObject1 instanceof axQ)) {
      return (axQ)paramObject1;
    }
    if ((paramObject2 instanceof axQ)) {
      return (axQ)paramObject2;
    }
    return a(paramObject2, paramObject3, paramObject4);
  }

  private static axQ a(Object paramObject1, Object paramObject2, Object paramObject3) {
    if ((paramObject2 instanceof apn)) {
      localObject = (apn)paramObject2;
      return ((apn)localObject).aBv();
    }

    if ((paramObject3 instanceof apn)) {
      localObject = (apn)paramObject3;
      return ((apn)localObject).aBv();
    }

    if (!(paramObject1 instanceof cYk)) {
      return null;
    }
    Object localObject = ah(paramObject2);
    if (localObject == null)
      return null;
    cYk localcYk = (cYk)paramObject1;
    return ((dbE)localObject).x(localcYk);
  }

  private static List b(Object paramObject1, Object paramObject2, Object paramObject3) {
    if ((paramObject2 instanceof apn)) {
      localObject = (apn)paramObject2;
      return Collections.singletonList(((apn)localObject).aBv());
    }

    if ((paramObject3 instanceof apn)) {
      localObject = (apn)paramObject3;
      return Collections.singletonList(((apn)localObject).aBv());
    }

    if (!(paramObject1 instanceof cYk)) {
      return Collections.emptyList();
    }
    Object localObject = new ArrayList();
    dbE localdbE = ah(paramObject2);
    if (localdbE == null)
      return Collections.emptyList();
    cYk localcYk = (cYk)paramObject1;
    ((List)localObject).add(localdbE.x(localcYk));

    List localList = localdbE.LC().v(localcYk);
    int i = 0; for (int j = localList.size(); i < j; i++) {
      cjK localcjK = (cjK)localList.get(i);
      ((List)localObject).add((axQ)localcjK);
    }

    return localObject;
  }

  public static dbE ah(Object paramObject) {
    if (paramObject == null)
      return null;
    if ((paramObject instanceof dbE))
      return (dbE)paramObject;
    if ((paramObject instanceof dMC))
      return ((dMC)paramObject).dps();
    return null;
  }

  public static dle ai(Object paramObject)
  {
    if (paramObject == null)
      return null;
    if ((paramObject instanceof dhJ))
      return ((dhJ)paramObject).afw();
    if ((paramObject instanceof cBn))
      return ai(((cBn)paramObject).axG());
    if ((paramObject instanceof dle))
      return (dle)paramObject;
    return null;
  }

  public static doA aj(Object paramObject) {
    if (paramObject == null)
      return null;
    if (!(paramObject instanceof aVc)) {
      throw new aIh("Le critère d'effet est employé pour autre chose qu'un effet");
    }
    dji localdji = (dji)((aVc)paramObject).bkh();
    if (localdji == null) {
      return null;
    }
    return localdji.cRV();
  }

  public static dle ak(Object paramObject) {
    if (paramObject == null)
      return null;
    if (!(paramObject instanceof aVc)) {
      throw new aIh("Le critère d'effet est employé pour autre chose qu'un effet");
    }
    dji localdji = (dji)((aVc)paramObject).bkh();
    if (localdji == null) {
      return null;
    }
    doA localdoA = localdji.cRV();
    if (localdoA == null) {
      return null;
    }
    return localdoA.bkf();
  }

  public static dle al(Object paramObject) {
    if (paramObject == null)
      return null;
    if (!(paramObject instanceof aVc)) {
      throw new aIh("Le critère d'effet est employé pour autre chose qu'un effet");
    }
    dji localdji = (dji)((aVc)paramObject).bkh();
    if (localdji == null) {
      return null;
    }
    doA localdoA = localdji.cRV();
    if (localdoA == null) {
      return null;
    }
    return localdoA.bke();
  }

  public static dbE i(Object paramObject1, Object paramObject2) {
    if ((paramObject2 instanceof dbE)) {
      return (dbE)paramObject2;
    }
    if ((paramObject2 instanceof dMC)) {
      return ((dMC)paramObject2).dps();
    }
    if (!(paramObject1 instanceof axQ)) {
      throw new aIh("On essaie de compter les fighters d'un caster qui n'est pas un perso");
    }
    if ((paramObject1 instanceof dhJ)) {
      return (dbE)((dhJ)paramObject1).afv();
    }
    return null;
  }

  public static axQ a(String paramString, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    Object localObject1 = null;
    if ((paramString == null) || (paramString.equalsIgnoreCase("caster"))) {
      localObject1 = b(false, paramObject1, paramObject2, paramObject3, paramObject4);
    } else if (paramString.equalsIgnoreCase("target")) {
      localObject1 = b(true, paramObject1, paramObject2, paramObject3, paramObject4);
    }
    else
    {
      Object localObject2;
      if (paramString.equalsIgnoreCase("triggeringCaster")) {
        localObject2 = al(paramObject4);
        if ((localObject2 instanceof axQ))
          localObject1 = (axQ)localObject2;
      } else if (paramString.equalsIgnoreCase("triggeringTarget")) {
        localObject2 = ak(paramObject4);
        if ((localObject2 instanceof axQ))
          localObject1 = (axQ)localObject2;
      } else if (paramString.equalsIgnoreCase("casterController")) {
        localObject2 = b(false, paramObject1, paramObject2, paramObject3, paramObject4);
        dbE localdbE = ah(paramObject3);
        if (localdbE == null)
          return null;
        localObject1 = localdbE.eu(((axQ)localObject2).aJq());
      }
    }
    return localObject1;
  }
}