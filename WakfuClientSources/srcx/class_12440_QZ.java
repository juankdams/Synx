import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT.ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.Entity3D.ObjectFactory;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh.ObjectFactory;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;

public class QZ
{
  private static final float cqj = -0.09F;
  private static final float cqk = -0.18F;
  private static final float cql = 0.3F;
  private static final bNa cqm = new bNa(0.5F, 0.5F, 0.3F, 0.85F);
  private static final bNa cqn = new bNa(0.8F, 0.8F, 0.5F, 1.0F);
  private static final bNa cqo = new bNa(0.0F, 0.0F, 0.0F, 1.0F);

  private static final bNa cqp = new bNa(0.4F, 0.0F, 0.0F, 0.85F);

  private static final Logger K = Logger.getLogger(QZ.class);
  private final Xt cqq;
  private final aoL cqr = new aoL();
  private final bcm cqs = new bcm();
  private final bKR cqt = new bKR();

  private final float[] cqu = new float[4];
  private static final boolean cqv = false;

  public QZ(UG paramUG)
  {
    this.cqq = new Xt(paramUG);
  }

  public void clear() {
    this.cqs.clear();
    this.cqr.s(new aIf(this));
  }

  public void p(ArrayList paramArrayList)
  {
    this.cqs.clear();
    this.cqt.clear();
    for (int i = 0; i < paramArrayList.size(); i++) {
      DisplayedScreenElement localDisplayedScreenElement = (DisplayedScreenElement)paramArrayList.get(i);
      long l = a(localDisplayedScreenElement);
      if (!this.cqt.N(l))
      {
        Entity localEntity = (Entity)this.cqr.get(l);
        if (localEntity == null) {
          localEntity = c(localDisplayedScreenElement);
          this.cqr.put(l, localEntity);
        }

        if (localEntity != null) {
          this.cqt.add(l);
          if (!this.cqs.contains(localEntity))
            this.cqs.add(localEntity);
        }
      }
    }
  }

  private static long a(bgL parambgL) {
    long l1 = parambgL.fa();
    long l2 = parambgL.fb();
    int i = parambgL.fc();
    return (l2 & 0x3FFFF) << 32 | (l1 & 0x3FFFF) << 14 | i & 0x3FFF;
  }

  public Collection acD() {
    return this.cqs;
  }

  private Entity c(DisplayedScreenElement paramDisplayedScreenElement) {
    if (paramDisplayedScreenElement.bpg()) {
      return null;
    }

    baX localbaX = this.cqq.o(paramDisplayedScreenElement.fa(), paramDisplayedScreenElement.fb(), paramDisplayedScreenElement.fc());
    if (localbaX == null) {
      return null;
    }

    Entity3D localEntity3D = d(paramDisplayedScreenElement);

    a(localEntity3D, cSb.kEo, a(localbaX));
    a(localEntity3D, cSb.kEk, b(localbaX), 1.0F, false);
    if ((localbaX.fja != 0.0F) || (localbaX.fjb != 0.0F)) {
      a(localEntity3D, cSb.kEj, c(localbaX), 1.0F, false);
    }

    return localEntity3D;
  }

  private Entity3D d(DisplayedScreenElement paramDisplayedScreenElement) {
    Entity3D localEntity3D = (Entity3D)Entity3D.fAs.bQy();
    Entity localEntity = paramDisplayedScreenElement.GG();
    localEntity3D.mnQ = localEntity.mnQ;
    localEntity3D.mnR = localEntity.mnR;
    localEntity3D.mnS = localEntity.mnS;
    localEntity3D.cat = localEntity.cat;
    localEntity3D.mnP = localEntity.mnP;
    localEntity3D.hYO = localEntity.hYO;
    localEntity3D.mnT = localEntity.mnT;
    return localEntity3D;
  }

  private void a(Entity3D paramEntity3D, int paramInt1, int paramInt2) {
    float f = 4.3F;
    int i = (int)paramEntity3D.mnQ;
    int j = (int)paramEntity3D.mnR;
    int k = (int)paramEntity3D.mnS;

    for (int m = 1; ; m++) {
      int n = i - m + paramInt1;
      int i1 = j - m + paramInt2;

      HM localHM = this.cqq.aJ(n, i1);
      if (localHM == null) {
        break;
      }
      dhM localdhM = localHM.eV(bCO.aB(k - (m - 1) * 4.3F) - 1);
      if ((localdhM != null) && (localdhM.ldE != k)) {
        baX localbaX = new baX(true, localdhM.ldE, 0, 0, n, i1, localdhM.fiY);
        a(paramEntity3D, cSb.kEj, d(localbaX), 1.0F, true);
      }
    }
  }

