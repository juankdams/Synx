public class abb extends cdI
{
  public abb(bBn parambBn)
  {
    super(parambBn);
  }

  public boolean isEditable()
  {
    return false;
  }

  public boolean d(bBn parambBn)
  {
    return false;
  }

  public void e(bBn parambBn)
  {
    throw new dEi("Impossible d'equiper une gemme sur un ImmutableGems");
  }

  public int aF(byte paramByte)
  {
    throw new dEi("Impossible de retirer une gemme sur un ImmutableGems");
  }
}