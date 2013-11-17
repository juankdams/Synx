import org.apache.log4j.Logger;

final class cXG
{
  private static Logger K = Logger.getLogger(pw.class);
  private final dbE aVI;
  private final dxj aVJ;

  cXG(dbE paramdbE)
  {
    this.aVI = paramdbE;
    this.aVJ = new dxj(paramdbE);
  }

  public baf a(dhJ paramdhJ, gA paramgA, cYk paramcYk, boolean paramBoolean)
  {
    if ((paramgA == null) || (!paramgA.isUsable())) {
      K.error(this.aVI.ha("cast d'un item null ou non utilisable ou cassé"));
      return baf.fhz;
    }

    if (paramdhJ.cLK()) {
      return baf.fhR;
    }

    if (paramdhJ.c(cfY.hBN)) {
      return baf.fhS;
    }

    bBn localbBn = paramgA.oi();

    if (paramBoolean)
    {
      int i = localbBn.bKg();
      if ((i > 0) && (paramdhJ.c(cfY.hBW))) {
        return baf.fhD;
      }
      if (i > paramdhJ.d(eu.ayN).value()) {
        return baf.fhD;
      }

      if (localbBn.bKi() > paramdhJ.d(eu.ayP).value()) {
        return baf.fhE;
      }

      if (localbBn.bKj() > paramdhJ.d(eu.ayO).value()) {
        return baf.fhF;
      }
    }

    if (!cVY.cKs().a(paramgA, paramdhJ, this.aVI.aIq())) {
      return baf.fhN;
    }

    if ((localbBn.bKq()) && (paramcYk != null) && 
      (paramcYk.getX() != paramdhJ.ML().getX()) && (paramcYk.getY() != paramdhJ.ML().getY())) {
      return baf.fhM;
    }

    if ((localbBn.getId() != 2145) && (localbBn.bKw()) && (!paramdhJ.ayJ().hg(localbBn.getId())))
    {
      return baf.fhS;
    }

    bZA localbZA = localbBn.a(Aq.bvP);

    return this.aVJ.a(paramdhJ, paramgA, paramcYk, false, localbBn.bKp(), localbBn.bKo(), localbBn.bKl(), localbBn.bHR(), localbBn.bHS(), false, localbZA);
  }
}