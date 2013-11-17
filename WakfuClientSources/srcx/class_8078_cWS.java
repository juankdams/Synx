import com.ankamagames.baseImpl.graphics.isometric.maskableLayer.MaskableElementAddedListener;
import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.log4j.Logger;

public class cWS
  implements cFh, cnk
{
  private static final Logger K = Logger.getLogger(cWS.class);
  private static final int kJy = 54;
  private static final cWS kJz = new cWS();
  protected MaskableElementAddedListener kJA;
  private final Map kJB;
  private byte kJC;
  private volatile boolean iwR;
  private final ArrayList kJD;

  public cWS()
  {
    this.kJB = new ConcurrentHashMap();

    this.iwR = true;

    this.kJD = new ArrayList();
  }
  public static cWS cKD() {
    return kJz;
  }

  public void hV(boolean paramBoolean) {
    this.iwR = paramBoolean;
  }

  public boolean czt() {
    return this.iwR;
  }

  public void a(CellParticleSystem paramCellParticleSystem)
  {
    if (a(paramCellParticleSystem)) {
      return;
    }
    b(paramCellParticleSystem);
  }

  public boolean a(IsoParticleSystem paramIsoParticleSystem)
  {
    for (IsoParticleSystem localIsoParticleSystem : this.kJB.values()) {
      if (localIsoParticleSystem.getId() == paramIsoParticleSystem.getId()) {
        return true;
      }
    }
    return false;
  }

  public Iterator cKE() {
    return this.kJB.values().iterator();
  }

  public IsoParticleSystem zj(int paramInt) {
    return (IsoParticleSystem)this.kJB.get(Integer.valueOf(paramInt));
  }

  public void b(IsoParticleSystem paramIsoParticleSystem)
  {
    if (!this.iwR) {
      return;
    }

    if ((!bB) && (this.kJB.containsKey(Integer.valueOf(paramIsoParticleSystem.getId())))) throw new AssertionError();
    paramIsoParticleSystem.gQ();
    this.kJB.put(Integer.valueOf(paramIsoParticleSystem.getId()), paramIsoParticleSystem);
    a(paramIsoParticleSystem, (int)paramIsoParticleSystem.getX(), (int)paramIsoParticleSystem.getY(), (int)paramIsoParticleSystem.aCv());

    beV.fsh.c(paramIsoParticleSystem);
  }

  public void zk(int paramInt)
  {
    A(paramInt, false);
  }

  public void A(int paramInt, boolean paramBoolean)
  {
    IsoParticleSystem localIsoParticleSystem = (IsoParticleSystem)this.kJB.get(Integer.valueOf(paramInt));
    if (localIsoParticleSystem == null) {
      return;
    }

    if (paramBoolean)
      localIsoParticleSystem.ciX();
    else
      localIsoParticleSystem.kill();
  }

  public void B(int paramInt, boolean paramBoolean)
  {
    IsoParticleSystem localIsoParticleSystem = (IsoParticleSystem)this.kJB.get(Integer.valueOf(paramInt));
    if (localIsoParticleSystem != null)
      localIsoParticleSystem.setVisible(paramBoolean);
  }

  public void cKF()
  {
    for (Iterator localIterator = this.kJB.values().iterator(); localIterator.hasNext(); ) { localIsoParticleSystem = (IsoParticleSystem)localIterator.next();
      localIsoParticleSystem.OY();
    }
    IsoParticleSystem localIsoParticleSystem;
    if (!this.iwR) {
      return;
    }

    localIterator = this.kJB.values().iterator();

    while (localIterator.hasNext()) {
      localIsoParticleSystem = (IsoParticleSystem)localIterator.next();
      if (localIsoParticleSystem.bpu() <= 0) {
        localIsoParticleSystem.axl();
        localIterator.remove();
      }
    }
  }

  public void a(adG paramadG, int paramInt) {
    if (!this.iwR) {
      return;
    }

    float f = paramInt / 1000.0F;
    if (f > 0.066F) {
      f = 0.066F;
    }

    for (IsoParticleSystem localIsoParticleSystem : this.kJB.values())
      if ((localIsoParticleSystem.bpu() != 0) && 
        (localIsoParticleSystem.OX() <= this.kJC))
      {
        localIsoParticleSystem.M(f);
      }
  }

  public void b(adG paramadG, float paramFloat1, float paramFloat2)
  {
    if (!this.iwR) {
      return;
    }

    this.kJD.clear();
    Iterator localIterator = this.kJB.values().iterator();

    int i = (int)paramFloat1;
    int j = (int)paramFloat2;
    dQx localdQx = paramadG.apF().csU();
    while (localIterator.hasNext()) {
      IsoParticleSystem localIsoParticleSystem = (IsoParticleSystem)localIterator.next();
      if (localIsoParticleSystem.bpu() <= 0) {
        localIsoParticleSystem.axl();
        localIterator.remove();
      }
      else if (localIsoParticleSystem.OX() <= this.kJC)
      {
        boolean bool = true;

        switch (bmf.fDx[a(localIsoParticleSystem, paramadG, localdQx, i, j).ordinal()]) {
        case 1:
          if (localIsoParticleSystem.Pd()) {
            bool = localIsoParticleSystem.c(paramadG);
          }
          this.kJD.add(localIsoParticleSystem);
          localIsoParticleSystem.b(paramadG);
          break;
        case 2:
          try
          {
            localIsoParticleSystem.vk(1);
          }
          catch (Exception localException) {
            while (localIsoParticleSystem.bpu() >= 0) {
              localIsoParticleSystem.axl();
            }
            localIterator.remove();
            K.error("problème lors de l'arrêt d'un système de particule", localException);
          }

        case 3:
        }

        if (!bool)
        {
          bdB.b(localIsoParticleSystem);
        }
      }
    }
  }

  private aAD a(IsoParticleSystem paramIsoParticleSystem, adG paramadG, dQx paramdQx, int paramInt1, int paramInt2)
  {
    float f1 = paramIsoParticleSystem.getX() - paramInt1;
    float f2 = paramIsoParticleSystem.getY() - paramInt2;

    if ((Math.abs(f1) > 54.0F) || (Math.abs(f2) > 54.0F))
    {
      return aAD.dTx;
    }

    if (!paramIsoParticleSystem.isVisible()) {
      return aAD.dTw;
    }

    dQx localdQx = new dQx(paramIsoParticleSystem.Pf());
    cYm localcYm = up.a(paramadG, paramIsoParticleSystem.getX(), paramIsoParticleSystem.getY(), paramIsoParticleSystem.aCv());
    localdQx.translate((int)localcYm.aOR, (int)localcYm.aOS);
    if (paramdQx.f(localdQx)) {
      return aAD.dTv;
    }

    return aAD.dTw;
  }

  public void eB(int paramInt1, int paramInt2)
  {
    for (IsoParticleSystem localIsoParticleSystem : this.kJB.values())
      if (((int)localIsoParticleSystem.getX() == paramInt1) && ((int)localIsoParticleSystem.getY() == paramInt2))
        localIsoParticleSystem.kill();
  }

  private void a(IsoParticleSystem paramIsoParticleSystem, int paramInt1, int paramInt2, int paramInt3)
  {
    bdB.b(paramIsoParticleSystem);
  }

  public void f(bSl parambSl) {
    for (IsoParticleSystem localIsoParticleSystem : this.kJB.values())
      if ((localIsoParticleSystem instanceof FreeParticleSystem)) {
        FreeParticleSystem localFreeParticleSystem = (FreeParticleSystem)localIsoParticleSystem;
        if (localFreeParticleSystem.Gu() == parambSl)
          zk(localIsoParticleSystem.getId());
      }
  }

  public void eJ(byte paramByte)
  {
    this.kJC = paramByte;
  }

  public int cKG() {
    int i = 0;
    Iterator localIterator = this.kJB.values().iterator();

    while (localIterator.hasNext()) {
      IsoParticleSystem localIsoParticleSystem = (IsoParticleSystem)localIterator.next();
      i += localIsoParticleSystem.OU();
    }
    return i;
  }

  public void a(cuA paramcuA, ArrayList paramArrayList) {
    paramArrayList.addAll(this.kJD);
  }
}