import com.ankamagames.framework.graphics.engine.text.EntityText;
import com.ankamagames.framework.graphics.engine.text.GeometryBackground;

public class cCx extends cqW
{
  public static final int blX = -1;
  private int blY = 0;

  private int aKS = -1;
  private int fug;

  public cCx(hf paramhf, String paramString)
  {
    super(paramhf, paramString);
    setDuration(-1);
  }

  public cCx(hf paramhf, String paramString, int paramInt)
  {
    super(paramhf, paramString);
    setDuration(paramInt);
  }

  public int getDuration()
  {
    return this.aKS;
  }

  public void setDuration(int paramInt)
  {
    if ((!bB) && (paramInt < -1)) throw new AssertionError();
    this.aKS = paramInt;
  }

  public boolean isAlive()
  {
    if (this.aKS == -1) {
      return true;
    }
    return this.blY <= this.aKS + this.fug;
  }

  public void cxC()
  {
    this.blY = 0;
  }

  public void cz(int paramInt)
  {
    if (this.fug > 0) {
      this.fug -= paramInt;
      if (this.fug <= 0)
        KF().setVisible(true);
    }
    else
    {
      this.blY += paramInt;
    }
  }

  public void pu(int paramInt) {
    if ((!bB) && (paramInt < 0)) throw new AssertionError();
    this.fug = paramInt;
    if (this.fug > 0)
      KF().setVisible(false);
  }

  protected int Ft()
  {
    return this.blY;
  }

  public final String getText() {
    return KF().getText();
  }

  public final void setColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    KF().setColor(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }

  public final void a(hf paramhf) {
    KF().a(paramhf);
  }

  public final void j(float paramFloat1, float paramFloat2) {
    KF().m(new cEh(paramFloat1, paramFloat2, 0.0F));
  }

  public final void setBorderWidth(float paramFloat) {
    KF().cPB().setBorderWidth(paramFloat);
  }

  public final void setMaxWidth(int paramInt) {
    KF().setMaxWidth(paramInt);
  }

  public final int getMaxWidth() {
    return KF().getMaxWidth();
  }

  public final int getMinWidth() {
    return KF().getMinWidth();
  }

  public final void a(FP paramFP) {
    GeometryBackground localGeometryBackground = KF().cPB();
    localGeometryBackground.a(paramFP.PU(), paramFP.PV());
    localGeometryBackground.b(paramFP.PW());
    localGeometryBackground.a(paramFP.PX());
    localGeometryBackground.j(paramFP.getLeftMargin(), paramFP.getRightMargin(), paramFP.getTopMargin(), paramFP.getBottomMargin());
  }

  public final void setMinWidth(int paramInt) {
    KF().setMinWidth(paramInt);
  }

  public final void setVisible(boolean paramBoolean) {
    KF().setVisible(paramBoolean);
  }

  public final void setMinHeight(int paramInt) {
    KF().setMinHeight(paramInt);
  }

  public final int cyJ() {
    return KF().cPC();
  }

  public final int cyK() {
    return KF().getTextHeight();
  }
}