public class dVz
{
  public final short aDx;
  final short muy;
  final float eVG;
  final float eVH;
  final float hYN;
  final float hYM;
  final short gKt;
  final short bdV;
  final float aZs;
  final float aZt;

  public dVz(aYQ paramaYQ)
  {
    this.aDx = paramaYQ.readShort();
    this.muy = paramaYQ.readShort();

    this.eVG = ((paramaYQ.readShort() & 0xFFFF) / 65535.0F);
    this.eVH = ((paramaYQ.readShort() & 0xFFFF) / 65535.0F);
    this.hYN = ((paramaYQ.readShort() & 0xFFFF) / 65535.0F);
    this.hYM = ((paramaYQ.readShort() & 0xFFFF) / 65535.0F);

    this.gKt = paramaYQ.readShort();
    this.bdV = paramaYQ.readShort();

    this.aZs = paramaYQ.readFloat();
    this.aZt = paramaYQ.readFloat();
  }
}