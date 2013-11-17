import org.apache.log4j.Logger;

class SU
  implements dGy
{
  SU(cEk paramcEk)
  {
  }

  public boolean m(aid paramaid)
  {
    for (cLC localcLC : cEk.a(this.cux)) {
      try {
        localcLC.t(paramaid);
      } catch (Exception localException) {
        cEk.K.error("Exception levée lors du dé-enregitrement d'un protecteur ID=" + paramaid.getId());
      }
    }
    return true;
  }
}