  private VertexBufferPCT a(baX parambaX) {
    VertexBufferPCT localVertexBufferPCT = VertexBufferPCT.gNI.zN(12);
    localVertexBufferPCT.begin();

    float f = 0.3F * this.cqq.aa(parambaX.fiZ);
    float[] arrayOfFloat1 = e(a(parambaX, this.cqu), f);

    localVertexBufferPCT.a(parambaX.bjJ(), parambaX.bjI(), 0.0F, 0.0F, arrayOfFloat1);
    localVertexBufferPCT.a(parambaX.bjH(), parambaX.bpp(), 0.0F, 0.0F, arrayOfFloat1);
    localVertexBufferPCT.a(parambaX.bjK(), parambaX.bjI(), 0.0F, 0.0F, arrayOfFloat1);
    localVertexBufferPCT.a(parambaX.bjH(), parambaX.bpo(), 0.0F, 0.0F, arrayOfFloat1);
    float[] arrayOfFloat2;
    if (parambaX.fja != 0.0F) {
      arrayOfFloat2 = e(a(parambaX, this.cqu), f + -0.09F);
      localVertexBufferPCT.a(parambaX.bjJ(), parambaX.bjI(), 0.0F, 0.0F, arrayOfFloat2);
      localVertexBufferPCT.a(parambaX.bjJ(), parambaX.bjI() - parambaX.fja, 0.0F, 0.0F, arrayOfFloat2);
      localVertexBufferPCT.a(parambaX.bjH(), parambaX.bpp() - parambaX.fja, 0.0F, 0.0F, arrayOfFloat2);
      localVertexBufferPCT.a(parambaX.bjH(), parambaX.bpp(), 0.0F, 0.0F, arrayOfFloat2);
    }

    if (parambaX.fjb != 0.0F) {
      arrayOfFloat2 = e(a(parambaX, this.cqu), f + -0.18F);
      localVertexBufferPCT.a(parambaX.bjH(), parambaX.bpp(), 0.0F, 0.0F, arrayOfFloat2);
      localVertexBufferPCT.a(parambaX.bjH(), parambaX.bpp() - parambaX.fjb, 0.0F, 0.0F, arrayOfFloat2);
      localVertexBufferPCT.a(parambaX.bjK(), parambaX.bjI() - parambaX.fjb, 0.0F, 0.0F, arrayOfFloat2);
      localVertexBufferPCT.a(parambaX.bjK(), parambaX.bjI(), 0.0F, 0.0F, arrayOfFloat2);
    }
    localVertexBufferPCT.end();
    return localVertexBufferPCT;
  }

  private static float[] a(baX parambaX, float[] paramArrayOfFloat) {
    bNa localbNa = parambaX.fiX ? cqm : cqp;
    paramArrayOfFloat[0] = localbNa.QC();
    paramArrayOfFloat[1] = localbNa.QD();
    paramArrayOfFloat[2] = localbNa.QE();
    paramArrayOfFloat[3] = localbNa.getAlpha();
    return paramArrayOfFloat;
  }

  private static float[] e(float[] paramArrayOfFloat, float paramFloat) {
    paramArrayOfFloat[0] += paramFloat;
    paramArrayOfFloat[1] += paramFloat;
    paramArrayOfFloat[2] += paramFloat;
    return paramArrayOfFloat;
  }

  private VertexBufferPCT b(baX parambaX) {
    VertexBufferPCT localVertexBufferPCT = VertexBufferPCT.gNI.zN(5);
    localVertexBufferPCT.begin();
    float[] arrayOfFloat = a(parambaX, this.cqu);
    arrayOfFloat[0] = cqn.QC();
    arrayOfFloat[1] = cqn.QD();
    arrayOfFloat[2] = cqn.QE();
    arrayOfFloat[3] = cqn.getAlpha();

    localVertexBufferPCT.a(parambaX.bjJ(), parambaX.bjI(), 0.0F, 0.0F, arrayOfFloat);
    localVertexBufferPCT.a(parambaX.bjH(), parambaX.bpp(), 0.0F, 0.0F, arrayOfFloat);
    localVertexBufferPCT.a(parambaX.bjK(), parambaX.bjI(), 0.0F, 0.0F, arrayOfFloat);
    localVertexBufferPCT.a(parambaX.bjH(), parambaX.bpo(), 0.0F, 0.0F, arrayOfFloat);
    localVertexBufferPCT.a(parambaX.bjJ(), parambaX.bjI(), 0.0F, 0.0F, arrayOfFloat);

    localVertexBufferPCT.end();
    return localVertexBufferPCT;
  }

