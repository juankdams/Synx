import java.nio.ByteBuffer;

 enum adb
{
  byte hV;
  Class cTp;

  private adb(byte arg3, Class arg4)
  {
    byte b;
    this.hV = b;
    Object localObject;
    this.cTp = localObject;
  }

  static adb A(Class paramClass) {
    for (adb localadb : values()) {
      if (localadb.cTp == paramClass)
        return localadb;
    }
    throw new IllegalArgumentException("Pas sérialisable: " + paramClass.getSimpleName());
  }

  static adb aK(byte paramByte) {
    for (adb localadb : values()) {
      if (localadb.hV == paramByte)
        return localadb;
    }
    throw new IllegalArgumentException("Pas sérialisable: id " + paramByte);
  }

  public void a(dIN paramdIN, ByteBuffer paramByteBuffer) {
    if (paramdIN.getClass() != this.cTp)
      throw new IllegalArgumentException();
    paramByteBuffer.put(this.hV);
    paramdIN.at(paramByteBuffer);
  }

  public int a(dIN paramdIN) {
    return 1 + paramdIN.bwy();
  }

  abstract dIN apo();

  public static dIN Y(ByteBuffer paramByteBuffer) {
    return aK(paramByteBuffer.get()).apo();
  }
}