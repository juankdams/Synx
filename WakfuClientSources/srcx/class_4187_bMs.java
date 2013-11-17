import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT.ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.Entity3D.ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup.ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh.ObjectFactory;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite.ObjectFactory;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.ArrayList;

public final class bMs
{
  private static final short gPP = 21845;
  private EntityGroup bqm;
  private Entity3D gPQ;
  private Entity3D gPR;
  private Entity3D gPS;
  private SF gPT;
  private SF gPU;
  private SF gPV;
  private bNa bPm = null;

  private int gPW = 0;
  private int ia;
  private int ib;
  private dwT gPX = null;

  public void clear()
  {
    this.gPX = null;
  }

  public void a(dwT paramdwT) {
    this.gPX = paramdwT;
  }

  public int getHeight()
  {
    return this.ib;
  }

  public void setHeight(int paramInt)
  {
    this.ib = paramInt;
  }

  public int getWidth()
  {
    return this.ia;
  }

  public void setWidth(int paramInt)
  {
    this.ia = paramInt;
  }

  public void setCellWidth(int paramInt) {
    this.gPW = paramInt;
  }

  public void setModulationColor(bNa parambNa)
  {
    if (this.bPm == parambNa) {
      return;
    }
    this.bPm = parambNa;
  }

  public bNa getModulationColor()
  {
    return this.bPm;
  }

  private static int cZ(int paramInt1, int paramInt2) {
    return paramInt1 / 2 + da(paramInt1, paramInt2);
  }

  private static int da(int paramInt1, int paramInt2) {
    return paramInt1 * paramInt2;
  }

  private float bTL() {
    return this.gPX != null ? -this.gPX.dcj() : 0.0F;
  }

  private float bTM() {
    if (this.gPX == null) {
      return 1.0F;
    }
    return this.ib / (this.gPX.dck() - this.gPX.dcj());
  }

  public float[] bTN() {
    int i = this.gPX != null ? (int)this.gPX.dcj() : 0;
    int j = this.gPX != null ? (int)this.gPX.dck() : 0;

    int k = i / 5 * 5;
    int m = j / 5 * 5;

    int n = (m - k) / 5 + 1;
    jY localjY = new jY();
    for (int i1 = 0; i1 < n; i1++) {
      float f1 = k + 5 * i1;
      localjY.add(0.0F);
      localjY.add(f1);
      localjY.add(this.ia);
      localjY.add(f1);
    }

    if (this.gPX != null) {
      i1 = 0; for (int i2 = this.gPX.dcl().size(); i1 < i2; i1++) {
        float f2 = this.gPW * i1;
        localjY.add(f2);
        localjY.add(i);
        localjY.add(f2);
        localjY.add(j);
      }
    }

    return localjY.rI();
  }

  public void a(Dimension paramDimension, Insets paramInsets1, Insets paramInsets2, Insets paramInsets3)
  {
    int i = paramInsets1.left + paramInsets2.left + paramInsets3.left;
    int j = paramInsets1.bottom + paramInsets2.bottom + paramInsets3.bottom;

    this.ia = (paramDimension.width - i);
    this.ib = (paramDimension.height - j);

    this.gPQ.clear();
    this.gPS.clear();
    this.gPR.clear();

    cxn localcxn = (cxn)this.gPS.dsE().sz(0);
    localcxn.c(1.0F, bTM(), 1.0F);
    localcxn.b(i, bTL() * bTM() + j, 0.0F);
    this.gPS.dsE().b(0, localcxn);

    localcxn = (cxn)this.gPR.dsE().sz(0);
    localcxn.c(1.0F, bTM(), 1.0F);
    localcxn.b(i, bTL() * bTM() + j, 0.0F);
    this.gPR.dsE().b(0, localcxn);

    bNa localbNa = this.bPm == null ? bNa.gRx : this.bPm;
    Object localObject2;
    if (this.gPX != null) {
      localObject1 = this.gPX.dcl();
      int k = 0; for (int m = ((ArrayList)localObject1).size(); k < m; k++) {
        cxr localcxr = (cxr)((ArrayList)localObject1).get(k);
        dDq localdDq = localcxr.cuP();
        localObject2 = localcxr.getModulationColor() != null ? bNa.a(localcxr.getModulationColor(), localbNa) : localbNa;

        if (localdDq != null)
          b(i + da(this.gPW, k), j + this.ib, this.gPW, this.ib, localdDq, (bNa)localObject2);
        else {
          a(i + da(this.gPW, k), j + this.ib, this.gPW, this.ib, (bNa)localObject2);
        }
      }

    }

    Object localObject1 = bTN();
    int[] arrayOfInt = new int[localObject1.length / 2];
    a((float[])localObject1, new bNa[] { new bNa(0.0F, 0.0F, 0.0F, 0.5F) }, arrayOfInt, 1.0F, cSb.kEj, this.gPR);

    if (this.gPX != null) {
      ArrayList localArrayList1 = this.gPX.dcn();

      int n = 0; for (int i1 = localArrayList1.size(); n < i1; n++) {
        localObject2 = (cKL)localArrayList1.get(n);

        a(((cKL)localObject2).pe(this.gPW), ((cKL)localObject2).bsj(), ((cKL)localObject2).bsl(), 1.0F, cSb.kEm, this.gPS);
      }

      ArrayList localArrayList2 = this.gPX.dcm();

      i1 = 0; for (int i2 = localArrayList2.size(); i1 < i2; i1++) {
        beu localbeu = (beu)localArrayList2.get(i1);

        a(localbeu.pe(this.gPW), localbeu.bsj(), localbeu.bsl(), 2.0F, cSb.kEk, this.gPS);
        a(localbeu.pe(this.gPW), localbeu.bsj(), localbeu.bsl(), 2.0F, cSb.kEi, this.gPS);
      }
    }
  }

