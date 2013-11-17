import java.nio.ByteBuffer;
import java.util.ArrayList;

public class bmn extends cDO
{
  private int bXf;
  byte[] bXg;
  private boolean dGV;
  private boolean fDQ = false;
  private final ArrayList dGW = new ArrayList();

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    aG(localByteBuffer);

    this.fDQ = (localByteBuffer.get() == 1);
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
    return 6320;
  }

  public int eo()
  {
    return this.bXf;
  }

  public adO bxg()
  {
    return adO.cUz;
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

  public boolean bxh() {
    return this.fDQ;
  }

  public boolean aGP() {
    return this.dGV;
  }
}