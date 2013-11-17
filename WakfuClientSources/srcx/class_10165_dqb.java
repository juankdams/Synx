class dqb
{
  final dgg lqU;
  final dgg lqV;
  final dgg lqW;
  final dgg lqX;
  aXL[] lqY;

  dqb(bnp parambnp1, bnp parambnp2, bnp parambnp3, bnp parambnp4)
  {
    this.lqU = ((dgg)parambnp1);
    this.lqV = ((dgg)parambnp2);
    this.lqW = ((dgg)parambnp3);
    this.lqX = ((dgg)parambnp4);
  }

  void a(aXL[] paramArrayOfaXL) {
    this.lqY = paramArrayOfaXL;
  }

  private int a(dgg paramdgg) {
    return paramdgg == null ? 0 : paramdgg.cPJ().Sn();
  }

  int Wf() {
    int i = bCO.a(a(this.lqU), a(this.lqV), new int[] { a(this.lqW), a(this.lqX) });

    int j = i;
    for (aXL localaXL : this.lqY) {
      bFA localbFA = (bFA)localaXL;
      int n = ((dOW)localbFA.bmZ()).Wf() + localbFA.getLayer();
      if (n > j) {
        j = n;
      }
    }
    return j + 1;
  }
}