import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.Threading;
import org.apache.log4j.Logger;

public final class cdg extends uz
{
  private static final Logger K = Logger.getLogger(cdg.class);
  private static final int hws = bIN.jQ("DXT1");
  private static final int hwt = bIN.jQ("DXT3");
  private static final int hwu = bIN.jQ("DXT5");
  public static final int hwv = 32856;
  private static final int hww = 25;
  private int[] hwx;

  public cdg(long paramLong, String paramString, boolean paramBoolean)
  {
    super(paramLong, paramString, paramBoolean);
    initialize();
  }

  public cdg(long paramLong, crX paramcrX, boolean paramBoolean) {
    super(paramLong, paramcrX, paramBoolean);
    initialize();
  }

  public cdg(long paramLong, int paramInt1, int paramInt2, boolean paramBoolean) {
    super(paramLong, paramInt1, paramInt2, paramBoolean);
    initialize();
  }

  public int getID()
  {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    return this.hwx[0];
  }

  public int cge() {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    return this.hwx[3];
  }

  public boolean c(bSr parambSr)
  {
    return j(abY.m(parambSr));
  }

  private boolean j(GL paramGL) {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    if (!Threading.isOpenGLThread()) {
      return false;
    }
    if (this.biq) {
      return l(paramGL);
    }
    return m(paramGL);
  }

  public boolean h(bSr parambSr)
  {
    return k(abY.m(parambSr));
  }

  public boolean k(GL paramGL) {
    int i = 0;
    if (cqu().getID() == hws)
      i = 33777;
    else if (cqu().getID() == hwt)
      i = 33778;
    else if (cqu().getID() == hwu) {
      i = 33779;
    }

    paramGL.glBindTexture(3553, this.hwx[0]);
    paramGL.glTexParameterf(3553, 10242, 10497.0F);
    paramGL.glTexParameterf(3553, 10243, 10497.0F);
    paramGL.glTexParameterf(3553, 10240, 9729.0F);
    paramGL.glTexParameterf(3553, 10241, 9729.0F);

    cJX localcJX = cJX.cDN();

    for (int j = 0; j < cqt(); j++) {
      cSJ localcSJ1 = wn(j);
      cSJ localcSJ2 = null;
      if (localcSJ1.getBitDepth() != 32) {
        K.warn("Setting layer to RGBA32");
        localcSJ2 = localcSJ1 = localcSJ1.cIx();
      }
      byte[] arrayOfByte = localcSJ1.getData();
      if (arrayOfByte == null) {
        if (localcSJ2 != null)
          localcSJ2.axl();
        return false;
      }

      int k = arrayOfByte.length;

      oC localoC = localcJX.xZ(k);

      ByteBuffer localByteBuffer = (ByteBuffer)localoC.getBuffer();
      localByteBuffer.put(arrayOfByte, 0, k);
      localByteBuffer.rewind();

      if (isCompressed()) {
        paramGL.glCompressedTexImage2D(3553, j, i, bCO.sj(localcSJ1.getWidth()), bCO.sj(localcSJ1.getHeight()), 0, arrayOfByte.length, localByteBuffer);
      }
      else {
        paramGL.glTexImage2D(3553, j, 32856, bCO.sj(localcSJ1.getWidth()), bCO.sj(localcSJ1.getHeight()), 0, a(localcSJ1), 5121, localByteBuffer);
      }

      localoC.release();
      if (localcSJ2 != null)
        localcSJ2.axl();
    }
    this.bim = true;
    this.Vm = false;

    return true;
  }

  private static int a(cSJ paramcSJ) {
    switch (paramcSJ.cIB()) {
    case 1:
      return 6407;
    case 17:
      return 6408;
    case 18:
      return 32993;
    case 2:
      return 32992;
    }
    return 6408;
  }

  public void d(bSr parambSr)
  {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");

    GL localGL = abY.m(parambSr);
    if (!gI()) {
      j(localGL);
    }

    cgf();

    dsZ localdsZ = dsZ.cZe();
    localdsZ.ks(true);
    localdsZ.x(parambSr);

    localGL.glBindTexture(3553, this.hwx[0]);

    localdsZ.b(this.bin);
    localdsZ.x(parambSr);
  }

