class bhz
{
  static int pE(int paramInt)
  {
    int i = 0;
    while (paramInt != 0) {
      i++;
      paramInt >>>= 1;
    }
    return i;
  }

  static int pF(int paramInt) {
    int i = 0;
    while (paramInt > 1) {
      i++;
      paramInt >>>= 1;
    }
    return i;
  }

  static int pG(int paramInt) {
    int i = 0;
    while (paramInt != 0) {
      i += (paramInt & 0x1);
      paramInt >>>= 1;
    }
    return i;
  }
}