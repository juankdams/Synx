import java.util.HashMap;
import java.util.Map;

public abstract class bLQ extends dNt
{
  protected final Map gPp = new HashMap();

  protected bLQ(String paramString, dNt paramdNt, dUl paramdUl) {
    super(paramString, paramdNt, paramdUl);
  }

  protected dNt a(dNt paramdNt) {
    String str = paramdNt.getName();
    Object localObject = str != null ? str.intern() : null;
    if (this.gPp.containsKey(localObject)) {
      throw new RuntimeException("Le noeud " + this + " possède déjà un enfant nommé " + paramdNt.getName());
    }
    this.gPp.put(localObject, paramdNt);
    return paramdNt;
  }

  public final Map byb() {
    return this.gPp;
  }

  public void clear() {
    for (dNt localdNt : this.gPp.values()) {
      localdNt.clear();
    }
    this.gPp.clear();
  }

  public final boolean hasValue() {
    return false;
  }

  public long getValue() {
    throw new UnsupportedOperationException("Pas de valeur pour un ContainerNode");
  }
}