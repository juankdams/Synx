import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh.ObjectFactory;
import com.ankamagames.framework.graphics.engine.particleSystem.Emitter;
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import java.util.ArrayList;

public class cqf
{
  protected final cSR hZV = new cSR();
  protected final cSR hZW = new cSR();

  public cqf(ParticleSystem paramParticleSystem) {
  }
  public final bsn wf(int paramInt) {
    return (bsn)this.hZV.get(paramInt);
  }

  public final void a(int paramInt, bsn parambsn, boolean paramBoolean) {
    this.hZV.put(paramInt, parambsn);
    b(paramInt, parambsn, paramBoolean);
  }

  public final void wg(int paramInt) {
    this.hZV.remove(paramInt);
  }

  private void b(int paramInt, bsn parambsn, boolean paramBoolean) {
    long l = this.dxU.vl(paramInt);
    uz localuz = tq.Bg().aw(l);
    if (localuz != null) {
      localuz.gQ();
      this.hZW.put(paramInt, localuz);
      return;
    }

    cSJ localcSJ = crX.a(parambsn.getData(), parambsn.getWidth(), parambsn.getHeight(), 32);

    crX localcrX = new crX(bIN.gJf, localcSJ);
    localuz = tq.Bg().a(dHL.lSB.dhZ(), l, localcrX, paramBoolean);

    localuz.gQ();
    this.hZW.put(paramInt, localuz);

    localcSJ.axl();
    localcrX.axl();
  }

  public void a(Emitter paramEmitter) {
    if ((!bB) && (!this.dxU.isEditable())) throw new AssertionError();
    int i = paramEmitter.cRs.lkS * 4;
    ArrayList localArrayList = paramEmitter.cRs.lkP;
    int j = localArrayList.size();
    if (paramEmitter.cRp == null)
      paramEmitter.cRp = new ArrayList(j);
    Object localObject;
    uz localuz;
    for (int k = 0; k < j; k++) {
      qU localqU = (qU)localArrayList.get(k);

      localObject = (GLGeometryMesh)GLGeometryMesh.djO.bQy();
      ((GLGeometryMesh)localObject).a(cSb.kEo, i, dUU.mtc);
      ((GLGeometryMesh)localObject).a(cnQ.hUU, cnQ.hUY);

      localuz = (uz)ParticleSystem.f(this.dxU).hZW.get(localqU.xG());
      this.dxU.a((Geometry)localObject, localuz, ParticleSystem.UA);
      ((GLGeometryMesh)localObject).axl();
      ((GLGeometryMesh)localObject).a(this.dxU.Va, this.dxU.hFa);
      paramEmitter.cRp.add(localObject);
    }

    k = 0; for (int n = this.dxU.bvg(); k < n; k++) {
      localObject = this.dxU.pW(k);
      ((Geometry)localObject).gQ();
      localuz = this.dxU.jP(k);
      localuz.gQ();
    }
    ParticleSystem.g(this.dxU);

    if (this.dxU.hFc.gFO != null) {
      Emitter[] arrayOfEmitter = this.dxU.hFc.gFO;
      n = 0; for (int i1 = arrayOfEmitter.length; n < i1; n++) {
        b(arrayOfEmitter[n]);
      }
    }
    int m = 0; for (n = this.dxU.bvg(); m < n; m++)
      this.dxU.jP(m).axl();
  }

  private void b(Emitter paramEmitter)
  {
    if (paramEmitter == null) {
      return;
    }
    ArrayList localArrayList = paramEmitter.cRs.lkP;
    int i = localArrayList.size();
    Object localObject1;
    Object localObject2;
    for (int j = 0; j < i; j++) {
      qU localqU = (qU)localArrayList.get(j);
      localObject1 = (uz)ParticleSystem.f(this.dxU).hZW.get(localqU.xG());
      localObject2 = (GeometryMesh)paramEmitter.cRp.get(j);
      this.dxU.a((Geometry)localObject2, (uz)localObject1, ParticleSystem.UA);
      ((GeometryMesh)localObject2).axl();
    }

    if (paramEmitter.cRq != null) {
      j = paramEmitter.cRq.size();
      for (int k = 0; k < j; k++) {
        localObject1 = paramEmitter.cRq.tb(k);
        if (((Particle)localObject1).bIX())
        {
          localObject2 = ((Particle)localObject1).gFO;
          int m = 0; for (int n = localObject2.length; m < n; m++)
            b(localObject2[m]);
        }
      }
    }
  }
}