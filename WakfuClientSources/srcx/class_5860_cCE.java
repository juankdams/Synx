import java.nio.Buffer;

public abstract interface cCE
{
  public abstract Buffer getBuffer();

  public abstract int getId();

  public abstract void release();
}