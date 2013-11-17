import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;

 enum xw
{
  xw()
  {
    super(str, i, null);
  }
  public void a(Entity3D paramEntity3D, byte paramByte, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    if ((!bB) && (paramEntity3D.bvg() != 1)) throw new AssertionError();
    GeometryMesh localGeometryMesh = (GeometryMesh)paramEntity3D.pW(0);
    VertexBufferPCT localVertexBufferPCT = localGeometryMesh.bIl();
    dn.hk()[0] = (-paramFloat3);
    dn.hk()[1] = (-paramFloat4);
    dn.hk()[2] = (-paramFloat3);
    dn.hk()[3] = paramFloat4;
    dn.hk()[4] = paramFloat3;
    dn.hk()[5] = (-paramFloat4);
    dn.hk()[6] = paramFloat3;
    dn.hk()[7] = paramFloat4;
    localVertexBufferPCT.A(dn.hk());
  }
}