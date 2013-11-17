import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.Entity3D.ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.material.Material.ObjectFactory;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import com.sun.opengl.util.texture.TextureCoords;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import javax.media.opengl.Threading;
import org.apache.log4j.Logger;

public class ahm
  implements aVn, agn, alt, bSl, bgL, bjC, bjr, cDW, cbI, csQ
{
  private static final Logger K = Logger.getLogger(ahm.class);

  private static boolean dbE = true;

  private String dbF = "AnimStatique";

  private String dbG = "AnimHit";
  private final cEh dbH;
  protected boolean dbI;
  protected String bU = "AnimStatique";
  protected boolean dbJ = false;
  protected float dbK = 1.0F;
  protected boolean dbL = true;
  protected String dbM = "AnimStatique";
  protected boolean dbN = true;
  protected static final float dbO = 500.0F;
  protected float dbP = 1.0F;
  protected boolean dbQ = false;
  protected boolean dbR = false;

  protected final btQ dbS = new btQ(5);
  protected IL dbT = dHZ.lSN;

  private String dbU = null;

  protected float cat = 1.0F;
  protected EntityGroup bqm;
  protected String ki;
  protected String SK;
  protected int dbV = -1;
  protected int dbW = -1;
  protected int dbX = 0;
  protected int bmM = 0;
  protected boolean dbY = false;
  private boolean dbZ = true;
  private dR dca;
  private final dQx dcb = new dQx();
  private static final dQx dcc = new dQx(-256, 256, -256, 256);
  protected Material UZ;
  private cnQ Va = cnQ.hUU;
  private cnQ Vb = cnQ.hUY;

  private static final ArrayList dcd = new ArrayList(5);
  private byte dce = dLw.mbl.asR();

  private final ArrayList dcf = new ArrayList(1);
  private final ArrayList dcg = new ArrayList(1);
  private boolean dch = false;

  private boolean dci = false;
  private dQp dcj = bBx.bKI().bKH();
  public static boolean dck = false;
  private boolean ip = false;
  protected long aTz;
  protected float dcl;
  protected float dcm;
  protected float cQv = 0.0F;
  protected final cYk dcn = new cYk();
  protected int dco;
  protected short bMJ;
  protected int kO = -2147483648;
  protected int kP = -2147483648;
  protected int kQ;
  protected ArrayList dcp = null;
  protected boolean dcq = true;
  protected boolean dcr = true;
  protected ArrayList dcs = null;

  private boolean aYZ = true;
  protected boolean dct = true;
  private boolean dcu = true;
  protected final float[] bRQ = { 1.0F, 1.0F, 1.0F, 1.0F };
  private boolean dcv = false;
  protected float dcw = 1.0F;
  protected float dcx = 1.0F;
  private byte dcy = 3;
  private static final float[] dcz = new float[4];

  protected float cas = 1.0F;

  protected short dcA = 6;

  private boolean dcB = false;
  private ArrayList dcC;
  private ArrayList dcD;
  private dR dcE;
  private final ArrayList dcF = new ArrayList();

  private static final dQx dcG = new dQx();

  protected void reset()
  {
    int i = 0; for (int j = this.dcF.size(); i < j; i++) {
      ((Lp)this.dcF.get(i)).remove();
    }
    this.dcF.clear();

    this.cat = 1.0F;
    this.dbP = 1.0F;
    this.dcx = (this.dcw = this.bRQ[0] = this.bRQ[1] = this.bRQ[2] = this.bRQ[3] = 1.0F);
    this.dcB = false;
    this.dbQ = false;
    this.dbR = false;
    this.dbV = -1;
    this.dbW = -1;
    this.dbX = 0;

    this.dbJ = true;
    this.dbN = true;
    this.dcy = 3;

    atv();

    if (this.dca != null) {
      this.dca.reset();
      this.dca = null;
    }
    if (this.dcE != null) {
      this.dcE.reset();
      this.dcE = null;
    }

    if (this.bqm != null) {
      this.bqm.axl();
      this.bqm = null;
      this.dcj.reset();
      if ((!bB) && (this.UZ == null)) throw new AssertionError();
      this.UZ.axl();
      this.UZ = null;
    }
    atI();
  }

  Entity3D asO() {
    Entity3D localEntity3D = (Entity3D)Entity3D.fAs.bQy();

    c(localEntity3D);

    return localEntity3D;
  }

  private void c(Entity paramEntity) {
    cxn localcxn = new cxn();
    localcxn.Ls();
    localcxn.c(getScale(), getScale(), 1.0F);
    paramEntity.dsE().a(localcxn);
    paramEntity.a(Pb.aaU().aaV(), cmL.hRG, cmL.hSk);

    if (this.ip)
      paramEntity.mnT |= 2;
    else {
      paramEntity.mnT &= -3;
    }
    paramEntity.mnU = this;
  }

  public byte afD() {
    return 0;
  }

  public boolean eZ() {
    return (this.kO != -2147483648) && (this.kP != -2147483648);
  }

  public float OZ() {
    return this.dcl - this.dcm;
  }

  public float Pa() {
    return -(this.dcl + this.dcm);
  }

  public float Pb() {
    return this.cQv / 4.8F;
  }

  public boolean Pc() {
    return false;
  }

  public int ca() {
    return OV();
  }

  public final Entity getEntity() {
    return this.bqm;
  }

  public final Entity3D asP() {
    return this.dcj.asP();
  }

  public boolean asQ() {
    return dck;
  }

  public final Material asf() {
    return this.UZ;
  }

  public final void setMaterial(Material paramMaterial) {
    this.UZ.e(paramMaterial);
  }

  public String getPath() {
    return this.SK;
  }

  public final byte asR() {
    return this.dce;
  }

  public final void id(int paramInt) {
    if ((paramInt < 0) || (paramInt >= dLw.mbp)) {
      K.error("DeltaZ incorrect " + paramInt);
      return;
    }
    this.dce = ((byte)paramInt);
  }

  public void setScale(float paramFloat) {
    this.cas = paramFloat;
  }

  public void em(String paramString) {
    String str = this.ki;
    this.ki = paramString;

    if (str != this.ki)
      asZ();
  }

  public String asS()
  {
    return this.ki;
  }

  protected String en(String paramString) {
    String str = atc();
    if (str != null) {
      return paramString + str;
    }
    return paramString;
  }

  public void a(IL paramIL) {
    this.dbT = paramIL;
  }

  public IL asT() {
    return this.dbT;
  }

  public final void asU()
  {
    this.UZ.e(dR.hU());
  }

  public void e(ahm paramahm) {
    if (paramahm == null) {
      return;
    }

    this.dbY = true;
    this.dbL = true;
    this.dcv = true;

    if (paramahm.asP() == null) {
      paramahm.asY();
    }

    Entity localEntity = paramahm.getEntity();
    cgR localcgR = cgR.b(localEntity.dsI());
    this.bqm.a(localEntity.dsH(), localEntity.bxb(), localcgR);

    this.UZ.e(paramahm.UZ);
    this.Va = paramahm.Va;
    this.Vb = paramahm.Vb;

    this.SK = paramahm.SK;
    this.ki = paramahm.ki;
    this.cat = paramahm.cat;
    this.dbK = paramahm.dbK;

    if (paramahm.dca != null) {
      if (this.dca != null) {
        this.dca.reset();
      }
      this.dca = new dR(paramahm.dca);
    }
    if (paramahm.dcE != null) {
      if (this.dcE != null) {
        this.dcE.reset();
      }
      this.dcE = new dR(paramahm.dcE);
      asW();
    }
  }

  public final void a(cnQ paramcnQ1, cnQ paramcnQ2) {
    this.Va = paramcnQ1;
    this.Vb = paramcnQ2;
  }

  private static Anm l(String paramString, boolean paramBoolean) {
    String str1;
    try {
      URL localURL = new URL(paramString);
      String str2 = localURL.getPath();
      str1 = localURL.getProtocol() + ":" + str2;
    } catch (MalformedURLException localMalformedURLException) {
      if (paramBoolean) {
        K.error("Exception", localMalformedURLException);
        return null;
      }
      str1 = paramString;
    }

    Anm localAnm;
    try
    {
      localAnm = bOE.bVz().C(str1, paramBoolean);
    } catch (IOException localIOException) {
      K.error("Unable to load equipment", localIOException);
      return null;
    }
    return localAnm;
  }

  public static Anm eo(String paramString) {
    return l(paramString, true);
  }

  public void b(String paramString, String[] paramArrayOfString)
  {
    if (paramString == null) {
      K.warn("on veut appliquer un equipemnt depuis un path null");
      return;
    }
    Anm localAnm = eo(paramString);
    if (localAnm == null) {
      return;
    }
    a(localAnm, byn.t(paramArrayOfString));
  }

  public Anm ep(String paramString) {
    if (paramString == null) {
      K.warn("on veut appliquer un equipemnt depuis un path null");
      return null;
    }
    Anm localAnm = eo(paramString);
    if (localAnm == null) {
      return localAnm;
    }
    a(localAnm, new int[0]);
    return localAnm;
  }

  public Anm ie(int paramInt) {
    String str = jdMethod_if(paramInt);
    if (str == null) {
      K.warn("on veut appliquer un equipemnt depuis un path null");
      return null;
    }
    return ep(str);
  }

  protected String jdMethod_if(int paramInt) {
    return null;
  }

  public void c(Anm paramAnm) {
    if (paramAnm == null) {
      return;
    }
    c(paramAnm, new int[0]);
  }

  public void a(Anm paramAnm, int[] paramArrayOfInt)
  {
    if (aty() == null) {
      return;
    }
    aty().a(paramAnm, paramArrayOfInt);
    asV();
  }

  public void a(Anm paramAnm, String[] paramArrayOfString) {
    a(paramAnm, byn.t(paramArrayOfString));
  }

  public void asV() {
    this.dbY = true;
  }

  public void c(Anm paramAnm, int[] paramArrayOfInt) {
    if (aty() != null) {
      aty().b(paramAnm, paramArrayOfInt);
    }
    asV();
  }

  private void m(String paramString, boolean paramBoolean)
  {
    this.SK = paramString;

    if (this.dcE != null) {
      this.dcE.reset();
    }

    this.dcE = bOE.bVz().B(paramString, paramBoolean);
    asW();
  }

  private void asW() {
    a(this.dcE, new buc(this));

    if (this.dca == null) {
      this.dca = this.dcE;
      this.dcE = null;
    }
    else {
      a(this.dcE, new buf(this));
    }
  }

  public final void c(Runnable paramRunnable)
  {
    dR localdR = aty();
    if (localdR == null) {
      return;
    }
    a(localdR, paramRunnable);
  }

  private void a(dR paramdR, Runnable paramRunnable) {
    Anm localAnm = paramdR.hK();
    if (localAnm.gI())
      paramRunnable.run();
    else
      a(localAnm, paramRunnable);
  }

  public final void a(Anm paramAnm, Runnable paramRunnable)
  {
    bue localbue = new bue(this, paramAnm, paramRunnable);

    this.dcF.add(localbue);
  }

  protected void asX() {
    if (aty() == null) {
      return;
    }
    R(aty().jdMethod_if());
  }

  public void b(String paramString, boolean paramBoolean)
  {
    if ((!bB) && (!paramString.endsWith("anm")) && (!paramString.endsWith("ANM"))) throw new AssertionError();
    m(paramString, paramBoolean);
  }

  public ahm()
  {
    this(0L);
  }

  public ahm(long paramLong) {
    this(paramLong, 0.0F, 0.0F);
  }

  public ahm(long paramLong, float paramFloat1, float paramFloat2) {
    this(paramLong, paramFloat1, paramFloat2, 0.0F);
  }

  public ahm(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3) {
    a(paramLong);
    this.dcl = paramFloat1;
    this.dcm = paramFloat2;
    this.cQv = paramFloat3;

    this.dbH = new cEh();
    this.dbI = true;
    atl();

    if (Threading.isOpenGLThread()) {
      asY();
    }
    bdB.b(this);
    atf();
  }

  private void asY() {
    if ((!bB) && (this.bqm != null)) throw new AssertionError();
    if ((!bB) && (this.UZ != null)) throw new AssertionError();

    this.UZ = ((Material)Material.mwD.bQy());
    this.UZ.e(dR.hU());

    this.bqm = this.dcj.b(this);
    c(this.bqm);
  }

  public void asZ()
  {
    this.dbJ = true;
  }

  public String ata() {
    return this.bU;
  }

  public boolean eq(String paramString)
  {
    if (this.bU.equals(paramString)) {
      return false;
    }

    asX();
    ci(false);
    this.dbM = this.bU;
    this.bU = paramString;
    asZ();

    return true;
  }

  public void cb(boolean paramBoolean) {
    this.dbN = paramBoolean;
    if (!this.dbN)
      atr();
  }

  public boolean atb()
  {
    return (this.dbN) && (isVisible());
  }

  public String atc()
  {
    return this.dbU;
  }

  public String atd() {
    return this.dbM;
  }

  public void er(String paramString)
  {
    int i = (paramString != this.dbU) || ((paramString != null) && (!paramString.equals(this.dbU))) ? 1 : 0;

    if (i != 0) {
      this.dbU = paramString;
      asZ();
    }
  }

  public void av(float paramFloat)
  {
    this.dbK = paramFloat;
  }

  public String ate() {
    String str1 = this.bU;
    String str2 = atc();
    if (str2 != null) {
      str1 = str1 + str2;
    }
    return str1;
  }

  public final void atf()
  {
    this.dbQ = true;
  }

  protected final boolean j(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool = (this.dca != null) && (this.dcb.contains((int)paramFloat1, (int)paramFloat2));

    if (bool) {
      float f1 = paramFloat1 - this.dcb.drw();
      float f2 = paramFloat2 - this.dcb.dry();
      bool = a(this.bqm, f1, f2, paramFloat3);
    }
    return bool;
  }

  public boolean w(float paramFloat1, float paramFloat2) {
    return j(paramFloat1, paramFloat2, 1.0F);
  }

  private boolean a(Entity paramEntity, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramEntity == null) {
      return false;
    }

    ArrayList localArrayList = paramEntity.aSj();
    if (localArrayList == null) {
      return false;
    }

    cEh localcEh1 = new cEh();
    cEh localcEh2 = new cEh();
    cEh localcEh3 = new cEh();

    cEl localcEl1 = new cEl();
    cEl localcEl2 = new cEl();
    cEh localcEh4 = new cEh(paramFloat1, paramFloat2, 0.0F, 0.0F);

    int i = (this.dca.gJ()) && (paramFloat3 == 1.0F) ? 1 : 0;

    float f1 = this.dca.getMinX();
    float f2 = this.dca.getMinY();

    for (Entity localEntity : localArrayList) {
      int j = ((Entity3D)localEntity).bvg();

      for (int k = 0; k < j; k++) {
        Geometry localGeometry = ((Entity3D)localEntity).pW(k);
        if ((localGeometry instanceof GLGeometryMesh)) {
          GLGeometryMesh localGLGeometryMesh = (GLGeometryMesh)localGeometry;

          VertexBufferPCT localVertexBufferPCT = localGLGeometryMesh.bIl();
          int m = localVertexBufferPCT.bSV();
          FloatBuffer localFloatBuffer1 = localVertexBufferPCT.bSP();

          for (int n = 0; n < m; n += 4) {
            int i1 = n * 2;
            localcEh1.h(localFloatBuffer1.get(i1 + 0), localFloatBuffer1.get(i1 + 1), 0.0F, 1.0F);
            localcEh2.h(localFloatBuffer1.get(i1 + 2), localFloatBuffer1.get(i1 + 3), 0.0F, 1.0F);
            localcEh3.h(localFloatBuffer1.get(i1 + 4), localFloatBuffer1.get(i1 + 5), 0.0F, 1.0F);

            localcEl1.ae(localcEh3.getX() - localcEh2.getX(), localcEh3.getY() - localcEh2.getY());
            localcEl2.ae(localcEh1.getX() - localcEh2.getX(), localcEh1.getY() - localcEh2.getY());

            float f3 = f1 - localcEh2.getX();
            float f4 = f2 - localcEh2.getY();

            localcEh4.h(paramFloat1 + f3, paramFloat2 + f4, 0.0F, 0.0F);
            if (paramFloat3 != 1.0F) {
              f5 = (paramFloat3 - 1.0F) * 0.5F;

              localcEh2.h(localcEh2.aOR - f5 * (localcEl1.aOR + localcEl2.aOR), localcEh2.aOS - f5 * (localcEl1.aOS + localcEl2.aOS), localcEh2.aOT, localcEh2.dYq);
              localcEl1.cL(paramFloat3);
              localcEl2.cL(paramFloat3);
            }

            float f5 = localcEl2.getY() * localcEl1.getX() - localcEl2.getX() * localcEl1.getY();

            if (f5 != 0.0F)
            {
              float f6;
              float f7;
              if (localcEl1.getX() == 0.0F) {
                if ((!bB) && (localcEl2.getX() == 0.0F)) throw new AssertionError();
                f6 = localcEl2.getY() * localcEh4.getX() - localcEl2.getX() * localcEh4.getY();
                f6 /= f5;
                if ((f6 < 0.0F) || (f6 > 1.0F)) {
                  continue;
                }
                f7 = (localcEh4.getX() - f6 * localcEl1.getX()) / localcEl2.getX();
                if (f7 < 0.0F) continue; if (f7 > 1.0F)
                  continue;
              }
              else
              {
                f7 = localcEh4.getY() * localcEl1.getX() - localcEh4.getX() * localcEl1.getY();
                f7 /= f5;
                if ((f7 < 0.0F) || (f7 > 1.0F)) {
                  continue;
                }
                f6 = (localcEh4.getX() - f7 * localcEl2.getX()) / localcEl1.getX();
                if ((f6 < 0.0F) || (f6 > 1.0F))
                {
                  continue;
                }
              }
              if ((!bB) && ((f6 < 0.0F) || (f6 > 1.0F) || (f7 < 0.0F) || (f7 > 1.0F))) throw new AssertionError("et hop, du code tout buggé");

              FloatBuffer localFloatBuffer2 = localVertexBufferPCT.bSR();
              TextureCoords localTextureCoords = new TextureCoords(localFloatBuffer2.get(i1), localFloatBuffer2.get(i1 + 1), localFloatBuffer2.get(i1 + 4), localFloatBuffer2.get(i1 + 5));

              if ((i == 0) || (a(f6, f7, localTextureCoords, ((Entity3D)localEntity).jP(k)))) {
                return true;
              }
            }
          }
        }
      }

      if (a(localEntity, paramFloat1, paramFloat2, paramFloat3)) {
        return true;
      }
    }
    return false;
  }

  private void a(cEh paramcEh1, cEl paramcEl1, cEl paramcEl2, cEh paramcEh2, Entity paramEntity, TextureCoords paramTextureCoords)
  {
    cwz.iiH.a(paramcEh1.getX(), paramcEh1.getY(), paramcEl1, paramcEl2, paramcEh2);
    cwz.iiH.a(((Entity3D)paramEntity).jP(0), paramTextureCoords);
    cwz.iiH.i(-1, -1, false);
    cwz.iiH.update();
  }

  private void a(cEh paramcEh1, cEl paramcEl1, cEl paramcEl2, cEh paramcEh2)
  {
    cwz.iiH.a(paramcEh1.getX(), paramcEh1.getY(), paramcEl1, paramcEl2, paramcEh2);
    cwz.iiH.update();
  }

  private void a(int paramInt, FloatBuffer paramFloatBuffer, float paramFloat)
  {
    cEh localcEh1 = new cEh();
    cEh localcEh2 = new cEh();
    cEh localcEh3 = new cEh();

    cEl localcEl1 = new cEl();
    cEl localcEl2 = new cEl();

    cwz.iiH.clear();
    for (int i = 0; i < paramInt; i += 4) {
      int j = i * 2;

      localcEh1.h(paramFloatBuffer.get(j + 0), paramFloatBuffer.get(j + 1), 0.0F, 1.0F);
      localcEh2.h(paramFloatBuffer.get(j + 2), paramFloatBuffer.get(j + 3), 0.0F, 1.0F);
      localcEh3.h(paramFloatBuffer.get(j + 4), paramFloatBuffer.get(j + 5), 0.0F, 1.0F);

      localcEl1.ae(localcEh3.getX() - localcEh2.getX(), localcEh3.getY() - localcEh2.getY());
      localcEl2.ae(localcEh1.getX() - localcEh2.getX(), localcEh1.getY() - localcEh2.getY());

      if (paramFloat != 1.0F) {
        float f = (paramFloat - 1.0F) * 0.5F;
        localcEh2.h(localcEh2.aOR - f * (localcEl1.aOR + localcEl2.aOR), localcEh2.aOS - f * (localcEl1.aOS + localcEl2.aOS), localcEh2.aOT, localcEh2.dYq);
        localcEl1.cL(paramFloat);
        localcEl2.cL(paramFloat);
      }

      cwz.iiH.a(new cEh[] { new cEh(localcEh2.getX(), localcEh2.getY(), 0.0F, 0.0F), new cEh(localcEh2.getX() + localcEl1.getX(), localcEh2.getY() + localcEl1.getY(), 0.0F, 0.0F), new cEh(localcEh2.getX() + localcEl1.getX() + localcEl2.getX(), localcEh2.getY() + localcEl1.getY() + localcEl2.getY(), 0.0F, 0.0F), new cEh(localcEh2.getX() + localcEl2.getX(), localcEh2.getY() + localcEl2.getY(), 0.0F, 0.0F) });
    }
  }

  private void a(dKq paramdKq, int paramInt1, int paramInt2)
  {
    cwz.iiH.i(paramInt1, paramInt2, paramdKq.fj(paramInt1, paramInt2));
    cwz.iiH.update();
  }

  private boolean a(float paramFloat1, float paramFloat2, TextureCoords paramTextureCoords, uz paramuz) {
    if (paramuz == null)
      return false;
    try
    {
      cSJ localcSJ = paramuz.wn(0);
      dKq localdKq = localcSJ.cIz();
      int i = localcSJ.getWidth();
      int j = localcSJ.getHeight();

      float f1 = bCO.s(paramTextureCoords.left(), paramTextureCoords.right(), paramFloat1);
      float f2 = bCO.s(paramTextureCoords.top(), paramTextureCoords.bottom(), paramFloat2);

      int k = Math.round(f1 * i);
      int m = j - Math.round(f2 * j);

      return localdKq.fj(k, m);
    } catch (Throwable localThrowable) {
      K.error("", localThrowable);
    }return false;
  }

  public void dispose()
  {
    dbI.cNt().c(this);

    reset();
  }

  protected boolean atg() {
    return (this.dbJ) || (this.dbL) || (this.dct) || (this.dcv) || (this.dbY);
  }

  protected void ath()
  {
    this.dbJ = false;
    this.dbL = false;
    this.dcv = false;
    this.dbY = false;
  }

  private void ati() {
    String str = atp();
    aty().setAnimation(en(str));
  }

  public boolean b(adG paramadG, int paramInt) {
    return a(paramadG, paramInt, 0);
  }

  private boolean a(adG paramadG, int paramInt1, int paramInt2)
  {
    if (paramInt2 > 5) {
      K.info("Boucle infinie dans le process de l'anm " + this.dca.ih() + " animation courante=" + this.bU + " (problème dans l'enchainement des goto ?)");

      return false;
    }
    int i = (paramadG == null) || (e(paramadG)) ? 1 : 0;

    int j = (this.dbZ) && (i != 0) ? 1 : 0;
    if (this.dch) {
      this.dcf.removeAll(this.dcg);
      this.dcg.clear();
      this.dch = false;
    }

    if (this.dcE != null) {
      return true;
    }

    if (this.dca == null) {
      return false;
    }

    boolean bool1 = this.dca.gI();

    if (this.dbQ) {
      this.dbQ = false;
      if (i != 0) {
        if (!bool1)
          this.dbR = true;
        else {
          this.dbP = 0.0F;
        }
      }
    }

    if ((this.dbR) && (bool1)) {
      this.dbP = 0.0F;
      this.dbR = false;
    }
    if (asP() == null) {
      asY();
      cd(this.dci);
      this.dcv = true;
    }
    if ((!bB) && (paramInt1 >= 1000000)) throw new AssertionError("DeltaTime is very high (" + paramInt1 + "), did you use realTime instead ?");
    if (this.ki == null) {
      return false;
    }

    this.bmM = ((int)(this.bmM + paramInt1 * this.dbK));

    if ((!bB) && (this.dca == null)) throw new AssertionError();
    if (!bool1) {
      return false;
    }
    this.dca.ic();

    if (this.dbP < this.dcx) {
      this.dbP += paramInt1 / 500.0F;
      if (this.dbP > this.dcx) {
        this.dbP = this.dcx;
      }
      if (this.bRQ[3] != this.dbP) {
        this.bRQ[3] = this.dbP;
        this.dcv = true;
      }
    }
    int k = 0;
    this.dbY |= this.dca.ii();
    if ((atg()) && (j != 0)) {
      k = 1;
      this.dct = false;
      localbiK = this.dca.hQ();
      this.dca.setAnimation(en(this.bU));
      boolean bool2 = this.dca.hR();
      if (this.dca.hQ() == null) {
        if ((bool2) && (localbiK != null))
          this.dca.setAnimation(localbiK.getName());
        else {
          this.dca.setAnimation(en("AnimStatique"));
        }
      }
      if ((this.dca.hQ() != null) || (bool2)) {
        if ((this.dbJ) && (this.dca.hS())) {
          this.bmM = 0;
          if (this.dbS.size() > 0) {
            atr();
          }
        }
        this.dbX = this.bmM;
        this.dbJ = false;
        this.dbV = -1;
        this.dbW = -1;
      } else {
        ati();
        if (this.dca.hQ() != localbiK) {
          this.bmM = 0;
          this.dbV = -1;
          this.dbW = -1;
          this.dbX = 0;
        }
      }
      ath();
      if (bool2) {
        this.dbJ = true;
        return true;
      }
    }
    biK localbiK = this.dca.hQ();
    if ((localbiK != null) && (localbiK.buE())) {
      atk();
      a(paramadG, paramInt1, paramInt2 + 1);
      return true;
    }

    if (this.dca.hP()) {
      k = 1;
    }
    if (this.dca.hT()) {
      k = 1;
    }

    if (this.dca.hQ() == null) {
      return false;
    }

    int m = this.dca.av(this.bmM);
    if ((m != this.dbW) || (m != this.dbV)) {
      k = 1;
    }

    if ((k != 0) || (this.dca.ib()))
    {
      if ((j != 0) && (this.dbW != m) && ((paramadG == null) || ((isVisible()) && (i != 0)))) {
        this.dca.setMaterial(this.UZ);
        this.dca.a(this.Va, this.Vb);
        this.dca.a(this.bmM, asP(), paramInt1);
        this.dbW = m;
      }

      if (this.dbV != m) {
        this.dbV = m;
        atk();

        if (m == this.dca.hW() - 1) {
          atA();
          if (this.dca == null) {
            return false;
          }
        }
      }

      this.dbX = this.bmM;
    }
    this.dca.b(paramInt1);
    return true;
  }

  protected boolean atj() {
    return (this.dbZ) || (this.dbJ);
  }

  private void atk() {
    this.dca.a(dcd, this.bmM, this.dbX);
    t(dcd);
    dcd.clear();
  }

  public cEh d(adG paramadG) {
    if (this.dbI) {
      cYm localcYm = up.a(paramadG, this);
      this.dbH.m(localcYm.aOR, localcYm.aOS, -1.0F);
      this.dbI = false;
    }

    return this.dbH;
  }

  public void setVisible(boolean paramBoolean) {
    if (paramBoolean != this.aYZ) {
      setAnimated(paramBoolean);
      this.aYZ = paramBoolean;
      this.dct = true;
      a(paramBoolean, dnS.log);
      cg(paramBoolean);
    }
    if ((this.dct) && (paramBoolean))
      this.dbI = true;
  }

  private void setAnimated(boolean paramBoolean)
  {
    if (this.dbZ == paramBoolean) {
      return;
    }
    this.dbZ = paramBoolean;
    this.dbL = true;
  }

  public void atl() {
    this.dbI = true;
  }

  public boolean e(adG paramadG)
  {
    cEh localcEh = d(paramadG);
    rp localrp = paramadG.apF();

    int i = (int)localcEh.getX();
    int j = (int)localcEh.getY();

    dcG.set(i + dcc.drw(), i + dcc.drx(), j + dcc.dry(), j + dcc.drz());

    return localrp.B(dcG.hqx, dcG.hqu, dcG.hqw, dcG.hqv);
  }

  public boolean a(cXf paramcXf)
  {
    if ((!isVisible()) || (!e(paramcXf)) || (this.dca == null)) {
      return false;
    }

    if (this.dca.hQ() == null)
    {
      this.dcb.set(2147483647, -2147483648, 2147483647, -2147483648);
      return false;
    }

    cEh localcEh = d(paramcXf);

    aWe localaWe = paramcXf.cKV();
    dQx localdQx = this.dca.hV();

    int i = bCO.bC(localcEh.getX());
    int j = bCO.bC(localcEh.getY());

    this.bqm.aEf = (i + localdQx.hqu);
    this.bqm.aEh = (i + localdQx.hqv);
    this.bqm.aEg = (j + localdQx.hqw);
    this.bqm.aEi = (j + localdQx.hqx);

    int k = i - localaWe.getScreenX();
    int m = j - localaWe.getScreenY();
    this.dcb.set(k + localdQx.hqu, k + localdQx.hqv, m + localdQx.hqw, m + localdQx.hqx);
    if (!localaWe.B(this.bqm.aEi, this.bqm.aEf, this.bqm.aEg, this.bqm.aEh)) {
      return false;
    }

    float f1 = getWorldX();
    float f2 = getWorldY();
    float f3 = getAltitude();

    float f4 = f1;
    float f5 = f2;

    int n = bCO.bC(f4);
    int i1 = bCO.bC(f5);
    int i2 = bCO.bC(f3);
    if (bdB.c(this)) {
      paramcXf.a(this, this.bqm, n, i1, i2, this.dce, false);
    }

    float[] arrayOfFloat = localaWe.a(this);
    boolean bool = arrayOfFloat[3] != 0.0F;
    if (this.dcu != bool) {
      a(bool, dnS.lof);
      this.dcu = bool;
    }
    if (!bool) {
      return false;
    }

    System.arraycopy(arrayOfFloat, 0, dcz, 0, arrayOfFloat.length);
    byte b = cyQ.a(this.dcy, dcz);
    if (b != this.dcy) {
      this.dcy = b;
    }

    j(dcz);

    asP().d(this.UZ);

    this.bqm.dsE().b(0, getScale(), getScale());
    this.bqm.dsE().a(0, localcEh.getX(), localcEh.getY());

    this.bqm.cat = this.cat;
    if ((dbE) && (this.cat >= 1.0F) && (this.dbZ) && (
      (f1 != n) || (i1 != f2)))
    {
      this.bqm.cat = (this.cat + 1.0F);
    }

    this.bqm.mnQ = f4;
    this.bqm.mnR = f5;
    this.bqm.mnS = f3;
    this.bqm.hYO = ats();

    if (!paramcXf.c(this)) {
      return false;
    }

    paramcXf.b(this.bqm, this.cat > 0.0F);
    return true;
  }

  protected float atm() {
    return 0.0F;
  }

  protected float atn() {
    return 0.0F;
  }

  public void a(cXf paramcXf, int paramInt) {
    this.dct = false;
    this.dbI = true;
  }

  public long ato() {
    return this.bqm.mnP;
  }

  public boolean a(aLA paramaLA) {
    return false;
  }

  public String atp() {
    return this.dbF;
  }

  public void es(String paramString)
  {
    if ((!bB) && (paramString == null)) throw new AssertionError();
    this.dbF = paramString;
  }

  public void t(ArrayList paramArrayList) {
    boolean bool = false;
    int i = -1;

    int j = 0; for (int k = paramArrayList.size(); j < k; j++) {
      int m = ((aLA)paramArrayList.get(j)).bde();
      if ((bool) && (i != m)) break;
      bool |= ((aLA)paramArrayList.get(j)).a(this);

      i = m;
    }
  }

  public final void a(Material paramMaterial) {
    if (this.UZ == null) {
      return;
    }
    this.UZ.e(paramMaterial);
  }

  public void atq() {
    if (this.UZ == null) {
      return;
    }
    this.UZ.F(0.0F, 0.0F, 0.0F);

    ArrayList localArrayList = this.bqm.aSj();
    int i = localArrayList.size();
    for (int j = 0; j < i; j++)
      ((Entity)localArrayList.get(j)).dsJ();
  }

  public void j(long paramLong1, long paramLong2)
  {
    this.dbS.B(paramLong1, paramLong2);
  }

  protected void atr() {
    for (int i = this.dbS.size() - 1; i >= 0; i--) {
      ZG localZG = cFl.cAH().ir(this.dbS.qU(i));
      if (localZG != null) {
        localZG.bH(true);
        localZG.q(0.0F, 0.7F);
      }
    }

    this.dbS.clear();
  }

  public short BC()
  {
    return this.dcA;
  }

  public short ats() {
    Anm localAnm = atx();
    if (localAnm == null) {
      return BC();
    }

    String str1 = atc();
    String str2 = this.bU + str1;
    int i = localAnm.z(str2);
    if (i == -1) {
      return BC();
    }
    return (short)i;
  }

  public void ax(short paramShort) {
    this.dcA = paramShort;
  }

  public void setSelected(boolean paramBoolean)
  {
  }

  public String att()
  {
    return this.dbG;
  }

  public void et(String paramString) {
    this.dbG = paramString;
  }

  public void j(float[] paramArrayOfFloat) {
    if ((!bB) && (paramArrayOfFloat.length != 4)) throw new AssertionError();

    float f1 = this.bRQ[3];
    float f2 = f1 * this.bRQ[0] * paramArrayOfFloat[0];
    float f3 = f1 * this.bRQ[1] * paramArrayOfFloat[1];
    float f4 = f1 * this.bRQ[2] * paramArrayOfFloat[2];
    float f5 = f1 * paramArrayOfFloat[3];
    this.UZ.x(f2, f3, f4, f5);
  }

  public void R(float paramFloat)
  {
    this.cat = paramFloat;
  }

  public float jdMethod_if() {
    return this.cat;
  }

  public float atu() {
    return this.bqm.cat;
  }

  public boolean a(aNA paramaNA)
  {
    if (!this.dcf.contains(paramaNA)) {
      return this.dcf.add(paramaNA);
    }
    return false;
  }

  public void atv() {
    this.dcf.clear();
  }

  public void b(aNA paramaNA) {
    this.dcg.add(paramaNA);
    this.dch = true;
  }

  public void atw() {
    atA();
    this.dcg.addAll(this.dcf);
    this.dch = true;
  }

  public Anm atx()
  {
    dR localdR = aty();
    return localdR == null ? null : localdR.hK();
  }

  public dR aty() {
    return this.dcE == null ? this.dca : this.dcE;
  }

  public int H(String paramString) {
    if ((aty() == null) || (paramString == null)) {
      return 0;
    }
    return aty().H(paramString);
  }

  public final void cc(boolean paramBoolean) {
    if (this.dci == paramBoolean) {
      return;
    }

    cd(paramBoolean);
  }

  public final void cd(boolean paramBoolean)
  {
    this.dci = paramBoolean;
    if (asP() == null) {
      return;
    }

    if (this.dci)
      this.bqm.mnT |= 1;
    else {
      this.bqm.mnT &= -2;
    }
    this.dcj.S(this.dci);
  }

  public final boolean atz() {
    return this.dci;
  }

  public final void ce(boolean paramBoolean) {
    this.ip = paramBoolean;
    if (this.bqm != null)
      if (this.ip)
        this.bqm.mnT |= 2;
      else
        this.bqm.mnT &= -3;
  }

  private void atA()
  {
    int i = 0; for (int j = this.dcf.size(); i < j; i++)
      ((aNA)this.dcf.get(i)).a(this);
  }

  public void cf(boolean paramBoolean)
  {
    this.dcv = paramBoolean;
  }

  public void d(float[] paramArrayOfFloat) {
    if ((paramArrayOfFloat[0] == 1.0F) && (paramArrayOfFloat[1] == 1.0F) && (paramArrayOfFloat[2] == 1.0F)) {
      return;
    }

    this.UZ.E(paramArrayOfFloat[0], paramArrayOfFloat[1], paramArrayOfFloat[2]);
  }

  public void a(String[] paramArrayOfString, boolean paramBoolean) {
    for (String str : paramArrayOfString)
      n(str, paramBoolean);
  }

  public void n(String paramString, boolean paramBoolean)
  {
    int i = byn.jq(paramString);
    if (paramBoolean)
      aty().au(i);
    else
      aty().at(i);
  }

  protected void a(long paramLong)
  {
    this.aTz = paramLong;
  }

  public long getId() {
    return this.aTz;
  }

  public float getAltitude() {
    return this.cQv;
  }

  public float getWorldX() {
    return this.dcl;
  }

  public float getWorldY() {
    return this.dcm;
  }

  public int fa() {
    return bCO.bC(this.dcl);
  }

  public int fb() {
    return bCO.bC(this.dcm);
  }

  public short fc() {
    return (short)bCO.bC(this.cQv);
  }

  public void x(float paramFloat1, float paramFloat2) {
    this.dcl = paramFloat1;
    this.dcm = paramFloat2;
    atl();
    bdB.b(this);
  }

  public void k(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.dcl = paramFloat1;
    this.dcm = paramFloat2;
    if (paramFloat3 == -32768.0F) {
      try {
        throw new Exception("on vient de setter une altitude anormale");
      } catch (Exception localException) {
        dCb.K.error("", localException);
      }
    }
    this.cQv = paramFloat3;
    atl();
    bdB.b(this);
  }

  public cYk atB()
  {
    this.dcn.ac(fa(), fb(), (short)(int)this.cQv);
    return this.dcn;
  }

  public final int OV() {
    return this.dco;
  }

  public final short OW() {
    return this.bMJ;
  }

  public void j(int paramInt, short paramShort) {
    this.dco = paramInt;
    this.bMJ = paramShort;
  }

  public int getScreenX() {
    return this.kO;
  }

  public int getScreenY() {
    return this.kP;
  }

  public void setScreenX(int paramInt) {
    this.kO = paramInt;
  }

  public void setScreenY(int paramInt) {
    this.kP = paramInt;
  }

  public void T(int paramInt) {
    this.kQ = paramInt;
  }

  public int eY() {
    return this.kQ;
  }

  public float getScale() {
    return this.cas;
  }

  public boolean isVisible()
  {
    return this.aYZ;
  }

  public float getAlpha()
  {
    return this.bRQ[3];
  }

  public void z(float paramFloat)
  {
    this.bRQ[3] = paramFloat;
  }

  public void aw(float paramFloat)
  {
    float tmp7_6 = paramFloat; this.dcx = tmp7_6; this.bRQ[3] = tmp7_6;
  }

  public void atC() {
    this.bRQ[3] = this.dcx;
  }

  public float atD() {
    return this.dcw;
  }

  public boolean atE() {
    return this.dcp != null;
  }

  public void a(bUe parambUe) {
    if (this.dcp == null) {
      this.dcp = new ArrayList();
    }
    this.dcp.add(parambUe);
    parambUe.setTargetIsVisible(this.dcq);
  }

  public void b(bUe parambUe) {
    if (this.dcp == null) {
      return;
    }

    this.dcp.remove(parambUe);
    if (this.dcp.size() == 0) {
      this.dcp = null;
      this.kO = -2147483648;
      this.kP = -2147483648;
    }
  }

  public void atF()
  {
    if (this.dcp != null)
      for (int i = 0; i < this.dcp.size(); i++)
        ((bUe)this.dcp.get(i)).a(this, this.kO, this.kP, this.kQ);
  }

  public void cg(boolean paramBoolean)
  {
    if (paramBoolean == this.dcq) {
      return;
    }

    this.dcq = paramBoolean;
    atG();
  }

  public void ch(boolean paramBoolean) {
    if (paramBoolean == this.dcr) {
      return;
    }

    this.dcr = paramBoolean;
    atG();
  }

  private void atG() {
    if (this.dcp == null) {
      return;
    }

    for (int i = 0; i < this.dcp.size(); i++)
      ((bUe)this.dcp.get(i)).setTargetIsVisible((!this.dcr) && (this.dcq));
  }

  public void a(boolean paramBoolean, dnS paramdnS)
  {
    if (this.dcs != null)
      for (int i = 0; i < this.dcs.size(); i++)
        ((bX)this.dcs.get(i)).b(paramBoolean, paramdnS);
  }

  public void a(bX parambX)
  {
    if (this.dcs == null) {
      this.dcs = new ArrayList();
    }
    this.dcs.add(parambX);
  }

  public void b(bX parambX) {
    if (this.dcs != null)
      this.dcs.remove(parambX);
  }

  public cZH atH()
  {
    return cZH.kNh;
  }

  public int aeR() {
    return -1;
  }

  public final void m(boolean paramBoolean) {
    this.dcy = (paramBoolean ? 0 : 2);
  }

  public void ci(boolean paramBoolean)
  {
    this.dcB = paramBoolean;
    this.dcB = false;
  }

  public static void cj(boolean paramBoolean) {
    dbE = paramBoolean;
  }

  public void a(FreeParticleSystem paramFreeParticleSystem) {
    if (this.dcC == null) {
      this.dcC = new ArrayList();
    }
    this.dcC.add(paramFreeParticleSystem);
  }

  public void b(FreeParticleSystem paramFreeParticleSystem) {
    if (this.dcC != null)
      this.dcC.remove(paramFreeParticleSystem);
  }

  public void a(bGL parambGL)
  {
    if (this.dcD == null) {
      this.dcD = new ArrayList();
    }
    this.dcD.add(parambGL);
  }

  public void b(bGL parambGL) {
    if (this.dcD != null)
      this.dcD.remove(parambGL);
  }

  public void atI()
  {
    int i;
    if (this.dcC != null) {
      for (i = 0; i < this.dcC.size(); i++) {
        ((FreeParticleSystem)this.dcC.get(i)).kill();
      }
    }
    if (this.dcD != null)
      for (i = 0; i < this.dcD.size(); i++)
        ((bGL)this.dcD.get(i)).shutdown(100);
  }

  public float[] aw(int paramInt)
  {
    if (aty() == null) {
      return null;
    }
    return aty().aw(paramInt);
  }

  public void e(int paramInt, float[] paramArrayOfFloat)
  {
    if ((!bB) && (paramArrayOfFloat != null) && (paramArrayOfFloat.length != 4)) throw new AssertionError();
    dR localdR = aty();
    if (localdR == null) {
      return;
    }

    if (paramArrayOfFloat == null) {
      localdR.ax(paramInt);
    }

    localdR.a(paramInt, paramArrayOfFloat);
  }
}