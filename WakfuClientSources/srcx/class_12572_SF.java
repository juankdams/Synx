import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT.ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh.ObjectFactory;

public class SF
{
  private VertexBufferPCT aVY = null;
  private cdg ctX;
  private Entity3D aVX;
  private int ctY;
  private cnQ Va;
  private cnQ Vb;

  public SF(cnQ paramcnQ1, cnQ paramcnQ2)
  {
    a(paramcnQ1, paramcnQ2);
  }

  public SF() {
    this(cnQ.hUX, cnQ.hUY);
  }

  public final void a(cnQ paramcnQ1, cnQ paramcnQ2) {
    this.Va = paramcnQ1;
    this.Vb = paramcnQ2;
  }

  public final void release() {
    if (this.aVY != null) {
      this.aVY.axl();
      this.aVY = null;
    }
  }

  public final void a(Entity3D paramEntity3D, int paramInt) {
    int i = paramInt * 4;
    this.ctY = paramInt;
    if ((this.aVY != null) && (this.aVY.bSW() != i)) {
      this.aVY.axl();
      this.aVY = null;
    }
    if (this.aVY == null) {
      this.aVY = VertexBufferPCT.gNI.zN(i);
    }
    this.aVY.rewind();
    this.aVX = paramEntity3D;
  }

  public final void afN()
  {
    afO();
    this.aVX = null;
    this.ctX = null;
  }

  private void afO() {
    if ((!bB) && (this.aVY == null)) throw new AssertionError();
    if ((!bB) && (this.aVX == null)) throw new AssertionError();

    if (this.aVY.bSV() != 0) {
      GLGeometryMesh localGLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.djO.bQy();
      localGLGeometryMesh.a(this.Va, this.Vb);

      localGLGeometryMesh.a(cSb.kEo, this.aVY, dUU.mtc);
      this.aVX.a(localGLGeometryMesh, this.ctX, null);
      localGLGeometryMesh.axl();
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, dDq paramdDq, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, bNa parambNa)
  {
    if ((!bB) && ((paramInt3 == 0) || (paramInt4 == 0))) throw new AssertionError();
    if ((!bB) && (paramdDq == null)) throw new AssertionError();
    if ((!bB) && (this.aVY.bSV() + 4 > this.aVY.bSW())) throw new AssertionError();

    if ((this.ctX != null) && (this.ctX != paramdDq.hN())) {
      afO();
      this.aVY.axl();
      this.aVY = VertexBufferPCT.gNI.zN(this.ctY * 4);
    }

    GeometrySprite.b(this.aVY, paramInt2, paramInt1, paramInt3, paramInt4);
    if (parambNa != null)
      GeometrySprite.a(this.aVY, parambNa.QC(), parambNa.QD(), parambNa.QE(), parambNa.getAlpha());
    else {
      GeometrySprite.a(this.aVY, 1.0F, 1.0F, 1.0F, 1.0F);
    }
    GeometrySprite.a(this.aVY, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramdDq.getRotation());

    this.ctX = ((cdg)paramdDq.hN());
    this.ctY -= 1;
    this.aVY.tg(4 + this.aVY.bSV());
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, dDq paramdDq, bNa parambNa)
  {
    if (paramdDq == null) {
      this.ctY -= 1;
      return;
    }
    a(paramInt1, paramInt2, paramInt3, paramInt4, paramdDq, paramdDq.bjL(), paramdDq.bjJ(), paramdDq.bjM(), paramdDq.bjK(), parambNa);
  }
}