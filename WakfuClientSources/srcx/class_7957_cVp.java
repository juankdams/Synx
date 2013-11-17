import org.apache.log4j.Logger;

public abstract class cVp extends dzz
{
  protected short dOO;
  protected byte[] bFC;
  protected long eoe;
  protected byte dON;
  protected static final Logger K = Logger.getLogger(cVp.class);

  public abstract boolean a(byte[] paramArrayOfByte);

  public abstract int getId();

  public byte[] encode() {
    throw new UnsupportedOperationException("On tente d'encoder un message server->client coté client");
  }

  public short cKb()
  {
    return this.dOO;
  }

  public long cKc() {
    return this.eoe;
  }

  public byte[] getData() {
    return this.bFC;
  }

  public byte cdC()
  {
    return this.dON;
  }
}