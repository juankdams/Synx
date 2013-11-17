class dPU
  implements caY
{
  int mjC = 0;
  int cug = 0;

  int mjD = 0;
  dle evp;

  public void a(cqm paramcqm)
  {
    int i = paramcqm.max();
    int j = paramcqm.value();

    int k = i - this.mjC;
    int m = j - this.cug;

    this.mjD += k;

    this.mjC = i;
    this.cug = j;

    cqm localcqm = this.evp.a(eu.ayO);
    localcqm.set(localcqm.value() + m);
    localcqm.setMax(localcqm.max() + k);
  }
}