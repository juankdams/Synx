import org.apache.log4j.Logger;

public final class bIP
{
  private static Logger K = Logger.getLogger(bIP.class);

  public static void a(int paramInt, bES parambES)
  {
    Object localObject;
    switch (paramInt) {
    case 8100:
      localObject = new ail();
      break;
    case 8300:
      localObject = new aWt();
      break;
    case 8104:
      localObject = new aCy();
      break;
    default:
      K.warn("ATTENTION : l'id de message passé en parametre n'est pas géré par la factory : " + paramInt);
      localObject = blJ.bwM();
    }

    ((bWH)localObject).jl(paramInt);
    parambES.a((bWH)localObject);
  }
}