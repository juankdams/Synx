import com.ankamagames.framework.graphics.engine.entity.Entity;

public class cpG extends csD
{
  public static final String TAG = "timePointBarDecorator";
  public static final String hYR = "link";
  public static final String hYS = "doubleBubble";
  public static final String hYT = "borderBubble";
  public static final String hYU = "oppositeBorderBubble";
  private bvR hYV;

  public void a(aNL paramaNL)
  {
    super.a(paramaNL);

    if ((paramaNL instanceof aAR)) {
      aAR localaAR = (aAR)paramaNL;
      String str = localaAR.getName();
      if ("link".equals(str))
        this.hYV.l(localaAR.getPixmap());
      else if ("doubleBubble".equals(str))
        this.hYV.m(localaAR.getPixmap());
      else if ("borderBubble".equals(str))
        this.hYV.k(localaAR.getPixmap());
      else if ("oppositeBorderBubble".equals(str))
        this.hYV.n(localaAR.getPixmap());
    }
  }

  public void setPixelSeparations(int[] paramArrayOfInt1, int[] paramArrayOfInt2, float[] paramArrayOfFloat)
  {
    this.hYV.setPixelSeparations(paramArrayOfInt1, paramArrayOfInt2, paramArrayOfFloat);
  }

  public int[] getPixelSeparations() {
    return this.hYV.getPixelSeparations();
  }

  public String getTag()
  {
    return "timePointBarDecorator";
  }

  public bvR getMesh() {
    return this.hYV;
  }

  public Entity getEntity() {
    return this.hYV.getEntity();
  }

  public void aJ()
  {
    super.aJ();

    this.hYV = new bvR();
    this.hYV.aJ();
  }

  public void bc()
  {
    super.bc();

    this.hYV = null;
  }
}