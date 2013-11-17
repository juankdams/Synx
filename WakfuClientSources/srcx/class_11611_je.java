public enum je
{
  public static je aZ(int paramInt)
  {
    je[] arrayOfje = values();
    if ((paramInt < 0) || (paramInt >= arrayOfje.length)) {
      throw new bIp("[HAVEN_WORLD] Erreur " + paramInt + " inconnue");
    }
    return arrayOfje[paramInt];
  }
}