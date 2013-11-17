import java.util.List;
import org.apache.log4j.Logger;

final class pw
{
  private static Logger K = Logger.getLogger(pw.class);
  private final dbE aVI;
  private final dxj aVJ;

  pw(dbE paramdbE)
  {
    this.aVI = paramdbE;
    this.aVJ = new dxj(paramdbE);
  }

  baf a(dhJ paramdhJ, bfE parambfE, cYk paramcYk, boolean paramBoolean)
  {
    if (parambfE == null) {
      K.error(this.aVI.ha("cast d'un spell null"));
      return baf.fhz;
    }

    bzj localbzj = parambfE.bsL();

    if (bFm.a(localbzj)) {
      return baf.fhO;
    }

    if (paramdhJ.c(cfY.hCP)) {
      return baf.fhU;
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

    baf localbaf1 = paramdhJ.cQH().c(parambfE, this.aVI.aDG().AU());
    if (!localbaf1.isValid()) {
      return localbaf1;
    }

    if (paramcYk != null)
    {
      dhJ localdhJ = this.aVI.bo(paramcYk.getX(), paramcYk.getY());
      UG localUG = this.aVI.LB();

      if (!this.aVJ.a(paramdhJ, paramcYk, localbzj, localdhJ, localUG)) {
        return baf.fhM;
      }

      List localList = this.aVI.k(paramcYk);
      for (dle localdle : localList)
      {
        baf localbaf2 = paramdhJ.cQH().a(parambfE, this.aVI.aDG().AU(), localdle);
        if (!localbaf2.isValid()) {
          return localbaf2;
        }
      }

    }

    if ((paramdhJ instanceof avm)) {
      int i = ((avm)paramdhJ).aHq();
      if (i == localbzj.getId()) {
        K.error("Trying to cast a locked spell. Spell :" + localbzj.getId() + " caster : " + paramdhJ);
        return baf.fhN;
      }
    }

    return this.aVJ.a(paramdhJ, parambfE, paramcYk, localbzj.bIc(), localbzj.rL(parambfE.nU()), localbzj.f(parambfE, paramdhJ, paramcYk, this.aVI.aIq()), localbzj.a(parambfE, paramdhJ, paramcYk, this.aVI.aIq()), localbzj.bHR(), localbzj.bHS(), localbzj.vB(), localbzj.bHT());
  }
}