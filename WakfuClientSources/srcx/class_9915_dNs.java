import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;

class dNs
{
  private final akR mea = new akR();
  private final akR meb = new akR();

  public Entity b(Entity paramEntity, bNi parambNi) {
    Entity localEntity = (Entity)this.meb.put(parambNi, paramEntity);
    if (localEntity != null) {
      this.mea.remove(localEntity);
    }

    this.mea.put(paramEntity, parambNi);

    return localEntity;
  }

  public Entity l(bNi parambNi) {
    return (Entity)this.meb.get(parambNi);
  }

  public bNi d(EntitySprite paramEntitySprite) {
    return (bNi)this.mea.get(paramEntitySprite);
  }

  public Entity m(bNi parambNi) {
    Entity localEntity = (Entity)this.meb.remove(parambNi);
    this.mea.remove(localEntity);
    if ((!bB) && (this.meb.size() != this.mea.size())) throw new AssertionError();
    return localEntity;
  }

  public bNi l(Entity paramEntity) {
    bNi localbNi = (bNi)this.mea.remove(paramEntity);
    this.meb.remove(localbNi);
    if ((!bB) && (this.meb.size() != this.mea.size())) throw new AssertionError();
    return localbNi;
  }

  public void clear() {
    this.mea.clear();
    this.meb.clear();
  }
}