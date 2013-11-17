public class bUq
{
  public final int aw;
  public final int hgo;
  public final int eRe;

  public bUq(int paramInt1, int paramInt2, int paramInt3)
  {
    this.aw = paramInt1;
    this.hgo = paramInt2;
    this.eRe = paramInt3;
  }

  final dRW ku(String paramString) {
    dRW localdRW = new dRW(paramString);
    localdRW.bu("id", String.valueOf(this.aw));
    localdRW.bu("minQuantity", String.valueOf(this.hgo));
    localdRW.bu("maxQuantity", String.valueOf(this.eRe));
    return localdRW;
  }
}