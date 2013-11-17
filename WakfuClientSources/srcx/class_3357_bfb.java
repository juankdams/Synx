import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class bfb extends aRw
{
  private final ArrayList fsm = new ArrayList();

  private short fsn = -1;

  private int fso = -1;
  private int fsp = -1;

  private byte fsq = -1;
  private short fsr = 0;
  private boolean fss = true;

  public void F(ArrayList paramArrayList) {
    this.fsm.clear();
    this.fsm.addAll(paramArrayList);
  }

  public void bK(short paramShort) {
    this.fsn = paramShort;
  }

  public void pf(int paramInt) {
    this.fso = paramInt;
  }

  public void pg(int paramInt) {
    this.fsp = paramInt;
  }

  public void cG(byte paramByte) {
    this.fsq = paramByte;
  }

  public int bsy() {
    return this.fsm.size();
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(14 + this.fsm.size() * 4);

    localByteBuffer.putShort(this.fsn);
    localByteBuffer.putInt(this.fso);
    localByteBuffer.putInt(this.fsp);
    localByteBuffer.put(this.fsq);
    localByteBuffer.putShort(this.fsr);
    localByteBuffer.put((byte)(this.fss ? 1 : 0));
    for (int i = 0; i < this.fsm.size(); i++)
      localByteBuffer.putInt(((Integer)this.fsm.get(i)).intValue());
    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 15263;
  }

  public void bL(short paramShort) {
    this.fsr = paramShort;
  }

  public void eD(boolean paramBoolean) {
    this.fss = paramBoolean;
  }

  public boolean bsz() {
    return this.fss;
  }

  public short bsA() {
    return this.fsn;
  }

  public int bsB() {
    return this.fso;
  }

  public int bsC() {
    return this.fsp;
  }
}