  private VertexBufferPCT c(baX parambaX) {
    VertexBufferPCT localVertexBufferPCT = VertexBufferPCT.gNI.zN(6);
    localVertexBufferPCT.begin();
    float[] arrayOfFloat = a(parambaX, this.cqu);
    arrayOfFloat[0] = cqn.QC();
    arrayOfFloat[1] = cqn.QD();
    arrayOfFloat[2] = cqn.QE();
    arrayOfFloat[3] = cqn.getAlpha();

    if (parambaX.fja != 0.0F) {
      localVertexBufferPCT.a(parambaX.bjJ(), parambaX.bjI(), 0.0F, 0.0F, arrayOfFloat);
      localVertexBufferPCT.a(parambaX.bjJ(), parambaX.bjI() - parambaX.fja, 0.0F, 0.0F, arrayOfFloat);
    }
    if (parambaX.fjb != 0.0F) {
      localVertexBufferPCT.a(parambaX.bjK(), parambaX.bjI() - parambaX.fjb, 0.0F, 0.0F, arrayOfFloat);
      localVertexBufferPCT.a(parambaX.bjK(), parambaX.bjI(), 0.0F, 0.0F, arrayOfFloat);
    }

    float f = Math.max(parambaX.fja, parambaX.fjb);
    if (f != 0.0F) {
      localVertexBufferPCT.a(parambaX.bjH(), parambaX.bpp(), 0.0F, 0.0F, arrayOfFloat);
      localVertexBufferPCT.a(parambaX.bjH(), parambaX.bpp() - f, 0.0F, 0.0F, arrayOfFloat);
    }
    localVertexBufferPCT.end();
    return localVertexBufferPCT;
  }

  private VertexBufferPCT d(baX parambaX) {
    VertexBufferPCT localVertexBufferPCT = VertexBufferPCT.gNI.zN(8);
    localVertexBufferPCT.begin();
    float[] arrayOfFloat = a(parambaX, this.cqu);
    arrayOfFloat[0] = cqo.QC();
    arrayOfFloat[1] = cqo.QD();
    arrayOfFloat[2] = 0.0F;
    arrayOfFloat[3] = cqo.getAlpha();

    localVertexBufferPCT.a(parambaX.bjJ(), parambaX.bjI(), 0.0F, 0.0F, arrayOfFloat);
    localVertexBufferPCT.a(parambaX.bjH(), parambaX.bpp(), 0.0F, 0.0F, arrayOfFloat);

    localVertexBufferPCT.a(parambaX.bjH(), parambaX.bpp(), 0.0F, 0.0F, arrayOfFloat);
    localVertexBufferPCT.a(parambaX.bjK(), parambaX.bjI(), 0.0F, 0.0F, arrayOfFloat);

    localVertexBufferPCT.a(parambaX.bjK(), parambaX.bjI(), 0.0F, 0.0F, arrayOfFloat);
    localVertexBufferPCT.a(parambaX.bjH(), parambaX.bpo(), 0.0F, 0.0F, arrayOfFloat);

    localVertexBufferPCT.a(parambaX.bjH(), parambaX.bpo(), 0.0F, 0.0F, arrayOfFloat);
    localVertexBufferPCT.a(parambaX.bjJ(), parambaX.bjI(), 0.0F, 0.0F, arrayOfFloat);

    localVertexBufferPCT.end();
    return localVertexBufferPCT;
  }

  private void a(Entity3D paramEntity3D, cSb paramcSb, VertexBufferPCT paramVertexBufferPCT)
  {
    a(paramEntity3D, paramcSb, paramVertexBufferPCT, 0.0F, false);
  }

  private void a(Entity3D paramEntity3D, cSb paramcSb, VertexBufferPCT paramVertexBufferPCT, float paramFloat, boolean paramBoolean)
  {
    GLGeometryMesh localGLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.djO.bQy();
    localGLGeometryMesh.a(paramcSb, paramVertexBufferPCT, dUU.mtc);
    localGLGeometryMesh.setLineWidth(paramFloat);
    localGLGeometryMesh.be(paramBoolean);
    paramEntity3D.a(localGLGeometryMesh);
    localGLGeometryMesh.axl();
  }

  boolean am(int paramInt1, int paramInt2) {
    return this.cqq.aJ(paramInt1, paramInt2) != null;
  }
}