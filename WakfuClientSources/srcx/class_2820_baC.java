class baC
  implements bhG
{
  int fiL;
  final cbQ fiM = new cbQ();

  private baC(bGT parambGT) {  } 
  public boolean a(long paramLong, dvR paramdvR) { if (paramdvR.dT(this.fiL))
      this.fiM.add(paramLong);
    return true; }

  void clean()
  {
    for (int i = this.fiM.size() - 1; i >= 0; i--) {
      bGT.a(this.fiN).remove(this.fiM.uD(i));
    }
    this.fiM.clear();
  }
}