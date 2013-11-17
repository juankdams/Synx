import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryBackground;
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryBackground.ObjectFactory;
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryText;
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryText.ObjectFactory;
import com.ankamagames.framework.graphics.engine.text.EntityText;
import com.ankamagames.framework.graphics.engine.text.EntityText.ObjectFactory;
import com.ankamagames.framework.graphics.engine.text.GeometryBackground;

public class BD
{
  public static final int blX = 2147483647;
  public static final int bDE = 3000;
  public static int bDF = 3000;
  private int bmM;
  private int aKS = bDF;
  private boolean bDG = false;

  private int bjr = 0;
  private int bjs = 0;
  private EntityText bDH;

  public static void ec(int paramInt)
  {
    bDF = paramInt;
  }

  public static int KC()
  {
    return bDF;
  }

  public BD(hf paramhf)
  {
    this.bDH = ((EntityText)EntityText.laL.bQy());
    GLGeometryText localGLGeometryText = (GLGeometryText)GLGeometryText.lBa.bQy();
    GeometryBackground localGeometryBackground1 = (GeometryBackground)GLGeometryBackground.aTA.bQy();

    this.bDH.a(dRJ.mnp);
    this.bDH.a(localGLGeometryText);
    this.bDH.a(localGeometryBackground1);
    this.bDH.a(paramhf);

    GeometryBackground localGeometryBackground2 = this.bDH.cPB();
    cYj localcYj = new cYj();
    localGeometryBackground2.a(localcYj.PU(), localcYj.PV());
    localGeometryBackground2.b(localcYj.PW());
    localGeometryBackground2.a(localcYj.PX());
    localGeometryBackground2.j(localcYj.getLeftMargin(), localcYj.getRightMargin(), localcYj.getTopMargin(), localcYj.getBottomMargin());

    localGLGeometryText.axl();
    localGeometryBackground2.axl();
  }

  public void c(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.bDH.cPB().setColor(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }

  public bNa getBackgroundColor()
  {
    return this.bDH.cPB().getColor();
  }

  public void d(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.bDH.cPB().d(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }

  public bNa getBorderColor()
  {
    return this.bDH.cPB().getBorderColor();
  }

  public int getDuration()
  {
    return this.aKS;
  }

  public void setDuration(int paramInt)
  {
    this.aKS = paramInt;
  }

  public void setOffset(int paramInt1, int paramInt2)
  {
    this.bjr = paramInt1;
    this.bjs = paramInt2;
  }

  public int getXOffset()
  {
    return this.bjr;
  }

  public int getYOffset()
  {
    return this.bjs;
  }

  protected float KD() {
    return this.bjr;
  }

  protected float KE() {
    return this.bjs;
  }

  public void setVisible(boolean paramBoolean) {
    if ((!paramBoolean) && (this.bDH.getText() != null) && (!this.bDH.getText().equals(""))) {
      this.bDG = false;
      this.bmM = 0;
    }
    this.bDH.setVisible(paramBoolean);
  }

  public void cz(int paramInt) {
    if (this.bDH.getText() == null) {
      return;
    }
    if (!this.bDH.isVisible()) {
      this.bDG = false;
      return;
    }

    if (this.aKS == 2147483647) {
      return;
    }
    this.bmM += paramInt;

    if (!this.bDG) {
      this.bmM = 0;
      this.bDG = true;
    }
    if (this.bmM >= this.aKS) {
      setVisible(false);
      this.bDG = false;
      return;
    }
  }

  public final EntityText KF() {
    return this.bDH;
  }

  public final String getText() {
    return this.bDH.getText();
  }

  public final void setText(String paramString) {
    this.bDH.setText(paramString);
  }

  public final void setColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.bDH.setColor(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }

  public final void a(hf paramhf) {
    this.bDH.a(paramhf);
  }

  public final void j(float paramFloat1, float paramFloat2) {
    this.bDH.m(new cEh(paramFloat1, paramFloat2, 0.0F));
  }

  public final void setBorderWidth(float paramFloat) {
    this.bDH.cPB().setBorderWidth(paramFloat);
  }

  public final void setMaxWidth(int paramInt) {
    this.bDH.setMaxWidth(paramInt);
  }
}