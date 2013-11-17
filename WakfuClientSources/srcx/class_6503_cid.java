import com.sun.opengl.util.texture.TextureCoords;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class cid
{
  private static final Logger K = Logger.getLogger(cid.class);
  private static final short hGt = 16;
  private static final short hGu = 32;
  private static final short hGv = 64;
  private static final short hGw = 128;
  private static final short hGx = 15;
  public static final byte hGy = 1;
  public static final byte hGz = 2;
  private final int aw;
  private final short dyg;
  private final short dyh;
  private final short hGA;
  private final short hGB;
  private final int aSg;
  private final byte hGC;
  private final byte gaR;
  private final byte hGD;
  private final byte hGE;
  protected final dzZ dlt;
  private final TextureCoords hGF;
  private byte hGG;
  private final byte hGH;

  public cid(int paramInt1, short paramShort1, short paramShort2, short paramShort3, short paramShort4, int paramInt2, boolean paramBoolean1, byte paramByte1, byte paramByte2, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, byte paramByte3, byte paramByte4, byte paramByte5, dzZ paramdzZ, byte paramByte6)
  {
    this.aw = paramInt1;
    this.dyg = paramShort1;
    this.dyh = paramShort2;
    this.hGA = paramShort3;
    this.hGB = paramShort4;
    this.aSg = paramInt2;
    this.hGC = paramByte2;
    if ((!bB) && (paramByte1 > 15)) throw new AssertionError();
    byte b = paramByte1;
    b = (byte)(b | (paramBoolean1 ? 16 : 0));
    b = (byte)(b | (paramBoolean2 ? 32 : 0));
    b = (byte)(b | (paramBoolean3 ? 64 : 0));
    b = (byte)(b | (paramBoolean4 ? 128 : 0));
    this.hGH = b;
    this.gaR = paramByte3;
    this.hGD = paramByte4;
    this.hGE = paramByte5;
    this.dlt = paramdzZ;
    this.hGF = (this.dlt == null ? h(this.hGA, this.hGB, cjH()) : null);
    this.hGG = paramByte6;
  }

  private static TextureCoords h(int paramInt1, int paramInt2, boolean paramBoolean) {
    float f1 = bCO.sj(paramInt1);
    float f2 = bCO.sj(paramInt2) - 0.5F;

    float f3 = paramInt1 / f1;
    float f4 = paramInt2 / f2;

    if (paramBoolean) {
      return new TextureCoords(f3, f4, 0.0F, 0.0F);
    }
    return new TextureCoords(0.0F, f4, f3, 0.0F);
  }

  cid(ByteBuffer paramByteBuffer) {
    this.aw = paramByteBuffer.getInt();
    this.dyg = paramByteBuffer.getShort();
    this.dyh = paramByteBuffer.getShort();
    this.hGA = paramByteBuffer.getShort();
    this.hGB = paramByteBuffer.getShort();
    this.aSg = paramByteBuffer.getInt();
    this.hGH = paramByteBuffer.get();
    this.hGC = paramByteBuffer.get();
    this.gaR = paramByteBuffer.get();
    this.hGD = paramByteBuffer.get();
    this.hGE = paramByteBuffer.get();

    boolean bool = cjH();
    this.dlt = aTy.b(paramByteBuffer, bool);
    this.hGF = (this.dlt == null ? h(this.hGA, this.hGB, bool) : null);
    this.hGG = paramByteBuffer.get();
  }

  public void b(dSw paramdSw) {
    paramdSw.writeInt(this.aw);
    paramdSw.writeShort(this.dyg);
    paramdSw.writeShort(this.dyh);
    paramdSw.writeShort(this.hGA);
    paramdSw.writeShort(this.hGB);
    paramdSw.writeInt(this.aSg);
    paramdSw.writeByte(this.hGH);
    paramdSw.writeByte(this.hGC);
    paramdSw.writeByte(this.gaR);
    paramdSw.writeByte(this.hGD);
    paramdSw.writeByte(this.hGE);
    if (this.dlt == null)
      paramdSw.writeByte((byte)0);
    else {
      this.dlt.a(paramdSw);
    }
    paramdSw.writeByte(this.hGG);
  }

  public int getId()
  {
    return this.aw;
  }

  public int KU() {
    return this.dyg;
  }

  public int KV() {
    return this.dyh;
  }

  public int cjF() {
    return this.hGA;
  }

  public int cjG() {
    return this.hGB;
  }

  public int oc() {
    return this.aSg;
  }

  public boolean cjH() {
    return (this.hGH & 0x10) == 16;
  }

  public byte cjI() {
    return (byte)(this.hGH & 0xF);
  }

  public int cjJ() {
    return this.hGC;
  }

  public boolean cjK() {
    return (this.hGH & 0x20) == 32;
  }

  public byte cjL() {
    return this.hGG;
  }

  public boolean cjM()
  {
    return (this.hGH & 0x40) == 64;
  }

  public boolean cjN() {
    return (this.hGH & 0x80) == 128;
  }

  public byte bBm() {
    return this.gaR;
  }

  public byte cjO() {
    return this.hGD;
  }

  public byte cjP() {
    return this.hGE;
  }

  public boolean cjQ() {
    return this.dlt != null;
  }

  public TextureCoords br(short paramShort)
  {
    if (this.hGF != null) {
      if ((!bB) && (this.dlt != null)) throw new AssertionError();
      return this.hGF;
    }

    return this.dlt.br(paramShort);
  }

  public static cid d(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    return new cid(paramInt, (short)0, (short)0, (short)0, (short)0, 0, false, (byte)0, (byte)0, paramBoolean1, false, paramBoolean2, (byte)0, (byte)0, (byte)0, null, (byte)0);
  }
}