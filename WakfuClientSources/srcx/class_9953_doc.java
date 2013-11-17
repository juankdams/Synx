import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.Entity3D.ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite.ObjectFactory;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;

public class doc extends bgm
{
  private final Entity3D aVX;
  private cqz iaD;
  private final dbK loq;
  private float aOR;
  private float aOS;
  private int bjr;
  private int bjs;
  private int aw;
  private int aGs = 4;

  private boolean aYZ = true;
  public static final int blX = -1;

  private static float n(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return -paramFloat3 * ((paramFloat1 = paramFloat1 / paramFloat4 - 1.0F) * paramFloat1 * paramFloat1 * paramFloat1 - 1.0F) + paramFloat2;
  }

  private static float p(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    return paramFloat1 * (paramFloat3 - paramFloat2) / paramFloat4 + paramFloat2;
  }

  public void setVisible(boolean paramBoolean)
  {
    this.aYZ = paramBoolean;
  }

  public doc(String paramString, int paramInt1, int paramInt2, dbK paramdbK, int paramInt3)
  {
    this(tq.Bg().b(dHL.lSB.dhZ(), byn.jp(paramString), paramString, false), paramInt1, paramInt2, paramdbK, paramInt3);
  }

  public doc(uz paramuz, int paramInt1, int paramInt2, dbK paramdbK, int paramInt3) {
    this.loq = paramdbK;
    this.aKS = paramInt3;
    this.aVX = ((Entity3D)Entity3D.fAs.bQy());

    this.aVX.dsE().a(new cxn());

    GeometrySprite localGeometrySprite = (GeometrySprite)GLGeometrySprite.ieZ.bQy();

    if (paramInt1 == -1) {
      paramInt1 = paramuz.wn(0).getWidth();
    }

    if (paramInt2 == -1) {
      paramInt2 = paramuz.wn(0).getHeight();
    }

    localGeometrySprite.c(paramInt2, 0.0F, paramInt1, paramInt2);
    localGeometrySprite.i(0.0F, 0.0F, 1.0F, 1.0F);

    this.aVX.a(localGeometrySprite, paramuz, null);
    localGeometrySprite.axl();
    this.aVX.setColor(1.0F, 1.0F, 1.0F, 0.0F);
  }

  public cqz Fr()
  {
    return this.iaD;
  }

  public void a(cqz paramcqz) {
    this.iaD = paramcqz;
  }

  public int getXOffset() {
    return this.bjr;
  }

  public void setXOffset(int paramInt) {
    this.bjr = paramInt;
  }

  public int getYOffset() {
    return this.bjs;
  }

  public void setYOffset(int paramInt) {
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

  private void bjP() {
    cVt().dsE().a(0, this.aOR, this.aOS);
  }

  public void b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.aOR = (paramFloat1 + paramFloat3);
    this.aOS = (paramFloat2 + paramFloat4);

    bjP();
  }

  public int getId() {
    return this.aw;
  }

  public void d(int paramInt) {
    this.aw = paramInt;
  }

  public int xj() {
    return this.aGs;
  }

  public void dl(int paramInt) {
    this.aGs = paramInt;
  }

  public Entity3D cVt() {
    return this.aVX;
  }

  public void cxC()
  {
    this.blY = 0;
  }

  public void cz(int paramInt)
  {
    super.cz(paramInt);

    if (this.aYZ)
      this.loq.a(this, paramInt);
  }

  public void a(cXf paramcXf, int paramInt)
  {
    cz(paramInt);
  }

  public void cleanUp() {
    this.aVX.axl();
    this.iaD = null;
  }

  public boolean Fs() {
    return true;
  }

  public float getX() {
    return this.aOR;
  }

  public float getY() {
    return this.aOS;
  }
}