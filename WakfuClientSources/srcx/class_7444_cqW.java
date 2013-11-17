import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryBackground;
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryBackground.ObjectFactory;
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryText;
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryText.ObjectFactory;
import com.ankamagames.framework.graphics.engine.text.EntityText;
import com.ankamagames.framework.graphics.engine.text.EntityText.ObjectFactory;
import com.ankamagames.framework.graphics.engine.text.GeometryBackground;
import com.ankamagames.framework.graphics.engine.text.GeometryText;

public class cqW
{
  private cqz iaD = null;
  private int bjr;
  private int bjs;
  private EntityText bDH;

  public cqW(hf paramhf, String paramString)
  {
    this(paramhf, false, paramString);
  }

  public cqW(hf paramhf, boolean paramBoolean, String paramString)
  {
    this.bDH = ((EntityText)EntityText.laL.bQy());
    GeometryBackground localGeometryBackground = (GeometryBackground)GLGeometryBackground.aTA.bQy();
    GeometryText localGeometryText = (GeometryText)GLGeometryText.lBa.bQy();
    this.bDH.a(localGeometryBackground);
    this.bDH.a(localGeometryText);
    this.bDH.a(paramhf);
    this.bDH.setText(paramString);

    localGeometryBackground.axl();
    localGeometryText.axl();
  }

  public cqz Fr()
  {
    return this.iaD;
  }

  public void a(cqz paramcqz)
  {
    this.iaD = paramcqz;
  }

  public int getXOffset()
  {
    return this.bjr;
  }

  public void setXOffset(int paramInt)
  {
    this.bjr = paramInt;
  }

  public int getYOffset()
  {
    return this.bjs;
  }

  public void setYOffset(int paramInt)
  {
    this.bjs = paramInt;
  }

  public float getWorldX()
  {
    if (this.iaD != null) {
      return this.iaD.getWorldX();
    }
    return 0.0F;
  }

  public float getWorldY()
  {
    if (this.iaD != null) {
      return this.iaD.getWorldY();
    }
    return 0.0F;
  }

  public float getAltitude()
  {
    if (this.iaD != null) {
      return this.iaD.getAltitude();
    }
    return 0.0F;
  }

  public EntityText KF() {
    return this.bDH;
  }

  public void setText(String paramString) {
    this.bDH.setText(paramString);
  }

  public void setVisible(boolean paramBoolean) {
    this.bDH.setVisible(paramBoolean);
  }

  public boolean isVisible() {
    return this.bDH.isVisible();
  }

  public boolean Fs() {
    return false;
  }

  public void release() {
    this.bDH.axl();
    this.iaD = null;
  }
}