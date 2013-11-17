import java.nio.ByteBuffer;

public final class aLd extends cAl
{
  public aLd(String paramString)
  {
    super(paramString);
  }

  public cwc bcJ()
  {
    return new cwc();
  }

  public void a(cwc paramcwc, ByteBuffer paramByteBuffer)
  {
    paramcwc.ihx.a(paramByteBuffer.getFloat(), paramByteBuffer.getFloat(), paramByteBuffer.getFloat(), paramByteBuffer.getFloat());
    int i = paramByteBuffer.get() & 0xFF;
    paramcwc.ihx.clear();
    for (int j = 0; j < i; j++) {
      double d1 = paramByteBuffer.getFloat();
      double d2 = paramByteBuffer.getFloat();
      bJP localbJP = new bJP(d1, d2);
      paramcwc.ihx.a(localbJP);

      localbJP.i(paramByteBuffer.getFloat(), paramByteBuffer.getFloat());
      localbJP.j(paramByteBuffer.getFloat(), paramByteBuffer.getFloat());
    }
  }

  public void a(dSw paramdSw, String paramString)
  {
    aeK localaeK = Zh.dS(paramString);
    int i = localaeK.size();
    paramdSw.writeFloat((float)localaeK.aqs());
    paramdSw.writeFloat((float)localaeK.aqu());
    paramdSw.writeFloat((float)localaeK.aqt());
    paramdSw.writeFloat((float)localaeK.aqv());
    paramdSw.writeByte((byte)i);
    for (int j = 0; j < i; j++) {
      bJP localbJP = localaeK.hO(j);
      paramdSw.writeFloat((float)localbJP.getX());
      paramdSw.writeFloat((float)localbJP.getY());

      paramdSw.writeFloat((float)localbJP.bRr());
      paramdSw.writeFloat((float)localbJP.bRs());

      paramdSw.writeFloat((float)localbJP.bRt());
      paramdSw.writeFloat((float)localbJP.bRu());
    }
  }
}