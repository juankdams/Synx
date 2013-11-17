public class cDB
{
  private static final byte fZf = 2;
  private int aw;
  private int hY;
  private int hZ;
  private int aSg;
  private String iwV;

  cDB()
  {
  }

  public cDB(int paramInt1, int paramInt2, int paramInt3, String paramString, int paramInt4)
  {
    this.aw = paramInt1;
    this.hY = paramInt2;
    this.hZ = paramInt3;
    this.aSg = paramInt4;
    this.iwV = paramString;
  }

  public int getId() {
    return this.aw;
  }

  public void d(int paramInt) {
    this.aw = paramInt;
  }

  public int getX() {
    return this.hY;
  }

  public void setX(int paramInt) {
    this.hY = paramInt;
  }

  public int getY() {
    return this.hZ;
  }

  public void setY(int paramInt) {
    this.hZ = paramInt;
  }

  public String getNote() {
    return this.iwV;
  }

  public void setNote(String paramString) {
    this.iwV = paramString;
  }

  public void iT(int paramInt) {
    this.aSg = paramInt;
  }

  public int oc() {
    return this.aSg;
  }

  public void a(aYQ paramaYQ, int paramInt) {
    this.hY = paramaYQ.readInt();
    this.hZ = paramaYQ.readInt();
    this.iwV = paramaYQ.readString();

    if (paramInt > -1)
      this.aSg = paramaYQ.readInt();
  }

  public void a(dSw paramdSw, int paramInt)
  {
    paramdSw.writeInt(this.hY);
    paramdSw.writeInt(this.hZ);
    paramdSw.writeString(this.iwV);

    if (paramInt > -1)
      paramdSw.writeInt(this.aSg);
  }

  public String toString()
  {
    return this.iwV;
  }
}