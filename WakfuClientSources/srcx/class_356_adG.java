import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.ArrayList;

public class adG extends DB
{
  public static final float cUa = 86.0F;
  public static final float cUb = 43.0F;
  public static final float cUc = 10.0F;
  public static final float cUd = 4.8F;
  public static float cUe = 1.0F;
  public static float cUf = 1.4F;
  public static float cUg = 2.2F;
  protected float cUh;
  protected float cUi;
  protected float cUj = 86.0F;
  protected float cUk = 43.0F;
  protected float cUl = 10.0F;
  protected final ArrayList cUm;
  protected final ArrayList cUn;
  protected final cbQ cUo;
  protected final ArrayList cUp;
  protected final cuA cUq;
  private dkP cUr = dkP.lip;

  public adG(float paramFloat1, float paramFloat2)
  {
    this.cUh = paramFloat1;
    this.cUi = paramFloat2;
    this.cUq = apI();
    this.cUm = new ArrayList(2048);
    this.cUo = new cbQ(2048);
    this.cUn = new ArrayList(1024);
    this.cUp = new ArrayList(3072);
  }

  public void a(dkP paramdkP) {
    this.cUr.clear();
    this.cUr = paramdkP;
  }

  public void b(Entity paramEntity, boolean paramBoolean) {
    if (!this.cUr.a(paramEntity, paramBoolean)) {
      return;
    }
    c(paramEntity, paramBoolean);
  }

  public void c(Entity paramEntity, boolean paramBoolean) {
    if (paramBoolean)
      this.cUm.add(paramEntity);
    else
      this.cUn.add(paramEntity);
  }

  public final void d(Entity paramEntity, boolean paramBoolean) {
    if (paramBoolean)
      this.cUm.remove(paramEntity);
    else
      this.cUn.remove(paramEntity);
  }

  public float apB() {
    return this.cUj;
  }

  public void ar(float paramFloat)
  {
    this.cUj = paramFloat;
  }

  public float apC() {
    return this.cUk;
  }

  public void as(float paramFloat)
  {
    this.cUk = paramFloat;
  }

  public float apD() {
    return this.cUl;
  }

  public void at(float paramFloat) {
    this.cUl = paramFloat;
  }

  public final cuA apE() {
    return this.cUq;
  }

  public rp apF() {
    return (rp)this.cUq;
  }

  public bSl apG() {
    return apF().xZ();
  }

  public void c(bSl parambSl) {
    apF().a(parambSl);
  }

  public void apH()
  {
    apF().xS();
  }

  public float xU()
  {
    if (this.cUq != null)
      return apF().xU();
    return 1.0F;
  }

  public void B(float paramFloat)
  {
    if (this.cUq != null)
      apF().B(paramFloat);
  }

  protected cuA apI()
  {
    return new rp(this, this.cUh, this.cUi);
  }

  public float r(float paramFloat1, float paramFloat2)
  {
    return (paramFloat1 - paramFloat2) * this.cUj * 0.5F;
  }

  public float s(float paramFloat1, float paramFloat2)
  {
    return -(paramFloat1 + paramFloat2) * this.cUk * 0.5F;
  }

  public float g(float paramFloat1, float paramFloat2, float paramFloat3) {
    return s(paramFloat1, paramFloat2) + paramFloat3 * this.cUl;
  }

  public float t(float paramFloat1, float paramFloat2)
  {
    return paramFloat1 / this.cUj - paramFloat2 / this.cUk;
  }

  public float h(float paramFloat1, float paramFloat2, float paramFloat3) {
    return paramFloat1 / this.cUj - (paramFloat2 - paramFloat3 * this.cUl) / this.cUk;
  }

  public float u(float paramFloat1, float paramFloat2)
  {
    return -(paramFloat1 / this.cUj + paramFloat2 / this.cUk);
  }

  public float i(float paramFloat1, float paramFloat2, float paramFloat3) {
    return -(paramFloat1 / this.cUj + (paramFloat2 - paramFloat3 * this.cUl) / this.cUk);
  }

  protected long f(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return dLw.a(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public ArrayList apJ()
  {
    return this.cUm;
  }

  public boolean a(aVn paramaVn, Entity paramEntity, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    paramEntity.mnP = f(paramInt1, paramInt2, paramInt3, paramInt4);
    return true;
  }

  public final boolean a(aVn paramaVn, Entity paramEntity, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return a(paramaVn, paramEntity, paramInt1, paramInt2, paramInt3, paramInt4, false);
  }

  public float[] a(aVn paramaVn) {
    return ayj.aJY().a(paramaVn);
  }

  public void s(ArrayList paramArrayList) {
    this.cUr.a(this, paramArrayList);
  }

  public boolean c(ahm paramahm) {
    return this.cUr.c(paramahm);
  }

  public static float aT(int paramInt1, int paramInt2) {
    return (paramInt1 - paramInt2) * 86.0F * 0.5F;
  }

  public static float aU(int paramInt1, int paramInt2) {
    return -(paramInt1 + paramInt2) * 43.0F * 0.5F;
  }
}