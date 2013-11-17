 enum RL
{
  RL()
  {
    super(str, i, null);
  }
  public Float a(Number paramNumber1, Number paramNumber2) {
    return Float.valueOf(paramNumber1.floatValue() < paramNumber2.floatValue() ? 1.0F : 0.0F);
  }
}