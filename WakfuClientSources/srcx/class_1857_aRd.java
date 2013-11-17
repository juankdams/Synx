public abstract class aRd
{
  private static aRd eNU;

  public static aRd bhB()
  {
    if (eNU == null)
      throw new UnsupportedOperationException("Le provider n'est pas initialisé");
    return eNU;
  }

  public static void a(aRd paramaRd) {
    if (eNU != null)
      throw new UnsupportedOperationException("Le provider a déjà été initialisé");
    eNU = paramaRd;
  }

  public abstract Vc nw(int paramInt);

  public abstract String bgZ();
}