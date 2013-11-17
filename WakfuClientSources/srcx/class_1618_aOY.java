import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class aOY extends bxG
{
  private ArrayList ewi = new ArrayList();

  private static long ewj = 800L;

  public aOY(int paramInt1, int paramInt2, int paramInt3, int paramInt4, ArrayList paramArrayList) {
    super(paramInt1, paramInt2, paramInt3, paramInt4);

    this.ewi = paramArrayList;
  }

  protected void kO()
  {
    for (int i = 0; i < this.ewi.size(); i++) {
      FreeParticleSystem localFreeParticleSystem = cof.cop().vY(15106);
      aSu localaSu = ((bls)this.ewi.get(i)).bwu();
      localFreeParticleSystem.f(localaSu.fa(), localaSu.fb(), localaSu.fc());
      localFreeParticleSystem.cS(a());
      cWS.cKD().b(localFreeParticleSystem);

      ((bls)this.ewi.get(i)).setVisible(true);
      ((bls)this.ewi.get(i)).bwu().sM();
    }
    super.kO();
  }

  public long mC()
  {
    try {
      bfQ();
    } catch (Exception localException) {
      K.error("Exception levee", localException);
    }
    return ewj;
  }

  private void bfQ() {
    String str = "";
    lZ locallZ = new lZ();
    for (int i = 0; i < this.ewi.size(); i++) {
      bls localbls = (bls)this.ewi.get(i);

      if (localbls != null) {
        gA localgA = localbls.getItem();
        Object localObject2;
        Object localObject3;
        if (localgA != null)
        {
          Su localSu = dX(localbls.bwv());
          cYk localcYk = localSu.ML();
          if ((localSu != null) && (localcYk != null)) {
            localObject1 = cof.cop().vY(15105);
            localObject2 = localbls.bwu();

            ((FreeParticleSystem)localObject1).f(localcYk.getX(), localcYk.getY(), localcYk.IB());

            localObject3 = new ZP((bSl)localObject1, ((aSu)localObject2).fa(), ((aSu)localObject2).fb(), ((aSu)localObject2).fc(), 50.0D, 1.6F);
            ((FreeParticleSystem)localObject1).cS(a());
            cWS.cKD().b((IsoParticleSystem)localObject1);
            cnj.cnO().b((bwF)localObject3);
          } else {
            K.warn("figtherDroper null : probablement parce que c'était le dernier du combat et qu'il a été despawn avant d'afficher l'aps");
          }

          if (i == 0) {
            locallZ.tz().a(localgA.getName()).tA();
          }
          else if (i == this.ewi.size() - 1)
            locallZ.a(" et ").tz().a(localgA.getName()).tA();
          else {
            locallZ.a(", ").tz().a(localgA.getName()).tA();
          }

          Object localObject1 = ay.bd().u(localgA.oc());

          localObject2 = "";
          for (localObject3 = ((bls)this.ewi.get(i)).cqo().iterator(); ((Iterator)localObject3).hasNext(); ) { long l = ((Long)((Iterator)localObject3).next()).longValue();
            if (!((String)localObject2).equals(""))
              localObject2 = (String)localObject2 + ", ";
            if (CA.Lv().bj(l) != null)
              localObject2 = (String)localObject2 + CA.Lv().bj(l).getName(); }
        }
        else {
          K.error("Pas d'Item associé au FloorItem à la position " + i);
        }
      } else {
        K.error("Pas de FloorItem à la position " + i);
      }
    }
    ehE.info(new lZ().am(cPU.kAA).a(bU.fH().getString("fight.drop", new Object[] { locallZ.tP() })).tP());
  }
}