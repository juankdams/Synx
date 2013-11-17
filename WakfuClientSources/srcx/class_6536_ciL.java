import com.ankamagames.baseImpl.graphics.isometric.highlight.HighLightEntity;
import com.ankamagames.baseImpl.graphics.isometric.highlight.HighLightEntity.ObjectFactory;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.material.Material.ObjectFactory;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh.ObjectFactory;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import org.apache.log4j.Logger;

public class ciL
{
  private static final Logger K = Logger.getLogger(ciL.class);
  String m_name;
  public int edm;
  private Material UZ;
  private final aoL cqr = new aoL();
  final bKR hIb = new bKR();

  private boolean aYZ = true;
  private uz UI;
  private dn hIc;
  private static final dGy hId = new aeH();

  ciL(String paramString, uz paramuz, dn paramdn)
  {
    if ((!bB) && (paramuz == null)) throw new AssertionError();
    this.m_name = paramString;
    this.hIc = paramdn;
    this.UZ = ((Material)Material.mwD.bQy());
    this.UI = paramuz;
    this.UI.gQ();
  }

  public void Q(dGy paramdGy) {
    this.cqr.a(new aeI(this, paramdGy));
  }

  public dn ckD()
  {
    return this.hIc;
  }

  public void a(uz paramuz, dn paramdn) {
    int i = paramuz != this.UI ? 1 : 0;

    paramuz.gQ();
    this.UI.axl();
    this.UI = paramuz;
    this.hIc = paramdn;

    cHu localcHu = this.cqr.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      HighLightEntity localHighLightEntity = (HighLightEntity)localcHu.value();
      localHighLightEntity.a(0, this.UI);
      if (i != 0) {
        GeometryMesh localGeometryMesh = (GeometryMesh)localHighLightEntity.pW(0);
        b(localGeometryMesh);
        localHighLightEntity.biG = false;
      }
    }
  }

  public boolean isEmpty() {
    return this.cqr.isEmpty();
  }

  public float[] ckE() {
    return this.UZ.dvD();
  }

  public void g(float[] paramArrayOfFloat) {
    this.UZ.V(paramArrayOfFloat);

    cHu localcHu = this.cqr.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      HighLightEntity localHighLightEntity = (HighLightEntity)localcHu.value();
      GeometryMesh localGeometryMesh = (GeometryMesh)localHighLightEntity.pW(0);
      localGeometryMesh.setColor(paramArrayOfFloat[0], paramArrayOfFloat[1], paramArrayOfFloat[2], paramArrayOfFloat[3]);
      localHighLightEntity.biG = false;
    }
  }

  final MD ckF() {
    return this.UI.cqv();
  }

  public boolean isVisible() {
    return this.aYZ;
  }

  public void setVisible(boolean paramBoolean) {
    this.aYZ = paramBoolean;
  }

  boolean N(long paramLong) {
    return this.cqr.N(paramLong);
  }

  public boolean P(int paramInt1, int paramInt2, short paramShort) {
    return N(dbL.ac(paramInt1, paramInt2, paramShort));
  }

  final HighLightEntity Q(int paramInt1, int paramInt2, int paramInt3) {
    return hu(dbL.ac(paramInt1, paramInt2, paramInt3));
  }

  HighLightEntity hu(long paramLong) {
    return (HighLightEntity)this.cqr.get(paramLong);
  }

  public void clear()
  {
    if (!this.cqr.isEmpty()) {
      this.cqr.s(hId);
    }
    this.cqr.clear();
  }

  public void Q(int paramInt1, int paramInt2, short paramShort) {
    long l = dbL.ac(paramInt1, paramInt2, paramShort);
    add(l);
  }

  public void R(int paramInt1, int paramInt2, short paramShort) {
    long l = dbL.ac(paramInt1, paramInt2, paramShort);
    fD(l);
  }

  void add(long paramLong)
  {
    if (this.cqr.get(paramLong) != null) {
      return;
    }
    try
    {
      HighLightEntity localHighLightEntity = (HighLightEntity)HighLightEntity.biF.bQy();
      GeometryMesh localGeometryMesh = (GeometryMesh)GLGeometryMesh.djO.bQy();
      if ((!bB) && (localHighLightEntity.bpu() != 0)) throw new AssertionError();
      if ((!bB) && (localGeometryMesh.bpu() != 0)) throw new AssertionError();

      localGeometryMesh.a(cSb.kEo, 4, dUU.mtb);

      b(localGeometryMesh);

      localGeometryMesh.setColor(0.5F, 0.5F, 0.5F, 1.0F);

      cxn localcxn = new cxn();
      localcxn.Ls();
      localHighLightEntity.dsE().a(localcxn);

      Material localMaterial = Material.mwz;
      localHighLightEntity.a(localGeometryMesh, this.UI, localMaterial);
      localGeometryMesh.axl();
      localHighLightEntity.a(Pb.aaU().aaV(), cmL.hRG, cmL.hSk);
      this.cqr.put(paramLong, localHighLightEntity);
    } catch (Exception localException) {
      K.error("problème création highlight entity layer=" + this.m_name, localException);
    }
  }

  private void b(GeometryMesh paramGeometryMesh) {
    VertexBufferPCT localVertexBufferPCT = paramGeometryMesh.bIl();

    localVertexBufferPCT.tg(4);

    float f1 = this.UI.cqv().getX() / this.UI.cqw().getX();
    float f2 = this.UI.cqv().getY() / this.UI.cqw().getY();
    localVertexBufferPCT.c(0, 0.0F, 0.0F);
    localVertexBufferPCT.c(1, 0.0F, f2);
    localVertexBufferPCT.c(2, f1, f2);
    localVertexBufferPCT.c(3, f1, 0.0F);
  }

  void fD(long paramLong)
  {
    if (this.cqr.isEmpty()) {
      return;
    }
    HighLightEntity localHighLightEntity = (HighLightEntity)this.cqr.remove(paramLong);
    if (localHighLightEntity != null) {
      localHighLightEntity.axl();
      localHighLightEntity.biG = false;
    }
  }

  void R(dGy paramdGy) {
    if (!this.cqr.isEmpty())
      this.cqr.s(paramdGy);
  }

  void release()
  {
    clear();
    this.UZ.axl();
    this.UI.axl();
    this.UZ = null;
    this.UI = null;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.m_name).append(" cellCount=").append(this.cqr.size());
    return localStringBuilder.toString();
  }
}