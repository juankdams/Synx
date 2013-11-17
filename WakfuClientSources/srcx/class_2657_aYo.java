import org.apache.log4j.Logger;

public class aYo
{
  private static final Logger K = Logger.getLogger(aYo.class);

  public static buS a(int paramInt, dGX paramdGX)
  {
    if (paramdGX == null)
    {
      K.error("Impossible de créer une action de generic à partir d'une constante 'null'", new IllegalArgumentException());
      return null;
    }
    switch (cOV.kxT[paramdGX.ordinal()]) {
    case 1:
      return new atP(paramInt);
    case 2:
      return new bTH(paramInt);
    case 3:
      return new btU(paramInt);
    case 4:
      return new dct(paramInt);
    case 5:
      return new aIM(paramInt);
    case 6:
      return new dLG(paramInt);
    case 7:
      return new cZu(paramInt);
    case 8:
      return new dgV(paramInt);
    case 9:
      return new sa(paramInt);
    }
    return null;
  }

  public static buS a(cfc paramcfc)
  {
    buS localbuS = a(paramcfc.eo(), paramcfc.cia());
    if (localbuS != null) {
      localbuS.b(paramcfc);
    }
    return localbuS;
  }
}