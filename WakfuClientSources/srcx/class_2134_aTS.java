import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT.ObjectFactory;
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
import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import java.awt.Insets;
import java.util.ArrayList;

public final class aTS
{
  private bNa bPm = null;

  private ArrayList eSH = new ArrayList();
  private ArrayList eSI = new ArrayList();
  private int hY = 0;
  private int hZ = 0;
  private int eSJ = 0;
  private int eSK = 0;

  private boolean cZw = false;
  private Entity3D eSL;
  private EntityGroup bqm;
  private EntityGroup eSM;
  static int eSN = 0;

  public final int getX()
  {
    return this.hY;
  }

  public final void setX(int paramInt)
  {
    this.hY = paramInt;
  }

  public final int getY()
  {
    return this.hZ;
  }

  public final void setY(int paramInt)
  {
    this.hZ = paramInt;
  }

  public final int getHeight()
  {
    return this.eSK;
  }

  public final void setHeight(int paramInt)
  {
    this.eSK = paramInt;
  }

  public final int getWidth()
  {
    return this.eSJ;
  }

  public final void setWidth(int paramInt)
  {
    this.eSJ = paramInt;
  }

  public void a(Ib paramIb) {
    this.eSH.add(paramIb);
    c(paramIb);
  }

  public void a(aG paramaG) {
    this.eSI.add(paramaG);
    b(paramaG);
  }

  public void b(Ib paramIb) {
    int i = this.eSH.indexOf(paramIb);
    this.eSH.remove(i);
    this.eSL.b(this.eSL.pW(i));
  }

  public final boolean biY()
  {
    return this.cZw;
  }

  public final void setModulationColor(bNa parambNa)
  {
    if (parambNa == this.bPm) {
      return;
    }
    if (parambNa != null)
      this.eSL.setColor(parambNa.QC(), parambNa.QD(), parambNa.QE(), parambNa.getAlpha());
    else {
      this.eSL.setColor(1.0F, 1.0F, 1.0F, 1.0F);
    }

    this.bPm = parambNa;
  }

  public final bNa getModulationColor()
  {
    return this.bPm;
  }

  public void clear()
  {
    for (int i = this.eSL.bvg() - 1; i >= 0; i--) {
      this.eSL.b(this.eSL.pW(0));
    }
    this.eSH.clear();
    this.eSI.clear();
  }

  public void a(Or paramOr, Insets paramInsets1, Insets paramInsets2, Insets paramInsets3)
  {
    this.bqm.setVisible(true);
    this.eSL.setVisible(true);
    this.eSM.setVisible(true);

    int i = paramInsets1.left + paramInsets2.left + paramInsets3.left;
    int j = paramInsets1.bottom + paramInsets2.bottom + paramInsets3.bottom;

    this.bqm.dsE().a(0, this.hY, this.hZ);

    if (this.bPm != null) {
      this.eSL.setColor(this.bPm.QC(), this.bPm.QD(), this.bPm.QE(), this.bPm.getAlpha());
      k = 0; for (m = this.eSI.size(); k < m; k++) {
        ((aG)this.eSI.get(k)).bO().m(this.bPm.QC() * this.bPm.getAlpha(), this.bPm.QD() * this.bPm.getAlpha(), this.bPm.QE() * this.bPm.getAlpha(), this.bPm.getAlpha());
      }
    }
    else
    {
      this.eSL.setColor(1.0F, 1.0F, 1.0F, 1.0F);
      k = 0; for (m = this.eSI.size(); k < m; k++) {
        ((aG)this.eSI.get(k)).bO().m(1.0F, 1.0F, 1.0F, 1.0F);
      }
    }
    int k = 0;
    Object localObject;
    for (int m = this.eSH.size(); k < m; k++) {
      localObject = (Ib)this.eSH.get(k);
      int n = ((Ib)localObject).getX() * this.eSJ + i;
      int i1 = ((Ib)localObject).getY() * this.eSK + j + paramOr.height;
      GeometrySprite localGeometrySprite = (GeometrySprite)this.eSL.pW(k);
      localGeometrySprite.M(i1, n);
    }

    k = 0; for (m = this.eSI.size(); k < m; k++) {
      localObject = (aG)this.eSI.get(k);
      GeometryMesh localGeometryMesh = (GeometryMesh)this.eSL.pW(k + this.eSH.size());
      a(localGeometryMesh.bIl(), (aG)localObject);
    }
  }

