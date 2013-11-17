class aCM
  implements bPA
{
  aCM(dxy paramdxy, String paramString)
  {
  }

  public boolean a(int paramInt, int[] paramArrayOfInt)
  {
    String[] arrayOfString = new String[paramArrayOfInt.length];
    for (int i = 0; i < paramArrayOfInt.length; i++) {
      arrayOfString[i] = String.format(this.dXw, new Object[] { Integer.valueOf(paramArrayOfInt[i]) });
    }
    dxy.b(this.dXx).put(paramInt, arrayOfString);
    return true;
  }
}