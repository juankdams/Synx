import java.nio.ByteBuffer;
import java.util.Arrays;

public class buY extends dzz
{
  private byte[] geJ;
  private long[] geK;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    Short localShort = Short.valueOf(localByteBuffer.getShort());
    this.geK = new long[localShort.shortValue()];
    for (int i = 0; i < localShort.shortValue(); i++) {
      this.geK[i] = localByteBuffer.getLong();
    }

    this.geJ = new byte[localByteBuffer.getInt()];
    localByteBuffer.get(this.geJ);
    return true;
  }

  public int getId()
  {
    return 4098;
  }

  public byte[] bCJ() {
    return aUP.O(this.geJ);
  }

  public long[] bCK() {
    return aUP.e(this.geK);
  }

  public String toString()
  {
    return "CharacterInformationMessage{m_serializedCharacterInfo=" + Arrays.toString(this.geJ) + ", m_reservedIds=" + Arrays.toString(this.geK) + '}';
  }
}