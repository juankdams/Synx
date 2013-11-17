import com.ankamagames.wakfu.client.core.script.MonsterBehaviourFunctionsLibrary;

public class aIA extends atX
{
  private final byo ehd;
  private final Su ehe;
  private final long ehf;

  public aIA(int paramInt1, int paramInt2, int paramInt3, int paramInt4, byo parambyo, Su paramSu)
  {
    super(paramInt1, paramInt2, paramInt3);

    this.ehd = parambyo;
    this.ehe = paramSu;
    this.ehf = -1L;

    c(new hQ[] { new MonsterBehaviourFunctionsLibrary(this) });

    ko(paramInt4);
  }

  public aIA(int paramInt1, int paramInt2, int paramInt3, int paramInt4, byo parambyo, long paramLong) {
    super(paramInt1, paramInt2, paramInt3);

    this.ehd = parambyo;
    this.ehe = null;
    this.ehf = paramLong;

    c(new hQ[] { new MonsterBehaviourFunctionsLibrary(this) });

    ko(paramInt4);
  }

  public byo aKk() {
    return this.ehd;
  }

  public Su aUs() {
    return this.ehe;
  }

  public long aUt() {
    return this.ehf;
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

  public void b(bXf parambXf)
  {
    super.b(parambXf);

    if (this.ehd != null) {
      this.ehd.a(null);
    }

    if ((this.ehe != null) && ((this.ehe instanceof byo)))
      ((byo)this.ehe).a(null);
  }

  public void aUu()
  {
    if (this.boY != null)
      this.boY.ccB();
  }
}