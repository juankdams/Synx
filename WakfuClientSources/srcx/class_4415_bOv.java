import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

class bOv
  implements dxu
{
  private final Charset gTD;

  public bOv(Charset paramCharset)
  {
    this.gTD = paramCharset;
  }

  public boolean gQ(String paramString)
  {
    CharsetEncoder localCharsetEncoder = this.gTD.newEncoder();
    localCharsetEncoder.onMalformedInput(CodingErrorAction.REPORT);
    localCharsetEncoder.onUnmappableCharacter(CodingErrorAction.REPORT);

    return localCharsetEncoder.canEncode(paramString);
  }

  public ByteBuffer encode(String paramString)
  {
    CharsetEncoder localCharsetEncoder = this.gTD.newEncoder();

    localCharsetEncoder.onMalformedInput(CodingErrorAction.REPORT);
    localCharsetEncoder.onUnmappableCharacter(CodingErrorAction.REPORT);

    CharBuffer localCharBuffer = CharBuffer.wrap(paramString);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramString.length() + (paramString.length() + 1) / 2);

    while (localCharBuffer.remaining() > 0) {
      CoderResult localCoderResult = localCharsetEncoder.encode(localCharBuffer, localByteBuffer, true);

      if ((localCoderResult.isUnmappable()) || (localCoderResult.isMalformed()))
      {
        if (localCoderResult.length() * 6 > localByteBuffer.remaining()) {
          localByteBuffer = ach.i(localByteBuffer, localByteBuffer.position() + localCoderResult.length() * 6);
        }

        for (int i = 0; i < localCoderResult.length(); i++) {
          ach.a(localByteBuffer, localCharBuffer.get());
        }
      }
      else if (localCoderResult.isOverflow())
      {
        localByteBuffer = ach.i(localByteBuffer, 0);
      }
      else if (localCoderResult.isUnderflow())
      {
        localCharsetEncoder.flush(localByteBuffer);
        break;
      }

    }

    localByteBuffer.limit(localByteBuffer.position());
    localByteBuffer.rewind();
    return localByteBuffer;
  }

  public String K(byte[] paramArrayOfByte)
  {
    return this.gTD.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(paramArrayOfByte)).toString();
  }
}