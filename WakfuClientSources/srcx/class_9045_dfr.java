import org.apache.log4j.Logger;

public enum dfr
{
  private static final Logger K = Logger.getLogger(dfr.class);
  private final aug kZN;

  private dfr(aug arg3)
  {
    Object localObject;
    this.kZN = localObject;
  }

  public static ctN eU(byte paramByte) {
    dfr[] arrayOfdfr = values();

    if ((paramByte < 0) || (paramByte > arrayOfdfr.length)) {
      K.error("Impossible de créer une requête à partir de son ordinal : rodinal en dehors des limites : " + values().length + " max, " + paramByte + " demandé");

      return null;
    }

    dfr localdfr = values()[paramByte];
    if (localdfr.kZN != null)
      return localdfr.kZN.QF();
    return null;
  }
}