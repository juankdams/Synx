class cxx extends cxy
{
  int a(cPr paramcPr, Object paramObject, float[][] paramArrayOfFloat, int[] paramArrayOfInt, int paramInt)
  {
    int i = 0;
    for (int j = 0; j < paramInt; j++) {
      if (paramArrayOfInt[j] != 0) {
        paramArrayOfFloat[(i++)] = paramArrayOfFloat[j];
      }
    }
    if (i != 0) {
      return a(paramcPr, paramObject, paramArrayOfFloat, i, 1);
    }
    return 0;
  }
}