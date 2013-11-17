import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class bop
  implements cMX
{
  private int aw;
  private short aFV;
  private byte[] bFC;

  public bop(int paramInt, short paramShort, byte[] paramArrayOfByte)
  {
    this.aw = paramInt;
    this.aFV = paramShort;
    this.bFC = paramArrayOfByte;
  }

  public bop() {
  }

  public int getId() {
    return this.aw;
  }

  public short oX() {
    return this.aFV;
  }

  public byte[] getData() {
    return this.bFC;
  }

  public void write(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.aw);
    paramDataOutputStream.writeShort(this.aFV);
    paramDataOutputStream.writeInt(this.bFC.length);
    paramDataOutputStream.write(this.bFC);
  }

  public void read(DataInputStream paramDataInputStream) {
    this.aw = paramDataInputStream.readInt();
    this.aFV = paramDataInputStream.readShort();
    int i = paramDataInputStream.readInt();
    this.bFC = new byte[i];
    paramDataInputStream.read(this.bFC);
  }

  public static int a(DataInputStream paramDataInputStream) {
    paramDataInputStream.readInt();
    paramDataInputStream.readShort();
    int i = paramDataInputStream.readInt();
    paramDataInputStream.skipBytes(i);

    return 10 + i;
  }
}