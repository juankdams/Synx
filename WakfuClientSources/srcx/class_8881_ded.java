public class ded
{
  public int aw;
  public String m_name;

  public void d(aYQ paramaYQ)
  {
    this.aw = paramaYQ.readInt();
    this.m_name = paramaYQ.readString();
  }

  public void b(dSw paramdSw) {
    paramdSw.writeInt(this.aw);
    paramdSw.writeString(this.m_name);
  }

  public void l(aYQ paramaYQ) {
    d(paramaYQ);
  }

  public void f(dSw paramdSw) {
    b(paramdSw);
  }

  public String toString() {
    return this.m_name + " (id=" + this.aw + ")";
  }
}