  public void bc()
  {
    this.bqm.axl();
    this.bqm = null;

    this.gPQ.axl();
    this.gPQ = null;
    this.gPR.axl();
    this.gPR = null;
    this.gPS.axl();
    this.gPS = null;

    this.bPm = null;

    this.gPX = null;
  }

  public void aJ() {
    if ((!bB) && (this.bqm != null)) throw new AssertionError();
    if ((!bB) && (this.gPR != null)) throw new AssertionError();
    if ((!bB) && (this.gPS != null)) throw new AssertionError();
    this.bqm = ((EntityGroup)EntityGroup.ecY.bQy());
    this.bqm.mnU = this;

    this.gPQ = ((Entity3D)Entity3D.fAs.bQy());
    this.gPR = ((Entity3D)Entity3D.fAs.bQy());
    this.gPS = ((Entity3D)Entity3D.fAs.bQy());

    this.bqm.d(this.gPQ);
    this.bqm.d(this.gPR);
    this.bqm.d(this.gPS);

    this.gPR.a(new aul(this));

    this.gPR.b(new auj(this));

    this.gPS.a(new auo(this));

    this.gPS.b(new aun(this));

    this.gPS.dsE().a(new cxn());
    this.gPR.dsE().a(new cxn());
  }

  public final Entity getEntity()
  {
    return this.bqm;
  }

  private int a(float[] paramArrayOfFloat, bNa[] paramArrayOfbNa, int[] paramArrayOfInt, float paramFloat, cSb paramcSb, Entity3D paramEntity3D)
  {
    GLGeometryMesh localGLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.djO.bQy();

    int i = paramArrayOfFloat.length / 2;

    VertexBufferPCT localVertexBufferPCT = VertexBufferPCT.gNI.zM(i);
    dUU localdUU = dUU.mtc;

    localVertexBufferPCT.tg(i);
    localVertexBufferPCT.A(paramArrayOfFloat);

    int j = 0; for (int k = localVertexBufferPCT.bSV(); j < k; j++) {
      bNa localbNa = paramArrayOfbNa[paramArrayOfInt[j]];
      localVertexBufferPCT.a(j, localbNa.QC(), localbNa.QD(), localbNa.QE(), localbNa.getAlpha());
    }

    localGLGeometryMesh.a(paramcSb, localVertexBufferPCT, localdUU);
    localGLGeometryMesh.setLineWidth(paramFloat);

    j = paramEntity3D.a(localGLGeometryMesh);
    localGLGeometryMesh.axl();
    localVertexBufferPCT.axl();
    return j;
  }

  private void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, dDq paramdDq, bNa parambNa) {
    if ((paramInt3 == 0) || (paramInt4 == 0)) {
      return;
    }

    float f = 0.0F;

    GeometrySprite localGeometrySprite = (GeometrySprite)GLGeometrySprite.ieZ.bQy();
    localGeometrySprite.c(paramInt2 - paramInt4 / 2.0F, paramInt1 - paramInt3 / 2, paramInt3, paramInt4);
    localGeometrySprite.setColor(parambNa.QC(), parambNa.QD(), parambNa.QE(), parambNa.getAlpha());

    uz localuz = null;
    if (paramdDq != null) {
      localGeometrySprite.a(paramdDq.bjL(), paramdDq.bjJ(), paramdDq.bjM(), paramdDq.bjK(), paramdDq.getRotation());
      localuz = paramdDq.hN();
    }
    this.gPQ.a(localGeometrySprite, localuz, null);
    localGeometrySprite.axl();
  }

  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, bNa parambNa) {
    if ((paramInt3 == 0) || (paramInt4 == 0)) {
      return;
    }

    GeometryMesh localGeometryMesh = (GeometryMesh)GLGeometryMesh.djO.bQy();

    float[] arrayOfFloat = new float[8];
    arrayOfFloat[0] = paramInt1;
    arrayOfFloat[1] = (paramInt2 - paramInt4);
    arrayOfFloat[2] = (paramInt1 + paramInt3);
    arrayOfFloat[3] = (paramInt2 - paramInt4);
    arrayOfFloat[4] = (paramInt1 + paramInt3);
    arrayOfFloat[5] = paramInt2;
    arrayOfFloat[6] = paramInt1;
    arrayOfFloat[7] = paramInt2;

    VertexBufferPCT localVertexBufferPCT = VertexBufferPCT.gNI.zN(4);
    dUU localdUU = dUU.mtb;

    localVertexBufferPCT.tg(4);
    localVertexBufferPCT.A(arrayOfFloat);

    int i = 0; for (int j = localVertexBufferPCT.bSV(); i < j; i++) {
      localVertexBufferPCT.a(i, parambNa.QC(), parambNa.QD(), parambNa.QE(), parambNa.getAlpha());
    }

    localGeometryMesh.a(cSb.kEo, localVertexBufferPCT, localdUU);
    localVertexBufferPCT.axl();

    this.gPQ.a(localGeometryMesh);
    localGeometryMesh.axl();
  }
}