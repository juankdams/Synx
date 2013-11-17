import org.apache.log4j.Logger;

public final class bYs
{
  private static final Logger K = Logger.getLogger(bYs.class);

  public static wz c(kH paramkH)
  {
    int i = paramkH.type;
    Object localObject;
    switch (i) {
    case 1:
      localObject = new cNr();
      break;
    case 2:
      localObject = new abW();
      break;
    default:
      K.error("Type de location inconnu " + i);
      return null;
    }

    ((wz)localObject).b(paramkH);
    return localObject;
  }
}