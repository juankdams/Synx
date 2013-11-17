import java.nio.ByteBuffer;

public class dNV extends ass
{
  private dQa meu;
  private final cCH kC = new wl(this);

  public dNV(bTF parambTF, String paramString, int paramInt)
  {
    super(parambTF, paramString);
    if (paramInt != 0)
      h(azO.dRO.hV, paramInt);
  }

  public cCH yI() {
    return this.kC;
  }

  public dPl yJ() {
    return this.meu;
  }

  public void U(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() == 1 ? 1 : 0;

    if (i != 0)
      this.meu = dQa.aV(paramByteBuffer);
    else {
      this.meu = null;
    }
    aEJ().initialize();
  }
}