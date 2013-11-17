import org.apache.log4j.Logger;

class UE
  implements aNA
{
  UE(asf paramasf, long paramLong)
  {
  }

  public void a(ahm paramahm)
  {
    dWu localdWu = ((abc)paramahm).vK();
    if (localdWu != null) {
      asf.a(this.cxR, localdWu);
      ayg.aJQ().e(localdWu);
    } else {
      asf.K.warn("Impossible de retirer un élément interactif ID=" + this.cyf + ", il n'est référencé dans aucune partition.");
    }

    paramahm.b(this);
  }
}