public abstract interface dAb
{
  public abstract int read();

  public abstract int read(byte[] paramArrayOfByte);

  public abstract int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  public abstract void seek(long paramLong);

  public abstract long length();

  public abstract long tell();

  public abstract void close();
}