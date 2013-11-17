import java.nio.ByteBuffer;

public class cSh
  implements cxS
{
  public akO aPo;

  public cSh()
  {
    this.aPo = null;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.aPo != null) {
      paramByteBuffer.put((byte)1);
      boolean bool = this.aPo.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.aPo = new akO();
      boolean bool = this.aPo.h(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      this.aPo = null;
    }
    return true;
  }

  public void clear() {
    this.aPo = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      lJ locallJ = new lJ(this, null);
      boolean bool = locallJ.b(paramByteBuffer, paramInt);
      if (bool) {
        locallJ.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i++;
    if (this.aPo != null) {
      i += this.aPo.O();
    }
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("spawnedCharacter=");
    if (this.aPo == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.aPo.a(paramStringBuilder, paramString + "  ");
    }
  }
}