public abstract class Dd
  implements aee
{
  private volatile boolean closed = false;

  public abstract Object Mm();

  public abstract void y(Object paramObject);

  public abstract void z(Object paramObject);

  public int Mn()
  {
    throw new UnsupportedOperationException();
  }

  public int Mo()
  {
    throw new UnsupportedOperationException();
  }

  public void clear()
  {
    throw new UnsupportedOperationException();
  }

  public void Mp()
  {
    throw new UnsupportedOperationException();
  }

  public void close() {
    Mq();
    this.closed = true;
  }

  public void a(aRy paramaRy)
  {
    throw new UnsupportedOperationException();
  }

  protected final boolean isClosed() {
    return this.closed;
  }

  protected final void Mq() {
    if (isClosed())
      throw new IllegalStateException("Pool not open");
  }
}