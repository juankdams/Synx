import java.nio.ByteBuffer;

public class dsO
{
  public static final short lvc = -1;
  public final short az;
  public final boolean lvd;
  public final float lve;
  public final float dka;
  public final float lvf;

  public dsO()
  {
    this((short)-1);
  }

  public dsO(short paramShort) {
    this(paramShort, true, 0.01F, 1.0F, 0.01F);
  }

  public dsO(short paramShort, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3) {
    this.az = paramShort;
    this.lvd = paramBoolean;
    this.lve = paramFloat1;
    this.dka = paramFloat2;
    this.lvf = paramFloat3;
  }

  public dsO eq(short paramShort) {
    return new dsO(paramShort, this.lvd, this.lve, this.dka, this.lvf);
  }

  public dsO(ByteBuffer paramByteBuffer) {
    this.az = paramByteBuffer.getShort();
    this.lvd = (paramByteBuffer.get() != 0);
    this.lve = paramByteBuffer.getFloat();
    this.dka = paramByteBuffer.getFloat();
    this.lvf = paramByteBuffer.getFloat();
  }

  public void a(dSw paramdSw) {
    paramdSw.writeShort(this.az);
    paramdSw.writeByte((byte)(this.lvd ? 1 : 0));
    paramdSw.writeFloat(this.lve);
    paramdSw.writeFloat(this.dka);
    paramdSw.writeFloat(this.lvf);
  }
}