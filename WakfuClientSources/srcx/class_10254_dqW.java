public final class dqW
{
  private static final long ltt = 4611686018427387903L;
  private static long ltu = -1L;
  private static long ltv = 0L;

  public static void kb(long paramLong)
  {
    if (paramLong >= 0L)
      throw new IndexOutOfBoundsException("L'id de base pour la génération dynamique doit etre négatif.");
    ltv = paramLong;
  }

  public static long kc(long paramLong)
  {
    if (paramLong < 0L)
      return paramLong;
    if (paramLong >= 4611686018427387903L)
      throw new IndexOutOfBoundsException("L'ID spécifié écrase une plage d'ID existante id=" + paramLong + " >= " + 4611686018427387903L);
    return 4611686018427387903L + paramLong;
  }

  public static long kd(long paramLong)
  {
    if (paramLong > 4611686018427387903L)
      return paramLong - 4611686018427387903L;
    return paramLong;
  }

  public static boolean ke(long paramLong)
  {
    return paramLong >= 4611686018427387903L;
  }

  public static boolean kf(long paramLong)
  {
    return paramLong < 0L;
  }

  public static long cYb()
  {
    return ltv - ltu--;
  }
}