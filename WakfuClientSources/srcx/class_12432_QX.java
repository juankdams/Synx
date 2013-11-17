import org.apache.log4j.Logger;

public class QX
{
  private static final Logger K = Logger.getLogger("fileLoadingLogger");
  public static final String cqb = "animation";
  public static final String cqc = "bdata";
  public static final String cqd = "gui";
  public static final String cqe = "gui_dialog";
  public static final String cqf = "world";
  public static final String cqg = "particule";
  public static final String cqh = "script";
  public static final String cqi = "sound";
  private static boolean bur;

  public static boolean isEnabled()
  {
    return bur;
  }

  public static void setEnabled(boolean paramBoolean) {
    bur = paramBoolean;
    if (paramBoolean)
      K.info("*** DEBUT DE LOG DE CHARGEMENT ***");
    else
      K.info("**** FIN DE LOG DE CHARGEMENT ****");
  }

  public static void log(String paramString1, String paramString2)
  {
    if (bur)
      K.info("<" + paramString1 + "> " + paramString2);
  }

  public static void gr(int paramInt) {
    log("world", String.valueOf(paramInt));
  }
}