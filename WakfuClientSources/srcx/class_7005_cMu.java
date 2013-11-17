import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class cMu
  implements dor
{
  private static final Logger K = Logger.getLogger(cMu.class);
  private final int aw;
  private final dfy krO;

  cMu(int paramInt, byte paramByte)
  {
    this.aw = paramInt;
    this.krO = new dfy(Fj.bMB, aYu.fet, (short)paramByte, true);
  }

  cMu(int paramInt, dfy paramdfy)
  {
    this.aw = paramInt;
    this.krO = paramdfy;
  }

  public boolean au(gA paramgA)
  {
    return this.krO.l(paramgA);
  }

  public boolean av(gA paramgA) {
    try {
      return (au(paramgA)) && (this.krO.c(paramgA));
    } catch (amq localamq) {
      K.error("[STORAGE_BOX] Impossible d'ajouter un item à l'inventaire alors qu'on à pourtant testé le canAdd", localamq);
    }return false;
  }

  public boolean f(gA paramgA, byte paramByte)
  {
    return this.krO.a(paramgA, (short)paramByte);
  }

  public boolean g(gA paramgA, byte paramByte) {
    try {
      return (f(paramgA, paramByte)) && (this.krO.b(paramgA, (short)paramByte));
    } catch (amq localamq) {
      K.error("[STORAGE_BOX] Impossible d'ajouter un item à l'inventaire alors qu'on à pourtant testé le canAdd", localamq);
    }return false;
  }

  public boolean aw(gA paramgA)
  {
    return this.krO.m(paramgA);
  }

  public boolean K(gA paramgA) {
    return (aw(paramgA)) && (this.krO.d(paramgA));
  }

  public boolean n(long paramLong, short paramShort) {
    return this.krO.n(paramLong, paramShort);
  }

  public boolean o(long paramLong, short paramShort) {
    return (n(paramLong, paramShort)) && (this.krO.c(paramLong, (short)-paramShort));
  }

  public gA bI(long paramLong)
  {
    return (gA)this.krO.ci(paramLong);
  }

  public gA ag(byte paramByte) {
    return (gA)this.krO.dB((short)paramByte);
  }

  public int size() {
    return this.krO.size();
  }

  public short cFy() {
    return this.krO.cFy();
  }

  public byte iU(long paramLong) {
    return (byte)this.krO.il(paramLong);
  }

  public Iterator iterator() {
    return this.krO.jb(false);
  }

  public Iterator cFz() {
    return this.krO.jb(true);
  }

  public void a(bbk parambbk) {
    this.krO.d(parambbk);
  }

  public void b(bbk parambbk) {
    this.krO.c(parambbk);
  }

  public void b(bph parambph)
  {
    parambph.id = this.aw;
    for (Iterator localIterator = this.krO.iterator(); localIterator.hasNext(); ) {
      gA localgA = (gA)localIterator.next();
      daq localdaq = new daq();
      localdaq.cIh = this.krO.il(localgA.oj());
      localgA.a(localdaq.cpq);
      parambph.bED.add(localdaq);
    }
  }

  public void c(bph parambph) {
    this.krO.ajy();
    Fj localFj = (Fj)this.krO.ajw();
    int i = 0; for (int j = parambph.bED.size(); i < j; i++) {
      daq localdaq = (daq)parambph.bED.get(i);
      gA localgA = localFj.c(localdaq.cpq);
      try {
        this.krO.b(localgA, localdaq.cIh);
      } catch (amq localamq) {
        K.error("[STORAGE_BOX] Problème de récupération d'un item de compartiment", localamq);
      }
    }
  }

  public String toString()
  {
    return "StorageBoxCompartment{m_inventory=" + this.krO + '}';
  }
}