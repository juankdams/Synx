import com.sun.jna.Native;

public class Sx extends dNT
{
  public static final int SIZE = Native.LONG_SIZE;

  public Sx()
  {
    this(0L);
  }

  public Sx(long paramLong)
  {
    super(SIZE, paramLong);
  }
}