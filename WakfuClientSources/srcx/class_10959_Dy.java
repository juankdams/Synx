import java.nio.ByteBuffer;

public abstract class Dy
  implements cxS
{
  public static Dy G(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.get();
    Object localObject;
    switch (i) {
    case 0:
      localObject = new BV();
      break;
    case 1:
      localObject = new cWJ();
      break;
    case 2:
      localObject = new cys();
      break;
    case 3:
      localObject = new bRW();
      break;
    case 4:
      localObject = new dla();
      break;
    case 5:
      localObject = new Uo();
      break;
    case 6:
      localObject = new bup();
      break;
    case 7:
      localObject = new B();
      break;
    case 8:
      localObject = new T();
      break;
    default:
      return null;
    }
    if (!((Dy)localObject).h(paramByteBuffer))
      return null;
    return localObject;
  }

  public static Dy h(ByteBuffer paramByteBuffer, int paramInt) {
    int i = paramByteBuffer.get();
    Object localObject;
    switch (i) {
    case 0:
      localObject = new BV();
      break;
    case 1:
      localObject = new cWJ();
      break;
    case 2:
      localObject = new cys();
      break;
    case 3:
      localObject = new bRW();
      break;
    case 4:
      localObject = new dla();
      break;
    case 5:
      localObject = new Uo();
      break;
    case 6:
      localObject = new bup();
      break;
    case 7:
      localObject = new B();
      break;
    case 8:
      localObject = new T();
      break;
    default:
      return null;
    }
    if (!((Dy)localObject).b(paramByteBuffer, paramInt))
      return null;
    return localObject;
  }

  public abstract byte N();

  public abstract void a(StringBuilder paramStringBuilder, String paramString);
}