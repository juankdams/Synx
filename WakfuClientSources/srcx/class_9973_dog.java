class dog
{
  final int aRQ;
  final eu lor;
  final eu los;
  final short aGz;
  final short lot;

  private dog(dkF paramdkF, eu parameu1, eu parameu2, int paramInt1, int paramInt2)
  {
    this.aRQ = paramdkF.getId();
    this.lor = parameu1;
    this.los = parameu2;
    this.aGz = ((short)paramInt1);
    this.lot = ((short)paramInt2);
  }

  public int C(dle paramdle) {
    if (this.lor == null)
      return 0;
    if (paramdle == null)
      return 0;
    cqm localcqm = paramdle.a(this.lor);
    if (localcqm == null)
      return 0;
    return localcqm.value();
  }

  public int D(dle paramdle) {
    if (this.los == null)
      return 0;
    if (paramdle == null)
      return 0;
    cqm localcqm = paramdle.a(this.los);
    if (localcqm == null)
      return 0;
    return localcqm.value();
  }
}