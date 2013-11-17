import java.nio.ByteBuffer;

public class aos extends aRw
{
  private vL aIX;

  public void a(vL paramvL)
  {
    this.aIX = paramvL;
  }

  public byte[] encode() {
    aHR localaHR = new aHR();
    localaHR.o(this.aIX);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(localaHR.cc());
    localaHR.b(localByteBuffer);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 563;
  }
}