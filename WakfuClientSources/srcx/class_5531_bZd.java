public enum bZd
{
  abstract void c(dnV paramdnV);

  bZd cdJ()
  {
    int i = ordinal();
    bZd[] arrayOfbZd = values();
    if (i == arrayOfbZd.length - 1)
      return arrayOfbZd[0];
    return arrayOfbZd[(i + 1)];
  }
}