public abstract class axk
{
  protected final float[] baW;
  private final dht dMz;

  protected axk(dht paramdht, float[] paramArrayOfFloat)
  {
    this.dMz = paramdht;
    if (dht.a(paramdht) != paramArrayOfFloat.length) {
      throw new UnsupportedOperationException("Nombre de paramètre incorrect pour la creation de paramètres de skill");
    }
    this.baW = paramArrayOfFloat;
  }

  public dht aIW()
  {
    return this.dMz;
  }
}