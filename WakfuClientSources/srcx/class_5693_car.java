public class car
  implements dGy
{
  private int aUH;
  private final cXr ghG = new cXr();

  public boolean g(bnt parambnt) {
    this.ghG.aD(Fk.c(parambnt));
    this.aUH += 1;
    return true;
  }

  public byte[] getData() {
    return this.ghG.toArray();
  }

  public int ceF() {
    return this.aUH;
  }

  public String toString()
  {
    return "SerializePartitions{m_bb=" + this.ghG + ", m_counter=" + this.aUH + '}';
  }
}