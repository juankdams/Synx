public class aoV
  implements azp
{
  private final cSR duA = new cSR();

  public aoV(Iterable paramIterable)
  {
    for (dSc localdSc : paramIterable)
      this.duA.put(localdSc.bJ(), dIa.i(localdSc));
  }

  public aoV(dSc[] paramArrayOfdSc) {
    for (dSc localdSc : paramArrayOfdSc)
      this.duA.put(localdSc.bJ(), dIa.i(localdSc));
  }

  public void acY()
  {
    dmn localdmn = this.duA.yF();
    for (int i = this.duA.size(); i-- > 0; ) {
      localdmn.fl();
      cqm localcqm = (cqm)localdmn.value();
      localcqm.acY();
    }
  }

  public boolean c(dSc paramdSc) {
    return (paramdSc != null) && (this.duA.contains(paramdSc.bJ()));
  }

  public cqm a(dSc paramdSc) {
    return (cqm)this.duA.get(paramdSc.bJ());
  }

  public int e(dSc paramdSc) {
    cqm localcqm = (cqm)this.duA.get(paramdSc.bJ());
    if (localcqm != null) {
      return localcqm.value();
    }
    throw new UnsupportedOperationException("caractéristique inexistante : " + paramdSc.bJ());
  }

  public int f(dSc paramdSc)
  {
    cqm localcqm = (cqm)this.duA.get(paramdSc.bJ());
    if (localcqm != null) {
      return localcqm.max();
    }
    throw new UnsupportedOperationException("caractéristique inexistante : " + paramdSc.bJ());
  }

  public void c(caY paramcaY)
  {
    dmn localdmn = this.duA.yF();

    for (int i = this.duA.size(); i-- > 0; ) {
      localdmn.fl();
      cqm localcqm = (cqm)localdmn.value();

      localcqm.a(paramcaY);
    }
  }

  public void aBo() {
    if (this.duA.isEmpty())
      return;
    this.duA.s(new dUG(this));
  }

  public dmn yF()
  {
    return this.duA.yF();
  }

  public boolean a(cZr paramcZr, dSc[] paramArrayOfdSc) {
    throw new UnsupportedOperationException("On ne peut pas sérialiser un characteristic manager d'objet");
  }

  public boolean a(cZr paramcZr) {
    throw new UnsupportedOperationException("On ne peut pas sérialiser un characteristic manager d'objet");
  }

  public boolean b(cZr paramcZr) {
    throw new UnsupportedOperationException("On ne peut pas sérialiser un characteristic manager d'objet");
  }

  public void a(air paramair) {
    throw new UnsupportedOperationException("On ne peut pas invoquer le double d'un objet ");
  }
}