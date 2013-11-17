import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class zD
  implements cMX
{
  private int aGs;
  private String but;
  private String buu;
  private long buv;

  public zD()
  {
  }

  public zD(int paramInt, String paramString1, String paramString2, long paramLong)
  {
    this.aGs = paramInt;
    this.but = (paramString1 != null ? paramString1.intern() : null);
    this.buu = (paramString2 != null ? paramString2.intern() : null);
    this.buv = paramLong;
  }

  public int getType() {
    return this.aGs;
  }

  public void setType(int paramInt) {
    this.aGs = paramInt;
  }

  public String getIndexName() {
    return this.but;
  }

  public void bl(String paramString) {
    this.but = paramString;
  }

  public String Iu() {
    return this.buu;
  }

  public void bm(String paramString) {
    this.buu = paramString;
  }

  public long getPosition() {
    return this.buv;
  }

  public void ba(long paramLong) {
    this.buv = paramLong;
  }

  public void write(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.aGs);
    paramDataOutputStream.writeUTF(this.but);
    paramDataOutputStream.writeUTF(this.buu);
    paramDataOutputStream.writeLong(this.buv);
  }

  public void read(DataInputStream paramDataInputStream) {
    this.aGs = paramDataInputStream.readInt();
    this.but = paramDataInputStream.readUTF().intern();
    this.buu = paramDataInputStream.readUTF().intern();
    this.buv = paramDataInputStream.readLong();
  }
}