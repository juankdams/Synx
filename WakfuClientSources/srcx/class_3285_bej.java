public class bej extends djO
{
  public static final bXj fqQ = new bej(true);
  public static final bXj fqR = new bej(false);
  static Class bRs;
  static Class bRr;
  static Class fqS;
  static Class cvK;
  static Class cvG;

  protected bej(boolean paramBoolean)
  {
    if (paramBoolean) {
      localObject = new dgB(this);

      a(bRr == null ? (bej.bRr = cd("java.lang.String")) : bRr, (dsn)localObject);
      a(fqS == null ? (bej.fqS = cd("[Ljava.lang.String;")) : fqS, (aEQ)localObject);
    }
    Object localObject = new dgC(this);

    a(cvG == null ? (bej.cvG = cd("java.lang.Boolean")) : cvG, (dsn)localObject);
  }

  static Class cd(String paramString)
  {
    try
    {
      return Class.forName(paramString); } catch (ClassNotFoundException localClassNotFoundException) { throw new NoClassDefFoundError().initCause(localClassNotFoundException); }

  }
}