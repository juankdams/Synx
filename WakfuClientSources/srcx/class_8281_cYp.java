import com.ankamagames.framework.graphics.engine.entity.EntitySprite;

public class cYp
{
  public final dwn aVa;
  public final EntitySprite aVb;
  public final EntitySprite kLR;
  private byte kLS = 0;

  public cYp(dwn paramdwn, EntitySprite paramEntitySprite1, EntitySprite paramEntitySprite2) {
    this.aVa = paramdwn;
    this.aVb = paramEntitySprite1;
    this.kLR = paramEntitySprite2;
  }

  public Object getValue() {
    return this.aVa.getValue();
  }

  public void gQ() {
    this.aVb.gQ();
    this.kLR.gQ();
    this.kLS = ((byte)(this.kLS + 1));
  }

  public void axl() {
    if (this.kLS > 0) {
      this.aVb.axl();
      this.kLR.axl();
    }
    this.kLS = ((byte)(this.kLS - 1));
  }
}