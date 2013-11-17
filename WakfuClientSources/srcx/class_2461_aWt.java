import org.apache.log4j.Logger;

final class aWt extends dcW
{
  private static final Logger K = Logger.getLogger(aWt.class);

  public boolean a(dBj paramdBj) {
    int i = paramdBj.a();
    if ((this.kLP != null) && (((arl)this.kLP).getId() == i)) {
      cIS localcIS = new cIS(paramdBj.bQX(), paramdBj.ep().bJ(), paramdBj.eo(), ((arl)this.kLP).getId(), false);
      localcIS.ij(true);
      ((arl)this.kLP).p(paramdBj.deA());
      ((arl)this.kLP).o(paramdBj.deB());
      bnc.bxw().a((arl)this.kLP, localcIS);
      bnc.bxw().d(this.kLP);
      return false;
    }
    K.error("Pas de combat associé a la frame pour sortir du mode spectateur");
    return true;
  }
}