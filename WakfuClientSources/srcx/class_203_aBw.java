class aBw
{
  static final int aWW = 63;
  static final int dVl = 16;
  static final int dVm = 31;
  int cFJ;
  int[] dVn = new int[31];

  int[] dVo = new int[16];
  int[] dVp = new int[16];
  int[] dVq = new int[16];
  int[][] dVr = new int[16][];
  int dVs;
  int[] dVt = new int[65];

  aBw() {
    for (int i = 0; i < this.dVr.length; i++)
      this.dVr[i] = new int[8];
  }

  void free()
  {
    this.dVn = null;
    this.dVo = null;
    this.dVp = null;
    this.dVq = null;
    this.dVr = ((int[][])null);
    this.dVt = null;
  }
}