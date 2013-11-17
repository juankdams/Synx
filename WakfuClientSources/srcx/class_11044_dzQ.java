public class dzQ extends qM
{
  public dzQ(ec[] paramArrayOfec)
  {
    super(paramArrayOfec);
  }

  public final boolean cu(int paramInt)
  {
    if (paramInt > 0) {
      return (paramInt % 2 == 0) && (ct(paramInt / 2));
    }

    return ct(paramInt);
  }
}