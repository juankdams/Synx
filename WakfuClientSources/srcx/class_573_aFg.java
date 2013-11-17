import java.nio.ByteBuffer;
import java.util.ArrayList;

public class aFg extends dzz
{
  private je eaV;
  private String aQZ;
  private final ArrayList eaW = new ArrayList();
  private int eaX;
  private int eaY;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.eaV = je.aZ(localByteBuffer.getInt());

    if (localByteBuffer.get() == 1) {
      this.eaX = localByteBuffer.getInt();
      this.eaY = localByteBuffer.getInt();

      byte[] arrayOfByte = new byte[localByteBuffer.getInt()];
      localByteBuffer.get(arrayOfByte);
      this.aQZ = dzp.aJ(arrayOfByte);
      int i = 0; for (int j = localByteBuffer.getInt(); i < j; i++) {
        this.eaW.add(Fk.K(localByteBuffer));
      }
    }

    return true;
  }

  public je aRB() {
    return this.eaV;
  }

  public String uo() {
    return this.aQZ;
  }

  public ArrayList aRC() {
    return new ArrayList(this.eaW);
  }

  public int aRD() {
    return this.eaX;
  }

  public int aRE() {
    return this.eaY;
  }

  public int getId()
  {
    return 20090;
  }

  public String toString()
  {
    return "HavenWorldInfoResult{m_error=" + this.eaV + ", m_guildName='" + this.aQZ + '\'' + ", m_buildings=" + this.eaW.size() + '}';
  }
}