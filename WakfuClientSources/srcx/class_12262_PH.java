public class PH
{
  public int aw;
  public short cii;
  public String cij;
  public bZA aB;

  public PH()
  {
  }

  public PH(int paramInt, short paramShort, String paramString)
  {
    this.aw = paramInt;
    this.cii = paramShort;
    this.cij = paramString;
  }

  public void d(aYQ paramaYQ) {
    this.aw = paramaYQ.readInt();
    this.cii = paramaYQ.readShort();
    this.cij = paramaYQ.readString();
  }

  public void b(dSw paramdSw) {
    paramdSw.writeInt(this.aw);
    paramdSw.writeShort(this.cii);
    paramdSw.writeString(this.cij);
  }
}