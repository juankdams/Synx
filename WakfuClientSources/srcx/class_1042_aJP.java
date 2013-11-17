import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite.ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite.ObjectFactory;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aJP
{
  private static final Logger K = Logger.getLogger(aJP.class);

  private final ArrayList cWn = new ArrayList();
  private final ArrayList ekh = new ArrayList();
  private final ArrayList eki = new ArrayList();

  public void D(ArrayList paramArrayList) {
    this.cWn.clear();
    this.cWn.addAll(paramArrayList);

    bbr();
  }

  public dwn mJ(int paramInt) {
    return (dwn)this.cWn.get(paramInt);
  }

  public EntitySprite mK(int paramInt) {
    return (EntitySprite)this.ekh.get(paramInt);
  }

  public EntitySprite mL(int paramInt) {
    return (EntitySprite)this.eki.get(paramInt);
  }

  public void g(dwn paramdwn) {
    this.cWn.add(paramdwn);

    this.ekh.add(ap(this));
    this.eki.add(ap(this));

    if ((!bB) && (this.ekh.size() != this.cWn.size())) throw new AssertionError(); 
  }

  public void h(dwn paramdwn)
  {
    int i = this.cWn.indexOf(paramdwn);
    if (i != -1) {
      this.cWn.remove(i);
      ((EntitySprite)this.ekh.remove(i)).axl();
      ((EntitySprite)this.eki.remove(i)).axl();
    }
    if ((!bB) && (this.ekh.size() != this.cWn.size())) throw new AssertionError(); 
  }

  public int size()
  {
    return this.cWn.size();
  }

  public void clear() {
    this.cWn.clear();

    for (int i = this.ekh.size() - 1; i >= 0; i--) {
      ((EntitySprite)this.ekh.remove(i)).axl();
    }
    this.ekh.clear();
    if ((!bB) && (this.ekh.size() != this.cWn.size())) throw new AssertionError(); 
  }

  private void bbr()
  {
    int i = this.cWn.size();
    if ((!bB) && (this.ekh.size() != this.eki.size())) throw new AssertionError();

    while (this.ekh.size() > i) {
      ((EntitySprite)this.ekh.remove(this.ekh.size() - 1)).axl();
      ((EntitySprite)this.eki.remove(this.eki.size() - 1)).axl();
    }

    for (int j = this.ekh.size(); j < i; j++) {
      EntitySprite localEntitySprite1 = ap("MapOverlay");
      EntitySprite localEntitySprite2 = ap("MapOverlay");
      this.ekh.add(localEntitySprite1);
      this.eki.add(localEntitySprite2);
    }

    if ((!bB) && ((this.ekh.size() != this.cWn.size()) || (this.ekh.size() != this.eki.size()))) throw new AssertionError(); 
  }

  private static EntitySprite ap(Object paramObject)
  {
    EntitySprite localEntitySprite = (EntitySprite)EntitySprite.kYR.bQy();
    localEntitySprite.mnU = paramObject;

    GeometrySprite localGeometrySprite = (GeometrySprite)GLGeometrySprite.ieZ.bQy();
    localEntitySprite.a(localGeometrySprite);
    localGeometrySprite.axl();
    return localEntitySprite;
  }

  public void H(float paramFloat1, float paramFloat2) {
    int i = 0; for (int j = this.ekh.size(); i < j; i++) {
      EntitySprite localEntitySprite1 = (EntitySprite)this.ekh.get(i);
      localEntitySprite1.M(localEntitySprite1.bjL() - paramFloat2, localEntitySprite1.bjJ() - paramFloat1);
      EntitySprite localEntitySprite2 = (EntitySprite)this.eki.get(i);
      localEntitySprite2.M(localEntitySprite2.bjL() - paramFloat2, localEntitySprite2.bjJ() - paramFloat1);
    }
  }

  public cYp mM(int paramInt) {
    if ((paramInt < 0) || (paramInt >= this.cWn.size())) {
      return null;
    }
    return new cYp((dwn)this.cWn.get(paramInt), (EntitySprite)this.ekh.get(paramInt), (EntitySprite)this.eki.get(paramInt));
  }
}