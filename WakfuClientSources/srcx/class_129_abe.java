final class abe extends Mo
{
  private final st cPr;

  abe(bKm parambKm, st paramst)
  {
    this.cPr = paramst;
    this.cPr.ao().a(this);
  }

  public void aS() {
    throw new UnsupportedOperationException("[NATION] La part ne devrait pas être sérialisée par le client.");
  }

  public void aT() {
    this.aHq.cJf().an(this.cPr.bbB);
  }
}