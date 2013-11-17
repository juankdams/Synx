import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.ankamagames.framework.kernel.core.maths.Matrix44.ObjectFactory;
import java.util.Arrays;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.apache.log4j.Logger;

public final class ayc extends bSr
{
  public final brZ dNI = new brZ();
  public static final GLU dNJ = new GLU();

  private static final Logger K = Logger.getLogger(ayc.class);

  public ayc()
  {
    this.hdd = ((Matrix44)Matrix44.bFc.bQx());
    this.hde = ((Matrix44)Matrix44.bFc.bQx());
    this.hdd.Ls();
    this.hde.Ls();
  }

  public dHL aJG()
  {
    return dHL.lSB;
  }

  public uz b(long paramLong, String paramString, boolean paramBoolean)
  {
    return new cdg(paramLong, paramString, paramBoolean);
  }

  public uz a(long paramLong, crX paramcrX, boolean paramBoolean)
  {
    return new cdg(paramLong, paramcrX, paramBoolean);
  }

  public uz a(long paramLong, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return new cdg(paramLong, paramInt1, paramInt2, false);
  }

  public void f(Matrix44 paramMatrix44)
  {
    if (!this.hdd.e(paramMatrix44)) {
      this.hdd.a(paramMatrix44);
      aJJ();
    }
  }

  public void g(Matrix44 paramMatrix44)
  {
    if (!this.hde.e(paramMatrix44)) {
      this.hde.a(paramMatrix44);
      aJJ();
    }
  }

  public void b(uz paramuz)
  {
    this.hdg = paramuz;
    if (paramuz == null) {
      ((GL)this.hdc).glBindFramebufferEXT(36160, 0);
    } else {
      if ((!bB) && (paramuz.getClass() != cdg.class)) throw new AssertionError("GLRenderer can't apply Texture but GLTexture");
      cdg localcdg = (cdg)paramuz;
      ((GL)this.hdc).glBindFramebufferEXT(36160, localcdg.cge());
    }
  }

  public void e(GL paramGL)
  {
    super.ag(paramGL);
    this.dNI.i(paramGL);

    int[] arrayOfInt = new int[1];
    paramGL.glGetIntegerv(34018, arrayOfInt, 0);
    this.hdh = arrayOfInt[0];
  }

  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt)
  {
    dsZ.cZe().ks(false);
    dsZ.cZe().x(this);

    f(Matrix44.bFe);
    g(Matrix44.bFe);

    ((GL)this.hdc).glBegin(7);
    ((GL)this.hdc).glColor4f(bNa.ty(paramInt), bNa.tx(paramInt), bNa.tw(paramInt), bNa.tv(paramInt));
    ((GL)this.hdc).glVertex2f(paramFloat1, paramFloat2);
    ((GL)this.hdc).glVertex2f(paramFloat1, paramFloat2 + paramFloat4);
    ((GL)this.hdc).glVertex2f(paramFloat1 + paramFloat3, paramFloat2 + paramFloat4);
    ((GL)this.hdc).glVertex2f(paramFloat1 + paramFloat3, paramFloat2);
    ((GL)this.hdc).glEnd();
  }

  public boolean aJH()
  {
    return aNh.eth.a(dEX.lOf);
  }

  public void aJI() {
    kW(3042);
    kX(3041);
    kX(3040);

    kW(32886);
    kX(32897);
    kX(32899);
    kX(32898);

    kW(32888);
    kX(32904);
    kX(32906);
    kX(32905);

    kW(32884);
    kX(32890);
    kX(32892);
    kX(32891);

    kW(2884);
    kX(2885);

    kX(3415);
    kX(2961);
    kX(2964);
    kX(2962);
    kX(2965);
    kX(2966);
    kX(2967);
    kW(2960);
    kX(2963);
    kX(2968);

    kW(3552);
    kW(3553);

    kW(2977);
    kW(3089);

    kY(4609);
  }

  private void kW(int paramInt)
  {
    byte[] arrayOfByte = new byte[1];
    ((GL)this.hdc).glGetBooleanv(paramInt, arrayOfByte, 0);
    K.info(paramInt + "\t" + arrayOfByte[0]);
  }

  private void kX(int paramInt) {
    int[] arrayOfInt = new int[1];
    ((GL)this.hdc).glGetIntegerv(paramInt, arrayOfInt, 0);
    K.info(paramInt + "\t" + arrayOfInt[0]);
  }

  private void kY(int paramInt) {
    float[] arrayOfFloat = new float[4];
    ((GL)this.hdc).glGetFloatv(paramInt, arrayOfFloat, 0);
    K.info(paramInt + "\t" + Arrays.toString(arrayOfFloat));
  }

  public void aJJ()
  {
    if ((this.hdd.isIdentity()) && (this.hde.isIdentity()))
      this.hdf.Ls();
    else {
      this.hdf.a(this.hdd, this.hde);
    }
    dsZ.cZe().a((GL)this.hdc, aLv.epP, this.hdf);
  }
}