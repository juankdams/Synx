import java.nio.ByteBuffer;

class aHS extends cCH
{
  aHS(aSJ paramaSJ)
  {
  }

  private cCH aTX()
  {
    return aSJ.a(this.egk);
  }

  public int cc()
  {
    return 2 + aTX().cc();
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    aTX().b(paramByteBuffer);
    if (this.egk.aOF != null)
      paramByteBuffer.put(this.egk.aOF.bJ());
    else
      paramByteBuffer.put((byte)0);
    paramByteBuffer.put((byte)(aSJ.b(this.egk) ? 1 : 0));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    aTX().a(paramByteBuffer, aUk.eVd);
    this.egk.aOF = eu.a(Byte.valueOf(paramByteBuffer.get()));
    aSJ.a(this.egk, paramByteBuffer.get() == 1);
  }
}