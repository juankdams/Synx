 enum bUI
{
  bUI()
  {
    super(str, i, null);
  }
  public Float a(Number paramNumber1, Number paramNumber2) {
    return Float.valueOf(Math.max(paramNumber1.floatValue(), paramNumber2.floatValue()));
  }
}