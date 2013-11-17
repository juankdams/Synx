import java.awt.Point;
import java.awt.geom.Rectangle2D;

class cwN
{
  private String ijf;
  int ijg;
  private Point origin;
  private Rectangle2D ijh;
  private boolean used;

  cwN(String paramString, Point paramPoint, Rectangle2D paramRectangle2D, int paramInt)
  {
    this.ijf = paramString;
    this.origin = paramPoint;
    this.ijh = paramRectangle2D;
    this.ijg = paramInt;
  }

  String ctZ() {
    return this.ijf;
  }

  Point cua() {
    return this.origin;
  }

  int cub()
  {
    return (int)-this.ijh.getMinX();
  }

  int cuc() {
    return (int)-this.ijh.getMinY();
  }

  Rectangle2D cud() {
    return this.ijh;
  }

  boolean cue() {
    return this.used;
  }

  void cuf() {
    this.used = true;
  }

  void cug() {
    this.used = false;
  }
}