import org.apache.log4j.Logger;

public final class qv
{
  private static Logger K = Logger.getLogger(qv.class);
  private arl aXG;

  public arl a(Ia paramIa, arl paramarl)
  {
    this.aXG = paramarl;

    bFL[] arrayOfbFL = paramIa.Ru();

    for (int i = 0; i < arrayOfbFL.length; i++) {
      if (arrayOfbFL[i].gBM == 10) {
        localObject = ayg.aJQ().dw(arrayOfbFL[i].aTz);
        if (localObject == null) {
          K.error("IE non trouvé " + arrayOfbFL[i].aTz);
        }
        else {
          this.aXG.l((cyj)localObject);
        }
      }
    }
    aYV localaYV1 = bMF.bUo().fk(paramIa.Rq());

    if ((!bB) && (localaYV1 == null)) throw new AssertionError("Impossible de créer la bulle de combat : la zone d'effet d'index " + paramIa.Rq() + " n'existe pas");

    Object localObject = this.aXG.LB();
    aYV localaYV2 = (aYV)localaYV1.a(new agg(paramIa.Rr(), ((UG)localObject).getMinX(), ((UG)localObject).getMinY(), ((UG)localObject).ahP(), this.aXG.aIq(), null, (short)0, CG.bFP));
    localaYV2.g((UG)localObject);
    this.aXG.a(localaYV2);

    dyG localdyG = b(paramIa);

    a(paramIa, localdyG);
    this.aXG.L(paramIa.Rn());
    return this.aXG;
  }

  private dyG b(Ia paramIa) {
    dyG localdyG = new dyG(null);

    for (int i = 0; i < paramIa.Rl(); i++)
    {
      byte b = paramIa.eY(i);

      long l = paramIa.eW(i);
      Su localSu = CA.Lv().bj(l);

      if (localSu == null) {
        K.error("Impossible d'ajouter le joueur " + l + " au combat " + paramIa.a() + " : ce fighter n'existe pas");
      }
      else if ((l == paramIa.Rs()) || (l == paramIa.Rt()))
        localdyG.d(localSu, b);
      else {
        localdyG.c(localSu, b);
      }
    }

    return localdyG;
  }

  private void a(Ia paramIa, dyG paramdyG)
  {
    for (byte b : new byte[] { 0, 1 }) {
      if (!this.aXG.a(b, paramdyG.fE(b))) {
        K.error("Impossible d'ajouter une team au combat, client désynchronisé avec la demande serveur");
      }
    }
    for (int i = 0; i < paramIa.Rl(); i++) {
      Su localSu = (Su)this.aXG.eu(paramIa.eW(i));
      byte[] arrayOfByte2 = paramIa.eZ(i);
      byte[] arrayOfByte3 = paramIa.fa(i);
      if (localSu != null)
        localSu.a(this.aXG, arrayOfByte2, arrayOfByte3);
    }
  }
}