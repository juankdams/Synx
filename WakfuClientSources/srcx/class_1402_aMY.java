import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

public class aMY
{
  private static final int esx = 20;
  private final LinkedList esy = new LinkedList();
  private final LinkedList esz = new LinkedList();

  public void a(dJz paramdJz) {
    this.esy.addFirst(paramdJz);
    while (this.esy.size() > 20)
      this.esy.removeLast();
  }

  public void a(aMn paramaMn)
  {
    this.esz.addFirst(paramaMn);
    while (this.esz.size() > 20)
      this.esz.removeLast();
  }

  public void b(aMY paramaMY)
  {
    c(paramaMY);
    d(paramaMY);
  }

  private void c(aMY paramaMY) {
    int i = 0; for (int j = paramaMY.esy.size(); i < j; i++)
      a((dJz)paramaMY.esy.get(i));
  }

  private void d(aMY paramaMY)
  {
    int i = 0; for (int j = paramaMY.esz.size(); i < j; i++)
      a((aMn)paramaMY.esz.get(i));
  }

  public boolean F(dGy paramdGy)
  {
    int i = 0; for (int j = this.esy.size(); i < j; i++) {
      if (!paramdGy.d(this.esy.get(i))) {
        return false;
      }
    }
    return true;
  }

  public boolean G(dGy paramdGy) {
    int i = 0; for (int j = this.esz.size(); i < j; i++) {
      if (!paramdGy.d(this.esz.get(i))) {
        return false;
      }
    }
    return true;
  }

  public void b(bbO parambbO) {
    c(parambbO);
    d(parambbO);
  }

  private void c(bbO parambbO) {
    int i = 0; for (int j = this.esy.size(); i < j; i++) {
      dJz localdJz = (dJz)this.esy.get(i);
      bCj localbCj = new bCj();
      localbCj.crN = localdJz.getMemberName();
      localbCj.crO = localdJz.getDate();
      localbCj.aDe = localdJz.tc();
      localbCj.goO = localdJz.nP();
      localdJz.diS().j(localbCj.goP);
      parambbO.dXh.add(localbCj);
    }
  }

  private void d(bbO parambbO) {
    int i = 0; for (int j = this.esz.size(); i < j; i++) {
      aMn localaMn = (aMn)this.esz.get(i);
      Sf localSf = new Sf();
      localSf.crN = localaMn.getMemberName();
      localSf.crO = localaMn.getDate();
      localSf.crP = localaMn.bdA();
      parambbO.dXi.add(localSf);
    }
  }

  public void e(bbO parambbO) {
    f(parambbO);
    g(parambbO);
  }

  private void f(bbO parambbO) {
    int i = 0; for (int j = parambbO.dXh.size(); i < j; i++) {
      bCj localbCj = (bCj)parambbO.dXh.get(i);
      dnm localdnm = qa.a(localbCj.goP);
      this.esy.addLast(new dJz(localbCj.crN, localbCj.crO, localbCj.aDe, localbCj.goO, localdnm));
    }
  }

  private void g(bbO parambbO) {
    int i = 0; for (int j = parambbO.dXi.size(); i < j; i++) {
      Sf localSf = (Sf)parambbO.dXi.get(i);
      this.esz.addLast(new aMn(localSf.crN, localSf.crO, localSf.crP));
    }
  }

  public void aq(ByteBuffer paramByteBuffer) {
    bbO localbbO = new bbO();
    localbbO.h(paramByteBuffer);
    e(localbbO);
  }

  public byte[] j() {
    bbO localbbO = new bbO();
    b(localbbO);

    ByteBuffer localByteBuffer = ByteBuffer.allocate(localbbO.O());
    localbbO.g(localByteBuffer);
    return localByteBuffer.array();
  }

  public String toString()
  {
    return "GuildStorageHistory{m_itemHistory=" + this.esy.size() + ", m_moneyHistory=" + this.esz.size() + '}';
  }
}