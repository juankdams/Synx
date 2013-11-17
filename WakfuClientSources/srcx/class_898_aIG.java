import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class aIG extends aRw
{
  private static final Logger K = Logger.getLogger(aIG.class);
  protected byte cUt;
  protected short bem;
  protected bvv eho;

  public aIG()
  {
    this.eho = new bvv(64);
  }

  public void bM(byte paramByte)
  {
    this.cUt = paramByte;
  }

  public byte[] encode()
  {
    if (this.eho.size() > 65535) {
      K.error("Impossible d'encoder un message de taille " + this.eho.size() + " > 0xFFFF");
      return null;
    }
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4 + this.eho.size());
    localByteBuffer.putShort(this.bem);
    localByteBuffer.putShort((short)this.eho.size());
    localByteBuffer.put(this.eho.bDf());
    return a(this.cUt, localByteBuffer.array());
  }

  public int getId()
  {
    return 104;
  }

  public void bf(short paramShort)
  {
    this.bem = paramShort;
  }

  public void ao(Object paramObject)
  {
    if ((paramObject instanceof Integer)) {
      mH(((Integer)paramObject).intValue());
      return;
    }
    if ((paramObject instanceof Byte)) {
      bN(((Byte)paramObject).byteValue());
      return;
    }
    if ((paramObject instanceof Long)) {
      dU(((Long)paramObject).longValue());
      return;
    }
    if ((paramObject instanceof Float)) {
      aM(((Float)paramObject).floatValue());
      return;
    }
    if ((paramObject instanceof Short)) {
      bg(((Short)paramObject).shortValue());
      return;
    }
    if ((paramObject instanceof Boolean)) {
      dt(((Boolean)paramObject).booleanValue());
      return;
    }
    if ((paramObject instanceof String)) {
      gC((String)paramObject);
      return;
    }
    throw new IllegalArgumentException("type " + paramObject.getClass().getSimpleName() + " non ajoutable au message");
  }

  public void gC(String paramString)
  {
    byte[] arrayOfByte = dzp.qC(paramString);
    if ((arrayOfByte != null) && (arrayOfByte.length <= 65535)) {
      bg((short)arrayOfByte.length);
      this.eho.ae(arrayOfByte);
    } else {
      K.error("Impossible d'ajouter le paramètre de type chaîne.");
    }
  }

  public void mH(int paramInt)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.putInt(paramInt);
    this.eho.ae(localByteBuffer.array());
  }

  public void dt(boolean paramBoolean)
  {
    this.eho.add((byte)(paramBoolean ? 1 : 0));
  }

  public void bN(byte paramByte)
  {
    this.eho.add(paramByte);
  }

  public void dU(long paramLong)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
    localByteBuffer.putLong(paramLong);
    this.eho.ae(localByteBuffer.array());
  }

  public void bg(short paramShort)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(2);
    localByteBuffer.putShort(paramShort);
    this.eho.ae(localByteBuffer.array());
  }

  public void aM(float paramFloat)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.putFloat(paramFloat);
    this.eho.ae(localByteBuffer.array());
  }
}