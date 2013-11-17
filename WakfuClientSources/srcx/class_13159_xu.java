import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;

 enum xu
{
  xu()
  {
    super(str, i, null);
  }
  public void a(Entity3D paramEntity3D, byte paramByte, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    if ((!bB) && (paramEntity3D.bvg() != 1)) throw new AssertionError();
    GeometryMesh localGeometryMesh = (GeometryMesh)paramEntity3D.pW(0);
    VertexBufferPCT localVertexBufferPCT = localGeometryMesh.bIl();
    dn.hk()[0] = (-paramFloat2);
    dn.hk()[1] = ((paramByte & 0x1) == 1 ? paramFloat1 : 0.0F);
    dn.hk()[2] = 0.0F;
    dn.hk()[3] = (paramFloat2 * 0.5F + ((paramByte & 0x2) == 2 ? paramFloat1 : 0.0F));
    dn.hk()[4] = paramFloat2;
    dn.hk()[5] = ((paramByte & 0x4) == 4 ? paramFloat1 : 0.0F);
    dn.hk()[6] = 0.0F;
    dn.hk()[7] = (-paramFloat2 * 0.5F + ((paramByte & 0x8) == 8 ? paramFloat1 : 0.0F));
    localVertexBufferPCT.A(dn.hk());
  }
}