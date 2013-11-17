import com.ankamagames.framework.graphics.engine.entity.EntitySprite;

public class bmb
{
  private final nI fDn;
  public final String fDo;
  public final String fDp;
  private final int fDq;
  private boolean bur;
  private float fDr = 1.0F;
  protected long fDs = 0L;
  protected final cgR fDt;
  private boolean dLG;

  public bmb(String paramString1, String paramString2, cgR paramcgR)
  {
    this.bur = true;
    this.fDo = paramString1;
    this.fDp = paramString2;
    this.fDq = byn.jo(paramString2);
    this.fDn = new nI();
    this.fDn.load(dtb.pY(paramString1), paramString1);
    Pb.aaU().a(this.fDn);
    this.fDt = paramcgR;
  }

  public void update(int paramInt) {
    this.fDs += paramInt;
  }

  public final boolean isEnabled() {
    return this.bur;
  }

  public final void setEnabled(boolean paramBoolean) {
    this.bur = paramBoolean;
  }

  public final boolean apR() {
    return (this.fDr > 0.0F) && (this.bur);
  }

  public final nI bxa() {
    return this.fDn;
  }

  public final int bxb() {
    return this.fDq;
  }

  public void c(EntitySprite paramEntitySprite)
  {
    paramEntitySprite.a(bxa(), bxb(), this.fDt);
    paramEntitySprite.i(byn.bFr().gjT);
  }

  public void eS(boolean paramBoolean) {
    this.dLG = paramBoolean;
  }

  public boolean aIr() {
    return this.dLG;
  }
}