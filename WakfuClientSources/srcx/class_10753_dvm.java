import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class dvm
  implements dxu
{
  private final char[] Te;
  private final List lAH;

  public dvm(char[] paramArrayOfChar)
  {
    this.Te = ((char[])paramArrayOfChar.clone());
    ArrayList localArrayList = new ArrayList(this.Te.length);

    byte b = 127;

    for (int i = 0; i < this.Te.length; i++) {
      b = (byte)(b + 1); localArrayList.add(new bBF(b, this.Te[i]));
    }

    Collections.sort(localArrayList);
    this.lAH = Collections.unmodifiableList(localArrayList);
  }

  public char fA(byte paramByte)
  {
    if (paramByte >= 0) {
      return (char)paramByte;
    }

    return this.Te[(128 + paramByte)];
  }

  public boolean X(char paramChar)
  {
    if ((paramChar >= 0) && (paramChar < '')) {
      return true;
    }

    bBF localbBF = Y(paramChar);
    return localbBF != null;
  }

  public boolean b(ByteBuffer paramByteBuffer, char paramChar)
  {
    if ((paramChar >= 0) && (paramChar < '')) {
      paramByteBuffer.put((byte)paramChar);
      return true;
    }

    bBF localbBF = Y(paramChar);
    if (localbBF == null) {
      return false;
    }
    paramByteBuffer.put(localbBF.gux);
    return true;
  }

  private bBF Y(char paramChar)
  {
    int i = 0;
    int j = this.lAH.size();

    while (j > i)
    {
      int k = i + (j - i) / 2;

      bBF localbBF2 = (bBF)this.lAH.get(k);

      if (localbBF2.guw == paramChar) {
        return localbBF2;
      }

      if (localbBF2.guw < paramChar)
        i = k + 1;
      else {
        j = k;
      }
    }

    if (i >= this.lAH.size()) {
      return null;
    }

    bBF localbBF1 = (bBF)this.lAH.get(i);

    if (localbBF1.guw != paramChar) {
      return null;
    }

    return localbBF1;
  }

  public boolean gQ(String paramString)
  {
    for (int i = 0; i < paramString.length(); i++)
    {
      char c = paramString.charAt(i);

      if (!X(c)) {
        return false;
      }
    }

    return true;
  }

  public ByteBuffer encode(String paramString)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramString.length() + 6 + (paramString.length() + 1) / 2);

    for (int i = 0; i < paramString.length(); i++)
    {
      char c = paramString.charAt(i);

      if (localByteBuffer.remaining() < 6) {
        localByteBuffer = ach.i(localByteBuffer, localByteBuffer.position() + 6);
      }

      if (!b(localByteBuffer, c))
      {
        ach.a(localByteBuffer, c);
      }
    }

    localByteBuffer.limit(localByteBuffer.position());
    localByteBuffer.rewind();
    return localByteBuffer;
  }

  public String K(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar = new char[paramArrayOfByte.length];

    for (int i = 0; i < paramArrayOfByte.length; i++) {
      arrayOfChar[i] = fA(paramArrayOfByte[i]);
    }

    return new String(arrayOfChar);
  }
}