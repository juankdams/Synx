import java.util.EnumMap;
import java.util.Map;

public abstract class ccm
{
  public static final int htK = 0;
  private static final aot htL = aot.dtv;
  private static final Map htM = new EnumMap(dFN.class);

  public static void a(cQa[] paramArrayOfcQa) {
    int i = 0; for (int j = paramArrayOfcQa.length; i < j; i++) {
      cQa localcQa = paramArrayOfcQa[i];
      if (htM.containsKey(localcQa.cHc()))
        throw new IllegalArgumentException("Enregistrement multiple non autorisé pour le provider " + localcQa);
      htM.put(localcQa.cHc(), localcQa);
    }
  }

  public static aot cfG() {
    return htL;
  }

  public static cQa a(dFN paramdFN)
  {
    return (cQa)htM.get(paramdFN);
  }

  public static boolean a(awT paramawT, cPT paramcPT) {
    if ((!paramcPT.cGY()) && (paramawT.kR((int)paramcPT.getId()))) {
      return false;
    }
    return true;
  }
}