import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;

 enum xt
{
  xt()
  {
    super(str, i, null);
  }
  public void a(Entity3D paramEntity3D, byte paramByte, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    if ((!bB) && (paramEntity3D.bvg() != 1)) throw new AssertionError();
    GeometryMesh localGeometryMesh = (GeometryMesh)paramEntity3D.pW(0);
    VertexBufferPCT localVertexBufferPCT = localGeometryMesh.bIl();
    float f1 = bCO.sj((int)(paramFloat3 * 2.0F));
    float f2 = bCO.sj((int)(paramFloat4 * 2.0F));
    if (paramByte != 0)
    {
      float f3 = paramFloat3 * 2.0F / f1;
      float f4 = paramFloat4 * 2.0F / f2;
      float f5 = 1.0F;
      dn.hk()[0] = (-paramFloat2);
      dn.hk()[1] = (-1.0F * paramFloat4 + ((paramByte & 0x1) == 1 ? paramFloat1 : 0.0F));
      dn.hk()[2] = 0.0F;
      dn.hk()[3] = (-1.0F * paramFloat4 + paramFloat2 * 0.5F + ((paramByte & 0x2) == 2 ? paramFloat1 : 0.0F));
      dn.hk()[4] = paramFloat2;
      dn.hk()[5] = (-1.0F * paramFloat4 + ((paramByte & 0x4) == 4 ? paramFloat1 : 0.0F));
      dn.hk()[6] = 0.0F;
      dn.hk()[7] = (-1.0F * paramFloat4 + -paramFloat2 * 0.5F + ((paramByte & 0x8) == 8 ? paramFloat1 : 0.0F));
      localVertexBufferPCT.A(dn.hk());
      localVertexBufferPCT.c(0, 0.5F * f3, 0.0F);
      localVertexBufferPCT.c(1, 1.0F * f3, 0.5F * f4);
      localVertexBufferPCT.c(2, 0.5F * f3, 1.0F * f4);
      localVertexBufferPCT.c(3, 0.0F, 0.5F * f4);
    } else {
      dn.hk()[0] = (-paramFloat3);
      dn.hk()[1] = paramFloat4;
      dn.hk()[2] = (-paramFloat3);
      dn.hk()[3] = (-paramFloat4);
      dn.hk()[4] = paramFloat3;
      dn.hk()[5] = (-paramFloat4);
      dn.hk()[6] = paramFloat3;
      dn.hk()[7] = paramFloat4;

      localVertexBufferPCT.A(dn.hk());
    }
  }
}