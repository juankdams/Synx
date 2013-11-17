class cxC extends cxy
{
  int a(cPr paramcPr, Object paramObject, float[][] paramArrayOfFloat, int[] paramArrayOfInt, int paramInt)
  {
    int i = 0;
    for (i = 0; (i < paramInt) && 
      (paramArrayOfInt[i] == 0); i++);
    if (i == paramInt) {
      return 0;
    }
    return a(paramcPr, paramObject, paramArrayOfFloat, paramInt);
  }
}