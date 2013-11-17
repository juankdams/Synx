class cNA extends bTd
{
  cNA(bWP parambWP, kt paramkt1, kt paramkt2)
  {
  }

  public String aC(Object paramObject)
  {
    if (((paramObject instanceof Long)) && ((this.ksY.getValue() instanceof Long)) && ((this.ksZ.getValue() instanceof Long))) {
      long l1 = ((Long)paramObject).longValue();
      long l2 = ((Long)this.ksY.getValue()).longValue();
      long l3 = ((Long)this.ksZ.getValue()).longValue();
      if (l2 == l3)
        return null;
      if ((l1 >= l2) || (l1 <= l3))
        return "ff0000";
      int i = (int)((l2 - l3) * 0.15D);
      if ((l1 > l2 - i) || (l1 < l3 + i))
        return "ff9922";
      return "00ff00";
    }
    return null;
  }
}