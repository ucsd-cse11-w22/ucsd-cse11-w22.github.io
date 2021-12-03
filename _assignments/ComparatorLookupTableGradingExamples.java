import tester.*;
import java.util.*;

class ComparatorLookupTableGradingExamples {
  class GradingStringComparator implements Comparator<String> {
    public int compare(String s1, String s2) { return s1.compareTo(s2); }
  }
  class GradingIntegerComparator implements Comparator<Integer> {
    public int compare(Integer i1, Integer i2) { return i1 - i2; }
  }
  void testUpdate(Tester t) {
    List<String> strs = new ArrayList<>(Arrays.asList("a", "b", "c"));
    List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3));
    ComparatorLookupTable<String, Integer> ctl = new ComparatorLookupTable<>(strs, nums, new GradingStringComparator());
    t.checkExpect(ctl.contains("a"), true);
    ctl.update("a", 9);
    t.checkExpect(ctl.find("a"), 9);
    ctl.add("z", 10);
    t.checkExpect(ctl.keys, Arrays.asList("a", "b", "c", "z"));
    t.checkExpect(ctl.values, Arrays.asList(9, 2, 3, 10));

    t.checkExceptionType(RuntimeException.class, ctl, "add", "z", 5);
    t.checkExceptionType(RuntimeException.class, ctl, "find", "y");
  }

  class Point {
    int x, y;
    Point(int x, int y) { this.x = x; this.y = y; }
  }

  class PointCompare implements Comparator<Point> {
    public int compare(Point p1, Point p2) {
      if(p1.x < p2.x) { return -1; }
      if(p1.y < p2.y) { return -1; }
      if(p1.x == p2.x && p1.y == p2.y) { return 0; }
      if(p1.x > p2.x) { return 1; }
      return 1;
    }
  }
  List<Point> pts = new ArrayList<>(Arrays.asList(new Point(1, 2), new Point(3, 4)));
  List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2));
  ComparatorLookupTable<Point, Integer> ctl = new ComparatorLookupTable<>(pts, nums, new PointCompare());
  void testPointEqualsCompare(Tester t) {
    t.checkExpect(ctl.contains(new Point(1, 2)), true);
  }
  void testPoint(Tester t) {
    t.checkExpect(ctl.contains(pts.get(0)), true);
    Point p = pts.get(1);
    ctl.update(p, 9);
    t.checkExpect(ctl.find(p), 9);
    ctl.add(new Point(4, 5), 10);
    t.checkExpect(ctl.keys.size(), 3);
    t.checkExpect(ctl.values, Arrays.asList(1, 9, 10));

    t.checkExceptionType(RuntimeException.class, ctl, "add", p, 5);
    t.checkExceptionType(RuntimeException.class, ctl, "find", new Point(100, 100));
  }


  void testBuildFromEmpty(Tester t) {
    ComparatorLookupTable<String, Integer> ctl = new ComparatorLookupTable<>(new ArrayList<>(Arrays.asList()), new ArrayList<>(Arrays.asList()), new GradingStringComparator());
    ctl.add("m", 5);
    t.checkExpect(ctl.contains("y"), false);
    ctl.add("y", 10);
    t.checkExpect(ctl.contains("y"), true);
    ctl.add("a", 22);
    t.checkExpect(ctl.keys.size(), 3);
    t.checkExpect(ctl.values.size(), 3);
    t.checkExpect(ctl.find("m"), 5);
    t.checkExpect(ctl.find("y"), 10);
    t.checkExpect(ctl.find("a"), 22);
    ctl.update("m", 55);
    t.checkExpect(ctl.find("m"), 55);
    t.checkExpect(ctl.contains("m"), true);
    t.checkExceptionType(RuntimeException.class, ctl, "add", "m", 5000);
    t.checkExceptionType(RuntimeException.class, ctl, "update", "not-there", 22);
  }

  void testBuildFromEmptyInteger(Tester t) {
    ComparatorLookupTable<Integer, String> ctl = new ComparatorLookupTable<>(new ArrayList<>(Arrays.asList()), new ArrayList<>(Arrays.asList()), new GradingIntegerComparator());
    ctl.add(5, "m");
    t.checkExpect(ctl.contains(10), false);
    ctl.add(10, "y");
    t.checkExpect(ctl.contains(10), true);
    ctl.add(22, "a");
    t.checkExpect(ctl.keys.size(), 3);
    t.checkExpect(ctl.values.size(), 3);
    t.checkExpect(ctl.find(5), "m");
    t.checkExpect(ctl.find(10), "y");
    t.checkExpect(ctl.find(22), "a");
    ctl.update(5, "x");
    t.checkExpect(ctl.find(5), "x");
    t.checkExpect(ctl.contains(5), true);
    t.checkExceptionType(RuntimeException.class, ctl, "add", 5, "z");
    t.checkExceptionType(RuntimeException.class, ctl, "update", 1000, "z");
  }
}
