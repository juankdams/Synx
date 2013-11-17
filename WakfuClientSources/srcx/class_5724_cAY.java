import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.Entity3D.ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class cAY extends bah
{
  private static final Logger K = Logger.getLogger(cAY.class);
  private Entity3D irZ;
  private Entity3D isa;
  private bvH isb;
  private dDq cRR;
  private int isc;
  private int isd;
  private int ise;
  private int isf;
  private cSR cAh;
  private static final short gPP = 3855;

  public void setMapDisplayer(dWq paramdWq)
  {
    super.setMapDisplayer(paramdWq);
    i(this.fhW.getEntity());

    bVZ();
  }

  public void b(int paramInt, ZT paramZT) {
    this.cAh.put(paramInt, paramZT);
  }

  public void gZ(int paramInt) {
    this.cAh.remove(paramInt);
  }

  public void aiA() {
    this.cAh.clear();
  }

  public void setPixmap(dDq paramdDq)
  {
    super.setPixmap(paramdDq);
    this.isb.ro(paramdDq.getWidth());
  }

  public void p(dDq paramdDq) {
    this.cRR = paramdDq;
  }

  public void C(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.isc = paramInt1;
    this.isd = paramInt2;
    this.ise = paramInt3;
    this.isf = paramInt4;
  }

  public void a(bNa parambNa, int paramInt, boolean paramBoolean) {
    if ((paramInt < 0) || (paramInt >= this.irZ.bvg())) {
      return;
    }
    GeometryMesh localGeometryMesh = (GeometryMesh)this.irZ.pW(paramInt);
    localGeometryMesh.setColor(parambNa.QC(), parambNa.QD(), parambNa.QE(), paramBoolean ? 0.6F : 0.3F);
  }

  public void j(int paramInt, float paramFloat) {
    if ((paramInt < 0) || (paramInt >= this.irZ.bvg())) {
      return;
    }
    GLGeometryMesh localGLGeometryMesh = (GLGeometryMesh)this.irZ.pW(paramInt);
    localGLGeometryMesh.setLineWidth(paramFloat);
  }

  protected void bpa()
  {
    super.bpa();
    this.irZ.dsE().bMH();
    this.isa.dsE().bMH();
  }

  public void a(Dimension paramDimension, Insets paramInsets1, Insets paramInsets2, Insets paramInsets3)
  {
    super.a(paramDimension, paramInsets1, paramInsets2, paramInsets3);
    j(getColor());
  }

  protected void a(Dimension paramDimension)
  {
    N((float)paramDimension.getWidth() * 0.5F, (float)paramDimension.getHeight() * 0.5F);
  }

  protected void aGQ()
  {
    this.irZ.clear();
    this.isa.clear();

    ArrayList localArrayList = this.bqm.aSj();
    Entity localEntity = this.fhW.getEntity();
    if (localArrayList.isEmpty()) {
      this.bqm.d(localEntity);
      this.bqm.d(this.irZ);
      this.bqm.d(this.isa);
    }
    else if (localArrayList.get(0) != localEntity) {
      this.bqm.a(0, localEntity);
    }
  }

  private void j(bNa parambNa)
  {
    for (dmn localdmn = this.cAh.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      ZT localZT = (ZT)localdmn.value();
      dDq localdDq = localZT.getPixmap();
      if (localdDq != null) {
        int i = (int)(localdDq.getWidth() / this.blZ / 1.5F);
        int j = (int)(localdDq.getHeight() / this.blZ / 1.5F);
        doM.a(localZT.alG() - this.ia / 2, localZT.alH() + j + this.ib / 2, i, j, localdDq, parambNa, this.isa);
      }

    }

    if (this.cRR != null)
      doM.a(-this.ia / 2 + this.isc, this.ib / 2 - this.isd, this.ise, this.isf, this.cRR, parambNa, this.isa);
  }

  public void bc()
  {
    super.bc();
    this.cRR = null;

    this.cAh.clear();
    this.cAh = null;

    this.irZ.axl();
    this.irZ = null;

    this.isa.axl();
    this.isa = null;
  }

  public void aJ()
  {
    super.aJ();

    if ((!bB) && (this.irZ != null)) throw new AssertionError();
    if ((!bB) && (this.isa != null)) throw new AssertionError();

    this.irZ = ((Entity3D)Entity3D.fAs.bQy());
    this.isa = ((Entity3D)Entity3D.fAs.bQy());

    i(this.irZ);
    i(this.isa);

    this.cAh = new cSR();
    try
    {
      this.isb = new bvH();
    } catch (Exception localException) {
      K.warn("Problème à l'instantiation de MapMesh");
    }
  }

  private void i(Entity paramEntity) {
    paramEntity.dsE().a(this.fhX);
    paramEntity.dsE().a(this.fhY);
  }

  private void bVZ() {
    if (this.fhW != null)
      this.fhW.getEntity().a(this.isb.bxa(), this.isb.bxb(), this.isb.bDv());
  }

  private void cxx()
  {
    if (this.fhW != null)
      this.fhW.getEntity().dsK();
  }

  public void hS(boolean paramBoolean)
  {
    if (paramBoolean)
      bVZ();
    else
      cxx();
  }

  public void h(uz paramuz)
  {
    this.isb.c(paramuz);
    this.fhW.h(paramuz);
  }

  public void c(bjI parambjI) {
    this.isb.b(parambjI);
  }

  public void d(cSR paramcSR) {
    this.isb.a(paramcSR);
  }

  public void rn(int paramInt) {
    this.isb.rn(paramInt);
  }
}