import com.ankamagames.wakfu.client.core.script.MonsterActionFunctionsLibrary;

public class bMV extends atX
{
  private final byo ehd;
  private final bKm gRm;

  public bMV(int paramInt1, int paramInt2, int paramInt3, int paramInt4, byo parambyo, bKm parambKm)
  {
    super(paramInt1, paramInt2, paramInt3);

    this.ehd = parambyo;
    this.gRm = parambKm;

    c(new hQ[] { new MonsterActionFunctionsLibrary(this) });

    ko(paramInt4);
  }

  public byo aKk() {
    return this.ehd;
  }

  public bKm bUC() {
    return this.gRm;
  }

  public long mC()
  {
    long l = super.mC();
    if ((l != -1L) || (this.dFS)) {
      bZw();
      this.dFS = false;
    }
    return -1L;
  }
}