  public final void bc()
  {
    this.eSH.clear();
    this.eSI.clear();
    this.bPm = null;

    this.eSL.axl();
    this.eSL = null;
  }

  private void c(Ib paramIb) {
    GeometrySprite localGeometrySprite = (GeometrySprite)GLGeometrySprite.ieZ.bQy();
    dDq localdDq = paramIb.getPixmap();
    localGeometrySprite.i(localdDq.bjL(), localdDq.bjJ(), localdDq.bjM(), localdDq.bjK());
    localGeometrySprite.setSize(localdDq.getWidth(), localdDq.getHeight());
    this.eSL.a(localGeometrySprite, localdDq.hN(), null);
    localGeometrySprite.axl();
  }

  private void a(VertexBufferPCT paramVertexBufferPCT, aG paramaG) {
    float[] arrayOfFloat = new float[16];
    arrayOfFloat[0] = paramaG.getX();
    arrayOfFloat[1] = paramaG.getY();
    arrayOfFloat[2] = (paramaG.getX() + paramaG.getWidth());
    arrayOfFloat[3] = paramaG.getY();
    arrayOfFloat[4] = (paramaG.getX() + paramaG.getWidth());
    arrayOfFloat[5] = paramaG.getY();
    arrayOfFloat[6] = (paramaG.getX() + paramaG.getWidth());
    arrayOfFloat[7] = (paramaG.getY() + paramaG.getHeight());
    arrayOfFloat[8] = (paramaG.getX() + paramaG.getWidth());
    arrayOfFloat[9] = (paramaG.getY() + paramaG.getHeight());
    arrayOfFloat[10] = paramaG.getX();
    arrayOfFloat[11] = (paramaG.getY() + paramaG.getHeight());
    arrayOfFloat[12] = paramaG.getX();
    arrayOfFloat[13] = (paramaG.getY() + paramaG.getHeight());
    arrayOfFloat[14] = paramaG.getX();
    arrayOfFloat[15] = paramaG.getY();

    paramVertexBufferPCT.A(arrayOfFloat);
  }

  private void b(aG paramaG) {
    GeometryMesh localGeometryMesh = (GeometryMesh)GLGeometryMesh.djO.bQy();

    int i = 16;
    VertexBufferPCT localVertexBufferPCT = VertexBufferPCT.gNI.zN(16);
    dUU localdUU = dUU.mtc;

    localVertexBufferPCT.tg(16);

    int j = 0; for (int k = localVertexBufferPCT.bSV(); j < k; j++) {
      localVertexBufferPCT.a(j, 1.0F, 1.0F, 1.0F, 1.0F);
    }

    localGeometryMesh.a(cSb.kEj, localVertexBufferPCT, localdUU);
    this.eSL.a(localGeometryMesh);
    localGeometryMesh.axl();
    localVertexBufferPCT.axl();
  }

  public final void aJ() {
    if ((!bB) && (this.eSL != null)) throw new AssertionError();
    this.bqm = ((EntityGroup)EntityGroup.ecY.bQy());
    this.bqm.mnU = this;
    this.bqm.dsE().a(new cxn());
    this.eSL = ((Entity3D)Entity3D.fAs.bQy());
    this.eSM = ((EntityGroup)EntityGroup.ecY.bQy());
    this.eSM.mnU = this;
    this.bqm.d(this.eSL);
    this.bqm.d(this.eSM);
  }

  public final EntityGroup getEntity() {
    return this.bqm;
  }

  public EntityGroup biZ() {
    return this.eSM;
  }
}