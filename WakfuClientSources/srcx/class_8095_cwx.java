import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT.ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.Entity3D.ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup.ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite.ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh.ObjectFactory;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class cwx
{
  private static final Logger K = Logger.getLogger(cwx.class);

  private static final bNa iij = new bNa(0.2F, 0.2F, 0.2F, 0.3F);
  private static final int ibp = 86;
  private static final int ibq = 43;
  private static final float iik = 0.06F;
  private static final float iil = 1.0F;
  private static final float iim = 0.5F;
  private static final float iin = 193.5F;
  private static final float iio = 387.0F;
  private static final Comparator iip = new cfE();
  private float iiq;
  private float iir;
  private final cxn iis = new cxn();
  private final cxn iit = new cxn();
  private final EntityGroup iiu;
  private Entity3D iiv;
  private Entity3D iiw;
  private final qJ iix = new qJ();
  private final qJ iiy = new qJ();

  private boolean iiz = false;
  private final dQx iiA = new dQx();

  public cwx() {
    this.iiu = ((EntityGroup)EntityGroup.ecY.bQy());
    this.iiu.mnU = this;
    this.iiu.dsE().a(this.iis);
    this.iiu.dsE().a(this.iit);
  }

  public void co(float paramFloat) {
    this.iiy.z(paramFloat);
  }

  public void cp(float paramFloat) {
    this.iix.z(paramFloat);
  }

  public void Z(float paramFloat1, float paramFloat2) {
    this.iiq = paramFloat1;
    this.iir = paramFloat2;
  }

  public void setSize(int paramInt1, int paramInt2) {
    this.iit.b(paramInt1 * 0.5F, paramInt2 * 0.5F, 0.0F);
  }

  public void b(dQx paramdQx) {
    this.iiA.set(paramdQx.hqu, paramdQx.hqv + 1, paramdQx.hqw, paramdQx.hqx + 1);
  }

  public EntityGroup getEntity() {
    getEntities(this.iiu);
    return this.iiu;
  }

  public void getEntities(EntityGroup paramEntityGroup) {
    paramEntityGroup.removeAllChildren();

    Collections.sort(this.iix, iip);
    Collections.sort(this.iiy, iip);

    for (Iterator localIterator = this.iix.iterator(); localIterator.hasNext(); ) { localEntitySprite = (EntitySprite)localIterator.next();
      paramEntityGroup.d(localEntitySprite);
    }
    EntitySprite localEntitySprite;
    for (localIterator = this.iiy.iterator(); localIterator.hasNext(); ) { localEntitySprite = (EntitySprite)localIterator.next();
      paramEntityGroup.d(localEntitySprite);
    }

    if (this.iiw != null) {
      paramEntityGroup.d(this.iiw);
    }

    if (this.iiz)
      paramEntityGroup.d(this.iiv);
  }

  public EntitySprite a(MD paramMD1, MD paramMD2, uz paramuz, bNa parambNa)
  {
    return a(paramMD1, paramMD2, this.iiq, paramuz, parambNa, this.iix);
  }

  public EntitySprite b(MD paramMD1, MD paramMD2, uz paramuz, bNa parambNa) {
    return a(paramMD1, paramMD2, this.iir, paramuz, parambNa, this.iiy);
  }

  private EntitySprite a(MD paramMD1, MD paramMD2, float paramFloat, uz paramuz, bNa parambNa, ArrayList paramArrayList) {
    EntitySprite localEntitySprite = (EntitySprite)EntitySprite.kYR.bQy();
    localEntitySprite.a(Pb.aaU().aaV(), cmL.hRG, cmL.hSl);

    localEntitySprite.mnQ = paramMD1.getX();
    localEntitySprite.mnR = paramMD1.getY();
    localEntitySprite.mnP = (paramMD1.getX() + paramMD1.getY());

    int i = paramMD1.getX() + paramMD2.getX();
    int j = paramMD1.getY() + paramMD2.getY();
    int k = bCO.bD((i - j) * 86 * 0.5F);
    int m = bCO.bD(-(i + j) * 43 * 0.5F);

    cSJ localcSJ = paramuz.wn(0);
    int n = localcSJ.cIu();
    int i1 = localcSJ.cIv();
    doM.a(k + n, m + i1, paramuz, parambNa, localEntitySprite);

    GeometrySprite localGeometrySprite = localEntitySprite.cPd();
    localGeometrySprite.setSize(bCO.bD(localGeometrySprite.getWidth() / paramFloat), bCO.bD(localGeometrySprite.getHeight() / paramFloat));
    localGeometrySprite.a(cnQ.hUU, cnQ.hUY);
    paramArrayList.add(localEntitySprite);
    return localEntitySprite;
  }

  public Entity3D a(MD paramMD, bNa parambNa) {
    ctT();
    this.iiw = ((Entity3D)Entity3D.fAs.bQy());
    GLGeometryMesh localGLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.djO.bQy();

    VertexBufferPCT localVertexBufferPCT = VertexBufferPCT.gNI.zN(4);
    localVertexBufferPCT.begin();

    int i = bCO.bD(paramMD.getX() / 2.0F) * 2;
    int j = bCO.bD(paramMD.getY() / 2.0F) * 2;
    a(localVertexBufferPCT, i, i + 2, j, j, parambNa);
    a(localVertexBufferPCT, i + 2, i, j + 2, j + 2, parambNa);

    localVertexBufferPCT.end();
    localGLGeometryMesh.a(cSb.kEo, localVertexBufferPCT, dUU.mtb);

    this.iiw.a(localGLGeometryMesh);
    localGLGeometryMesh.axl();
    return this.iiw;
  }

  public void ctT() {
    if (this.iiw != null) {
      this.iiw.axl();
      this.iiw = null;
    }
  }

  public EntitySprite dP(int paramInt1, int paramInt2) {
    return e(paramInt1, paramInt2, this.iix);
  }

  public EntitySprite dQ(int paramInt1, int paramInt2) {
    return e(paramInt1, paramInt2, this.iiy);
  }

  public void f(Entity paramEntity) {
    if (this.iiy.remove(paramEntity)) {
      paramEntity.axl();
      return;
    }
    if (this.iix.remove(paramEntity)) {
      paramEntity.axl();
      return;
    }
  }

  private static EntitySprite e(int paramInt1, int paramInt2, ArrayList paramArrayList)
  {
    EntitySprite localEntitySprite = f(paramInt1, paramInt2, paramArrayList);
    if (localEntitySprite != null) {
      paramArrayList.remove(localEntitySprite);
      localEntitySprite.axl();
    }
    return localEntitySprite;
  }

  public EntitySprite dR(int paramInt1, int paramInt2) {
    return f(paramInt1, paramInt2, this.iix);
  }

  public EntitySprite dS(int paramInt1, int paramInt2) {
    return f(paramInt1, paramInt2, this.iiy);
  }

  private static EntitySprite f(int paramInt1, int paramInt2, ArrayList paramArrayList) {
    for (int i = 0; i < paramArrayList.size(); i++) {
      EntitySprite localEntitySprite = (EntitySprite)paramArrayList.get(i);
      if ((localEntitySprite.mnQ == paramInt1) && (localEntitySprite.mnR == paramInt2)) {
        return localEntitySprite;
      }
    }
    return null;
  }

  public EntitySprite dT(int paramInt1, int paramInt2) {
    float f1 = paramInt1 - this.iit.cuJ().aOR;
    float f2 = paramInt2 - this.iit.cuJ().aOS;

    f1 /= getZoomFactor();
    f2 /= getZoomFactor();
    f1 -= this.iis.cuJ().aOR;
    f2 -= this.iis.cuJ().aOS;

    for (int i = this.iiy.size() - 1; i >= 0; i--) {
      EntitySprite localEntitySprite = (EntitySprite)this.iiy.get(i);
      GeometrySprite localGeometrySprite = localEntitySprite.cPd();
      if ((f1 > localGeometrySprite.bjJ()) && (f1 < localGeometrySprite.bjK()) && (localGeometrySprite.bjL() > f2) && (localGeometrySprite.bjM() < f2))
      {
        dKq localdKq = localEntitySprite.hN().wn(0).cIz();
        float f3 = (f1 - localGeometrySprite.bjJ()) * this.iir;
        float f4 = (localGeometrySprite.getHeight() - (f2 - localGeometrySprite.bjM())) * this.iir;
        if ((localdKq == null) || (localdKq.fj((int)f3, (int)f4)))
          return localEntitySprite;
      }
    }
    return null;
  }

  public void clear() {
    this.iix.clear();
    this.iiy.clear();
    ctT();
    this.iiu.removeAllChildren();
  }

  public void dispose() {
    clear();
    if (this.iiv != null) {
      this.iiv.axl();
      this.iiv = null;
    }
    this.iiz = false;
    this.iiu.axl();
  }

  public float Q(float paramFloat1, float paramFloat2) {
    float f = paramFloat1 - paramFloat2;
    return f * 86.0F * 2.0F;
  }

  public float R(float paramFloat1, float paramFloat2) {
    float f = -(paramFloat1 + paramFloat2);
    return f * 43.0F * 2.0F;
  }

  public float getZoomFactor() {
    return this.iit.cuN().aOR;
  }

  public void C(float paramFloat) {
    float f = bCO.t(paramFloat, 0.06F, 1.0F);
    this.iit.c(f, f, 1.0F);
  }

  public void hI(boolean paramBoolean) {
    this.iiz = paramBoolean;
    if (this.iiv == null) {
      this.iiv = ((Entity3D)Entity3D.fAs.bQy());
      GLGeometryMesh localGLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.djO.bQy();

      VertexBufferPCT localVertexBufferPCT = VertexBufferPCT.gNI.zN(2 * (this.iiA.width() + this.iiA.height()));

      localVertexBufferPCT.begin();
      for (int i = this.iiA.hqu; i <= this.iiA.hqv; i++) {
        a(localVertexBufferPCT, i, i, this.iiA.hqw, this.iiA.hqx, iij);
      }
      for (i = this.iiA.hqw; i <= this.iiA.hqx; i++) {
        a(localVertexBufferPCT, this.iiA.hqu, this.iiA.hqv, i, i, iij);
      }
      localVertexBufferPCT.end();
      localGLGeometryMesh.a(cSb.kEj, localVertexBufferPCT, dUU.mtc);

      this.iiv.a(localGLGeometryMesh);
      localGLGeometryMesh.axl();
    }
  }

  private static void a(VertexBufferPCT paramVertexBufferPCT, int paramInt1, int paramInt2, int paramInt3, int paramInt4, bNa parambNa)
  {
    float f1 = paramInt1 - paramInt3;
    float f2 = paramInt2 - paramInt4;

    float f3 = -(paramInt1 + paramInt3);
    float f4 = -(paramInt2 + paramInt4);
    paramVertexBufferPCT.a(387.0F * f1, 193.5F * f3, 0.0F, 0.0F, parambNa.QC(), parambNa.QD(), parambNa.QE(), parambNa.getAlpha());
    paramVertexBufferPCT.a(387.0F * f2, 193.5F * f4, 0.0F, 0.0F, parambNa.QC(), parambNa.QD(), parambNa.QE(), parambNa.getAlpha());
  }

  public MD getCellCoordFromMouse(int paramInt1, int paramInt2)
  {
    float f1 = paramInt1 - this.iit.cuJ().aOR;
    float f2 = paramInt2 - this.iit.cuJ().aOS;
    f1 /= getZoomFactor();
    f2 /= getZoomFactor();
    f1 -= this.iis.cuJ().aOR;
    f2 -= this.iis.cuJ().aOS;
    f1 /= 86.0F;
    f2 /= 43.0F;
    f1 += 0.5F;
    f2 += 0.5F;
    return new MD(bCO.bD(f1 - f2), -bCO.bD(f1 + f2));
  }

  public cEl aa(float paramFloat1, float paramFloat2) {
    float f1 = paramFloat1 / 86.0F;
    float f2 = paramFloat2 / 43.0F;
    return new cEl(-f1 + f2, f1 + f2);
  }

  public cEl ctU() {
    cEh localcEh = this.iis.cuJ();
    return aa(localcEh.aOR, localcEh.aOS);
  }

  public cEl ab(float paramFloat1, float paramFloat2) {
    float f1 = paramFloat1 - paramFloat2;
    float f2 = -(paramFloat1 + paramFloat2);

    return new cEl(-f1 * 86.0F * 0.5F, -f2 * 43.0F * 0.5F);
  }

  public void ac(float paramFloat1, float paramFloat2) {
    cEl localcEl = ab(paramFloat1, paramFloat2);
    this.iis.b(localcEl.getX(), localcEl.getY(), 0.0F);
  }
}