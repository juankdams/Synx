public class ak extends aoI
{
  protected final crX a(aYQ paramaYQ)
  {
    int i = paramaYQ.readByte() == 109 ? 1 : 0;
    paramaYQ.os(3);

    int j = paramaYQ.readShort();
    int k = paramaYQ.readShort();
    int m = paramaYQ.readInt();
    int n = paramaYQ.readInt();
    byte b = i != 0 ? paramaYQ.readByte() : 1;

    byte[] arrayOfByte1 = new byte[m];
    paramaYQ.W(arrayOfByte1);
    cSJ localcSJ = new cSJ(j, k, (short)32, null, arrayOfByte1);
    byte[] arrayOfByte2 = new byte[n];
    paramaYQ.W(arrayOfByte2);
    localcSJ.f(arrayOfByte2, b);
    paramaYQ.close();
    crX localcrX = new crX(bIN.gJh, localcSJ);
    localcSJ.axl();
    return localcrX;
  }

  protected MD b(aYQ paramaYQ)
  {
    paramaYQ.os(4);
    return new MD(paramaYQ.readShort(), paramaYQ.readShort());
  }

  protected int aU()
  {
    return 8;
  }
}