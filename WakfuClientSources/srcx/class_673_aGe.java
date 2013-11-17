import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import java.util.HashMap;
import org.apache.log4j.Logger;

public class aGe
{
  private static final Logger K = Logger.getLogger(aGe.class);

  private final HashMap edj = new HashMap();

  public XulorParticleSystem f(dwn paramdwn)
  {
    String str = paramdwn.getParticlePath();
    if (str == null) {
      return null;
    }
    XulorParticleSystem localXulorParticleSystem = (XulorParticleSystem)this.edj.get(paramdwn);
    if (localXulorParticleSystem != null) {
      return localXulorParticleSystem;
    }

    return a(paramdwn, str);
  }

  private XulorParticleSystem a(dwn paramdwn, String paramString)
  {
    XulorParticleSystem localXulorParticleSystem = bHg.bOQ().jM(paramString);
    if (localXulorParticleSystem == null) {
      return null;
    }

    cDz.iwP.c(localXulorParticleSystem);
    this.edj.put(paramdwn, localXulorParticleSystem);
    localXulorParticleSystem.gQ();
    return localXulorParticleSystem;
  }

  public void a(aJP paramaJP) {
    int i = 0; for (int j = paramaJP.size(); i < j; i++) {
      dwn localdwn = paramaJP.mJ(i);
      if (localdwn.getParticlePath() != null)
      {
        XulorParticleSystem localXulorParticleSystem = (XulorParticleSystem)this.edj.remove(localdwn);
        if (localXulorParticleSystem != null)
          localXulorParticleSystem.axl(); 
      }
    }
  }

  public void clear() { for (XulorParticleSystem localXulorParticleSystem : this.edj.values()) {
      localXulorParticleSystem.axl();
    }
    this.edj.clear();
  }
}