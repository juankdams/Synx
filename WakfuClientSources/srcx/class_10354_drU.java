public abstract class drU extends aOw
{
  private boolean iBQ = false;

  public void bfq() {
    this.iBQ = (!this.iBQ);
  }

  protected boolean cYD() {
    return this.iBQ;
  }

  public static void a(dKY[] paramArrayOfdKY) {
    if (paramArrayOfdKY.length != 2)
      throw new ddQ("On essaie d'appliquer un opérateur numérique au mauvais nombre d'arguments ");
    for (dKY localdKY : paramArrayOfdKY)
      if (localdKY.aNE() != Pq.chv)
        throw new ddQ("On essaie d'appliquer un opérateur numérique à autre chose que des nombres...");
  }
}