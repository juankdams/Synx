class auy extends dPL
{
  private final acP dGS;

  auy(acP paramacP)
  {
    this.dGS = paramacP;
  }

  acP aGM() {
    return this.dGS;
  }

  public int hashCode()
  {
    return 3 * super.hashCode() + (int)(acP.b(this.dGS) % 2147483647L);
  }

  public boolean equals(Object paramObject)
  {
    if (super.equals(paramObject))
    {
      auy localauy = (auy)paramObject;
      return (acP.b(this.dGS) == acP.b(localauy.dGS)) && (acP.a(this.dGS) == acP.a(localauy.dGS));
    }

    return false;
  }
}