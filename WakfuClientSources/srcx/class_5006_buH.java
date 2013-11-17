final class buH extends dcW
{
  public boolean a(dBj paramdBj)
  {
    bGN.gDt.gDr = true;
    if (!paramdBj.deD()) {
      ((arl)this.kLP).o(paramdBj.deB());
      ((arl)this.kLP).p(paramdBj.deA());
    }

    cIS localcIS = new cIS(paramdBj.bQX(), paramdBj.ep().bJ(), paramdBj.eo(), ((arl)this.kLP).getId(), paramdBj.deD());
    bnc.bxw().a((arl)this.kLP, localcIS);
    if (paramdBj.deD())
      bnc.bxw().d(this.kLP);
    return false;
  }
}