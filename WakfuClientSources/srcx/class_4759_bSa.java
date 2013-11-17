public enum bSa
  implements doV
{
  private final int aw;
  private final boolean hcg;
  private static bSa[] hch;

  private bSa(int arg3, boolean arg4)
  {
    int i;
    this.aw = i;
    boolean bool;
    this.hcg = bool;
  }

  public static bSa tT(int paramInt) {
    if (hch == null) {
      hch = values();
    }
    for (bSa localbSa : hch) {
      if (localbSa.aw == paramInt) {
        return localbSa;
      }
    }
    return null;
  }

  public int getId() {
    return this.aw;
  }

  public boolean bYT() {
    return this.hcg;
  }
}