import java.util.Arrays;
import org.apache.log4j.Logger;

public class aN
{
  private static final Logger K = Logger.getLogger(aN.class);
  public static final byte[] ik = null;
  private final byte il;
  private final byte im;
  private final byte in;
  private final byte io;
  private final boolean ip;
  private final byte iq;
  private final cid ir;
  private final byte[] is;
  private final int it;
  private final byte iu;

  aN(int paramInt1, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, boolean paramBoolean, int paramInt2, byte paramByte5, byte paramByte6, byte[] paramArrayOfByte)
  {
    this.il = paramByte1;
    this.im = paramByte2;
    this.in = paramByte3;
    this.io = paramByte4;
    this.ip = paramBoolean;
    this.it = paramInt2;
    this.iu = paramByte5;
    this.ir = dsw.BE(paramInt1);
    if (this.ir == null) {
      K.error("l'element " + paramInt1 + " n'a pas été exporté");
    }
    this.iq = paramByte6;
    this.is = paramArrayOfByte;
  }

  public static aN c(aYQ paramaYQ) {
    int i = paramaYQ.readInt();
    byte b1 = paramaYQ.readByte();
    byte b2 = paramaYQ.readByte();
    byte b3 = paramaYQ.readByte();
    byte b4 = paramaYQ.readByte();
    boolean bool = paramaYQ.readByte() != 0;
    int j = paramaYQ.readInt();
    byte b5 = paramaYQ.readByte();
    byte b6 = paramaYQ.readByte();
    int k = paramaYQ.readByte() != 0 ? 1 : 0;
    byte[] arrayOfByte = k != 0 ? paramaYQ.ot(3) : ik;
    return new aN(i, b1, b2, b3, b4, bool, j, b5, b6, arrayOfByte);
  }

  public static byte[] a(int paramInt1, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, boolean paramBoolean, int paramInt2, byte paramByte5, byte paramByte6, byte[] paramArrayOfByte)
  {
    dSw localdSw = new dSw();
    localdSw.writeInt(paramInt1);
    localdSw.writeByte(paramByte1);
    localdSw.writeByte(paramByte2);
    localdSw.writeByte(paramByte3);
    localdSw.writeByte(paramByte4);
    localdSw.writeByte((byte)(paramBoolean ? 1 : 0));
    localdSw.writeInt(paramInt2);
    localdSw.writeByte(paramByte5);
    localdSw.writeByte(paramByte6);
    if (Arrays.equals(paramArrayOfByte, ik)) {
      localdSw.writeByte((byte)0);
    } else {
      localdSw.writeByte((byte)1);
      localdSw.writeBytes(paramArrayOfByte);
    }
    return localdSw.getData();
  }

  public cid bS() {
    return this.ir;
  }

  public byte bT() {
    return this.il;
  }

  public byte bU() {
    return this.im;
  }

  public byte bV() {
    return this.in;
  }

  public byte[] bW() {
    return this.is;
  }

  public byte bX() {
    return this.iq;
  }

  public byte bY() {
    return this.io;
  }

  public boolean bZ() {
    return this.ip;
  }

  public int ca() {
    return this.it;
  }

  public byte cb() {
    return this.iu;
  }
}