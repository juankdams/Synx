import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.ankamagames.framework.kernel.core.maths.Matrix44.ObjectFactory;

public abstract class bSr
{
  protected Object hdc;
  protected Matrix44 hdd;
  protected Matrix44 hde;
  protected final Matrix44 hdf;
  protected uz hdg;
  protected int hdh;
  private final cno hdi;
  private final boolean hdj = false;
  protected int hdk;
  protected int hdl;

  protected bSr()
  {
    this.hdh = 1;
    this.hdi = new cno();
    this.hdf = ((Matrix44)Matrix44.bFc.bQx());
  }

  public void aJA()
  {
  }

  public abstract dHL aJG();

  public abstract uz b(long paramLong, String paramString, boolean paramBoolean);

  public abstract uz a(long paramLong, crX paramcrX, boolean paramBoolean);

  public abstract uz a(long paramLong, int paramInt1, int paramInt2, boolean paramBoolean);

  public abstract void f(Matrix44 paramMatrix44);

  public abstract void g(Matrix44 paramMatrix44);

  public abstract void aJJ();

  public final Matrix44 bZi()
  {
    return this.hdd;
  }

  public final Matrix44 bZj() {
    return this.hde;
  }

  public abstract void b(uz paramuz);

  public void a(Ul paramUl)
  {
    paramUl.a(this);
  }

  public final void begin()
  {
  }

  public final void flush()
  {
  }

  public final void end()
  {
  }

  public void ag(Object paramObject)
  {
    this.hdc = paramObject;
  }

  public final Object bZk() {
    return this.hdc;
  }

  public abstract void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt);

  public abstract boolean aJH();

  public final Matrix44 bZl()
  {
    return this.hdf;
  }

  public final void dh(int paramInt1, int paramInt2) {
    this.hdk = paramInt1;
    this.hdl = paramInt2;
  }

  public final int bZm() {
    return this.hdk;
  }

  public final int bZn() {
    return this.hdl;
  }
}