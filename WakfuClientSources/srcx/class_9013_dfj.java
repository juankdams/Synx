import com.ankamagames.framework.graphics.engine.text.EntityText;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;

public class dfj extends cCx
  implements aCF
{
  private aQq kZk = null;
  private int aw;
  private int aWH = 3;
  private float aOR;
  private float aOS;
  private cEh kZl = new cEh();

  private static float d(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    float f1 = paramInt1 / paramInt2 / 2.0F;

    float f2 = (0.5F - f1) * (1.0F - 2.0F * Math.abs(0.5F - f1));

    f1 = (f1 - f2) * 2.0F;

    return paramFloat1 + (paramFloat2 - paramFloat1) * f1;
  }

  private static float n(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    return -paramFloat3 * ((paramFloat1 = paramFloat1 / paramFloat4 - 1.0F) * paramFloat1 * paramFloat1 * paramFloat1 - 1.0F) + paramFloat2;
  }

  private static float p(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    return paramFloat1 * (paramFloat3 - paramFloat2) / paramFloat4 + paramFloat2;
  }

  public dfj(hf paramhf, String paramString)
  {
    this(paramhf, paramString, -1);
  }

  public dfj(hf paramhf, String paramString, int paramInt)
  {
    this(paramhf, paramString, new vk(), paramInt);
  }

  public dfj(hf paramhf, String paramString, aQq paramaQq, int paramInt) {
    super(paramhf, paramString, paramInt);
    KF().a(null);
    KF().a(paramhf);
    this.kZk = paramaQq;
  }

  public aQq cPm() {
    return this.kZk;
  }

  public void a(aQq paramaQq) {
    this.kZk = paramaQq;
  }

  public float cPn() {
    return 2.0F;
  }

  public void b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.kZl.m(paramFloat1, paramFloat2, -1.0F);
    KF().m(this.kZl);
    KF().eH((int)paramFloat3, (int)paramFloat4);

    this.aOR = paramFloat1;
    this.aOS = paramFloat2;

    bjP();
  }

  public void a(cXf paramcXf, int paramInt) {
    cz(paramInt);
  }

  public void cz(int paramInt)
  {
    super.cz(paramInt);
    cPm().a(this, paramInt);
  }

  public int getId() {
    return this.aw;
  }

  public void d(int paramInt)
  {
    this.aw = paramInt;
  }

  public int xj() {
    return this.aWH;
  }

  public void dl(int paramInt) {
    this.aWH = paramInt;
  }

  public EntityText KF()
  {
    return super.KF();
  }

  public void cleanUp() {
    release();
  }

  private void bjP() {
    KF().dsE().a(0, this.aOR, this.aOS);
  }

  public float getX() {
    return this.aOR;
  }

  public void setX(float paramFloat) {
    this.aOR = paramFloat;
  }

  public float getY() {
    return this.aOS;
  }

  public void setY(float paramFloat) {
    this.aOS = paramFloat;
  }
}