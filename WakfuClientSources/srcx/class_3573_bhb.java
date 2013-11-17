abstract class bhb
{
  int fuZ = 0;

  static bhb n(aYQ paramaYQ)
  {
    int i = paramaYQ.readByte();
    int j = paramaYQ.readInt();

    switch (i) {
    case 1:
      return new Lw(paramaYQ.ot(j));
    case 2:
      return new cPK(paramaYQ.ou(j));
    case 4:
      return new JZ(paramaYQ.ov(j));
    case 3:
    }
    return null;
  }

  static void a(dSw paramdSw, cSi paramcSi) {
    int i = 0;
    int j = paramcSi.size();
    for (int k = 0; k < j; k++) {
      if (paramcSi.wm(k) > i) {
        i = paramcSi.wm(k);
      }
    }
    if (i < 255) {
      paramdSw.writeByte((byte)1);
      paramdSw.writeInt(j);
      for (k = 0; k < j; k++) {
        paramdSw.writeByte((byte)paramcSi.wm(k));
      }
      return;
    }
    if (i < 65535) {
      paramdSw.writeByte((byte)2);
      paramdSw.writeInt(j);
      for (k = 0; k < j; k++) {
        paramdSw.writeShort((short)paramcSi.wm(k));
      }
      return;
    }
    if (i >= 2147483647) {
      throw new cJ("trop de donnée");
    }
    paramdSw.writeByte((byte)4);
    paramdSw.writeInt(j);
    for (k = 0; k < j; k++)
      paramdSw.writeInt(paramcSi.wm(k));
  }

  public final void begin(int paramInt)
  {
    this.fuZ = paramInt;
  }

  public abstract int read();
}