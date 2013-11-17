import com.ankamagames.framework.graphics.engine.particleSystem.Particle;

public class bIQ
{
  private int m_size;
  private final Particle[] gJl;
  private int gJm = 0;

  public bIQ(int paramInt) {
    this.gJl = new Particle[paramInt];
  }

  public final void d(Particle paramParticle) {
    this.gJl[(this.m_size++)] = paramParticle;
  }

  public final void remove(int paramInt) {
    this.gJl[paramInt] = null;
    this.gJm += 1;
  }

  public final Particle tb(int paramInt) {
    return this.gJl[paramInt];
  }

  public final int size() {
    return this.m_size;
  }

  public final void compact() {
    if (this.gJm == 0)
      return;
    int i = 1;
    for (int j = 0; j < this.m_size - 1; j++) {
      if (this.gJl[j] != null) {
        i++;
      }
      else
      {
        for (int k = i; k < this.m_size; k++) {
          if (this.gJl[k] != null) {
            this.gJl[j] = this.gJl[k];
            this.gJl[k] = null;
            i = k + 1;
            break;
          }
        }
      }
    }
    this.m_size -= this.gJm;
    this.gJm = 0;
  }

  public final void clear() {
    this.m_size = 0;
    this.gJm = 0;
  }

  public final boolean isFull() {
    return this.m_size >= this.gJl.length;
  }
}