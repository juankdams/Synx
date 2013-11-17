public class cRY
  implements dGy
{
  private final cXr ghG = new cXr();
  private int aUH;

  public boolean c(cuF paramcuF)
  {
    this.ghG.aD(Fk.e(paramcuF));
    this.aUH += 1;
    return true;
  }

  public int ceF() {
    return this.aUH;
  }

  public byte[] getData() {
    return this.ghG.toArray();
  }

  public String toString()
  {
    return "SerializeBuilding{m_bb=" + this.ghG + '}';
  }
}