import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT.ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh.ObjectFactory;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite.ObjectFactory;

public class doM
{
  private static int a(float[] paramArrayOfFloat, bNa parambNa, float paramFloat1, float paramFloat2, cSb paramcSb, boolean paramBoolean, Entity3D paramEntity3D)
  {
    GLGeometryMesh localGLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.djO.bQy();

    int i = paramArrayOfFloat.length / 2;

    VertexBufferPCT localVertexBufferPCT = VertexBufferPCT.gNI.zN(i);
    dUU localdUU = dUU.mtc;

    localVertexBufferPCT.tg(i);
    localVertexBufferPCT.A(paramArrayOfFloat);

    int j = 0; for (int k = localVertexBufferPCT.bSV(); j < k; j++) {
      localVertexBufferPCT.a(j, parambNa.QC(), parambNa.QD(), parambNa.QE(), parambNa.getAlpha());
    }

    localGLGeometryMesh.a(paramcSb, localVertexBufferPCT, localdUU);
    localGLGeometryMesh.setLineWidth(paramFloat2);
    localGLGeometryMesh.be(paramBoolean);

    j = paramEntity3D.a(localGLGeometryMesh);
    localVertexBufferPCT.axl();
    localGLGeometryMesh.axl();
    return j;
  }

  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, dDq paramdDq, bNa parambNa, Entity3D paramEntity3D) {
    if ((paramInt3 == 0) || (paramInt4 == 0)) {
      return;
    }
    GeometrySprite localGeometrySprite = b(paramInt1, paramInt2, paramInt3, paramInt4, parambNa);
    uz localuz = a(paramdDq, localGeometrySprite);
    paramEntity3D.a(localGeometrySprite, localuz, null);
    localGeometrySprite.axl();
  }

  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, dDq paramdDq, bNa parambNa, EntitySprite paramEntitySprite) {
    if ((paramInt3 == 0) || (paramInt4 == 0)) {
      return;
    }
    GeometrySprite localGeometrySprite = b(paramInt1, paramInt2, paramInt3, paramInt4, parambNa);
    uz localuz = a(paramdDq, localGeometrySprite);
    paramEntitySprite.setTexture(localuz);
    paramEntitySprite.a(localGeometrySprite);
    localGeometrySprite.axl();
  }

  public static void a(int paramInt1, int paramInt2, uz paramuz, bNa parambNa, EntitySprite paramEntitySprite) {
    dDq localdDq = new dDq(paramuz);
    GeometrySprite localGeometrySprite = b(paramInt1, paramInt2, localdDq.getWidth(), localdDq.getHeight(), parambNa);
    a(localdDq, localGeometrySprite);
    paramEntitySprite.setTexture(paramuz);
    paramEntitySprite.a(localGeometrySprite);
    localGeometrySprite.axl();
  }

  private static uz a(dDq paramdDq, GeometrySprite paramGeometrySprite) {
    if (paramdDq == null) {
      return null;
    }
    paramGeometrySprite.a(paramdDq.bjL(), paramdDq.bjJ(), paramdDq.bjM(), paramdDq.bjK(), paramdDq.getRotation());
    return paramdDq.hN();
  }

  public static GeometrySprite b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, bNa parambNa) {
    GeometrySprite localGeometrySprite = (GeometrySprite)GLGeometrySprite.ieZ.bQy();
    localGeometrySprite.c(paramInt2, paramInt1, paramInt3, paramInt4);
    localGeometrySprite.setColor(parambNa.QC(), parambNa.QD(), parambNa.QE(), parambNa.getAlpha());
    return localGeometrySprite;
  }
}