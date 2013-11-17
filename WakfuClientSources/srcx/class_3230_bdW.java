class bdW extends bTd
{
  public String aC(Object paramObject)
  {
    float f = Float.parseFloat((String)paramObject);
    if ((f > 800.0F) || (f <= 0.0D))
      return "ff0000";
    if (f < 250.0F)
      return "00ff00";
    return "ff9922";
  }
}