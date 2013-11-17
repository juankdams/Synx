import org.apache.log4j.Logger;

final class bnF
{
  private static Logger K = Logger.getLogger(bnF.class);
  private final dbE aVI;
  private final dxj aVJ;
  private final cXG fGz;

  bnF(dbE paramdbE)
  {
    this.aVI = paramdbE;
    this.aVJ = new dxj(paramdbE);
    this.fGz = new cXG(paramdbE);
  }

  public baf a(dhJ paramdhJ, gA paramgA, bfE parambfE, cYk paramcYk)
  {
    if ((paramgA == null) || (!paramgA.isUsable())) {
      K.error(this.aVI.ha("utilisation d'un objet null, inutilisable ou cassé"));
      return baf.fhz;
    }

    bBn localbBn = paramgA.oi();

    if (parambfE == null) {
      K.error(this.aVI.ha("cast d'un spell null"));
      return baf.fhz;
    }

    bzj localbzj = parambfE.bsL();

    if (localbzj.bHY()) {
      return baf.fhO;
    }

    bPk localbPk = localbzj.b(parambfE, paramdhJ, paramcYk, paramdhJ.bEY());

    if (localbBn.bKg() + localbPk.j(eu.ayN) > paramdhJ.d(eu.ayN).value())
    {
      return baf.fhD;
    }

    if (localbBn.bKi() + localbPk.j(eu.ayP) > paramdhJ.d(eu.ayP).value())
    {
      return baf.fhE;
    }

    if (localbBn.bKj() + localbPk.j(eu.ayO) > paramdhJ.d(eu.ayO).value())
    {
      return baf.fhF;
    }

    if (paramcYk == null)
    {
      localObject = paramdhJ.cQH().c(parambfE, this.aVI.aDG().AU());
      if (!((baf)localObject).isValid())
        return localObject;
    }
    else
    {
      localObject = this.aVI.bo(paramcYk.getX(), paramcYk.getY());

      UG localUG = this.aVI.LB();

      if (!this.aVJ.a(paramdhJ, paramcYk, localbzj, (dhJ)localObject, localUG)) {
        return baf.fhM;
      }

      baf localbaf = paramdhJ.cQH().a(parambfE, this.aVI.aDG().AU(), (alr)localObject);
      if (!localbaf.isValid()) {
        return localbaf;
      }
    }

    Object localObject = this.aVJ.a(paramdhJ, parambfE, paramcYk, true, localbBn.bKp(), localbBn.bKo(), localbBn.bKl(), localbBn.bHR(), localbBn.bHS(), localbzj.vB(), localbzj.bHT());
    if (!((baf)localObject).isValid()) {
      return localObject;
    }
    return this.fGz.a(paramdhJ, paramgA, paramcYk, false);
  }
}