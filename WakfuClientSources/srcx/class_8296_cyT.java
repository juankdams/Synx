import java.util.Collection;
import java.util.Iterator;

public final class cyT
{
  private final arl inz;

  public cyT(arl paramarl)
  {
    this.inz = paramarl;
  }

  public czN cvR()
  {
    czN localczN = new czN(this.inz.aEt());
    localczN.d(this.inz.getId());
    localczN.a(this.inz.aEu());
    UG localUG = this.inz.LB();
    localczN.e(localUG);

    byz localbyz = byv.bFN().bFO();
    for (Object localObject1 = this.inz.bgU().iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (Su)((Iterator)localObject1).next();
      if (localObject2 != localbyz) {
        localczN.a((Su)localObject2, ((Su)localObject2).Fx());
      }
      ((Su)localObject2).aeL().chh();
    }
    localObject1 = this.inz.bbj();
    for (Object localObject2 = ((Collection)localObject1).iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (cjK)((Iterator)localObject2).next();
      bOX.bVM().r((cjK)localObject3);
    }
    bOX.bVM().r(this.inz.afA());

    localObject2 = this.inz.aDp();
    if (localObject2 != null) {
      ((zu)localObject2).stop();
      ((zu)localObject2).AZ();
    }
    this.inz.aDv();

    localUG.j(true, false);
    cjS.clP().g(localczN);

    for (Object localObject3 = localczN.bgG().iterator(); ((Iterator)localObject3).hasNext(); ) { Su localSu = (Su)((Iterator)localObject3).next();
      localSu.gD(-1);
      bgJ localbgJ = localSu.ayK();
      for (aVc localaVc : localbgJ) {
        localaVc.b(localczN.aIq());
      }
      localSu.a(null);
      localSu.a(localczN);
      localSu.gD(localczN.getId());
    }

    return localczN;
  }
}