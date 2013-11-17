import com.ankamagames.wakfu.client.binaryStorage.EmoteBinaryData;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bmJ
{
  public static final bmJ fFu = new bmJ();

  private final cSR fFv = new cSR();
  private final cSR fFw = new cSR();
  private final cSR fFx = new cSR();
  private final cSi fFy = new cSi();
  private final cSi fFz = new cSi();

  private bmJ() {
    for (aYU localaYU : aYU.values()) {
      cuI localcuI = new cuI(localaYU.getId(), localaYU.gp());
      this.fFx.put(localcuI.getId(), localcuI);
    }
  }

  public void a(EmoteBinaryData paramEmoteBinaryData) {
    this.fFv.put(paramEmoteBinaryData.getId(), c(paramEmoteBinaryData));
    this.fFy.add(paramEmoteBinaryData.getId());
  }

  public void b(EmoteBinaryData paramEmoteBinaryData) {
    this.fFw.put(paramEmoteBinaryData.getId(), c(paramEmoteBinaryData));
    this.fFz.add(paramEmoteBinaryData.getId());
  }

  private static doe c(EmoteBinaryData paramEmoteBinaryData) {
    return new doe(paramEmoteBinaryData.getId(), paramEmoteBinaryData.aTk(), paramEmoteBinaryData.aTi(), paramEmoteBinaryData.aTj(), paramEmoteBinaryData.aTl(), paramEmoteBinaryData.aTh(), paramEmoteBinaryData.aTm());
  }

  public cC qg(int paramInt)
  {
    doe localdoe = qi(paramInt);
    return localdoe != null ? localdoe : qh(paramInt);
  }

  public cuI qh(int paramInt) {
    return (cuI)this.fFx.get(paramInt);
  }

  public doe qi(int paramInt) {
    if (this.fFw.contains(paramInt))
      return (doe)this.fFw.get(paramInt);
    if (this.fFv.contains(paramInt))
      return (doe)this.fFv.get(paramInt);
    return null;
  }

  public doe a(aeF paramaeF) {
    for (dmn localdmn = this.fFw.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      if (paramaeF.aqm().matcher(((doe)localdmn.value()).RK).matches()) {
        return (doe)localdmn.value();
      }
    }
    for (localdmn = this.fFv.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      if (paramaeF.aqm().matcher(((doe)localdmn.value()).RK).matches()) {
        return (doe)localdmn.value();
      }
    }
    return null;
  }

  public ArrayList bxr() {
    ArrayList localArrayList = new ArrayList();
    this.fFy.g(new cne(this, localArrayList));

    return localArrayList;
  }

  public ArrayList bxs() {
    ArrayList localArrayList = new ArrayList();
    this.fFz.g(new cnd(this, localArrayList));

    return localArrayList;
  }
}