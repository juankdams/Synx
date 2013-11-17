import java.nio.ByteBuffer;
import java.util.ArrayList;

public class auB extends dsQ
{
  private int bXf;
  byte[] bXg;
  private boolean dGV;
  private final ArrayList dGW = new ArrayList();

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    aN(localByteBuffer);

    this.dGV = (localByteBuffer.get() == 1);

    this.bXf = localByteBuffer.getInt();

    this.bXg = new byte[localByteBuffer.getShort()];
    localByteBuffer.get(this.bXg);
    while (localByteBuffer.hasRemaining()) {
      byte[] arrayOfByte = new byte[localByteBuffer.getShort()];
      localByteBuffer.get(arrayOfByte);
      this.dGW.add(new cFc(Integer.valueOf(localByteBuffer.getInt()), Integer.valueOf(localByteBuffer.getInt()), arrayOfByte));
    }

    return true;
  }

  public int getId()
  {
    return 8120;
  }

  public int eo()
  {
    return this.bXf;
  }

  public dPD ep()
  {
    return dPD.mhg;
  }

  public int Vc() {
    return this.bXf;
  }

  public ArrayList aGO() {
    return this.dGW;
  }

  public byte[] Vd() {
    return this.bXg;
  }

  public boolean aGP()
  {
    return this.dGV;
  }
}