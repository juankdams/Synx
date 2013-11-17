import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.awt.Insets;
import org.apache.log4j.Logger;

public class dtO extends jH
{
  private static Logger K = Logger.getLogger(dtO.class);
  public static final String TAG = "BubbleBorder";
  private afr lwT;
  private boolean cYm = true;
  private boolean lwU = false;
  private float lwV = -2.094395F;
  private boolean lwW = false;

  public static final int lwX = "displaySpark".hashCode();
  public static final int lwY = "sparkAngle".hashCode();

  public String getTag()
  {
    return "BubbleBorder";
  }

  public afr getMesh()
  {
    return this.lwT;
  }

  public void setInsets(Insets paramInsets)
  {
  }

  public Entity getEntity()
  {
    return this.lwT.getEntity();
  }

  public void setDisplaySpark(boolean paramBoolean)
  {
    this.cYm = paramBoolean;
    this.lwU = true;
    this.lwT.setDisplaySpark(paramBoolean);
  }

  public void setSparkAngle(float paramFloat)
  {
    this.lwV = paramFloat;
    this.lwW = true;
    if (this.cYm)
      this.lwT.setSparkAngle(paramFloat);
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);
    dtO localdtO = (dtO)parambdj;
    if (this.lwU) {
      localdtO.setDisplaySpark(this.cYm);
    }

    if (this.lwW)
      localdtO.setSparkAngle(this.lwV);
  }

  public void bc()
  {
    super.bc();
    this.lwT.bc();
    this.lwT = null;
  }

  public void aJ()
  {
    super.aJ();

    this.lwV = -2.094395F;
    this.cYm = true;

    this.lwT = new afr();
    this.lwT.aJ();
    super.setInsets(this.lwT.getInsets());
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == lwX)
      setDisplaySpark(bUD.getBoolean(paramString));
    else if (paramInt == lwY)
      setSparkAngle(bUD.getFloat(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == lwX)
      setDisplaySpark(bUD.getBoolean(paramObject));
    else if (paramInt == lwY)
      setSparkAngle(bUD.getFloat(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}