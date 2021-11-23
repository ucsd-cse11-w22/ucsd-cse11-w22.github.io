class Pair<A, B> {
  A a; B b;
  Pair(A a, B b) { this.a = a; this.b = b; }
  public String toString() {
    return "Pair(" + this.a + ", " + this.b + ")";
  }
  public boolean equals(Pair other) {
    return this.a.equals(other.a) && this.b.equals(other.b);
  }
}

class PairMain {
  public static void main(String[] args) {
    Pair<Integer, String> p = new Pair<>(5, "a");
    System.out.println(p);
    Pair<Integer, String> p2 = new Pair<>(5, "a");
    System.out.println((p == p2) + " " + p.equals(p2)); 
  }
}

