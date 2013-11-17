public class dsE
  implements agG, dUd
{
  private static final long luP = 60000L;
  private int luQ;
  private int luR = -1;
  private long luS;
  private static final dsE luT = new dsE();

  public static dsE cYW() {
    return luT;
  }

  public static void init(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 255))
      throw new IllegalArgumentException("Le numéro de serveur doit être compris entre 0 et 255");
    luT.luR = paramInt;
    luT.luQ = 0;
    luT.cYY();
    cAo.cxf().a(luT, 60000L, 0);
  }

  public static long cYX()
  {
    long l = luT.luS + (luT.luQ & 0xFFFFFF);
    luT.luQ += 1;
    return l;
  }

  public boolean a(cWG paramcWG)
  {
    if (paramcWG.getId() == -2147483648) {
      cYY();
      this.luQ = 0;
      return false;
    }
    return true;
  }

  private void cYY()
  {
    if ((this.luR < 0) || (this.luR > 255))
      throw new IllegalArgumentException("Impossible d'initialiser le GUIDGenerator : Le numéro de serveur doit être fixé par la méthode init");
    this.luS = ((this.luR & 0xFF) << 48);
    this.luS |= (System.currentTimeMillis() / 60000L & 0xFFFFFF) << 24;
  }

  public long getId() {
    return 1L;
  }

  public void a(long paramLong) {
  }

  public long asd() {
    return cYX();
  }
}