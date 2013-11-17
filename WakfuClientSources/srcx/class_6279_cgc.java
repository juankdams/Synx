public class cgc
  implements bgG
{
  private int aw;
  private long hCY;
  private float cLM;
  private boolean hCZ;
  private boolean hDa;
  private short hDb;
  private short hDc;
  private float cLB;
  private int hDd;
  private int hDe;

  public cgc()
  {
  }

  public cgc(int paramInt1, long paramLong, float paramFloat1, boolean paramBoolean1, boolean paramBoolean2, short paramShort1, short paramShort2, float paramFloat2, int paramInt2, int paramInt3)
  {
    this.aw = paramInt1;
    this.hCY = paramLong;
    this.cLM = paramFloat1;
    this.hCZ = paramBoolean1;
    this.hDa = paramBoolean2;
    this.hDb = paramShort1;
    this.hDc = paramShort2;
    this.cLB = paramFloat2;
    this.hDd = paramInt2;
    this.hDe = paramInt3;
  }

  final void d(aYQ paramaYQ) {
    this.aw = paramaYQ.readInt();
    this.hCY = paramaYQ.readLong();
    this.cLM = paramaYQ.readFloat();
    this.hCZ = paramaYQ.bnT();
    this.hDa = paramaYQ.bnT();
    this.hDb = paramaYQ.readShort();
    this.hDc = paramaYQ.readShort();
    this.cLB = paramaYQ.readFloat();
    this.hDd = paramaYQ.readInt();
    this.hDe = paramaYQ.readInt();
  }

  final void b(dSw paramdSw) {
    paramdSw.writeInt(this.aw);
    paramdSw.writeLong(this.hCY);
    paramdSw.writeFloat(this.cLM);
    paramdSw.lu(this.hCZ);
    paramdSw.lu(this.hDa);
    paramdSw.writeShort(this.hDb);
    paramdSw.writeShort(this.hDc);
    paramdSw.writeFloat(this.cLB);
    paramdSw.writeInt(this.hDd);
    paramdSw.writeInt(this.hDe);
  }

  public int getId() {
    return this.aw;
  }

  public long btf() {
    return this.hCY;
  }

  public boolean getStereo() {
    return this.hCZ;
  }

  public float alj() {
    return this.cLM;
  }

  public float btg() {
    return this.hDc;
  }

  public int bth() {
    return this.hDe;
  }

  public float bti() {
    return this.cLB;
  }

  public float btj() {
    return this.hDb;
  }

  public int btk() {
    return this.hDd;
  }
}