import com.ankamagames.wakfu.client.binaryStorage.AreaEffectBinaryData;
import java.lang.reflect.Constructor;

class Wi
{
  private final Constructor cGd;

  Wi(Class paramClass)
  {
    this.cGd = y(paramClass);
  }

  private static Constructor y(Class paramClass) {
    for (Constructor localConstructor : paramClass.getConstructors()) {
      if (localConstructor.getParameterTypes().length == 15) {
        return localConstructor;
      }
    }
    throw new NoSuchMethodException();
  }

  public aAn a(AreaEffectBinaryData paramAreaEffectBinaryData)
  {
    return (aAn)this.cGd.newInstance(new Object[] { Integer.valueOf(paramAreaEffectBinaryData.getId()), bQd.d(paramAreaEffectBinaryData), bQd.G(paramAreaEffectBinaryData.bvR()), bQd.G(paramAreaEffectBinaryData.bvS()), Integer.valueOf(paramAreaEffectBinaryData.bvJ()), Integer.valueOf(paramAreaEffectBinaryData.uN()), Integer.valueOf(paramAreaEffectBinaryData.bvK()), paramAreaEffectBinaryData.bvU(), paramAreaEffectBinaryData.bvV(), paramAreaEffectBinaryData.bvW(), bQd.km(paramAreaEffectBinaryData.bvX()), bQd.km(paramAreaEffectBinaryData.bvY()), paramAreaEffectBinaryData.zp(), Boolean.valueOf(paramAreaEffectBinaryData.bvL()), Boolean.valueOf(paramAreaEffectBinaryData.bvP()) });
  }
}