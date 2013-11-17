class aRE
{
  final int n;
  final int eOF;
  final int eOG;
  final int[] eOH;
  final aNZ eOI;

  aRE(aNZ paramaNZ, int paramInt)
  {
    this.eOG = paramaNZ.order;
    this.n = paramInt;
    this.eOF = paramaNZ.eui;
    this.eOI = paramaNZ;
    this.eOH = new int[paramInt];
  }
}