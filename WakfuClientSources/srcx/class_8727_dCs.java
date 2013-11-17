public final class dCs
{
  private final dSC lKO;
  private static final dCs lKP = new dCs();

  public static dCs dfa() {
    return lKP;
  }

  private dCs() {
    this.lKO = new dSC();
  }

  public void a(String paramString, aoI paramaoI) {
    this.lKO.put(paramString, paramaoI);
  }

  public aoI qP(String paramString) {
    return (aoI)this.lKO.get(paramString);
  }

  public void reset() {
    this.lKO.clear();
  }

  public boolean isEmpty() {
    return this.lKO.size() == 0;
  }
}