  private boolean l(GL paramGL)
  {
    paramGL.glGenFramebuffersEXT(1, this.hwx, 3);
    paramGL.glGenTextures(1, this.hwx, 0);
    paramGL.glGenRenderbuffersEXT(1, this.hwx, 2);

    paramGL.glBindFramebufferEXT(36160, this.hwx[3]);

    paramGL.glBindTexture(3553, this.hwx[0]);
    paramGL.glTexParameteri(3553, 10242, 33071);
    paramGL.glTexParameteri(3553, 10243, 33071);

    cSJ localcSJ = wn(0);
    int i = localcSJ.getWidth();
    int j = localcSJ.getHeight();

    if (this.bir) {
      paramGL.glTexParameterf(3553, 10240, 9729.0F);
      paramGL.glTexParameterf(3553, 10241, 9987.0F);

      paramGL.glTexImage2D(3553, 0, 32856, i, j, 0, a(localcSJ), 5121, null);
      paramGL.glGenerateMipmapEXT(3553);
    } else {
      paramGL.glTexParameteri(3553, 10240, 9729);
      paramGL.glTexParameteri(3553, 10241, 9729);
      paramGL.glTexParameteri(3553, 34891, 6409);

      paramGL.glTexImage2D(3553, 0, 32856, i, j, 0, a(localcSJ), 5121, null);
    }
    paramGL.glFramebufferTexture2DEXT(36160, 36064, 3553, this.hwx[0], 0);

    paramGL.glBindRenderbufferEXT(36161, this.hwx[2]);
    paramGL.glRenderbufferStorageEXT(36161, 35056, i, j);

    paramGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, this.hwx[2]);
    paramGL.glFramebufferRenderbufferEXT(36160, 36128, 36161, this.hwx[2]);

    int k = paramGL.glCheckFramebufferStatusEXT(36160);
    boolean bool = k == 36053;
    paramGL.glBindFramebufferEXT(36160, 0);

    this.bim = bool;
    this.Vm = false;
    return bool;
  }

  private boolean m(GL paramGL) {
    if (this.SN != null) {
      if (this.SN.gI())
        cqA();
      else if (this.SN.LN())
        this.SN = null;
      else {
        return false;
      }
    }

    paramGL.glPixelStorei(3317, 1);

    paramGL.glGenTextures(1, this.hwx, 0);
    if (this.hwx[0] == 0) {
      K.error("Unable to generate a new texture");
      return false;
    }

    boolean bool = k(paramGL);

    if ((bool) && (!this.bio)) {
      if (this.bip) {
        wp(25);
      }
      Dv();
    }

    return bool;
  }

  public void t(bSr parambSr) {
    n(abY.m(parambSr));
  }

  public void n(GL paramGL) {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    if (!gI()) {
      j(paramGL);
    }

    paramGL.glBindTexture(3553, this.hwx[0]);
    cgf();
  }

  public void cgf() {
    int i = bpu();
    if (i > this.bis)
      this.bis = i;
  }

  public void e(bSr parambSr)
  {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    if (!Du()) {
      return;
    }
    this.bil = false;
    abY.m(parambSr).glBindTexture(3553, 0);
  }

  public void f(bSr parambSr)
  {
  }

  public void g(bSr parambSr)
  {
  }

  protected void DL()
  {
    if ((!bB) && (!Threading.isOpenGLThread())) throw new AssertionError("Trying to release a texture in a non-opengl thread");
    if ((!bB) && (this.bit != Qg.cpg) && (this.bit != Qg.cpd)) throw new AssertionError();

    super.DL();
    GL localGL = abY.m(dHL.lSB.dhZ());
    localGL.glDeleteTextures(1, this.hwx, 0);
    if (this.biq) {
      localGL.glDeleteFramebuffersEXT(1, this.hwx, 3);
      localGL.glDeleteRenderbuffersEXT(1, this.hwx, 2);
    }
    this.bim = false;
    this.bis = 0;
    this.bit = Qg.cph;
  }

  public boolean isCompressed()
  {
    if ((cqu().getID() == hws) || (cqu().getID() == hwt) || (cqu().getID() == hwu))
    {
      return true;
    }
    return false;
  }

  private void initialize()
  {
    if (this.biq) {
      this.hwx = new int[4];
      this.hwx[1] = 0;
      this.hwx[2] = 0;
      this.hwx[3] = 0;
    } else {
      this.hwx = new int[1];
    }
    this.hwx[0] = 0;
    this.bim = false;

    if (!aNh.eth.a(dEX.lOl)) {
      int i = cqv().getX();
      int j = cqv().getY();
      int k = bCO.sj(i);
      int m = bCO.sj(j);

      if ((k != i) || (m != j)) {
        cqx();
      }
    }
    this.bit = Qg.cpd;
  }

  public static void a(GL paramGL, int paramInt1, int paramInt2, int[] paramArrayOfInt, boolean paramBoolean) {
    paramGL.glGenTextures(1, paramArrayOfInt, 0);
    paramGL.glBindTexture(3553, paramArrayOfInt[0]);
    paramGL.glTexImage2D(3553, 0, 32856, paramInt1, paramInt2, 0, 6408, 5121, ByteBuffer.allocateDirect(paramInt1 * paramInt2 * 4));

    paramGL.glTexParameterf(3553, 10242, 33071.0F);
    paramGL.glTexParameterf(3553, 10243, 33071.0F);
    paramGL.glTexParameterf(3553, 10240, paramBoolean ? 9729.0F : 9728.0F);
    paramGL.glTexParameterf(3553, 10241, paramBoolean ? 9729.0F : 9728.0F);
  }

  public String toString()
  {
    return this.SL;
  }
}