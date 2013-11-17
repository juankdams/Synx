import java.util.Collection;

abstract class dBq
  implements ly
{
  final ckT aCI;
  final byz dmy;
  final byte bml;

  dBq(ckT paramckT, byz parambyz, byte paramByte)
  {
    this.aCI = paramckT;
    this.dmy = parambyz;
    this.bml = paramByte;
  }

  public int sS() {
    Collection localCollection = this.aCI.ch(this.bml);
    if (localCollection.size() >= 6) {
      return 1027;
    }
    if (!this.aCI.a(this.dmy, this.bml))
      return 1027;
    return 0;
  }
}