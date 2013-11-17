import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

public final class bUP
{
  private static final Logger K = Logger.getLogger(bUP.class);
  private arl hha;

  public baf a(dhJ paramdhJ, bfE parambfE, cYk paramcYk, boolean paramBoolean)
  {
    if (this.hha == null) {
      K.error("On ne check pas les critere si on a pas de combat associé dans le validateur");
      return baf.fhx;
    }

    if (parambfE == null) {
      return baf.fhz;
    }

    bzj localbzj = parambfE.bsL();

    if (bFm.a(localbzj)) {
      return baf.fhO;
    }
    if (!bFm.c(paramdhJ, localbzj)) {
      return baf.fhN;
    }

    if (paramBoolean) {
      if (!bFm.c(paramdhJ, parambfE, localbzj)) {
        return baf.fhD;
      }
      if (!bFm.b(paramdhJ, parambfE, localbzj)) {
        return baf.fhE;
      }
      if (!bFm.a(paramdhJ, parambfE, localbzj)) {
        return baf.fhF;
      }
      if (!bFm.a(paramdhJ, eu.azE, parambfE, localbzj)) {
        return baf.fhG;
      }
    }

    baf localbaf = paramdhJ.cQH().c(parambfE, this.hha.aDp().AU());
    if (!localbaf.isValid()) {
      return localbaf;
    }
    if ((!this.hha.aDp().AP()) || (this.hha.aDp().AQ() != paramdhJ.getId())) {
      return baf.fhQ;
    }
    bZA localbZA = localbzj.bHT();
    if (localbZA != null) {
      if (localbZA.i(paramdhJ, null, parambfE, this.hha)) {
        return baf.fhx;
      }
      int i = 0;
      Collection localCollection = this.hha.bgG();
      for (Object localObject1 = localCollection.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (Su)((Iterator)localObject1).next();
        if (localbZA.i(paramdhJ, ((Su)localObject2).ML(), parambfE, this.hha)) {
          i = 1;
          break;
        }
      }
      localObject1 = this.hha.bbj();
      for (Object localObject2 = ((Collection)localObject1).iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (cjK)((Iterator)localObject2).next();
        if (localbZA.i(paramdhJ, localObject3, parambfE, this.hha)) {
          i = 1;
          break;
        }
      }
      Object localObject3;
      localObject2 = this.hha.bgV();
      if (localObject2 != null) {
        while (((Iterator)localObject2).hasNext()) {
          localObject3 = (dle)((Iterator)localObject2).next();
          if (localbZA.i(paramdhJ, localObject3, parambfE, this.hha)) {
            i = 1;
            break;
          }
        }
      }
      if (i == 0) {
        return baf.fhN;
      }
    }
    byz localbyz = byv.bFN().bFO();
    if (((paramdhJ instanceof byz)) && (localbyz != null) && (localbyz.aHq() == localbzj.getId())) {
      return baf.fhT;
    }

    return baf.fhx;
  }

  public void k(arl paramarl) {
    this.hha = paramarl;
  }

  public void clear() {
    this.hha = null;
  }
}