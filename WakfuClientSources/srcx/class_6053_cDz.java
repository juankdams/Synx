import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import java.util.Iterator;
import java.util.LinkedList;

public class cDz
{
  public static final cDz iwP = new cDz();
  private final LinkedList iwQ;
  private volatile boolean iwR = true;

  private cDz() {
    this.iwQ = new LinkedList();
  }

  public void hV(boolean paramBoolean) {
    this.iwR = paramBoolean;
  }

  public boolean czt() {
    return this.iwR;
  }

  public void c(ParticleSystem paramParticleSystem) {
    this.iwQ.add(paramParticleSystem);
    beV.fsh.c(paramParticleSystem);
  }

  public void cz(int paramInt) {
    if (!this.iwR) {
      return;
    }
    float f = paramInt / 1000.0F;

    Iterator localIterator = this.iwQ.iterator();
    while (localIterator.hasNext()) {
      ParticleSystem localParticleSystem = (ParticleSystem)localIterator.next();

      if (localParticleSystem.bpu() < 0) {
        beV.fsh.d(localParticleSystem);
        localIterator.remove();
      }
      else
      {
        localParticleSystem.M(f);
      }
    }
  }
}