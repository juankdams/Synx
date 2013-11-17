import org.apache.log4j.Logger;

public class bWD extends pV
{
  private Qt hiP;

  public void a(Wj paramWj)
  {
    ayn localayn = d(paramWj);
    if (localayn == null) {
      return;
    }
    this.hiP = new aBy(this, paramWj);

    localayn.a(this.hiP);
    this.hiP.a(localayn, localayn.ava());
  }

  public void b(Wj paramWj) {
    ayn localayn = d(paramWj);
    if (localayn == null)
      return;
    localayn.b(this.hiP);
    this.hiP = null;
  }

  private static ayn d(Wj paramWj) {
    bva localbva = byJ.gma.cF(paramWj.fa(), paramWj.fb());
    if (localbva == null) {
      K.error("Aucun Territoire défini pour l'élément " + paramWj);
      return null;
    }
    return (ayn)localbva.boT();
  }
}