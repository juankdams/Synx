class cNx extends bTd
{
  cNx(bWP parambWP)
  {
  }

  public String aC(Object paramObject)
  {
    long l = System.currentTimeMillis();

    kt localkt1 = bZI().ag("environment.lastDay");
    if ((localkt1 != null) && ((localkt1.getValue() instanceof Long)) && (((Long)localkt1.getValue()).longValue() + 129600000L < l)) {
      return "ff0000";
    }
    kt localkt2 = bZI().ag("environment.lastNight");
    if ((localkt2 != null) && ((localkt2.getValue() instanceof Long)) && (((Long)localkt2.getValue()).longValue() + 129600000L < l)) {
      return "ff0000";
    }
    return null;
  }
}